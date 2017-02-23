package org.apache.spark.sql.execution.streaming.state;
/** Trait representing a provider of a specific version of a {@link StateStore}. */
public  interface StateStoreProvider {
  /** Get the store with the existing version. */
  public  org.apache.spark.sql.execution.streaming.state.StateStore getStore (long version)  ;
  /** Optional method for providers to allow for background maintenance */
  public  void doMaintenance ()  ;
}
