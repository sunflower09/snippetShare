package jp.sunflower09.model;

import java.io.Serializable;
import java.util.Date;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.google.appengine.api.datastore.Key;

@Model(schemaVersion = 1)
public class Snippet implements Serializable {

    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;

    @Attribute(version = true)
    private Long version;

    /**
     * user id
     */
    String userId;

    /**
     * code snippet
     */
    String snippet;

    /**
     * code category
     */
    String category;

    /**
     * create date
     */
    Date createDate;

    /**
     * modified date
     */
    Date modifiedDate;

    /**
     * Default Constructor
     */
    public Snippet() {

    }

    /**
     * Constructor
     * 
     * @param userId
     * @param category
     * @param snippet
     */
    public Snippet(String userId, String category, String snippet) {
        this.userId = userId;
        this.category = category;
        this.snippet = snippet;
        this.createDate = new Date();
        this.modifiedDate = new Date();
    }

    /**
     * return the id.
     * 
     * @return the id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the id
     * 
     * @param id
     */
    public void setUserId(String id) {
        this.userId = id;
    }

    /**
     * Return the snippet
     * 
     * @return the snippet
     */
    public String getSnippet() {
        return snippet;
    }

    /**
     * Sets the snippet
     * 
     * @param snippet
     */
    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    /**
     * Return the Category.
     * 
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category
     * 
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Return the createDate
     * 
     * @return createDate
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Sets the createDate
     * 
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * Return the modifiedDate
     * 
     * @return modifiedDate
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the modifiedDate
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * Returns the key.
     * 
     * @return the key
     */
    public Key getKey() {
        return key;
    }

    /**
     * Sets the key.
     * 
     * @param key
     *            the key
     */
    public void setKey(Key key) {
        this.key = key;
    }

    /**
     * Returns the version.
     * 
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the version.
     * 
     * @param version
     *            the version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Snippet other = (Snippet) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }
}
