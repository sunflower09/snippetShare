package jp.sunflower09.service;

import java.util.List;
import java.util.logging.Logger;

import jp.sunflower09.meta.SnippetMeta;
import jp.sunflower09.model.Snippet;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Transaction;

public class SnippetService {

    Logger logger = Logger.getLogger(this.getClass().getName());

    /**
     * キーによる一件取得
     * 
     * @param key
     * @return Snippet
     */
    public Snippet get(String key) {
        Snippet snippet =
            Datastore.getOrNull(SnippetMeta.get(), Datastore.stringToKey(key));
        return snippet;
    }

    /**
     * スニペット登録
     * 
     * @param snippet
     */
    public void add(Snippet snippet) {
        Transaction tx = Datastore.beginTransaction();
        Datastore.put(snippet);
        tx.commit();
    }

    /**
     * ユーザーIDによる一覧取得
     * 
     * @param userId
     * @return Snippetリスト
     */
    public List<Snippet> list(String userId) {
        SnippetMeta e = SnippetMeta.get();
        return Datastore
            .query(e)
            .filter(e.userId.equal(userId))
            .sort("modifiedDate")
            .asList();

    }

}
