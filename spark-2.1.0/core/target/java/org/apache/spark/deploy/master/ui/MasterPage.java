package org.apache.spark.deploy.master.ui;
  class MasterPage extends org.apache.spark.ui.WebUIPage {
  public   MasterPage (org.apache.spark.deploy.master.ui.MasterWebUI parent)  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointRef master ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.DeployMessages.MasterStateResponse getMasterState ()  { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JValue renderJson (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  public  void handleAppKillRequest (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  public  void handleDriverKillRequest (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  private  void handleKillRequest (javax.servlet.http.HttpServletRequest request, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> action)  { throw new RuntimeException(); }
  /** Index view listing applications and executors */
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> workerRow (org.apache.spark.deploy.master.WorkerInfo worker)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> appRow (org.apache.spark.deploy.master.ApplicationInfo app)  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> driverRow (org.apache.spark.deploy.master.DriverInfo driver)  { throw new RuntimeException(); }
}
