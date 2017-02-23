package org.apache.spark.ml.util;
/**
 * Trait for objects that provide {@link MLReader}.
 * <p>
 * @tparam T ML instance type
 */
public  interface MLReadable<T extends java.lang.Object> {
  /**
   * Returns an {@link MLReader} instance for this class.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.MLReader<T> read ()  ;
  /**
   * Reads an ML instance from the input path, a shortcut of <code>read.load(path)</code>.
   * <p>
   * @note Implementing classes should override this to be Java-friendly.
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  T load (java.lang.String path)  ;
}
