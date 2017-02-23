package org.apache.spark.deploy.history;
/**
 *  A probe which can be invoked to see if a loaded Web UI has been updated.
 *  The probe is expected to be relative purely to that of the UI returned
 *  in the same {@link LoadedAppUI} instance. That is, whenever a new UI is loaded,
 *  the probe returned with it is the one that must be used to check for it
 *  being out of date; previous probes must be discarded.
 */
 abstract class HistoryUpdateProbe {
  public   HistoryUpdateProbe ()  { throw new RuntimeException(); }
  /**
   * Return true if the history provider has a later version of the application
   * attempt than the one against this probe was constructed.
   * @return
   */
  public abstract  boolean isUpdated ()  ;
}
