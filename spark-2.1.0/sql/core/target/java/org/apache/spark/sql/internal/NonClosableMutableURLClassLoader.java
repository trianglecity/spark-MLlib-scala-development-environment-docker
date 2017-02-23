package org.apache.spark.sql.internal;
/**
 * URL class loader that exposes the <code>addURL</code> and <code>getURLs</code> methods in URLClassLoader.
 * This class loader cannot be closed (its <code>close</code> method is a no-op).
 */
  class NonClosableMutableURLClassLoader extends org.apache.spark.util.MutableURLClassLoader {
  public   NonClosableMutableURLClassLoader (java.lang.ClassLoader parent)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
