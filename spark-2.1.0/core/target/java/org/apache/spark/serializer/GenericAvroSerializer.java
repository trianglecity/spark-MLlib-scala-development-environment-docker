package org.apache.spark.serializer;
/**
 * Custom serializer used for generic Avro records. If the user registers the schemas
 * ahead of time, then the schema's fingerprint will be sent with each message instead of the actual
 * schema, as to reduce network IO.
 * Actions like parsing or compressing schemas are computationally expensive so the serializer
 * caches all previously seen values as to reduce the amount of work needed to do.
 * param:  schemas a map where the keys are unique IDs for Avro schemas and the values are the
 *                string representation of the Avro schema, used to decrease the amount of data
 *                that needs to be serialized.
 */
  class GenericAvroSerializer extends com.esotericsoftware.kryo.Serializer<org.apache.avro.generic.GenericRecord> {
  public   GenericAvroSerializer (scala.collection.immutable.Map<java.lang.Object, java.lang.String> schemas)  { throw new RuntimeException(); }
  /** Used to reduce the amount of effort to compress the schema */
  private  scala.collection.mutable.HashMap<org.apache.avro.Schema, byte[]> compressCache ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.nio.ByteBuffer, org.apache.avro.Schema> decompressCache ()  { throw new RuntimeException(); }
  /** Reuses the same datum reader/writer since the same schema will be used many times */
  private  scala.collection.mutable.HashMap<org.apache.avro.Schema, org.apache.avro.io.DatumWriter<?>> writerCache ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.avro.Schema, org.apache.avro.io.DatumReader<?>> readerCache ()  { throw new RuntimeException(); }
  /** Fingerprinting is very expensive so this alleviates most of the work */
  private  scala.collection.mutable.HashMap<org.apache.avro.Schema, java.lang.Object> fingerprintCache ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, org.apache.avro.Schema> schemaCache ()  { throw new RuntimeException(); }
  private  org.apache.spark.io.CompressionCodec codec ()  { throw new RuntimeException(); }
  /**
   * Used to compress Schemas when they are being sent over the wire.
   * The compression results are memoized to reduce the compression time since the
   * same schema is compressed many times over
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  byte[] compress (org.apache.avro.Schema schema)  { throw new RuntimeException(); }
  /**
   * Decompresses the schema into the actual in-memory object. Keeps an internal cache of already
   * seen values so to limit the number of times that decompression has to be done.
   * @param schemaBytes (undocumented)
   * @return (undocumented)
   */
  public  org.apache.avro.Schema decompress (java.nio.ByteBuffer schemaBytes)  { throw new RuntimeException(); }
  /**
   * Serializes a record to the given output stream. It caches a lot of the internal data as
   * to not redo work
   * @param datum (undocumented)
   * @param output (undocumented)
   */
  public <R extends org.apache.avro.generic.GenericRecord> void serializeDatum (R datum, com.esotericsoftware.kryo.io.Output output)  { throw new RuntimeException(); }
  /**
   * Deserializes generic records into their in-memory form. There is internal
   * state to keep a cache of already seen schemas and datum readers.
   * @param input (undocumented)
   * @return (undocumented)
   */
  public  org.apache.avro.generic.GenericRecord deserializeDatum (com.esotericsoftware.kryo.io.Input input)  { throw new RuntimeException(); }
  public  void write (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Output output, org.apache.avro.generic.GenericRecord datum)  { throw new RuntimeException(); }
  public  org.apache.avro.generic.GenericRecord read (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Input input, java.lang.Class<org.apache.avro.generic.GenericRecord> datumClass)  { throw new RuntimeException(); }
}
