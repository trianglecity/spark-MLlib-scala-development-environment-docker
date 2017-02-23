package org.apache.spark.sql.catalyst.catalog;
/**
 * An interface that is implemented by logical plans to return the underlying catalog table.
 * If we can in the future consolidate SimpleCatalogRelation and MetastoreRelation, we should
 * probably remove this interface.
 */
public  interface CatalogRelation {
  public  org.apache.spark.sql.catalyst.catalog.CatalogTable catalogTable ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  ;
}
