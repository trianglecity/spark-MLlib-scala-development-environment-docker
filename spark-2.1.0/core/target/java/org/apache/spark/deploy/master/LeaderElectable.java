package org.apache.spark.deploy.master;
public  interface LeaderElectable {
  public  void electedLeader ()  ;
  public  void revokedLeadership ()  ;
}
