package org.apache.spark.deploy.master;
/**
 * :: DeveloperApi ::
 * <p>
 * A LeaderElectionAgent tracks current master and is a common interface for all election Agents.
 */
public  interface LeaderElectionAgent {
  public  org.apache.spark.deploy.master.LeaderElectable masterInstance ()  ;
  public  void stop ()  ;
}
