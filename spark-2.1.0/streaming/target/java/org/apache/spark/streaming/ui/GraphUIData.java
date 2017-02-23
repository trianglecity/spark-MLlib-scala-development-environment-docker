package org.apache.spark.streaming.ui;
/**
 * A helper class to generate JavaScript and HTML for both timeline and histogram graphs.
 * <p>
 * param:  timelineDivId the timeline <code>id</code> used in the html <code>div</code> tag
 * param:  histogramDivId the timeline <code>id</code> used in the html <code>div</code> tag
 * param:  data the data for the graph
 * param:  minX the min value of X axis
 * param:  maxX the max value of X axis
 * param:  minY the min value of Y axis
 * param:  maxY the max value of Y axis
 * param:  unitY the unit of Y axis
 * param:  batchInterval if <code>batchInterval</code> is not None, we will draw a line for <code>batchInterval</code> in
 *                      the graph
 */
  class GraphUIData {
  public   GraphUIData (java.lang.String timelineDivId, java.lang.String histogramDivId, scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> data, long minX, long maxX, double minY, double maxY, java.lang.String unitY, scala.Option<java.lang.Object> batchInterval)  { throw new RuntimeException(); }
  private  java.lang.String dataJavaScriptName ()  { throw new RuntimeException(); }
  public  void generateDataJs (org.apache.spark.streaming.ui.JsCollector jsCollector)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> generateTimelineHtml (org.apache.spark.streaming.ui.JsCollector jsCollector)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> generateHistogramHtml (org.apache.spark.streaming.ui.JsCollector jsCollector)  { throw new RuntimeException(); }
}
