package jp.sunflower09.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-12-25 03:26:11")
/** */
public final class SnippetMeta extends org.slim3.datastore.ModelMeta<jp.sunflower09.model.Snippet> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.sunflower09.model.Snippet> category = new org.slim3.datastore.StringAttributeMeta<jp.sunflower09.model.Snippet>(this, "category", "category");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.sunflower09.model.Snippet, java.util.Date> createDate = new org.slim3.datastore.CoreAttributeMeta<jp.sunflower09.model.Snippet, java.util.Date>(this, "createDate", "createDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.sunflower09.model.Snippet, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.sunflower09.model.Snippet, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.sunflower09.model.Snippet, java.util.Date> modifiedDate = new org.slim3.datastore.CoreAttributeMeta<jp.sunflower09.model.Snippet, java.util.Date>(this, "modifiedDate", "modifiedDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.sunflower09.model.Snippet> snippet = new org.slim3.datastore.StringAttributeMeta<jp.sunflower09.model.Snippet>(this, "snippet", "snippet");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.sunflower09.model.Snippet> userId = new org.slim3.datastore.StringAttributeMeta<jp.sunflower09.model.Snippet>(this, "userId", "userId");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.sunflower09.model.Snippet, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.sunflower09.model.Snippet, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final SnippetMeta slim3_singleton = new SnippetMeta();

    /**
     * @return the singleton
     */
    public static SnippetMeta get() {
       return slim3_singleton;
    }

    /** */
    public SnippetMeta() {
        super("Snippet", jp.sunflower09.model.Snippet.class);
    }

    @Override
    public jp.sunflower09.model.Snippet entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.sunflower09.model.Snippet model = new jp.sunflower09.model.Snippet();
        model.setCategory((java.lang.String) entity.getProperty("category"));
        model.setCreateDate((java.util.Date) entity.getProperty("createDate"));
        model.setKey(entity.getKey());
        model.setModifiedDate((java.util.Date) entity.getProperty("modifiedDate"));
        model.setSnippet((java.lang.String) entity.getProperty("snippet"));
        model.setUserId((java.lang.String) entity.getProperty("userId"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.sunflower09.model.Snippet m = (jp.sunflower09.model.Snippet) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("category", m.getCategory());
        entity.setProperty("createDate", m.getCreateDate());
        entity.setProperty("modifiedDate", m.getModifiedDate());
        entity.setProperty("snippet", m.getSnippet());
        entity.setProperty("userId", m.getUserId());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.sunflower09.model.Snippet m = (jp.sunflower09.model.Snippet) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.sunflower09.model.Snippet m = (jp.sunflower09.model.Snippet) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.sunflower09.model.Snippet m = (jp.sunflower09.model.Snippet) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.sunflower09.model.Snippet m = (jp.sunflower09.model.Snippet) model;
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
        jp.sunflower09.model.Snippet m = (jp.sunflower09.model.Snippet) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getCategory() != null){
            writer.setNextPropertyName("category");
            encoder0.encode(writer, m.getCategory());
        }
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
        if(m.getSnippet() != null){
            writer.setNextPropertyName("snippet");
            encoder0.encode(writer, m.getSnippet());
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
    protected jp.sunflower09.model.Snippet jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.sunflower09.model.Snippet m = new jp.sunflower09.model.Snippet();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("category");
        m.setCategory(decoder0.decode(reader, m.getCategory()));
        reader = rootReader.newObjectReader("createDate");
        m.setCreateDate(decoder0.decode(reader, m.getCreateDate()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("modifiedDate");
        m.setModifiedDate(decoder0.decode(reader, m.getModifiedDate()));
        reader = rootReader.newObjectReader("snippet");
        m.setSnippet(decoder0.decode(reader, m.getSnippet()));
        reader = rootReader.newObjectReader("userId");
        m.setUserId(decoder0.decode(reader, m.getUserId()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}