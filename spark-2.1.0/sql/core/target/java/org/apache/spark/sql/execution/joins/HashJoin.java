package org.apache.spark.sql.execution.joins;
public  interface HashJoin {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> leftKeys ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> rightKeys ()  ;
  public  org.apache.spark.sql.catalyst.plans.JoinType joinType ()  ;
  public  org.apache.spark.sql.execution.joins.BuildSide buildSide ()  ;
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition ()  ;
  public  org.apache.spark.sql.execution.SparkPlan left ()  ;
  public  org.apache.spark.sql.execution.SparkPlan right ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  ;
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  ;
  // not preceding
  public  org.apache.spark.sql.execution.SparkPlan buildPlan ()  ;
  public  org.apache.spark.sql.execution.SparkPlan streamedPlan ()  ;
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> buildKeys ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> streamedKeys ()  ;
  public  org.apache.spark.sql.catalyst.expressions.Projection buildSideKeyGenerator ()  ;
  public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection streamSideKeyGenerator ()  ;
  public  scala.Function1<org.apache.spark.sql.catalyst.InternalRow, java.lang.Object> boundCondition ()  ;
  public  scala.Function1<org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow> createResultProjection ()  ;
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> innerJoin (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> streamIter, org.apache.spark.sql.execution.joins.HashedRelation hashedRelation)  ;
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> outerJoin (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> streamedIter, org.apache.spark.sql.execution.joins.HashedRelation hashedRelation)  ;
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> semiJoin (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> streamIter, org.apache.spark.sql.execution.joins.HashedRelation hashedRelation)  ;
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> existenceJoin (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> streamIter, org.apache.spark.sql.execution.joins.HashedRelation hashedRelation)  ;
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> antiJoin (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> streamIter, org.apache.spark.sql.execution.joins.HashedRelation hashedRelation)  ;
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> join (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> streamedIter, org.apache.spark.sql.execution.joins.HashedRelation hashed, org.apache.spark.sql.execution.metric.SQLMetric numOutputRows)  ;
}
