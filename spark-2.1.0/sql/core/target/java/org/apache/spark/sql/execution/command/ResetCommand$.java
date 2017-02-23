package org.apache.spark.sql.execution.command;
/**
 * This command is for resetting SQLConf to the default values. Command that runs
 * <pre><code>
 *   reset;
 * </code></pre>
 */
public  class ResetCommand$ extends org.apache.spark.sql.catalyst.plans.logical.LeafNode implements org.apache.spark.sql.execution.command.RunnableCommand, org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ResetCommand$ MODULE$ = null;
  public   ResetCommand$ ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.Row> run (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
}
