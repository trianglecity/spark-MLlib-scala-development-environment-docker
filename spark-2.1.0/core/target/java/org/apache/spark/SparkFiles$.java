package org.apache.spark;
/**
 * Resolves paths to files added through <code>SparkContext.addFile()</code>.
 */
public  class SparkFiles$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkFiles$ MODULE$ = null;
  public   SparkFiles$ ()  { throw new RuntimeException(); }
  /**
   * Get the absolute path of a file added through <code>SparkContext.addFile()</code>.
   * @param filename (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String get (java.lang.String filename)  { throw new RuntimeException(); }
  /**
   * Get the root directory that contains files added through <code>SparkContext.addFile()</code>.
   * @return (undocumented)
   */
  public  java.lang.String getRootDirectory ()  { throw new RuntimeException(); }
}
