package jp.sunflower.common;

import java.io.IOException;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public abstract class BaseController extends Controller {

    @Override
    protected Navigation run() throws Exception {
        String key = request.getParameter("key");
        if ("json".equals(request.getParameter("rf"))) {
            return jsonNavigation(key);
        }
        return normalNavigation();
    }

    protected Navigation jsonNavigation(String key) throws IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        response.getWriter().println(getJson());
        response.flushBuffer();
        return null;
    }

    protected String getJson() {
        return null;
    }

    protected Navigation normalNavigation() {
        return forward("index.jsp");
    }

}
