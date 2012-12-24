package jp.sunflower09.controller.snippet;

import jp.sunflower.common.BaseController;

import org.slim3.controller.Navigation;

public class AddController extends BaseController {
    @Override
    protected Navigation run() throws Exception {
        return forward("add.jsp");
    }

}
