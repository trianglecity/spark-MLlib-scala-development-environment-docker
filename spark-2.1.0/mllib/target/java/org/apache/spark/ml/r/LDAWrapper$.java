package org.apache.spark.ml.r;
public  class LDAWrapper$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.r.LDAWrapper> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LDAWrapper$ MODULE$ = null;
  public   LDAWrapper$ ()  { throw new RuntimeException(); }
  public  java.lang.String TOKENIZER_COL ()  { throw new RuntimeException(); }
  public  java.lang.String STOPWORDS_REMOVER_COL ()  { throw new RuntimeException(); }
  public  java.lang.String COUNT_VECTOR_COL ()  { throw new RuntimeException(); }
  private  org.apache.spark.ml.PipelineStage[] getPreStages (java.lang.String features, java.lang.String[] customizedStopWords, int maxVocabSize)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.r.LDAWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String features, int k, int maxIter, java.lang.String optimizer, double subsamplingRate, double topicConcentration, double[] docConcentration, java.lang.String[] customizedStopWords, int maxVocabSize)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.LDAWrapper> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.r.LDAWrapper load (java.lang.String path)  { throw new RuntimeException(); }
}
