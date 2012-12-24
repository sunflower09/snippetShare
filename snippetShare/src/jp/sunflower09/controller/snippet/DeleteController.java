package jp.sunflower09.controller.snippet;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class DeleteController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("delete.jsp");
    }
}
