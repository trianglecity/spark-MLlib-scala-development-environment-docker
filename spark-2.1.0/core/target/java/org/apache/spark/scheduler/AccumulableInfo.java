package org.apache.spark.scheduler;
/**
 * :: DeveloperApi ::
 * Information about an {@link org.apache.spark.Accumulable} modified during a task or stage.
 * <p>
 * param:  id accumulator ID
 * param:  name accumulator name
 * param:  update partial value from a task, may be None if used on driver to describe a stage
 * param:  value total accumulated value so far, maybe None if used on executors to describe a task
 * param:  internal whether this accumulator was internal
 * param:  countFailedValues whether to count this accumulator's partial value if the task failed
 * param:  metadata internal metadata associated with this accumulator, if any
 * <p>
 * @note Once this is JSON serialized the types of <code>update</code> and <code>value</code> will be lost and be
 * cast to strings. This is because the user can define an accumulator of any type and it will
 * be difficult to preserve the type in consumers of the event log. This does not apply to
 * internal accumulators that represent task level metrics.
 */
public  class AccumulableInfo implements scala.Product, scala.Serializable {
  /**
   * @deprecated do not create AccumulableInfo. Since 2.0.0. 
  */
  static public  org.apache.spark.scheduler.AccumulableInfo apply (long id, java.lang.String name, scala.Option<java.lang.String> update, java.lang.String value, boolean internal)  { throw new RuntimeException(); }
  /**
   * @deprecated do not create AccumulableInfo. Since 2.0.0. 
  */
  static public  org.apache.spark.scheduler.AccumulableInfo apply (long id, java.lang.String name, scala.Option<java.lang.String> update, java.lang.String value)  { throw new RuntimeException(); }
  /**
   * @deprecated do not create AccumulableInfo. Since 2.0.0. 
  */
  static public  org.apache.spark.scheduler.AccumulableInfo apply (long id, java.lang.String name, java.lang.String value)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  // not preceding
  public  long id ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> name ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> update ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> value ()  { throw new RuntimeException(); }
    boolean internal ()  { throw new RuntimeException(); }
    boolean countFailedValues ()  { throw new RuntimeException(); }
    scala.Option<java.lang.String> metadata ()  { throw new RuntimeException(); }
  // not preceding
     AccumulableInfo (long id, scala.Option<java.lang.String> name, scala.Option<java.lang.Object> update, scala.Option<java.lang.Object> value, boolean internal, boolean countFailedValues, scala.Option<java.lang.String> metadata)  { throw new RuntimeException(); }
}
