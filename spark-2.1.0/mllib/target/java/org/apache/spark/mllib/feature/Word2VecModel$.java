package org.apache.spark.mllib.feature;
public  class Word2VecModel$ implements org.apache.spark.mllib.util.Loader<org.apache.spark.mllib.feature.Word2VecModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Word2VecModel$ MODULE$ = null;
  public   Word2VecModel$ ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, java.lang.Object> buildWordIndex (scala.collection.immutable.Map<java.lang.String, float[]> model)  { throw new RuntimeException(); }
  private  float[] buildWordVectors (scala.collection.immutable.Map<java.lang.String, float[]> model)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.feature.Word2VecModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
}
