package org.apache.spark.streaming.api.java;
/**
 * As a workaround for https://issues.scala-lang.org/browse/SI-8905, implementations
 * of JavaDStreamLike should extend this dummy abstract class instead of directly inheriting
 * from the trait. See SPARK-3266 for additional details.
 */
 abstract class AbstractJavaDStreamLike<T extends java.lang.Object, This extends org.apache.spark.streaming.api.java.JavaDStreamLike<T, This, R>, R extends org.apache.spark.api.java.JavaRDDLike<T, R>> implements org.apache.spark.streaming.api.java.JavaDStreamLike<T, This, R> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.streaming.api.java.JavaDStreamLike), List(TypeTree().setOriginal(Ident(TypeName("T"))), TypeTree().setOriginal(Ident(TypeName("This"))), TypeTree().setOriginal(Ident(TypeName("R"))))))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Select(Select(Select(Select(Select(Ident(org), org.apache), org.apache.spark), org.apache.spark.api), org.apache.spark.api.java), org.apache.spark.api.java.JavaRDDLike), List(TypeTree().setOriginal(Ident(TypeName("T"))), TypeTree().setOriginal(Ident(TypeName("R"))))))))
  public   AbstractJavaDStreamLike ()  { throw new RuntimeException(); }
}
