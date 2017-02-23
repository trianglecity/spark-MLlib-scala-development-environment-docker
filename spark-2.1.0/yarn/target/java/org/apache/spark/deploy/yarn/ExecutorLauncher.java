package org.apache.spark.deploy.yarn;
/**
 * This object does not provide any special functionality. It exists so that it's easy to tell
 * apart the client-mode AM from the cluster-mode AM when using tools such as ps or jps.
 */
public  class ExecutorLauncher {
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
