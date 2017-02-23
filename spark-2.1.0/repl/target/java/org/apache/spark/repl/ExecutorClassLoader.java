package org.apache.spark.repl;
/**
 * A ClassLoader that reads classes from a Hadoop FileSystem or HTTP URI,
 * used to load classes defined by the interpreter when the REPL is used.
 * Allows the user to specify if user class path should be first.
 * This class loader delegates getting/finding resources to parent loader,
 * which makes sense until REPL never provide resource dynamically.
 */
public  class ExecutorClassLoader extends java.lang.ClassLoader implements org.apache.spark.internal.Logging {
  public   ExecutorClassLoader (org.apache.spark.SparkConf conf, org.apache.spark.SparkEnv env, java.lang.String classUri, java.lang.ClassLoader parent, boolean userClassPathFirst)  { throw new RuntimeException(); }
  public  java.net.URI uri ()  { throw new RuntimeException(); }
  public  java.lang.String directory ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.ParentClassLoader parentLoader ()  { throw new RuntimeException(); }
    int httpUrlConnectionTimeoutMillis ()  { throw new RuntimeException(); }
  private  scala.Function1<java.lang.String, java.io.InputStream> fetchFn ()  { throw new RuntimeException(); }
  public  java.net.URL getResource (java.lang.String name)  { throw new RuntimeException(); }
  public  java.util.Enumeration<java.net.URL> getResources (java.lang.String name)  { throw new RuntimeException(); }
  public  java.lang.Class<?> findClass (java.lang.String name)  { throw new RuntimeException(); }
  private  java.io.InputStream getClassFileInputStreamFromSparkRPC (java.lang.String path)  { throw new RuntimeException(); }
  private  java.io.InputStream getClassFileInputStreamFromHttpServer (java.lang.String pathInDirectory)  { throw new RuntimeException(); }
  private  java.io.InputStream getClassFileInputStreamFromFileSystem (org.apache.hadoop.fs.FileSystem fileSystem, java.lang.String pathInDirectory)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Class<?>> findClassLocally (java.lang.String name)  { throw new RuntimeException(); }
  public  byte[] readAndTransformClass (java.lang.String name, java.io.InputStream in)  { throw new RuntimeException(); }
  /**
   * URL-encode a string, preserving only slashes
   * @param str (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String urlEncode (java.lang.String str)  { throw new RuntimeException(); }
}
