package org.apache.spark.streaming;
/**
 * :: Experimental ::
 * Abstract class representing all the specifications of the DStream transformation
 * <code>mapWithState</code> operation of a
 * {@link org.apache.spark.streaming.dstream.PairDStreamFunctions pair DStream} (Scala) or a
 * {@link org.apache.spark.streaming.api.java.JavaPairDStream JavaPairDStream} (Java).
 * Use <code>org.apache.spark.streaming.StateSpec.function()</code> factory methods
 * to create instances of this class.
 * <p>
 * Example in Scala:
 * <pre><code>
 *    // A mapping function that maintains an integer state and return a String
 *    def mappingFunction(key: String, value: Option[Int], state: State[Int]): Option[String] = {
 *      // Use state.exists(), state.get(), state.update() and state.remove()
 *      // to manage state, and return the necessary string
 *    }
 *
 *    val spec = StateSpec.function(mappingFunction).numPartitions(10)
 *
 *    val mapWithStateDStream = keyValueDStream.mapWithState[StateType, MappedType](spec)
 * </code></pre>
 * <p>
 * Example in Java:
 * <pre><code>
 *   // A mapping function that maintains an integer state and return a string
 *   Function3&lt;String, Optional&lt;Integer&gt;, State&lt;Integer&gt;, String&gt; mappingFunction =
 *       new Function3&lt;String, Optional&lt;Integer&gt;, State&lt;Integer&gt;, String&gt;() {
 *           &#64;Override
 *           public Optional&lt;String&gt; call(Optional&lt;Integer&gt; value, State&lt;Integer&gt; state) {
 *               // Use state.exists(), state.get(), state.update() and state.remove()
 *               // to manage state, and return the necessary string
 *           }
 *       };
 *
 *    JavaMapWithStateDStream&lt;String, Integer, Integer, String&gt; mapWithStateDStream =
 *        keyValueDStream.mapWithState(StateSpec.function(mappingFunc));
 * </code></pre>
 * <p>
 * @tparam KeyType    Class of the state key
 * @tparam ValueType  Class of the state value
 * @tparam StateType  Class of the state data
 * @tparam MappedType Class of the mapped elements
 */
