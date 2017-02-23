package org.apache.spark.util;
/**
 * URL class loader that exposes the <code>addURL</code> and <code>getURLs</code> methods in URLClassLoader.
 */
  class MutableURLClassLoader extends java.net.URLClassLoader {
  public   MutableURLClassLoader (java.net.URL[] urls, java.lang.ClassLoader parent)  { throw new RuntimeException(); }
  public  void addURL (java.net.URL url)  { throw new RuntimeException(); }
  public  java.net.URL[] getURLs ()  { throw new RuntimeException(); }
}
