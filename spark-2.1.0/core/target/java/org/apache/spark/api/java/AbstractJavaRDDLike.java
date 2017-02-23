package org.apache.spark.api.java;
/**
 * As a workaround for https://issues.scala-lang.org/browse/SI-8905, implementations
 * of JavaRDDLike should extend this dummy abstract class instead of directly inheriting
 * from the trait. See SPARK-3266 for additional details.
 */
 abstract class AbstractJavaRDDLike<T extends java.lang.Object, This extends org.apache.spark.api.java.JavaRDDLike<T, This>> implements org.apache.spark.api.java.JavaRDDLike<T, This> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.api.java.JavaRDDLike), List(TypeTree().setOriginal(Ident(TypeName("T"))), TypeTree().setOriginal(Ident(TypeName("This"))))))))
  public   AbstractJavaRDDLike ()  { throw new RuntimeException(); }
}
