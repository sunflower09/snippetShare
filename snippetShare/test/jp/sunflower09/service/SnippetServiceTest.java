package jp.sunflower09.service;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import jp.sunflower09.meta.SnippetMeta;
import jp.sunflower09.model.Snippet;

import org.junit.Test;
import org.slim3.datastore.Datastore;
import org.slim3.tester.AppEngineTestCase;

public class SnippetServiceTest extends AppEngineTestCase {

    private SnippetService service = new SnippetService();

    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }

    @Test
    public void addのテスト() {
        // 初期状態(0件)
        List<Snippet> actual = Datastore.query(SnippetMeta.get()).asList();
        List<Snippet> expected = new ArrayList<Snippet>();
        assertThat(actual, is(expected));

        // 1件登録
        Snippet snippet = new Snippet("cyubachi", "shell", "ls -l");
        service.add(snippet);
        expected.add(snippet);

        // 1件登録されていることを確認
        actual = Datastore.query(SnippetMeta.get()).asList();
        assertThat(actual, is(expected));
    }

    @Test
    public void listのテスト() {
        List<Snippet> actual = service.list("cyubachi");
        List<Snippet> expected = new ArrayList<Snippet>();
        assertThat(actual, is(expected));

        Snippet snippet;
        snippet = new Snippet("cyubachi", "shell", "ls -l");
        service.add(snippet);
        expected.add(snippet);
        snippet = new Snippet("cyubachi", "shell", "ps -ef");
        service.add(snippet);
        expected.add(snippet);
        snippet = new Snippet("cyubachi", "shell", "pwd");
        service.add(snippet);
        expected.add(snippet);
        snippet = new Snippet("cyubachi", "shell", "find ./ -name \\*.xml");
        service.add(snippet);
        expected.add(snippet);

        actual = service.list("cyubachi");
        assertThat(actual, is(expected));

    }

    @Test
    public void getのテスト() {
        // 登録
        Snippet snippet = new Snippet("cyubachi", "shell", "ls -l");
        service.add(snippet);

        // 一覧取得
        List<Snippet> actualList = service.list("cyubachi");
        List<Snippet> expectedList =
            Datastore.query(SnippetMeta.get()).asList();

        Snippet actual =
            service.get(Datastore.keyToString(actualList.get(0).getKey()));
        Snippet expected = expectedList.get(0);
        assertThat(actual, is(expected));
    }
}
