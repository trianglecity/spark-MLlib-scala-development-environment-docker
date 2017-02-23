package org.apache.spark.launcher;
/**
 * This class makes SparkSubmitOptionParser visible for Spark code outside of the <code>launcher</code>
 * package, since Java doesn't have a feature similar to <code>private[spark]</code>, and we don't want
 * that class to be public.
 */
 abstract class SparkSubmitArgumentsParser extends org.apache.spark.launcher.SparkSubmitOptionParser {
  public   SparkSubmitArgumentsParser ()  { throw new RuntimeException(); }
}
