package org.apache.spark.util;
/**
 * Find the fields accessed by a given class.
 * <p>
 * The resulting fields are stored in the mutable map passed in through the constructor.
 * This map is assumed to have its keys already populated with the classes of interest.
 * <p>
 * param:  fields the mutable map that stores the fields to return
 * param:  findTransitively if true, find fields indirectly referenced through method calls
 * param:  specificMethod if not empty, visit only this specific method
 * param:  visitedMethods a set of visited methods to avoid cycles
 */
  class FieldAccessFinder extends org.apache.xbean.asm5.ClassVisitor {
  static public  void visit (int x$1, int x$2, java.lang.String x$3, java.lang.String x$4, java.lang.String x$5, java.lang.String[] x$6)  { throw new RuntimeException(); }
  static public  void visitSource (java.lang.String x$1, java.lang.String x$2)  { throw new RuntimeException(); }
  static public  void visitOuterClass (java.lang.String x$1, java.lang.String x$2, java.lang.String x$3)  { throw new RuntimeException(); }
  static public  org.apache.xbean.asm5.AnnotationVisitor visitAnnotation (java.lang.String x$1, boolean x$2)  { throw new RuntimeException(); }
  static public  org.apache.xbean.asm5.AnnotationVisitor visitTypeAnnotation (int x$1, org.apache.xbean.asm5.TypePath x$2, java.lang.String x$3, boolean x$4)  { throw new RuntimeException(); }
  static public  void visitAttribute (org.apache.xbean.asm5.Attribute x$1)  { throw new RuntimeException(); }
  static public  void visitInnerClass (java.lang.String x$1, java.lang.String x$2, java.lang.String x$3, int x$4)  { throw new RuntimeException(); }
  static public  org.apache.xbean.asm5.FieldVisitor visitField (int x$1, java.lang.String x$2, java.lang.String x$3, java.lang.String x$4, Object x$5)  { throw new RuntimeException(); }
  static public  void visitEnd ()  { throw new RuntimeException(); }
  public   FieldAccessFinder (scala.collection.mutable.Map<java.lang.Class<?>, scala.collection.mutable.Set<java.lang.String>> fields, boolean findTransitively, scala.Option<org.apache.spark.util.MethodIdentifier<?>> specificMethod, scala.collection.mutable.Set<org.apache.spark.util.MethodIdentifier<?>> visitedMethods)  { throw new RuntimeException(); }
  public  org.apache.xbean.asm5.MethodVisitor visitMethod (int access, java.lang.String name, java.lang.String desc, java.lang.String sig, java.lang.String[] exceptions)  { throw new RuntimeException(); }
}
