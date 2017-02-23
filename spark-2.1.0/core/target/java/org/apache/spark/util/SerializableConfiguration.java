package org.apache.spark.util;
  class SerializableConfiguration implements scala.Serializable {
  public  org.apache.hadoop.conf.Configuration value ()  { throw new RuntimeException(); }
  // not preceding
  public   SerializableConfiguration (org.apache.hadoop.conf.Configuration value)  { throw new RuntimeException(); }
  private  void writeObject (java.io.ObjectOutputStream out)  { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream in)  { throw new RuntimeException(); }
}
