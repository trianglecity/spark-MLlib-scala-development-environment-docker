package org.apache.spark.mllib.tree.model;
/**
 * Split with no acceptable feature values for categorical features. Helps with the first bin
 * creation.
 * param:  feature feature index
 * param:  featureType type of feature -- categorical or continuous
 */
  class DummyCategoricalSplit extends org.apache.spark.mllib.tree.model.Split {
  public   DummyCategoricalSplit (int feature, scala.Enumeration.Value featureType)  { throw new RuntimeException(); }
}
