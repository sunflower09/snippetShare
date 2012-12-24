package jp.sunflower09.service;

import java.util.List;

import jp.sunflower09.meta.UserMeta;
import jp.sunflower09.model.User;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Transaction;

public class UserService {
    /**
     * ユーザーIDによる一覧取得<br>
     * １件返却のみを想定
     * 
     * @param userId
     * @return Snippetリスト
     */
    public List<User> list(String userId) {
        UserMeta e = UserMeta.get();
        return Datastore.query(e).filter(e.userId.equal(userId)).asList();
    }

    /**
     * ユーザー情報登録
     * 
     * @param user
     */
    public void add(User user) {
        Transaction tx = Datastore.beginTransaction();
        Datastore.put(user);
        tx.commit();
    }

}
