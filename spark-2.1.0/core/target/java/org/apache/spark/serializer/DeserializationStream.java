package org.apache.spark.serializer;
/**
 * :: DeveloperApi ::
 * A stream for reading serialized objects.
 */
public abstract class DeserializationStream {
  public   DeserializationStream ()  { throw new RuntimeException(); }
  /** The most general-purpose method to read an object. */
  public abstract <T extends java.lang.Object> T readObject (scala.reflect.ClassTag<T> evidence$8)  ;
  /** Reads the object representing the key of a key-value pair. */
  public <T extends java.lang.Object> T readKey (scala.reflect.ClassTag<T> evidence$9)  { throw new RuntimeException(); }
  /** Reads the object representing the value of a key-value pair. */
  public <T extends java.lang.Object> T readValue (scala.reflect.ClassTag<T> evidence$10)  { throw new RuntimeException(); }
  public abstract  void close ()  ;
  /**
   * Read the elements of this stream through an iterator. This can only be called once, as
   * reading each element will consume data from the input source.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<java.lang.Object> asIterator ()  { throw new RuntimeException(); }
  /**
   * Read the elements of this stream through an iterator over key-value pairs. This can only be
   * called once, as reading each element will consume data from the input source.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>> asKeyValueIterator ()  { throw new RuntimeException(); }
}
