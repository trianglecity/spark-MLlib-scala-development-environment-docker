package org.apache.spark.ml.ann;
/**
 * Simple updater
 */
  class ANNUpdater extends org.apache.spark.mllib.optimization.Updater {
  public   ANNUpdater ()  { throw new RuntimeException(); }
  public  scala.Tuple2<org.apache.spark.mllib.linalg.Vector, java.lang.Object> compute (org.apache.spark.mllib.linalg.Vector weightsOld, org.apache.spark.mllib.linalg.Vector gradient, double stepSize, int iter, double regParam)  { throw new RuntimeException(); }
}
