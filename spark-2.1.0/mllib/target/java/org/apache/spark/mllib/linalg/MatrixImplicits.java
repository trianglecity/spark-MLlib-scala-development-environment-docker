package org.apache.spark.mllib.linalg;
/**
 * Implicit methods available in Scala for converting {@link org.apache.spark.mllib.linalg.Matrix} to
 * {@link org.apache.spark.ml.linalg.Matrix} and vice versa.
 */
public  class MatrixImplicits {
  static public  org.apache.spark.ml.linalg.Matrix mllibMatrixToMLMatrix (org.apache.spark.mllib.linalg.Matrix m)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.linalg.DenseMatrix mllibDenseMatrixToMLDenseMatrix (org.apache.spark.mllib.linalg.DenseMatrix m)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.linalg.SparseMatrix mllibSparseMatrixToMLSparseMatrix (org.apache.spark.mllib.linalg.SparseMatrix m)  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.linalg.Matrix mlMatrixToMLlibMatrix (org.apache.spark.ml.linalg.Matrix m)  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.linalg.DenseMatrix mlDenseMatrixToMLlibDenseMatrix (org.apache.spark.ml.linalg.DenseMatrix m)  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.linalg.SparseMatrix mlSparseMatrixToMLlibSparseMatrix (org.apache.spark.ml.linalg.SparseMatrix m)  { throw new RuntimeException(); }
}
