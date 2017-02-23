package org.apache.spark.launcher;
/**
 * This class is used by CommandUtils. It uses some package-private APIs in SparkLauncher, and since
 * Java doesn't have a feature similar to <code>private[spark]</code>, and we don't want that class to be
 * public, needs to live in the same package as the rest of the library.
 */
  class WorkerCommandBuilder extends org.apache.spark.launcher.AbstractCommandBuilder {
  public   WorkerCommandBuilder (java.lang.String sparkHome, int memoryMb, org.apache.spark.deploy.Command command)  { throw new RuntimeException(); }
  public  java.util.List<java.lang.String> buildCommand (java.util.Map<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
  public  java.util.List<java.lang.String> buildCommand ()  { throw new RuntimeException(); }
}
