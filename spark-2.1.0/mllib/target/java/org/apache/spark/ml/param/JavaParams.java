package org.apache.spark.ml.param;
/**
 * :: DeveloperApi ::
 * Java-friendly wrapper for {@link Params}.
 * Java developers who need to extend {@link Params} should use this class instead.
 * If you need to extend an abstract class which already extends {@link Params}, then that abstract
 * class should be Java-friendly as well.
 */
public abstract class JavaParams implements org.apache.spark.ml.param.Params {
  public   JavaParams ()  { throw new RuntimeException(); }
}
