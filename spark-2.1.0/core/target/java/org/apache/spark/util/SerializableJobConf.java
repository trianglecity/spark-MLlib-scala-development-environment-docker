package org.apache.spark.util;
  class SerializableJobConf implements scala.Serializable {
  public  org.apache.hadoop.mapred.JobConf value ()  { throw new RuntimeException(); }
  // not preceding
  public   SerializableJobConf (org.apache.hadoop.mapred.JobConf value)  { throw new RuntimeException(); }
  private  void writeObject (java.io.ObjectOutputStream out)  { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream in)  { throw new RuntimeException(); }
}
