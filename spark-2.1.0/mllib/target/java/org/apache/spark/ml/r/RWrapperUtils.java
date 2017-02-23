package org.apache.spark.ml.r;
public  class RWrapperUtils {
  /**
   * DataFrame column check.
   * When loading libsvm data, default columns "features" and "label" will be added.
   * And "features" would conflict with RFormula default feature column names.
   * Here is to change the column name to avoid "column already exists" error.
   * <p>
   * @param rFormula RFormula instance
   * @param data Input dataset
   */
  static public  void checkDataColumns (org.apache.spark.ml.feature.RFormula rFormula, org.apache.spark.sql.Dataset<?> data)  { throw new RuntimeException(); }
  /**
   * Get the feature names and original labels from the schema
   * of DataFrame transformed by RFormulaModel.
   * <p>
   * @param rFormulaModel The RFormulaModel instance.
   * @param data Input dataset.
   * @return The feature names and original labels.
   */
  static public  scala.Tuple2<java.lang.String[], java.lang.String[]> getFeaturesAndLabels (org.apache.spark.ml.feature.RFormulaModel rFormulaModel, org.apache.spark.sql.Dataset<?> data)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
}
