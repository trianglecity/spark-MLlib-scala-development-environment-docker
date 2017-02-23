package org.apache.spark.ml.source.libsvm;
/**
 * <code>libsvm</code> package implements Spark SQL data source API for loading LIBSVM data as <code>DataFrame</code>.
 * The loaded <code>DataFrame</code> has two columns: <code>label</code> containing labels stored as doubles and
 * <code>features</code> containing feature vectors stored as <code>Vector</code>s.
 * <p>
 * To use LIBSVM data source, you need to set "libsvm" as the format in <code>DataFrameReader</code> and
 * optionally specify options, for example:
 * <pre><code>
 *   // Scala
 *   val df = spark.read.format("libsvm")
 *     .option("numFeatures", "780")
 *     .load("data/mllib/sample_libsvm_data.txt")
 *
 *   // Java
 *   Dataset&lt;Row&gt; df = spark.read().format("libsvm")
 *     .option("numFeatures, "780")
 *     .load("data/mllib/sample_libsvm_data.txt");
 * </code></pre>
 * <p>
 * LIBSVM data source supports the following options:
 *  - "numFeatures": number of features.
 *    If unspecified or nonpositive, the number of features will be determined automatically at the
 *    cost of one additional pass.
 *    This is also useful when the dataset is already split into multiple files and you want to load
 *    them separately, because some features may not present in certain files, which leads to
 *    inconsistent feature dimensions.
 *  - "vectorType": feature vector type, "sparse" (default) or "dense".
 * <p>
 * @note This class is public for documentation purpose. Please don't use this class directly.
 * Rather, use the data source API as illustrated above.
 * <p>
 * @see <a href="https://www.csie.ntu.edu.tw/~cjlin/libsvmtools/datasets/">LIBSVM datasets</a>
 */
public  class LibSVMDataSource {
  private   LibSVMDataSource ()  { throw new RuntimeException(); }
}
