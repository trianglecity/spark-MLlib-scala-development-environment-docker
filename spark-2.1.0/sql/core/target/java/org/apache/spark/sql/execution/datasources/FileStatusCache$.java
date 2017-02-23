package org.apache.spark.sql.execution.datasources;
public  class FileStatusCache$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FileStatusCache$ MODULE$ = null;
  public   FileStatusCache$ ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.SharedInMemoryCache sharedCache ()  { throw new RuntimeException(); }
  /**
   * @return a new FileStatusCache based on session configuration. Cache memory quota is
   *         shared across all clients.
   * @param session (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.FileStatusCache newCache (org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
  public  void resetForTesting ()  { throw new RuntimeException(); }
}
