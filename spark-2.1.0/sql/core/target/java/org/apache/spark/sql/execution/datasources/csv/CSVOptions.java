package org.apache.spark.sql.execution.datasources.csv;
  class CSVOptions implements org.apache.spark.internal.Logging, scala.Serializable {
  static public  org.apache.spark.sql.execution.datasources.csv.CSVOptions apply ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.datasources.csv.CSVOptions apply (java.lang.String paramName, java.lang.String paramValue)  { throw new RuntimeException(); }
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
  private  org.apache.spark.sql.catalyst.util.CaseInsensitiveMap parameters ()  { throw new RuntimeException(); }
  // not preceding
  public   CSVOptions (org.apache.spark.sql.catalyst.util.CaseInsensitiveMap parameters)  { throw new RuntimeException(); }
  public   CSVOptions (scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  private  char getChar (java.lang.String paramName, char default_)  { throw new RuntimeException(); }
  private  int getInt (java.lang.String paramName, int default_)  { throw new RuntimeException(); }
  private  boolean getBool (java.lang.String paramName, boolean default_)  { throw new RuntimeException(); }
  public  char delimiter ()  { throw new RuntimeException(); }
  private  java.lang.String parseMode ()  { throw new RuntimeException(); }
  public  java.lang.String charset ()  { throw new RuntimeException(); }
  public  char quote ()  { throw new RuntimeException(); }
  public  char escape ()  { throw new RuntimeException(); }
  public  char comment ()  { throw new RuntimeException(); }
  public  boolean headerFlag ()  { throw new RuntimeException(); }
  public  boolean inferSchemaFlag ()  { throw new RuntimeException(); }
  public  boolean ignoreLeadingWhiteSpaceFlag ()  { throw new RuntimeException(); }
  public  boolean ignoreTrailingWhiteSpaceFlag ()  { throw new RuntimeException(); }
  public  boolean failFast ()  { throw new RuntimeException(); }
  public  boolean dropMalformed ()  { throw new RuntimeException(); }
  public  boolean permissive ()  { throw new RuntimeException(); }
  public  java.lang.String nullValue ()  { throw new RuntimeException(); }
  public  java.lang.String nanValue ()  { throw new RuntimeException(); }
  public  java.lang.String positiveInf ()  { throw new RuntimeException(); }
  public  java.lang.String negativeInf ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> compressionCodec ()  { throw new RuntimeException(); }
  public  org.apache.commons.lang3.time.FastDateFormat dateFormat ()  { throw new RuntimeException(); }
  public  org.apache.commons.lang3.time.FastDateFormat timestampFormat ()  { throw new RuntimeException(); }
  public  int maxColumns ()  { throw new RuntimeException(); }
  public  int maxCharsPerColumn ()  { throw new RuntimeException(); }
  public  boolean escapeQuotes ()  { throw new RuntimeException(); }
  public  int maxMalformedLogPerPartition ()  { throw new RuntimeException(); }
  public  boolean quoteAll ()  { throw new RuntimeException(); }
  public  int inputBufferSize ()  { throw new RuntimeException(); }
  public  boolean isCommentSet ()  { throw new RuntimeException(); }
}
