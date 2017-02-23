package org.apache.spark.util;
/**
 * A class loader which makes some protected methods in ClassLoader accessible.
 */
  class ParentClassLoader extends java.lang.ClassLoader {
  public   ParentClassLoader (java.lang.ClassLoader parent)  { throw new RuntimeException(); }
  public  java.lang.Class<?> findClass (java.lang.String name)  { throw new RuntimeException(); }
  public  java.lang.Class<?> loadClass (java.lang.String name)  { throw new RuntimeException(); }
  public  java.lang.Class<?> loadClass (java.lang.String name, boolean resolve)  { throw new RuntimeException(); }
}
