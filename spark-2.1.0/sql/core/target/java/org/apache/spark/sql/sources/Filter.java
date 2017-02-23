package org.apache.spark.sql.sources;
/**
 * A filter predicate for data sources.
 * <p>
 * @since 1.3.0
 */
public abstract class Filter {
  public   Filter ()  { throw new RuntimeException(); }
  /**
   * List of columns that are referenced by this filter.
   * @since 2.1.0
   * @return (undocumented)
   */
  public abstract  java.lang.String[] references ()  ;
  protected  java.lang.String[] findReferences (Object value)  { throw new RuntimeException(); }
}
