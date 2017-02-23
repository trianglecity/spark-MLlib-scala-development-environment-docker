package org.apache.spark.ui;
/** Utility functions for generating XML pages with spark content. */
public  class UIUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final UIUtils$ MODULE$ = null;
  public   UIUtils$ ()  { throw new RuntimeException(); }
  public  java.lang.String TABLE_CLASS_NOT_STRIPED ()  { throw new RuntimeException(); }
  public  java.lang.String TABLE_CLASS_STRIPED ()  { throw new RuntimeException(); }
  public  java.lang.String TABLE_CLASS_STRIPED_SORTABLE ()  { throw new RuntimeException(); }
  private  java.lang.ThreadLocal<java.text.SimpleDateFormat> dateFormat ()  { throw new RuntimeException(); }
  public  java.lang.String formatDate (java.util.Date date)  { throw new RuntimeException(); }
  public  java.lang.String formatDate (long timestamp)  { throw new RuntimeException(); }
  public  java.lang.String formatDuration (long milliseconds)  { throw new RuntimeException(); }
  /** Generate a verbose human-readable string representing a duration such as "5 second 35 ms" */
  public  java.lang.String formatDurationVerbose (long ms)  { throw new RuntimeException(); }
  /** Generate a human-readable string representing a number (e.g. 100 K) */
  public  java.lang.String formatNumber (double records)  { throw new RuntimeException(); }
  public  java.lang.String uiRoot ()  { throw new RuntimeException(); }
  public  java.lang.String prependBaseUri (java.lang.String basePath, java.lang.String resource)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> commonHeaderNodes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> vizHeaderNodes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> dataTablesHeaderNodes ()  { throw new RuntimeException(); }
  /** Returns a spark page with correctly formatted headers */
  public  scala.collection.Seq<scala.xml.Node> headerSparkPage (java.lang.String title, scala.Function0<scala.collection.Seq<scala.xml.Node>> content, org.apache.spark.ui.SparkUITab activeTab, scala.Option<java.lang.Object> refreshInterval, scala.Option<java.lang.String> helpText, boolean showVisualization, boolean useDataTables)  { throw new RuntimeException(); }
  /** Returns a page with the spark css/js and a simple format. Used for scheduler UI. */
  public  scala.collection.Seq<scala.xml.Node> basicSparkPage (scala.Function0<scala.collection.Seq<scala.xml.Node>> content, java.lang.String title, boolean useDataTables)  { throw new RuntimeException(); }
  /** Returns an HTML table constructed by generating a row for each object in a sequence. */
  public <T extends java.lang.Object> scala.collection.Seq<scala.xml.Node> listingTable (scala.collection.Seq<java.lang.String> headers, scala.Function1<T, scala.collection.Seq<scala.xml.Node>> generateDataRow, scala.collection.Iterable<T> data, boolean fixedWidth, scala.Option<java.lang.String> id, scala.collection.Seq<java.lang.String> headerClasses, boolean stripeRowsWithCss, boolean sortable)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> makeProgressBar (int started, int completed, int failed, int skipped, int killed, int total)  { throw new RuntimeException(); }
  /** Return a "DAG visualization" DOM element that expands into a visualization for a stage. */
  public  scala.collection.Seq<scala.xml.Node> showDagVizForStage (int stageId, scala.Option<org.apache.spark.ui.scope.RDDOperationGraph> graph)  { throw new RuntimeException(); }
  /** Return a "DAG visualization" DOM element that expands into a visualization for a job. */
  public  scala.collection.Seq<scala.xml.Node> showDagVizForJob (int jobId, scala.collection.Seq<org.apache.spark.ui.scope.RDDOperationGraph> graphs)  { throw new RuntimeException(); }
  /**
   * Return a "DAG visualization" DOM element that expands into a visualization on the UI.
   * <p>
   * This populates metadata necessary for generating the visualization on the front-end in
   * a format that is expected by spark-dag-viz.js. Any changes in the format here must be
   * reflected there.
   * @param graphs (undocumented)
   * @param forJob (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<scala.xml.Node> showDagViz (scala.collection.Seq<org.apache.spark.ui.scope.RDDOperationGraph> graphs, boolean forJob)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> tooltip (java.lang.String text, java.lang.String position)  { throw new RuntimeException(); }
  /**
   * Returns HTML rendering of a job or stage description. It will try to parse the string as HTML
   * and make sure that it only contains anchors with root-relative links. Otherwise,
   * the whole string will rendered as a simple escaped text.
   * <p>
   * Note: In terms of security, only anchor tags with root relative links are supported. So any
   * attempts to embed links outside Spark UI, or other tags like {@code <script>} will cause in
   * the whole description to be treated as plain text.
   * <p>
   * @param desc        the original job or stage description string, which may contain html tags.
   * @param basePathUri with which to prepend the relative links; this is used when plainText is
   *                    false.
   * @param plainText   whether to keep only plain text (i.e. remove html tags) from the original
   *                    description string.
   * @return the HTML rendering of the job or stage description, which will be a Text when plainText
   *         is true, and an Elem otherwise.
   */
  public  scala.xml.NodeSeq makeDescription (java.lang.String desc, java.lang.String basePathUri, boolean plainText)  { throw new RuntimeException(); }
  /**
   * Decode URLParameter if URL is encoded by YARN-WebAppProxyServlet.
   * Due to YARN-2844: WebAppProxyServlet cannot handle urls which contain encoded characters
   * Therefore we need to decode it until we get the real URLParameter.
   * @param urlParam (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String decodeURLParameter (java.lang.String urlParam)  { throw new RuntimeException(); }
  public  int getTimeZoneOffset ()  { throw new RuntimeException(); }
  /**
   * Return the correct Href after checking if master is running in the
   * reverse proxy mode or not.
   * @param proxy (undocumented)
   * @param id (undocumented)
   * @param origHref (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String makeHref (boolean proxy, java.lang.String id, java.lang.String origHref)  { throw new RuntimeException(); }
}
