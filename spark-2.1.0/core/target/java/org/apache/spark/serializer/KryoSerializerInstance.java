package org.apache.spark.serializer;
  class KryoSerializerInstance extends org.apache.spark.serializer.SerializerInstance {
  public   KryoSerializerInstance (org.apache.spark.serializer.KryoSerializer ks, boolean useUnsafe)  { throw new RuntimeException(); }
  /**
   * Borrows a {@link Kryo} instance. If possible, this tries to re-use a cached Kryo instance;
   * otherwise, it allocates a new instance.
   * @return (undocumented)
   */
    com.esotericsoftware.kryo.Kryo borrowKryo ()  { throw new RuntimeException(); }
  /**
   * Release a borrowed {@link Kryo} instance. If this serializer instance already has a cached Kryo
   * instance, then the given Kryo instance is discarded; otherwise, the Kryo is stored for later
   * re-use.
   * @param kryo (undocumented)
   */
    void releaseKryo (com.esotericsoftware.kryo.Kryo kryo)  { throw new RuntimeException(); }
  private  com.esotericsoftware.kryo.io.Output output ()  { throw new RuntimeException(); }
  private  com.esotericsoftware.kryo.io.Input input ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> java.nio.ByteBuffer serialize (T t, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T deserialize (java.nio.ByteBuffer bytes, scala.reflect.ClassTag<T> evidence$4)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T deserialize (java.nio.ByteBuffer bytes, java.lang.ClassLoader loader, scala.reflect.ClassTag<T> evidence$5)  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.SerializationStream serializeStream (java.io.OutputStream s)  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.DeserializationStream deserializeStream (java.io.InputStream s)  { throw new RuntimeException(); }
  /**
   * Returns true if auto-reset is on. The only reason this would be false is if the user-supplied
   * registrator explicitly turns auto-reset off.
   * @return (undocumented)
   */
  public  boolean getAutoReset ()  { throw new RuntimeException(); }
}
