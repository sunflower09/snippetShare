package jp.sunflower09.service;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jp.sunflower09.meta.UserMeta;
import jp.sunflower09.model.User;

import org.junit.Test;
import org.slim3.datastore.Datastore;
import org.slim3.tester.AppEngineTestCase;

public class UserServiceTest extends AppEngineTestCase {

    private UserService service = new UserService();

    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }

    @Test
    public void addのテスト() {
        // 初期状態(0件)
        List<User> actual = Datastore.query(UserMeta.get()).asList();
        List<User> expected = new ArrayList<User>();
        assertThat(actual, is(expected));

        // 1件登録
        User user = new User();
        user.setUserId("cyubachi");
        user.setType("twitter");
        user.setCreateDate(new Date());
        user.setModifiedDate(new Date());
        service.add(user);
        expected.add(user);

        // 1件登録されていることを確認
        actual = Datastore.query(UserMeta.get()).asList();
        assertThat(actual, is(expected));

    }

    @Test
    public void listのテスト() {
        // 初期値は0件
        List<User> actual = service.list("cyubachi");
        List<User> expected = new ArrayList<User>();
        assertThat(actual, is(expected));

        // 1件登録
        User user = new User();
        user.setUserId("cyubachi");
        user.setType("twitter");
        user.setCreateDate(new Date());
        user.setModifiedDate(new Date());
        service.add(user);
        expected.add(user);

        actual = service.list("cyubachi");
        assertThat(actual, is(expected));

    }

}
