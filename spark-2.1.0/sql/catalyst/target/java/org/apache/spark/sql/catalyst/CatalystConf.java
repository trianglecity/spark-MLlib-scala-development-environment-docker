package org.apache.spark.sql.catalyst;
/**
 * Interface for configuration options used in the catalyst module.
 */
public  interface CatalystConf {
  public  boolean caseSensitiveAnalysis ()  ;
  public  boolean orderByOrdinal ()  ;
  public  boolean groupByOrdinal ()  ;
  public  int optimizerMaxIterations ()  ;
  public  int optimizerInSetConversionThreshold ()  ;
  public  int maxCaseBranchesForCodegen ()  ;
  public  boolean runSQLonFile ()  ;
  public  java.lang.String warehousePath ()  ;
  /** If true, cartesian products between relations will be allowed for all
   * join types(inner, (left|right|full) outer).
   * If false, cartesian products will require explicit CROSS JOIN syntax.
   * @return (undocumented)
   */
  public  boolean crossJoinEnabled ()  ;
  /**
   * Returns the {@link Resolver} for the current configuration, which can be used to determine if two
   * identifiers are equal.
   * @return (undocumented)
   */
  public  scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver ()  ;
}
