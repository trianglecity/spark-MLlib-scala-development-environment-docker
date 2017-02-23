package org.apache.spark.mllib.stat.test;
/**
 * Companion object holding supported {@link StreamingTestMethod} names and handles conversion between
 * strings used in {@link StreamingTest} configuration and actual method implementation.
 * <p>
 * Currently supported tests: <code>welch</code>, <code>student</code>.
 */
public  class StreamingTestMethod$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StreamingTestMethod$ MODULE$ = null;
  public   StreamingTestMethod$ ()  { throw new RuntimeException(); }
  private final  scala.collection.immutable.Map<java.lang.String, org.apache.spark.mllib.stat.test.StreamingTestMethod> TEST_NAME_TO_OBJECT ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.stat.test.StreamingTestMethod getTestMethodFromName (java.lang.String method)  { throw new RuntimeException(); }
}
