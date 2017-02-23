package org.apache.spark.ml.util;
/**
 * A small wrapper that defines a training session for an estimator, and some methods to log
 * useful information during this session.
 * <p>
 * A new instance is expected to be created within fit().
 * <p>
 * param:  estimator the estimator that is being fit
 * param:  dataset the training dataset
 * @tparam E the type of the estimator
 */
  class Instrumentation<E extends org.apache.spark.ml.Estimator<?>> implements org.apache.spark.internal.Logging {
  static private  java.util.concurrent.atomic.AtomicLong counter ()  { throw new RuntimeException(); }
  /**
   * Creates an instrumentation object for a training session.
   * @param estimator (undocumented)
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  static public <E extends org.apache.spark.ml.Estimator<?>> org.apache.spark.ml.util.Instrumentation<E> create (E estimator, org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * Creates an instrumentation object for a training session.
   * @param estimator (undocumented)
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  static public <E extends org.apache.spark.ml.Estimator<?>> org.apache.spark.ml.util.Instrumentation<E> create (E estimator, org.apache.spark.rdd.RDD<?> dataset)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
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
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(ExistentialTypeTree(AppliedTypeTree(Select(Select(Select(Select(Ident(org), org.apache), org.apache.spark), org.apache.spark.ml), org.apache.spark.ml.Estimator), List(TypeTree().setOriginal(Ident(TypeName("_$1"))))), List(TypeDef(Modifiers(DEFERRED | SYNTHETIC), TypeName("_$1"), List(), TypeBoundsTree(EmptyTree, EmptyTree)))))))
  private   Instrumentation (E estimator, org.apache.spark.rdd.RDD<?> dataset)  { throw new RuntimeException(); }
  private  long id ()  { throw new RuntimeException(); }
  private  java.lang.String prefix ()  { throw new RuntimeException(); }
  private  void init ()  { throw new RuntimeException(); }
  /**
   * Logs a message with a prefix that uniquely identifies the training session.
   * @param msg (undocumented)
   */
  public  void log (java.lang.String msg)  { throw new RuntimeException(); }
  /**
   * Logs the value of the given parameters for the estimator being used in this session.
   * @param params (undocumented)
   */
  public  void logParams (scala.collection.Seq<org.apache.spark.ml.param.Param<?>> params)  { throw new RuntimeException(); }
  public  void logNumFeatures (long num)  { throw new RuntimeException(); }
  public  void logNumClasses (long num)  { throw new RuntimeException(); }
  /**
   * Logs the value with customized name field.
   * @param name (undocumented)
   * @param num (undocumented)
   */
  public  void logNamedValue (java.lang.String name, long num)  { throw new RuntimeException(); }
  /**
   * Logs the successful completion of the training session and the value of the learned model.
   * @param model (undocumented)
   */
  public  void logSuccess (org.apache.spark.ml.Model<?> model)  { throw new RuntimeException(); }
}
