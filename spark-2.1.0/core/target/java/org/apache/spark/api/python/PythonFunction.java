package org.apache.spark.api.python;
/**
 * A wrapper for a Python function, contains all necessary context to run the function in Python
 * runner.
 */
  class PythonFunction implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  byte[] command ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.String> envVars ()  { throw new RuntimeException(); }
  public  java.util.List<java.lang.String> pythonIncludes ()  { throw new RuntimeException(); }
  public  java.lang.String pythonExec ()  { throw new RuntimeException(); }
  public  java.lang.String pythonVer ()  { throw new RuntimeException(); }
  public  java.util.List<org.apache.spark.broadcast.Broadcast<org.apache.spark.api.python.PythonBroadcast>> broadcastVars ()  { throw new RuntimeException(); }
  public  org.apache.spark.api.python.PythonAccumulatorV2 accumulator ()  { throw new RuntimeException(); }
  // not preceding
  public   PythonFunction (byte[] command, java.util.Map<java.lang.String, java.lang.String> envVars, java.util.List<java.lang.String> pythonIncludes, java.lang.String pythonExec, java.lang.String pythonVer, java.util.List<org.apache.spark.broadcast.Broadcast<org.apache.spark.api.python.PythonBroadcast>> broadcastVars, org.apache.spark.api.python.PythonAccumulatorV2 accumulator)  { throw new RuntimeException(); }
}
