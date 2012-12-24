package jp.sunflower09.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SnippetTest extends AppEngineTestCase {

    private Snippet model = new Snippet();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
