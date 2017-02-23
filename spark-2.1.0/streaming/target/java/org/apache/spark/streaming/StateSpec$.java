package org.apache.spark.streaming;
/**
 * :: Experimental ::
 * Builder object for creating instances of <code>org.apache.spark.streaming.StateSpec</code>
 * that is used for specifying the parameters of the DStream transformation <code>mapWithState</code>
 * that is used for specifying the parameters of the DStream transformation
 * <code>mapWithState</code> operation of a
 * {@link org.apache.spark.streaming.dstream.PairDStreamFunctions pair DStream} (Scala) or a
 * {@link org.apache.spark.streaming.api.java.JavaPairDStream JavaPairDStream} (Java).
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
 *</code></pre>
 */
public  class StateSpec$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StateSpec$ MODULE$ = null;
  public   StateSpec$ ()  { throw new RuntimeException(); }
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
  public <KeyType extends java.lang.Object, ValueType extends java.lang.Object, StateType extends java.lang.Object, MappedType extends java.lang.Object> org.apache.spark.streaming.StateSpec<KeyType, ValueType, StateType, MappedType> function (scala.Function4<org.apache.spark.streaming.Time, KeyType, scala.Option<ValueType>, org.apache.spark.streaming.State<StateType>, scala.Option<MappedType>> mappingFunction)  { throw new RuntimeException(); }
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
  public <KeyType extends java.lang.Object, ValueType extends java.lang.Object, StateType extends java.lang.Object, MappedType extends java.lang.Object> org.apache.spark.streaming.StateSpec<KeyType, ValueType, StateType, MappedType> function (scala.Function3<KeyType, scala.Option<ValueType>, org.apache.spark.streaming.State<StateType>, MappedType> mappingFunction)  { throw new RuntimeException(); }
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
  public <KeyType extends java.lang.Object, ValueType extends java.lang.Object, StateType extends java.lang.Object, MappedType extends java.lang.Object> org.apache.spark.streaming.StateSpec<KeyType, ValueType, StateType, MappedType> function (org.apache.spark.api.java.function.Function4<org.apache.spark.streaming.Time, KeyType, org.apache.spark.api.java.Optional<ValueType>, org.apache.spark.streaming.State<StateType>, org.apache.spark.api.java.Optional<MappedType>> mappingFunction)  { throw new RuntimeException(); }
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
  public <KeyType extends java.lang.Object, ValueType extends java.lang.Object, StateType extends java.lang.Object, MappedType extends java.lang.Object> org.apache.spark.streaming.StateSpec<KeyType, ValueType, StateType, MappedType> function (org.apache.spark.api.java.function.Function3<KeyType, org.apache.spark.api.java.Optional<ValueType>, org.apache.spark.streaming.State<StateType>, MappedType> mappingFunction)  { throw new RuntimeException(); }
}
