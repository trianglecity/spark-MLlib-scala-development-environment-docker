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
public  class CausedBy {
  static public  scala.Option<java.lang.Throwable> unapply (java.lang.Throwable e)  { throw new RuntimeException(); }
}
