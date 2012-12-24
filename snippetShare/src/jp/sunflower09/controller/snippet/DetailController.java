package jp.sunflower09.controller.snippet;

import jp.sunflower.common.BaseController;
import jp.sunflower09.meta.SnippetMeta;
import jp.sunflower09.service.SnippetService;

public class DetailController extends BaseController {

    SnippetService service = new SnippetService();

    @Override
    protected String getJson() {
        String key = request.getParameter("key");
        return SnippetMeta.get().modelToJson(service.get(key));
    }
}
