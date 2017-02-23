package org.apache.spark.examples.mllib;
/**
 * Example for mining frequent itemsets using FP-growth.
 * Example usage: ./bin/run-example mllib.FPGrowthExample \
 *   --minSupport 0.8 --numPartition 2 ./data/mllib/sample_fpgrowth.txt
 */
public  class FPGrowthExample {
  static public  class Params extends org.apache.spark.examples.mllib.AbstractParams<org.apache.spark.examples.mllib.FPGrowthExample.Params> implements scala.Product, scala.Serializable {
    public  java.lang.String input ()  { throw new RuntimeException(); }
    public  double minSupport ()  { throw new RuntimeException(); }
    public  int numPartition ()  { throw new RuntimeException(); }
    // not preceding
    public   Params (java.lang.String input, double minSupport, int numPartition)  { throw new RuntimeException(); }
  }
  static public  class Params$ extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.Object, java.lang.Object, org.apache.spark.examples.mllib.FPGrowthExample.Params> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Params$ MODULE$ = null;
    public   Params$ ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void run (org.apache.spark.examples.mllib.FPGrowthExample.Params params)  { throw new RuntimeException(); }
}
