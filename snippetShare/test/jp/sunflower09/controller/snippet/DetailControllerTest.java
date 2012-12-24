package jp.sunflower09.controller.snippet;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class DetailControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/snippet/detail");
        DetailController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/snippet/detail.jsp"));
    }
}