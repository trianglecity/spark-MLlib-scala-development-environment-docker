package org.apache.spark.sql.catalyst.util;
/**
 * Shim to allow us to implement {@link scala.Iterator} in Java. Scala 2.11+ has an AbstractIterator
 * class for this, but that class is <code>private[scala]</code> in 2.10. We need to explicitly fix this to
 * <code>Row</code> in order to work around a spurious IntelliJ compiler error. This cannot be an abstract
 * class because that leads to compilation errors under Scala 2.11.
 */
public  class AbstractScalaRowIterator<T extends java.lang.Object> implements scala.collection.Iterator<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   AbstractScalaRowIterator ()  { throw new RuntimeException(); }
  public  boolean hasNext ()  { throw new RuntimeException(); }
  public  T next ()  { throw new RuntimeException(); }
}
