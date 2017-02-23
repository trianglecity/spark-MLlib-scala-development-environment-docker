package org.apache.spark.examples.streaming.clickstream;
/**
 * Generates streaming events to simulate page views on a website.
 * <p>
 * This should be used in tandem with PageViewStream.scala. Example:
 * <p>
 * To run the generator
 * <code>$ bin/run-example org.apache.spark.examples.streaming.clickstream.PageViewGenerator 44444 10</code>
 * To process the generated stream
 * <code>$ bin/run-example \
 *    org.apache.spark.examples.streaming.clickstream.PageViewStream errorRatePerZipCode localhost 44444</code>
 * <p>
 */
public  class PageViewGenerator {
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> pages ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> httpStatus ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> userZipCode ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> userID ()  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T pickFromDistribution (scala.collection.immutable.Map<T, java.lang.Object> inputMap)  { throw new RuntimeException(); }
  static public  java.lang.String getNextClickEvent ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
