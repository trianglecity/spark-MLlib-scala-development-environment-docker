package org.apache.spark.streaming;
/**
 * :: Experimental ::
 * Abstract class for getting and updating the state in mapping function used in the <code>mapWithState</code>
 * operation of a {@link org.apache.spark.streaming.dstream.PairDStreamFunctions pair DStream} (Scala)
 * or a {@link org.apache.spark.streaming.api.java.JavaPairDStream JavaPairDStream} (Java).
 * <p>
 * Scala example of using <code>State</code>:
 * <pre><code>
 *    // A mapping function that maintains an integer state and returns a String
 *    def mappingFunction(key: String, value: Option[Int], state: State[Int]): Option[String] = {
 *      // Check if state exists
 *      if (state.exists) {
 *        val existingState = state.get  // Get the existing state
 *        val shouldRemove = ...         // Decide whether to remove the state
 *        if (shouldRemove) {
 *          state.remove()     // Remove the state
 *        } else {
 *          val newState = ...
 *          state.update(newState)    // Set the new state
 *        }
 *      } else {
 *        val initialState = ...
 *        state.update(initialState)  // Set the initial state
 *      }
 *      ... // return something
 *    }
 *
 * </code></pre>
 * <p>
 * Java example of using <code>State</code>:
 * <pre><code>
 *    // A mapping function that maintains an integer state and returns a String
 *    Function3&lt;String, Optional&lt;Integer&gt;, State&lt;Integer&gt;, String&gt; mappingFunction =
 *       new Function3&lt;String, Optional&lt;Integer&gt;, State&lt;Integer&gt;, String&gt;() {
 *
 *         &#64;Override
 *         public String call(String key, Optional&lt;Integer&gt; value, State&lt;Integer&gt; state) {
 *           if (state.exists()) {
 *             int existingState = state.get(); // Get the existing state
 *             boolean shouldRemove = ...; // Decide whether to remove the state
 *             if (shouldRemove) {
 *               state.remove(); // Remove the state
 *             } else {
 *               int newState = ...;
 *               state.update(newState); // Set the new state
 *             }
 *           } else {
 *             int initialState = ...; // Set the initial state
 *             state.update(initialState);
 *           }
 *           // return something
 *         }
 *       };
 * </code></pre>
 * <p>
 * @tparam S Class of the state
 */
public abstract class State<S extends java.lang.Object> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   State ()  { throw new RuntimeException(); }
  /** Whether the state already exists */
  public abstract  boolean exists ()  ;
  /**
   * Get the state if it exists, otherwise it will throw <code>java.util.NoSuchElementException</code>.
   * Check with <code>exists()</code> whether the state exists or not before calling <code>get()</code>.
   * <p>
   * @throws java.util.NoSuchElementException If the state does not exist.
   * @return (undocumented)
   */
  public abstract  S get ()  ;
  /**
   * Update the state with a new value.
   * <p>
   * State cannot be updated if it has been already removed (that is, <code>remove()</code> has already been
   * called) or it is going to be removed due to timeout (that is, <code>isTimingOut()</code> is <code>true</code>).
   * <p>
   * @throws java.lang.IllegalArgumentException If the state has already been removed, or is
   *                                            going to be removed
   * @param newState (undocumented)
   */
  public abstract  void update (S newState)  ;
  /**
   * Remove the state if it exists.
   * <p>
   * State cannot be updated if it has been already removed (that is, <code>remove()</code> has already been
   * called) or it is going to be removed due to timeout (that is, <code>isTimingOut()</code> is <code>true</code>).
   */
  public abstract  void remove ()  ;
  /**
   * Whether the state is timing out and going to be removed by the system after the current batch.
   * This timeout can occur if timeout duration has been specified in the
   * {@link org.apache.spark.streaming.StateSpec StatSpec} and the key has not received any new data
   * for that timeout duration.
   * @return (undocumented)
   */
  public abstract  boolean isTimingOut ()  ;
  /**
   * Get the state as a {@link scala.Option}. It will be <code>Some(state)</code> if it exists, otherwise <code>None</code>.
   * @return (undocumented)
   */
  public final  scala.Option<S> getOption ()  { throw new RuntimeException(); }
  public final  java.lang.String toString ()  { throw new RuntimeException(); }
}
