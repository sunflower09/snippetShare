package jp.sunflower09.controller.snippet;

import jp.sunflower.common.BaseController;
import jp.sunflower09.meta.SnippetMeta;
import jp.sunflower09.service.SnippetService;

public class ListController extends BaseController {

    SnippetService service = new SnippetService();

    @Override
    protected String getJson() {
        String userId = request.getParameter("userId");
        return SnippetMeta.get().modelsToJson(service.list(userId).toArray());
    }
}
