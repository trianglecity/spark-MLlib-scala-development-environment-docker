package org.apache.spark.sql.execution;
/**
 * Physical version of <code>ObjectProducer</code>.
 */
public  interface ObjectProducerExec {
  public  org.apache.spark.sql.catalyst.expressions.Attribute outputObjAttr ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  ;
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  ;
  public  org.apache.spark.sql.types.DataType outputObjectType ()  ;
}
