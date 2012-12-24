package jp.sunflower09.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-12-25 03:26:11")
/** */
public final class UserMeta extends org.slim3.datastore.ModelMeta<jp.sunflower09.model.User> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.sunflower09.model.User, java.util.Date> createDate = new org.slim3.datastore.CoreAttributeMeta<jp.sunflower09.model.User, java.util.Date>(this, "createDate", "createDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.sunflower09.model.User, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.sunflower09.model.User, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.sunflower09.model.User, java.util.Date> modifiedDate = new org.slim3.datastore.CoreAttributeMeta<jp.sunflower09.model.User, java.util.Date>(this, "modifiedDate", "modifiedDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.sunflower09.model.User> type = new org.slim3.datastore.StringAttributeMeta<jp.sunflower09.model.User>(this, "type", "type");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.sunflower09.model.User> userId = new org.slim3.datastore.StringAttributeMeta<jp.sunflower09.model.User>(this, "userId", "userId");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.sunflower09.model.User, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.sunflower09.model.User, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final UserMeta slim3_singleton = new UserMeta();

    /**
     * @return the singleton
     */
    public static UserMeta get() {
       return slim3_singleton;
    }

    /** */
    public UserMeta() {
        super("User", jp.sunflower09.model.User.class);
    }

    @Override
    public jp.sunflower09.model.User entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.sunflower09.model.User model = new jp.sunflower09.model.User();
        model.setCreateDate((java.util.Date) entity.getProperty("createDate"));
        model.setKey(entity.getKey());
        model.setModifiedDate((java.util.Date) entity.getProperty("modifiedDate"));
        model.setType((java.lang.String) entity.getProperty("type"));
        model.setUserId((java.lang.String) entity.getProperty("userId"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.sunflower09.model.User m = (jp.sunflower09.model.User) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("createDate", m.getCreateDate());
        entity.setProperty("modifiedDate", m.getModifiedDate());
        entity.setProperty("type", m.getType());
        entity.setProperty("userId", m.getUserId());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.sunflower09.model.User m = (jp.sunflower09.model.User) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.sunflower09.model.User m = (jp.sunflower09.model.User) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.sunflower09.model.User m = (jp.sunflower09.model.User) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.sunflower09.model.User m = (jp.sunflower09.model.User) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    protected void postGet(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        jp.sunflower09.model.User m = (jp.sunflower09.model.User) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getCreateDate() != null){
            writer.setNextPropertyName("createDate");
            encoder0.encode(writer, m.getCreateDate());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getModifiedDate() != null){
            writer.setNextPropertyName("modifiedDate");
            encoder0.encode(writer, m.getModifiedDate());
        }
        if(m.getType() != null){
            writer.setNextPropertyName("type");
            encoder0.encode(writer, m.getType());
        }
        if(m.getUserId() != null){
            writer.setNextPropertyName("userId");
            encoder0.encode(writer, m.getUserId());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.sunflower09.model.User jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.sunflower09.model.User m = new jp.sunflower09.model.User();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("createDate");
        m.setCreateDate(decoder0.decode(reader, m.getCreateDate()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("modifiedDate");
        m.setModifiedDate(decoder0.decode(reader, m.getModifiedDate()));
        reader = rootReader.newObjectReader("type");
        m.setType(decoder0.decode(reader, m.getType()));
        reader = rootReader.newObjectReader("userId");
        m.setUserId(decoder0.decode(reader, m.getUserId()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}