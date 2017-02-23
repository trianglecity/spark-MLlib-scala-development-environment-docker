package org.apache.spark.ui;
/**
 * A paged table that will generate a HTML table for a specified page and also the page navigation.
 */
  interface PagedTable<T extends java.lang.Object> {
  public  java.lang.String tableId ()  ;
  public  java.lang.String tableCssClass ()  ;
  public  java.lang.String pageSizeFormField ()  ;
  public  java.lang.String prevPageSizeFormField ()  ;
  public  java.lang.String pageNumberFormField ()  ;
  public  org.apache.spark.ui.PagedDataSource<T> dataSource ()  ;
  public  scala.collection.Seq<scala.xml.Node> headers ()  ;
  public  scala.collection.Seq<scala.xml.Node> row (T t)  ;
  public  scala.collection.Seq<scala.xml.Node> table (int page)  ;
  /**
   * Return a page navigation.
   * <ul>
   *   <li>If the totalPages is 1, the page navigation will be empty</li>
   *   <li>
   *     If the totalPages is more than 1, it will create a page navigation including a group of
   *     page numbers and a form to submit the page number.
   *   </li>
   * </ul>
   * <p>
   * Here are some examples of the page navigation:
   * <pre><code>
   * &lt;&lt; &lt; 11 12 13* 14 15 16 17 18 19 20 &gt; &gt;&gt;
   *
   * This is the first group, so "&lt;&lt;" is hidden.
   * &lt; 1 2* 3 4 5 6 7 8 9 10 &gt; &gt;&gt;
   *
   * This is the first group and the first page, so "&lt;&lt;" and "&lt;" are hidden.
   * 1* 2 3 4 5 6 7 8 9 10 &gt; &gt;&gt;
   *
   * Assume totalPages is 19. This is the last group, so "&gt;&gt;" is hidden.
   * &lt;&lt; &lt; 11 12 13* 14 15 16 17 18 19 &gt;
   *
   * Assume totalPages is 19. This is the last group and the last page, so "&gt;&gt;" and "&gt;" are hidden.
   * &lt;&lt; &lt; 11 12 13 14 15 16 17 18 19*
   *
   * * means the current page number
   * &lt;&lt; means jumping to the first page of the previous group.
   * &lt; means jumping to the previous page.
   * &gt;&gt; means jumping to the first page of the next group.
   * &gt; means jumping to the next page.
   * </code></pre>
   * @param page (undocumented)
   * @param pageSize (undocumented)
   * @param totalPages (undocumented)
   * @return (undocumented)
   */
    scala.collection.Seq<scala.xml.Node> pageNavigation (int page, int pageSize, int totalPages)  ;
  /**
   * Return a link to jump to a page.
   * @param page (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String pageLink (int page)  ;
  /**
   * Returns the submission path for the "go to page #" form.
   * @return (undocumented)
   */
  public  java.lang.String goButtonFormPath ()  ;
}
