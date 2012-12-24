package jp.sunflower.common;

import jp.sunflower09.model.Snippet;
import jp.sunflower09.model.User;

public class ParameterBean {
    // response format
    String rf;

    Snippet snippet;

    User user;

    public String getRf() {
        return rf;
    }

    public void setRf(String rf) {
        this.rf = rf;
    }

    public Snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
