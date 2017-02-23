package org.apache.spark.ml.param;
/**
 * A param to value map.
 */
public final class ParamMap implements scala.Serializable {
  /**
   * Returns an empty param map.
   * @return (undocumented)
   */
  static public  org.apache.spark.ml.param.ParamMap empty ()  { throw new RuntimeException(); }
  /**
   * Puts a list of param pairs (overwrites if the input params exists).
   * @param paramPairs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.ParamMap put (org.apache.spark.ml.param.ParamPair<?>... paramPairs)  { throw new RuntimeException(); }
  // not preceding
  private  scala.collection.mutable.Map<org.apache.spark.ml.param.Param<java.lang.Object>, java.lang.Object> map ()  { throw new RuntimeException(); }
  // not preceding
     ParamMap (scala.collection.mutable.Map<org.apache.spark.ml.param.Param<java.lang.Object>, java.lang.Object> map)  { throw new RuntimeException(); }
  /**
   * Creates an empty param map.
   */
  public   ParamMap ()  { throw new RuntimeException(); }
  /**
   * Puts a (param, value) pair (overwrites if the input param exists).
   * @param param (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.ml.param.ParamMap put (org.apache.spark.ml.param.Param<T> param, T value)  { throw new RuntimeException(); }
  /**
   * Puts a list of param pairs (overwrites if the input params exists).
   * @param paramPairs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.ParamMap put (scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> paramPairs)  { throw new RuntimeException(); }
  /** Put param pairs with a {@link java.util.List} of values for Python. */
    org.apache.spark.ml.param.ParamMap put (java.util.List<org.apache.spark.ml.param.ParamPair<?>> paramPairs)  { throw new RuntimeException(); }
  /**
   * Optionally returns the value associated with a param.
   * @param param (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Option<T> get (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  /**
   * Returns the value associated with a param or a default value.
   * @param param (undocumented)
   * @param default_ (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T getOrElse (org.apache.spark.ml.param.Param<T> param, T default_)  { throw new RuntimeException(); }
  /**
   * Gets the value of the input param or its default value if it does not exist.
   * Raises a NoSuchElementException if there is no value associated with the input param.
   * @param param (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T apply (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  /**
   * Checks whether a parameter is explicitly specified.
   * @param param (undocumented)
   * @return (undocumented)
   */
  public  boolean contains (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  /**
   * Removes a key from this map and returns its value associated previously as an option.
   * @param param (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Option<T> remove (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  /**
   * Filters this param map for the given parent.
   * @param parent (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.ParamMap filter (org.apache.spark.ml.param.Params parent)  { throw new RuntimeException(); }
  /**
   * Creates a copy of this param map.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.ParamMap copy ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Converts this param map to a sequence of param pairs.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> toSeq ()  { throw new RuntimeException(); }
  /** Java-friendly method for Python API */
    java.util.List<org.apache.spark.ml.param.ParamPair<?>> toList ()  { throw new RuntimeException(); }
  /**
   * Number of param pairs in this map.
   * @return (undocumented)
   */
  public  int size ()  { throw new RuntimeException(); }
}
