package org.apache.spark.mllib.random;
/**
 * :: DeveloperApi ::
 * Generates i.i.d. samples from U[0.0, 1.0]
 */
public  class UniformGenerator implements org.apache.spark.mllib.random.RandomDataGenerator<java.lang.Object> {
  public   UniformGenerator ()  { throw new RuntimeException(); }
  private  org.apache.spark.util.random.XORShiftRandom random ()  { throw new RuntimeException(); }
  public  double nextValue ()  { throw new RuntimeException(); }
  public  void setSeed (long seed)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.random.UniformGenerator copy ()  { throw new RuntimeException(); }
}
