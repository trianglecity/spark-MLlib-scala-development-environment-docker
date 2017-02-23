package org.apache.spark.util;
/**
 * A mutable class loader that gives preference to its own URLs over the parent class loader
 * when loading classes and resources.
 */
  class ChildFirstURLClassLoader extends org.apache.spark.util.MutableURLClassLoader {
  public   ChildFirstURLClassLoader (java.net.URL[] urls, java.lang.ClassLoader parent)  { throw new RuntimeException(); }
  private  org.apache.spark.util.ParentClassLoader parentClassLoader ()  { throw new RuntimeException(); }
  public  java.lang.Class<?> loadClass (java.lang.String name, boolean resolve)  { throw new RuntimeException(); }
  public  java.net.URL getResource (java.lang.String name)  { throw new RuntimeException(); }
  public  java.util.Enumeration<java.net.URL> getResources (java.lang.String name)  { throw new RuntimeException(); }
  public  void addURL (java.net.URL url)  { throw new RuntimeException(); }
}
