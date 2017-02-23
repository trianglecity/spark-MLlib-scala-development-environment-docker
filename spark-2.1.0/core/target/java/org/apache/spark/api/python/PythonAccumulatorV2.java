package org.apache.spark.api.python;
/**
 * Internal class that acts as an <code>AccumulatorV2</code> for Python accumulators. Inside, it
 * collects a list of pickled strings that we pass to Python through a socket.
 */
  class PythonAccumulatorV2 extends org.apache.spark.util.CollectionAccumulator<byte[]> {
  private  java.lang.String serverHost ()  { throw new RuntimeException(); }
  private  int serverPort ()  { throw new RuntimeException(); }
  // not preceding
  public   PythonAccumulatorV2 (java.lang.String serverHost, int serverPort)  { throw new RuntimeException(); }
  public  int bufferSize ()  { throw new RuntimeException(); }
  /**
   * We try to reuse a single Socket to transfer accumulator updates, as they are all added
   * by the DAGScheduler's single-threaded RpcEndpoint anyway.
   * @return (undocumented)
   */
  private  java.net.Socket socket ()  { throw new RuntimeException(); }
  private  java.net.Socket openSocket ()  { throw new RuntimeException(); }
  public  org.apache.spark.api.python.PythonAccumulatorV2 copyAndReset ()  { throw new RuntimeException(); }
  public  void merge (org.apache.spark.util.AccumulatorV2<byte[], java.util.List<byte[]>> other)  { throw new RuntimeException(); }
}
