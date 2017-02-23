package org.apache.spark.deploy;
/**
 * Testing class that creates a Spark standalone process in-cluster (that is, running the
 * spark.deploy.master.Master and spark.deploy.worker.Workers in the same JVMs). Executors launched
 * by the Workers still run in separate JVMs. This can be used to test distributed operation and
 * fault recovery without spinning up a lot of processes.
 */
  class LocalSparkCluster implements org.apache.spark.internal.Logging {
  public   LocalSparkCluster (int numWorkers, int coresPerWorker, int memoryPerWorker, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  private  java.lang.String localHostname ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.rpc.RpcEnv> masterRpcEnvs ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.rpc.RpcEnv> workerRpcEnvs ()  { throw new RuntimeException(); }
  public  int masterWebUIPort ()  { throw new RuntimeException(); }
  public  java.lang.String[] start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
