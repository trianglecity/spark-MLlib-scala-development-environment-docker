package org.apache.spark.ml.param;
/**
 * :: DeveloperApi ::
 * Trait for components that take parameters. This also provides an internal param map to store
 * parameter values attached to the instance.
 */
public  interface Params extends org.apache.spark.ml.util.Identifiable, scala.Serializable {
  /**
   * Returns all params sorted by their names. The default implementation uses Java reflection to
   * list all public methods that have no arguments and return {@link Param}.
   * <p>
   * @note Developer should not use this method in constructor because we cannot guarantee that
   * this variable gets initialized before other params.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<?>[] params ()  ;
  /**
   * Explains a param.
   * @param param input param, must belong to this instance.
   * @return a string that contains the input param name, doc, and optionally its default value and
   *         the user-supplied value
   */
  public  java.lang.String explainParam (org.apache.spark.ml.param.Param<?> param)  ;
  /**
   * Explains all params of this instance. See <code>explainParam()</code>.
   * @return (undocumented)
   */
  public  java.lang.String explainParams ()  ;
  /** Checks whether a param is explicitly set. */
  public  boolean isSet (org.apache.spark.ml.param.Param<?> param)  ;
  /** Checks whether a param is explicitly set or has a default value. */
  public  boolean isDefined (org.apache.spark.ml.param.Param<?> param)  ;
  /** Tests whether this instance contains a param with a given name. */
  public  boolean hasParam (java.lang.String paramName)  ;
  /** Gets a param by its name. */
  public  org.apache.spark.ml.param.Param<java.lang.Object> getParam (java.lang.String paramName)  ;
  /**
   * Sets a parameter in the embedded param map.
   * @param param (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.ml.param.Params set (org.apache.spark.ml.param.Param<T> param, T value)  ;
  /**
   * Sets a parameter (by name) in the embedded param map.
   * @param param (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Params set (java.lang.String param, Object value)  ;
  /**
   * Sets a parameter in the embedded param map.
   * @param paramPair (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Params set (org.apache.spark.ml.param.ParamPair<?> paramPair)  ;
  /**
   * Optionally returns the user-supplied value of a param.
   * @param param (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Option<T> get (org.apache.spark.ml.param.Param<T> param)  ;
  /**
   * Clears the user-supplied value for the input param.
   * @param param (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Params clear (org.apache.spark.ml.param.Param<?> param)  ;
  /**
   * Gets the value of a param in the embedded param map or its default value. Throws an exception
   * if neither is set.
   * @param param (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T getOrDefault (org.apache.spark.ml.param.Param<T> param)  ;
  /**
   * Sets a default value for a param.
   * @param param  param to set the default value. Make sure that this param is initialized before
   *               this method gets called.
   * @param value  the default value
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.ml.param.Params setDefault (org.apache.spark.ml.param.Param<T> param, T value)  ;
  /**
   * Sets default values for a list of params.
   * <p>
   * Note: Java developers should use the single-parameter <code>setDefault</code>.
   *       Annotating this with varargs can cause compilation failures due to a Scala compiler bug.
   *       See SPARK-9268.
   * <p>
   * @param paramPairs  a list of param pairs that specify params and their default values to set
   *                    respectively. Make sure that the params are initialized before this method
   *                    gets called.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Params setDefault (scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> paramPairs)  ;
  /**
   * Gets the default value of a parameter.
   * @param param (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Option<T> getDefault (org.apache.spark.ml.param.Param<T> param)  ;
  /**
   * Tests whether the input param has a default value set.
   * @param param (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> boolean hasDefault (org.apache.spark.ml.param.Param<T> param)  ;
  /**
   * Creates a copy of this instance with the same UID and some extra params.
   * Subclasses should implement this method and set the return type properly.
   * See <code>defaultCopy()</code>.
   * @param extra (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Params copy (org.apache.spark.ml.param.ParamMap extra)  ;
  /**
   * Default implementation of copy with extra params.
   * It tries to create a new instance with the same UID.
   * Then it copies the embedded and extra parameters over and returns the new instance.
   * @param extra (undocumented)
   * @return (undocumented)
   */
  public <T extends org.apache.spark.ml.param.Params> T defaultCopy (org.apache.spark.ml.param.ParamMap extra)  ;
  /**
   * Extracts the embedded default param values and user-supplied values, and then merges them with
   * extra values from input into a flat param map, where the latter value is used if there exist
   * conflicts, i.e., with ordering:
   * default param values less than user-supplied values less than extra.
   * @param extra (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.ParamMap extractParamMap (org.apache.spark.ml.param.ParamMap extra)  ;
  /**
   * {@link extractParamMap} with no extra values.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.ParamMap extractParamMap ()  ;
  /** Internal param map for user-supplied values. */
  public  org.apache.spark.ml.param.ParamMap paramMap ()  ;
  /** Internal param map for default values. */
  public  org.apache.spark.ml.param.ParamMap defaultParamMap ()  ;
  /** Validates that the input param belongs to this instance. */
  public  void shouldOwn (org.apache.spark.ml.param.Param<?> param)  ;
  /**
   * Copies param values from this instance to another instance for params shared by them.
   * <p>
   * This handles default Params and explicitly set Params separately.
   * Default Params are copied from and to {@link defaultParamMap}, and explicitly set Params are
   * copied from and to {@link paramMap}.
   * Warning: This implicitly assumes that this {@link Params} instance and the target instance
   *          share the same set of default Params.
   * <p>
   * @param to the target instance, which should work with the same set of default Params as this
   *           source instance
   * @param extra extra params to be copied to the target's {@link paramMap}
   * @return the target instance with param values copied
   */
  public <T extends org.apache.spark.ml.param.Params> T copyValues (T to, org.apache.spark.ml.param.ParamMap extra)  ;
}
