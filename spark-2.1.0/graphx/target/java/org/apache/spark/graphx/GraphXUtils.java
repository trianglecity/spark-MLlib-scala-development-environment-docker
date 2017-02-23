package org.apache.spark.graphx;
public  class GraphXUtils {
  /**
   * Registers classes that GraphX uses with Kryo.
   * @param conf (undocumented)
   */
  static public  void registerKryoClasses (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * A proxy method to map the obsolete API to the new one.
   * @param g (undocumented)
   * @param mapFunc (undocumented)
   * @param reduceFunc (undocumented)
   * @param activeSetOpt (undocumented)
   * @param evidence$1 (undocumented)
   * @param evidence$2 (undocumented)
   * @param evidence$3 (undocumented)
   * @return (undocumented)
   */
  static  <VD extends java.lang.Object, ED extends java.lang.Object, A extends java.lang.Object> org.apache.spark.graphx.VertexRDD<A> mapReduceTriplets (org.apache.spark.graphx.Graph<VD, ED> g, scala.Function1<org.apache.spark.graphx.EdgeTriplet<VD, ED>, scala.collection.Iterator<scala.Tuple2<java.lang.Object, A>>> mapFunc, scala.Function2<A, A, A> reduceFunc, scala.Option<scala.Tuple2<org.apache.spark.graphx.VertexRDD<?>, org.apache.spark.graphx.EdgeDirection>> activeSetOpt, scala.reflect.ClassTag<VD> evidence$1, scala.reflect.ClassTag<ED> evidence$2, scala.reflect.ClassTag<A> evidence$3)  { throw new RuntimeException(); }
}
