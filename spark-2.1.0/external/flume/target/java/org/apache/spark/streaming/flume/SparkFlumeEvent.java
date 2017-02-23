package org.apache.spark.streaming.flume;
/**
 * A wrapper class for AvroFlumeEvent's with a custom serialization format.
 * <p>
 * This is necessary because AvroFlumeEvent uses inner data structures
 * which are not serializable.
 */
public  class SparkFlumeEvent implements java.io.Externalizable {
  static public  org.apache.spark.streaming.flume.SparkFlumeEvent fromAvroFlumeEvent (org.apache.flume.source.avro.AvroFlumeEvent in)  { throw new RuntimeException(); }
  public   SparkFlumeEvent ()  { throw new RuntimeException(); }
  public  org.apache.flume.source.avro.AvroFlumeEvent event ()  { throw new RuntimeException(); }
  public  void readExternal (java.io.ObjectInput in)  { throw new RuntimeException(); }
  public  void writeExternal (java.io.ObjectOutput out)  { throw new RuntimeException(); }
}
