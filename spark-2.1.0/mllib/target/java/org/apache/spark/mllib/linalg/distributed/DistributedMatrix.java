package org.apache.spark.mllib.linalg.distributed;
/**
 * Represents a distributively stored matrix backed by one or more RDDs.
 */
public  interface DistributedMatrix extends scala.Serializable {
  /** Gets or computes the number of rows. */
  public  long numRows ()  ;
  /** Gets or computes the number of columns. */
  public  long numCols ()  ;
  /** Collects data and assembles a local dense breeze matrix (for test only). */
    breeze.linalg.DenseMatrix<java.lang.Object> toBreeze ()  ;
}
