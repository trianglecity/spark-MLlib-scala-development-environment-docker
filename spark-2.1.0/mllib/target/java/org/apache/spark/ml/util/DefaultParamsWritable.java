package org.apache.spark.ml.util;
/**
 * :: DeveloperApi ::
 * <p>
 * Helper trait for making simple <code>Params</code> types writable.  If a <code>Params</code> class stores
 * all data as {@link org.apache.spark.ml.param.Param} values, then extending this trait will provide
 * a default implementation of writing saved instances of the class.
 * This only handles simple {@link org.apache.spark.ml.param.Param} types; e.g., it will not handle
 * {@link org.apache.spark.sql.Dataset}.
 * <p>
 * @see <code>DefaultParamsReadable</code>, the counterpart to this trait
 */
public  interface DefaultParamsWritable extends org.apache.spark.ml.util.MLWritable {
  public  org.apache.spark.ml.util.MLWriter write ()  ;
}
