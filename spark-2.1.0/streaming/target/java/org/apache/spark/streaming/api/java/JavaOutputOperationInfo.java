package org.apache.spark.streaming.api.java;
/**
 * Class having information on output operations.
 * <p>
 * param:  batchTime Time of the batch
 * param:  id Id of this output operation. Different output operations have different ids in a batch.
 * param:  name The name of this output operation.
 * param:  description The description of this output operation.
 * param:  startTime Clock time of when the output operation started processing. <code>-1</code> means the
 *                  output operation has not yet started
 * param:  endTime Clock time of when the output operation started processing. <code>-1</code> means the output
 *                operation has not yet completed
 * param:  failureReason Failure reason if this output operation fails. If the output operation is
 *                      successful, this field is <code>null</code>.
 */
  class JavaOutputOperationInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time batchTime ()  { throw new RuntimeException(); }
  public  int id ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.lang.String description ()  { throw new RuntimeException(); }
  public  long startTime ()  { throw new RuntimeException(); }
  public  long endTime ()  { throw new RuntimeException(); }
  public  java.lang.String failureReason ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaOutputOperationInfo (org.apache.spark.streaming.Time batchTime, int id, java.lang.String name, java.lang.String description, long startTime, long endTime, java.lang.String failureReason)  { throw new RuntimeException(); }
}
