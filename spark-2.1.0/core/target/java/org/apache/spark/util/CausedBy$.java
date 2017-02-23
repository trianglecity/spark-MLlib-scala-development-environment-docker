package org.apache.spark.util;
/**
 * Extractor Object for pulling out the root cause of an error.
 * If the error contains no cause, it will return the error itself.
 * <p>
 * Usage:
 * try {
 *   ...
 * } catch {
 *   case CausedBy(ex: CommitDeniedException) =&gt; ...
 * }
 */
public  class CausedBy$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CausedBy$ MODULE$ = null;
  public   CausedBy$ ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Throwable> unapply (java.lang.Throwable e)  { throw new RuntimeException(); }
}
