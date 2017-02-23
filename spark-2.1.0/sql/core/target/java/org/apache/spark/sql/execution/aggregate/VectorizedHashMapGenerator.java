package org.apache.spark.sql.execution.aggregate;
/**
 * This is a helper class to generate an append-only vectorized hash map that can act as a 'cache'
 * for extremely fast key-value lookups while evaluating aggregates (and fall back to the
 * <code>BytesToBytesMap</code> if a given key isn't found). This is 'codegened' in HashAggregate to speed
 * up aggregates w/ key.
 * <p>
 * It is backed by a power-of-2-sized array for index lookups and a columnar batch that stores the
 * key-value pairs. The index lookups in the array rely on linear probing (with a small number of
 * maximum tries) and use an inexpensive hash function which makes it really efficient for a
 * majority of lookups. However, using linear probing and an inexpensive hash function also makes it
 * less robust as compared to the <code>BytesToBytesMap</code> (especially for a large number of keys or even
 * for certain distribution of keys) and requires us to fall back on the latter for correctness. We
 * also use a secondary columnar batch that logically projects over the original columnar batch and
 * is equivalent to the <code>BytesToBytesMap</code> aggregate buffer.
 * <p>
 * NOTE: This vectorized hash map currently doesn't support nullable keys and falls back to the
 * <code>BytesToBytesMap</code> to store them.
 */
public  class VectorizedHashMapGenerator extends org.apache.spark.sql.execution.aggregate.HashMapGenerator {
  public   VectorizedHashMapGenerator (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> aggregateExpressions, java.lang.String generatedClassName, org.apache.spark.sql.types.StructType groupingKeySchema, org.apache.spark.sql.types.StructType bufferSchema)  { throw new RuntimeException(); }
  protected  java.lang.String initializeAggregateHashMap ()  { throw new RuntimeException(); }
  /**
   * Generates a method that returns true if the group-by keys exist at a given index in the
   * associated {@link org.apache.spark.sql.execution.vectorized.ColumnarBatch}. For instance, if we
   * have 2 long group-by keys, the generated function would be of the form:
   * <p>
   * <pre><code>
   * private boolean equals(int idx, long agg_key, long agg_key1) {
   *   return batch.column(0).getLong(buckets[idx]) == agg_key &amp;&amp;
   *     batch.column(1).getLong(buckets[idx]) == agg_key1;
   * }
   * </code></pre>
   * @return (undocumented)
   */
  protected  java.lang.String generateEquals ()  { throw new RuntimeException(); }
  /**
   * Generates a method that returns a mutable
   * {@link org.apache.spark.sql.execution.vectorized.ColumnarBatch.Row} which keeps track of the
   * aggregate value(s) for a given set of keys. If the corresponding row doesn't exist, the
   * generated method adds the corresponding row in the associated
   * {@link org.apache.spark.sql.execution.vectorized.ColumnarBatch}. For instance, if we
   * have 2 long group-by keys, the generated function would be of the form:
   * <p>
   * <pre><code>
   * public org.apache.spark.sql.execution.vectorized.ColumnarBatch.Row findOrInsert(
   *     long agg_key, long agg_key1) {
   *   long h = hash(agg_key, agg_key1);
   *   int step = 0;
   *   int idx = (int) h &amp; (numBuckets - 1);
   *   while (step &lt; maxSteps) {
   *     // Return bucket index if it's either an empty slot or already contains the key
   *     if (buckets[idx] == -1) {
   *       batch.column(0).putLong(numRows, agg_key);
   *       batch.column(1).putLong(numRows, agg_key1);
   *       batch.column(2).putLong(numRows, 0);
   *       buckets[idx] = numRows++;
   *       return batch.getRow(buckets[idx]);
   *     } else if (equals(idx, agg_key, agg_key1)) {
   *       return batch.getRow(buckets[idx]);
   *     }
   *     idx = (idx + 1) &amp; (numBuckets - 1);
   *     step++;
   *   }
   *   // Didn't find it
   *   return null;
   * }
   * </code></pre>
   * @return (undocumented)
   */
  protected  java.lang.String generateFindOrInsert ()  { throw new RuntimeException(); }
  protected  java.lang.String generateRowIterator ()  { throw new RuntimeException(); }
}
