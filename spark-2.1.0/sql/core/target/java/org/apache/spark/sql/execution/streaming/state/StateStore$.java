package org.apache.spark.sql.execution.streaming.state;
/**
 * Companion object to {@link StateStore} that provides helper methods to create and retrieve stores
 * by their unique ids. In addition, when a SparkContext is active (i.e. SparkEnv.get is not null),
 * it also runs a periodic background task to do maintenance on the loaded stores. For each
 * store, it uses the {@link StateStoreCoordinator} to ensure whether the current loaded instance of
 * the store is the active instance. Accordingly, it either keeps it loaded and performs
 * maintenance, or unloads the store.
 */
public  class StateStore$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StateStore$ MODULE$ = null;
  public   StateStore$ ()  { throw new RuntimeException(); }
  public  java.lang.String MAINTENANCE_INTERVAL_CONFIG ()  { throw new RuntimeException(); }
  public  int MAINTENANCE_INTERVAL_DEFAULT_SECS ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.sql.execution.streaming.state.StateStoreId, org.apache.spark.sql.execution.streaming.state.StateStoreProvider> loadedProviders ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledExecutorService maintenanceTaskExecutor ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledFuture<?> maintenanceTask ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.state.StateStoreCoordinatorRef _coordRef ()  { throw new RuntimeException(); }
  /** Get or create a store associated with the id. */
  public  org.apache.spark.sql.execution.streaming.state.StateStore get (org.apache.spark.sql.execution.streaming.state.StateStoreId storeId, org.apache.spark.sql.types.StructType keySchema, org.apache.spark.sql.types.StructType valueSchema, long version, org.apache.spark.sql.execution.streaming.state.StateStoreConf storeConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /** Unload a state store provider */
  public  void unload (org.apache.spark.sql.execution.streaming.state.StateStoreId storeId)  { throw new RuntimeException(); }
  /** Whether a state store provider is loaded or not */
  public  boolean isLoaded (org.apache.spark.sql.execution.streaming.state.StateStoreId storeId)  { throw new RuntimeException(); }
  public  boolean isMaintenanceRunning ()  { throw new RuntimeException(); }
  /** Unload and stop all state store providers */
  public  void stop ()  { throw new RuntimeException(); }
  /** Start the periodic maintenance task if not already started and if Spark active */
  private  void startMaintenanceIfNeeded ()  { throw new RuntimeException(); }
  /**
   * Execute background maintenance task in all the loaded store providers if they are still
   * the active instances according to the coordinator.
   */
  private  void doMaintenance ()  { throw new RuntimeException(); }
  private  void reportActiveStoreInstance (org.apache.spark.sql.execution.streaming.state.StateStoreId storeId)  { throw new RuntimeException(); }
  private  boolean verifyIfStoreInstanceActive (org.apache.spark.sql.execution.streaming.state.StateStoreId storeId)  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.execution.streaming.state.StateStoreCoordinatorRef> coordinatorRef ()  { throw new RuntimeException(); }
}
