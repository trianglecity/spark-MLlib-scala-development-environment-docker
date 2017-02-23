package org.apache.spark.streaming.flume;
/** A simple server that implements Flume's Avro protocol. */
  class FlumeEventServer implements org.apache.flume.source.avro.AvroSourceProtocol {
  public   FlumeEventServer (org.apache.spark.streaming.flume.FlumeReceiver receiver)  { throw new RuntimeException(); }
  public  org.apache.flume.source.avro.Status append (org.apache.flume.source.avro.AvroFlumeEvent event)  { throw new RuntimeException(); }
  public  org.apache.flume.source.avro.Status appendBatch (java.util.List<org.apache.flume.source.avro.AvroFlumeEvent> events)  { throw new RuntimeException(); }
}
