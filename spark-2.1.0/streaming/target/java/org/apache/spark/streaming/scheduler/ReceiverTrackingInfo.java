package org.apache.spark.streaming.scheduler;
/**
 * Class having information about a receiver.
 * <p>
 * param:  receiverId the unique receiver id
 * param:  state the current Receiver state
 * param:  scheduledLocations the scheduled locations provided by ReceiverSchedulingPolicy
 * param:  runningExecutor the running executor if the receiver is active
 * param:  name the receiver name
 * param:  endpoint the receiver endpoint. It can be used to send messages to the receiver
 * param:  errorInfo the receiver error information if it fails
 */
  class ReceiverTrackingInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int receiverId ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value state ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> scheduledLocations ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.scheduler.ExecutorCacheTaskLocation> runningExecutor ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> name ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rpc.RpcEndpointRef> endpoint ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.scheduler.ReceiverErrorInfo> errorInfo ()  { throw new RuntimeException(); }
  // not preceding
  public   ReceiverTrackingInfo (int receiverId, scala.Enumeration.Value state, scala.Option<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> scheduledLocations, scala.Option<org.apache.spark.scheduler.ExecutorCacheTaskLocation> runningExecutor, scala.Option<java.lang.String> name, scala.Option<org.apache.spark.rpc.RpcEndpointRef> endpoint, scala.Option<org.apache.spark.streaming.scheduler.ReceiverErrorInfo> errorInfo)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.ReceiverInfo toReceiverInfo ()  { throw new RuntimeException(); }
}
