package org.apache.spark.ml.feature;
public  class StopWordsRemover$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.feature.StopWordsRemover>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StopWordsRemover$ MODULE$ = null;
  public   StopWordsRemover$ ()  { throw new RuntimeException(); }
    scala.collection.immutable.Set<java.lang.String> supportedLanguages ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StopWordsRemover load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads the default stop words for the given language.
   * Supported languages: danish, dutch, english, finnish, french, german, hungarian,
   * italian, norwegian, portuguese, russian, spanish, swedish, turkish
   * @see <a href="http://anoncvs.postgresql.org/cvsweb.cgi/pgsql/src/backend/snowball/stopwords/">
   * here</a>
   * @param language (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String[] loadDefaultStopWords (java.lang.String language)  { throw new RuntimeException(); }
}
