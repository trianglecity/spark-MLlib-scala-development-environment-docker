package org.apache.spark.streaming.ui;
/**
 * A helper class that allows the user to add JavaScript statements which will be executed when the
 * DOM has finished loading.
 */
  class JsCollector {
  public   JsCollector ()  { throw new RuntimeException(); }
  private  int variableId ()  { throw new RuntimeException(); }
  /**
   * Return the next unused JavaScript variable name
   * @return (undocumented)
   */
  public  java.lang.String nextVariableName ()  { throw new RuntimeException(); }
  /**
   * JavaScript statements that will execute before <code>statements</code>
   * @return (undocumented)
   */
  private  scala.collection.mutable.ArrayBuffer<java.lang.String> preparedStatements ()  { throw new RuntimeException(); }
  /**
   * JavaScript statements that will execute after <code>preparedStatements</code>
   * @return (undocumented)
   */
  private  scala.collection.mutable.ArrayBuffer<java.lang.String> statements ()  { throw new RuntimeException(); }
  public  void addPreparedStatement (java.lang.String js)  { throw new RuntimeException(); }
  public  void addStatement (java.lang.String js)  { throw new RuntimeException(); }
  /**
   * Generate a html snippet that will execute all scripts when the DOM has finished loading.
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.xml.Node> toHtml ()  { throw new RuntimeException(); }
}
