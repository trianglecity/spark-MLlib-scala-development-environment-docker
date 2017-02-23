package org.apache.spark.sql.execution;
public  interface DataSourceScanExec extends org.apache.spark.sql.execution.LeafExecNode, org.apache.spark.sql.execution.CodegenSupport {
  public  org.apache.spark.sql.sources.BaseRelation relation ()  ;
  public  scala.Option<org.apache.spark.sql.catalyst.TableIdentifier> metastoreTableIdentifier ()  ;
  public  java.lang.String nodeName ()  ;
}
