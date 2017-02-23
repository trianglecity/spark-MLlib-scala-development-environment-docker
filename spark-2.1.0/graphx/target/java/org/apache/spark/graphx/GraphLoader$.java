package org.apache.spark.graphx;
/**
 * Provides utilities for loading {@link Graph}s from files.
 */
public  class GraphLoader$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GraphLoader$ MODULE$ = null;
  public   GraphLoader$ ()  { throw new RuntimeException(); }
  /**
   * Loads a graph from an edge list formatted file where each line contains two integers: a source
   * id and a target id. Skips lines that begin with <code>#</code>.
   * <p>
   * If desired the edges can be automatically oriented in the positive
   * direction (source Id is less than target Id) by setting <code>canonicalOrientation</code> to
   * true.
   * <p>
   * @example Loads a file in the following format:
   * <pre><code>
   * # Comment Line
   * # Source Id &lt;\t&gt; Target Id
   * 1   -5
   * 1    2
   * 2    7
   * 1    8
   * </code></pre>
   * <p>
   * @param sc SparkContext
   * @param path the path to the file (e.g., /home/data/file or hdfs://file)
   * @param canonicalOrientation whether to orient edges in the positive
   *        direction
   * @param numEdgePartitions the number of partitions for the edge RDD
   * Setting this value to -1 will use the default parallelism.
   * @param edgeStorageLevel the desired storage level for the edge partitions
   * @param vertexStorageLevel the desired storage level for the vertex partitions
   * @return (undocumented)
   */
  public  org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> edgeListFile (org.apache.spark.SparkContext sc, java.lang.String path, boolean canonicalOrientation, int numEdgePartitions, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel)  { throw new RuntimeException(); }
}
