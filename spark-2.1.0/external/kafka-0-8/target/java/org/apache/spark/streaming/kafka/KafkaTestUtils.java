package org.apache.spark.streaming.kafka;
/**
 * This is a helper class for Kafka test suites. This has the functionality to set up
 * and tear down local Kafka servers, and to push data using Kafka producers.
 * <p>
 * The reason to put Kafka test utility class in src is to test Python related Kafka APIs.
 */
  class KafkaTestUtils implements org.apache.spark.internal.Logging {
  public   KafkaTestUtils ()  { throw new RuntimeException(); }
  private  java.lang.String zkHost ()  { throw new RuntimeException(); }
  private  int zkPort ()  { throw new RuntimeException(); }
  private  int zkConnectionTimeout ()  { throw new RuntimeException(); }
  private  int zkSessionTimeout ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.kafka.KafkaTestUtils.EmbeddedZookeeper zookeeper ()  { throw new RuntimeException(); }
  private  org.I0Itec.zkclient.ZkClient zkClient ()  { throw new RuntimeException(); }
  private  java.lang.String brokerHost ()  { throw new RuntimeException(); }
  private  int brokerPort ()  { throw new RuntimeException(); }
  private  kafka.server.KafkaConfig brokerConf ()  { throw new RuntimeException(); }
  private  kafka.server.KafkaServer server ()  { throw new RuntimeException(); }
  private  kafka.producer.Producer<java.lang.String, java.lang.String> producer ()  { throw new RuntimeException(); }
  private  boolean zkReady ()  { throw new RuntimeException(); }
  private  boolean brokerReady ()  { throw new RuntimeException(); }
  public  java.lang.String zkAddress ()  { throw new RuntimeException(); }
  public  java.lang.String brokerAddress ()  { throw new RuntimeException(); }
  public  org.I0Itec.zkclient.ZkClient zookeeperClient ()  { throw new RuntimeException(); }
  private  void setupEmbeddedZookeeper ()  { throw new RuntimeException(); }
  private  void setupEmbeddedKafkaServer ()  { throw new RuntimeException(); }
  /** setup the whole embedded servers, including Zookeeper and Kafka brokers */
  public  void setup ()  { throw new RuntimeException(); }
  /** Teardown the whole servers, including Kafka broker and Zookeeper */
  public  void teardown ()  { throw new RuntimeException(); }
  /** Create a Kafka topic and wait until it is propagated to the whole cluster */
  public  void createTopic (java.lang.String topic, int partitions)  { throw new RuntimeException(); }
  /** Single-argument version for backwards compatibility */
  public  void createTopic (java.lang.String topic)  { throw new RuntimeException(); }
  /** Java-friendly function for sending messages to the Kafka broker */
  public  void sendMessages (java.lang.String topic, java.util.Map<java.lang.String, java.lang.Integer> messageToFreq)  { throw new RuntimeException(); }
  /** Send the messages to the Kafka broker */
  public  void sendMessages (java.lang.String topic, scala.collection.immutable.Map<java.lang.String, java.lang.Object> messageToFreq)  { throw new RuntimeException(); }
  /** Send the array of messages to the Kafka broker */
  public  void sendMessages (java.lang.String topic, java.lang.String[] messages)  { throw new RuntimeException(); }
  private  java.util.Properties brokerConfiguration ()  { throw new RuntimeException(); }
  private  java.util.Properties producerConfiguration ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T eventually (org.apache.spark.streaming.Time timeout, org.apache.spark.streaming.Time interval, scala.Function0<T> func)  { throw new RuntimeException(); }
  private  void waitUntilMetadataIsPropagated (java.lang.String topic, int partition)  { throw new RuntimeException(); }
  private  class EmbeddedZookeeper {
    public  java.lang.String zkConnect ()  { throw new RuntimeException(); }
    // not preceding
    public   EmbeddedZookeeper (java.lang.String zkConnect)  { throw new RuntimeException(); }
    public  java.io.File snapshotDir ()  { throw new RuntimeException(); }
    public  java.io.File logDir ()  { throw new RuntimeException(); }
    public  org.apache.zookeeper.server.ZooKeeperServer zookeeper ()  { throw new RuntimeException(); }
    public  java.lang.String ip ()  { throw new RuntimeException(); }
    public  int port ()  { throw new RuntimeException(); }
    public  org.apache.zookeeper.server.NIOServerCnxnFactory factory ()  { throw new RuntimeException(); }
    public  int actualPort ()  { throw new RuntimeException(); }
    public  void shutdown ()  { throw new RuntimeException(); }
  }
}