public abstract class StateSpec<KeyType extends java.lang.Object, ValueType extends java.lang.Object, StateType extends java.lang.Object, MappedType extends java.lang.Object> implements scala.Serializable {
  /**
   * Create a {@link org.apache.spark.streaming.StateSpec StateSpec} for setting all the specifications
   * of the <code>mapWithState</code> operation on a
   * {@link org.apache.spark.streaming.dstream.PairDStreamFunctions pair DStream}.
   * <p>
   * @param mappingFunction The function applied on every data item to manage the associated state
   *                         and generate the mapped data
   * @tparam KeyType      Class of the keys
   * @tparam ValueType    Class of the values
   * @tparam StateType    Class of the states data
   * @tparam MappedType   Class of the mapped data
   * @return (undocumented)
   */
  static public <KeyType extends java.lang.Object, ValueType extends java.lang.Object, StateType extends java.lang.Object, MappedType extends java.lang.Object> org.apache.spark.streaming.StateSpec<KeyType, ValueType, StateType, MappedType> function (scala.Function4<org.apache.spark.streaming.Time, KeyType, scala.Option<ValueType>, org.apache.spark.streaming.State<StateType>, scala.Option<MappedType>> mappingFunction)  { throw new RuntimeException(); }
  /**
   * Create a {@link org.apache.spark.streaming.StateSpec StateSpec} for setting all the specifications
   * of the <code>mapWithState</code> operation on a
   * {@link org.apache.spark.streaming.dstream.PairDStreamFunctions pair DStream}.
   * <p>
   * @param mappingFunction The function applied on every data item to manage the associated state
   *                         and generate the mapped data
   * @tparam ValueType    Class of the values
   * @tparam StateType    Class of the states data
   * @tparam MappedType   Class of the mapped data
   * @return (undocumented)
   */
  static public <KeyType extends java.lang.Object, ValueType extends java.lang.Object, StateType extends java.lang.Object, MappedType extends java.lang.Object> org.apache.spark.streaming.StateSpec<KeyType, ValueType, StateType, MappedType> function (scala.Function3<KeyType, scala.Option<ValueType>, org.apache.spark.streaming.State<StateType>, MappedType> mappingFunction)  { throw new RuntimeException(); }
  /**
   * Create a {@link org.apache.spark.streaming.StateSpec StateSpec} for setting all
   * the specifications of the <code>mapWithState</code> operation on a
   * {@link org.apache.spark.streaming.api.java.JavaPairDStream JavaPairDStream}.
   * <p>
   * @param mappingFunction The function applied on every data item to manage the associated
   *                        state and generate the mapped data
   * @tparam KeyType      Class of the keys
   * @tparam ValueType    Class of the values
   * @tparam StateType    Class of the states data
   * @tparam MappedType   Class of the mapped data
   * @return (undocumented)
   */
  static public <KeyType extends java.lang.Object, ValueType extends java.lang.Object, StateType extends java.lang.Object, MappedType extends java.lang.Object> org.apache.spark.streaming.StateSpec<KeyType, ValueType, StateType, MappedType> function (org.apache.spark.api.java.function.Function4<org.apache.spark.streaming.Time, KeyType, org.apache.spark.api.java.Optional<ValueType>, org.apache.spark.streaming.State<StateType>, org.apache.spark.api.java.Optional<MappedType>> mappingFunction)  { throw new RuntimeException(); }
  /**
   * Create a {@link org.apache.spark.streaming.StateSpec StateSpec} for setting all the specifications
   * of the <code>mapWithState</code> operation on a
   * {@link org.apache.spark.streaming.api.java.JavaPairDStream JavaPairDStream}.
   * <p>
   * @param mappingFunction The function applied on every data item to manage the associated
   *                        state and generate the mapped data
   * @tparam ValueType    Class of the values
   * @tparam StateType    Class of the states data
   * @tparam MappedType   Class of the mapped data
   * @return (undocumented)
   */
  static public <KeyType extends java.lang.Object, ValueType extends java.lang.Object, StateType extends java.lang.Object, MappedType extends java.lang.Object> org.apache.spark.streaming.StateSpec<KeyType, ValueType, StateType, MappedType> function (org.apache.spark.api.java.function.Function3<KeyType, org.apache.spark.api.java.Optional<ValueType>, org.apache.spark.streaming.State<StateType>, MappedType> mappingFunction)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   StateSpec ()  { throw new RuntimeException(); }
  /**
   * Set the RDD containing the initial states that will be used by <code>mapWithState</code>
   * @param rdd (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.streaming.StateSpec<KeyType, ValueType, StateType, MappedType> initialState (org.apache.spark.rdd.RDD<scala.Tuple2<KeyType, StateType>> rdd)  ;
  /**
   * Set the RDD containing the initial states that will be used by <code>mapWithState</code>
   * @param javaPairRDD (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.streaming.StateSpec<KeyType, ValueType, StateType, MappedType> initialState (org.apache.spark.api.java.JavaPairRDD<KeyType, StateType> javaPairRDD)  ;
  /**
   * Set the number of partitions by which the state RDDs generated by <code>mapWithState</code>
   * will be partitioned. Hash partitioning will be used.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.streaming.StateSpec<KeyType, ValueType, StateType, MappedType> numPartitions (int numPartitions)  ;
  /**
   * Set the partitioner by which the state RDDs generated by <code>mapWithState</code> will be partitioned.
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.streaming.StateSpec<KeyType, ValueType, StateType, MappedType> partitioner (org.apache.spark.Partitioner partitioner)  ;
  /**
   * Set the duration after which the state of an idle key will be removed. A key and its state is
   * considered idle if it has not received any data for at least the given duration. The
   * mapping function will be called one final time on the idle states that are going to be
   * removed; {@link org.apache.spark.streaming.State State.isTimingOut()} set
   * to <code>true</code> in that call.
   * @param idleDuration (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.streaming.StateSpec<KeyType, ValueType, StateType, MappedType> timeout (org.apache.spark.streaming.Duration idleDuration)  ;
}
