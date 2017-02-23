package org.apache.spark;
/**
 * A simpler value of {@link Accumulable} where the result type being accumulated is the same
 * as the types of elements being merged, i.e. variables that are only "added" to through an
 * associative and commutative operation and can therefore be efficiently supported in parallel.
 * They can be used to implement counters (as in MapReduce) or sums. Spark natively supports
 * accumulators of numeric value types, and programmers can add support for new types.
 * <p>
 * An accumulator is created from an initial value <code>v</code> by calling
 * {@link SparkContext#accumulator SparkContext.accumulator}.
 * Tasks running on the cluster can then add to it using the <code>+=</code> operator.
 * However, they cannot read its value. Only the driver program can read the accumulator's value,
 * using its {@link #value} method.
 * <p>
 * The interpreter session below shows an accumulator being used to add up the elements of an array:
 * <p>
 * <pre><code>
 * scala&gt; val accum = sc.accumulator(0)
 * accum: org.apache.spark.Accumulator[Int] = 0
 *
 * scala&gt; sc.parallelize(Array(1, 2, 3, 4)).foreach(x =&gt; accum += x)
 * ...
 * 10/09/29 18:41:08 INFO SparkContext: Tasks finished in 0.317106 s
 *
 * scala&gt; accum.value
 * res2: Int = 10
 * </code></pre>
 * <p>
 * param:  initialValue initial value of accumulator
 * param:  param helper object defining how to add elements of type <code>T</code>
 * param:  name human-readable name associated with this accumulator
 * param:  countFailedValues whether to accumulate values from failed tasks
 * @tparam T result type
 *
 * @deprecated use AccumulatorV2. Since 2.0.0. 
*/
public  class Accumulator<T extends java.lang.Object> extends org.apache.spark.Accumulable<T, T> {
  static public  long id ()  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> name ()  { throw new RuntimeException(); }
  static   boolean countFailedValues ()  { throw new RuntimeException(); }
  static public  R zero ()  { throw new RuntimeException(); }
  static   org.apache.spark.util.LegacyAccumulatorWrapper<R, T> newAcc ()  { throw new RuntimeException(); }
  static public  void $plus$eq (T term)  { throw new RuntimeException(); }
  static public  void add (T term)  { throw new RuntimeException(); }
  static public  void $plus$plus$eq (R term)  { throw new RuntimeException(); }
  static public  void merge (R term)  { throw new RuntimeException(); }
  static public  R value ()  { throw new RuntimeException(); }
  static public  R localValue ()  { throw new RuntimeException(); }
  static public  void value_$eq (R newValue)  { throw new RuntimeException(); }
  static public  void setValue (R newValue)  { throw new RuntimeException(); }
  static   void setValueAny (Object newValue)  { throw new RuntimeException(); }
  static   org.apache.spark.scheduler.AccumulableInfo toInfo (scala.Option<java.lang.Object> update, scala.Option<java.lang.Object> value)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  private  T initialValue ()  { throw new RuntimeException(); }
  // not preceding
     Accumulator (T initialValue, org.apache.spark.AccumulatorParam<T> param, scala.Option<java.lang.String> name, boolean countFailedValues)  { throw new RuntimeException(); }
}
