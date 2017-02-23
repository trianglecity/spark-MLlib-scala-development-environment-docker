package org.apache.spark;
/**
 * :: DeveloperApi ::
 * The task finished successfully, but the result was lost from the executor's block manager before
 * it was fetched.
 */
public  class TaskResultLost {
  static public  java.lang.String toErrorString ()  { throw new RuntimeException(); }
  static public  boolean countTowardsTaskFailures ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
}
