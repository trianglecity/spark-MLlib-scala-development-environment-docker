package org.apache.spark.annotation;
/**
 * A Scala annotation that specifies the Spark version when a definition was added.
 * Different from the <code>@since</code> tag in JavaDoc, this annotation does not require explicit JavaDoc and
 * hence works for overridden methods that inherit API documentation directly from parents.
 * The limitation is that it does not show up in the generated Java API documentation.
 */
  class Since extends scala.annotation.Annotation implements scala.annotation.StaticAnnotation {
  public   Since (java.lang.String version)  { throw new RuntimeException(); }
}
