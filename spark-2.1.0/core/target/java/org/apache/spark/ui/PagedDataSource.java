package org.apache.spark.ui;
/**
 * A data source that provides data for a page.
 * <p>
 * param:  pageSize the number of rows in a page
 */
 abstract class PagedDataSource<T extends java.lang.Object> {
  public  int pageSize ()  { throw new RuntimeException(); }
  // not preceding
  public   PagedDataSource (int pageSize)  { throw new RuntimeException(); }
  /**
   * Return the size of all data.
   * @return (undocumented)
   */
  protected abstract  int dataSize ()  ;
  /**
   * Slice a range of data.
   * @param from (undocumented)
   * @param to (undocumented)
   * @return (undocumented)
   */
  protected abstract  scala.collection.Seq<T> sliceData (int from, int to)  ;
  /**
   * Slice the data for this page
   * @param page (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ui.PageData<T> pageData (int page)  { throw new RuntimeException(); }
}
