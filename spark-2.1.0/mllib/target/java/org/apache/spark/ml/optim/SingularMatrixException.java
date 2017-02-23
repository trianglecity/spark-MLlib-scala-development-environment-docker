package org.apache.spark.ml.optim;
/**
 * Exception thrown when solving a linear system Ax = b for which the matrix A is non-invertible
 * (singular).
 */
  class SingularMatrixException extends java.lang.IllegalArgumentException {
  public   SingularMatrixException (java.lang.String message, java.lang.Throwable cause)  { throw new RuntimeException(); }
  public   SingularMatrixException (java.lang.String message)  { throw new RuntimeException(); }
}
