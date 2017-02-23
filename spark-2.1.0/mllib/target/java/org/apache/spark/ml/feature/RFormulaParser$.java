package org.apache.spark.ml.feature;
/**
 * Limited implementation of R formula parsing. Currently supports: '~', '+', '-', '.', ':'.
 */
public  class RFormulaParser$ implements scala.util.parsing.combinator.RegexParsers {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RFormulaParser$ MODULE$ = null;
  public   RFormulaParser$ ()  { throw new RuntimeException(); }
  private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.Intercept> intercept ()  { throw new RuntimeException(); }
  private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.ColumnRef> columnRef ()  { throw new RuntimeException(); }
  private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.ColumnRef> empty ()  { throw new RuntimeException(); }
  private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.ColumnRef> label ()  { throw new RuntimeException(); }
  private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.InteractableTerm> dot ()  { throw new RuntimeException(); }
  private  scala.util.parsing.combinator.Parsers.Parser<scala.collection.immutable.List<org.apache.spark.ml.feature.InteractableTerm>> interaction ()  { throw new RuntimeException(); }
  private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.Term> term ()  { throw new RuntimeException(); }
  private  scala.util.parsing.combinator.Parsers.Parser<scala.collection.immutable.List<org.apache.spark.ml.feature.Term>> terms ()  { throw new RuntimeException(); }
  private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.ParsedRFormula> formula ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.ParsedRFormula parse (java.lang.String value)  { throw new RuntimeException(); }
}
