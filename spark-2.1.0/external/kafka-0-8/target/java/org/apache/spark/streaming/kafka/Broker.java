package org.apache.spark.streaming.kafka;
/**
 * Represents the host and port info for a Kafka broker.
 * Differs from the Kafka project's internal kafka.cluster.Broker, which contains a server ID.
 */
public final class Broker implements scala.Serializable {
  static public  org.apache.spark.streaming.kafka.Broker create (java.lang.String host, int port)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.kafka.Broker apply (java.lang.String host, int port)  { throw new RuntimeException(); }
  static public  scala.Option<scala.Tuple2<java.lang.String, java.lang.Object>> unapply (org.apache.spark.streaming.kafka.Broker broker)  { throw new RuntimeException(); }
  /** Broker's hostname */
  public  java.lang.String host ()  { throw new RuntimeException(); }
  /** Broker's port */
  public  int port ()  { throw new RuntimeException(); }
  // not preceding
  private   Broker (java.lang.String host, int port)  { throw new RuntimeException(); }
  /** Broker's port */
  public  boolean equals (Object obj)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
