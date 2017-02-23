package org.apache.spark.ml.feature;
/**
 * Limited implementation of R formula parsing. Currently supports: '~', '+', '-', '.', ':'.
 */
public  class RFormulaParser {
  static private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.Intercept> intercept ()  { throw new RuntimeException(); }
  static private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.ColumnRef> columnRef ()  { throw new RuntimeException(); }
  static private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.ColumnRef> empty ()  { throw new RuntimeException(); }
  static private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.ColumnRef> label ()  { throw new RuntimeException(); }
  static private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.InteractableTerm> dot ()  { throw new RuntimeException(); }
  static private  scala.util.parsing.combinator.Parsers.Parser<scala.collection.immutable.List<org.apache.spark.ml.feature.InteractableTerm>> interaction ()  { throw new RuntimeException(); }
  static private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.Term> term ()  { throw new RuntimeException(); }
  static private  scala.util.parsing.combinator.Parsers.Parser<scala.collection.immutable.List<org.apache.spark.ml.feature.Term>> terms ()  { throw new RuntimeException(); }
  static private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.ml.feature.ParsedRFormula> formula ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.ParsedRFormula parse (java.lang.String value)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<T> Parser (scala.Function1<scala.util.parsing.input.Reader<java.lang.Object>, scala.util.parsing.combinator.Parsers.ParseResult<T>> f)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<T> OnceParser (scala.Function1<scala.util.parsing.input.Reader<java.lang.Object>, scala.util.parsing.combinator.Parsers.ParseResult<T>> f)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<T> commit (scala.Function0<scala.util.parsing.combinator.Parsers.Parser<T>> p)  { throw new RuntimeException(); }
  static public  scala.util.parsing.combinator.Parsers.Parser<java.lang.Object> elem (java.lang.String kind, scala.Function1<java.lang.Object, java.lang.Object> p)  { throw new RuntimeException(); }
  static public  scala.util.parsing.combinator.Parsers.Parser<java.lang.Object> elem (scala.util.parsing.combinator.Parsers e)  { throw new RuntimeException(); }
  static public  scala.util.parsing.combinator.Parsers.Parser<java.lang.Object> accept (scala.util.parsing.combinator.Parsers e)  { throw new RuntimeException(); }
  static public <ES extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<scala.collection.immutable.List<java.lang.Object>> accept (ES es, scala.Function1<ES, scala.collection.immutable.List<java.lang.Object>> evidence$1)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<U> accept (java.lang.String expected, scala.PartialFunction<java.lang.Object, U> f)  { throw new RuntimeException(); }
  static public  scala.util.parsing.combinator.Parsers.Parser<java.lang.Object> acceptIf (scala.Function1<java.lang.Object, java.lang.Object> p, scala.Function1<java.lang.Object, java.lang.String> err)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<U> acceptMatch (java.lang.String expected, scala.PartialFunction<java.lang.Object, U> f)  { throw new RuntimeException(); }
  static public <ES extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<scala.collection.immutable.List<java.lang.Object>> acceptSeq (ES es, scala.Function1<ES, scala.collection.Iterable<java.lang.Object>> evidence$2)  { throw new RuntimeException(); }
  static public  scala.util.parsing.combinator.Parsers.Parser<scala.runtime.Nothing$> failure (java.lang.String msg)  { throw new RuntimeException(); }
  static public  scala.util.parsing.combinator.Parsers.Parser<scala.runtime.Nothing$> err (java.lang.String msg)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<T> success (T v)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<T> log (scala.Function0<scala.util.parsing.combinator.Parsers.Parser<T>> p, java.lang.String name)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<scala.collection.immutable.List<T>> rep (scala.Function0<scala.util.parsing.combinator.Parsers.Parser<T>> p)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<scala.collection.immutable.List<T>> repsep (scala.Function0<scala.util.parsing.combinator.Parsers.Parser<T>> p, scala.Function0<scala.util.parsing.combinator.Parsers.Parser<java.lang.Object>> q)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<scala.collection.immutable.List<T>> rep1 (scala.Function0<scala.util.parsing.combinator.Parsers.Parser<T>> p)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<scala.collection.immutable.List<T>> rep1 (scala.Function0<scala.util.parsing.combinator.Parsers.Parser<T>> first, scala.Function0<scala.util.parsing.combinator.Parsers.Parser<T>> p0)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<scala.collection.immutable.List<T>> repN (int num, scala.Function0<scala.util.parsing.combinator.Parsers.Parser<T>> p)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<scala.collection.immutable.List<T>> rep1sep (scala.Function0<scala.util.parsing.combinator.Parsers.Parser<T>> p, scala.Function0<scala.util.parsing.combinator.Parsers.Parser<java.lang.Object>> q)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<T> chainl1 (scala.Function0<scala.util.parsing.combinator.Parsers.Parser<T>> p, scala.Function0<scala.util.parsing.combinator.Parsers.Parser<scala.Function2<T, T, T>>> q)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object, U extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<T> chainl1 (scala.Function0<scala.util.parsing.combinator.Parsers.Parser<T>> first, scala.Function0<scala.util.parsing.combinator.Parsers.Parser<U>> p, scala.Function0<scala.util.parsing.combinator.Parsers.Parser<scala.Function2<T, U, T>>> q)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object, U extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<U> chainr1 (scala.Function0<scala.util.parsing.combinator.Parsers.Parser<T>> p, scala.Function0<scala.util.parsing.combinator.Parsers.Parser<scala.Function2<T, U, U>>> q, scala.Function2<T, U, U> combine, U first)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<scala.Option<T>> opt (scala.Function0<scala.util.parsing.combinator.Parsers.Parser<T>> p)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<scala.runtime.BoxedUnit> not (scala.Function0<scala.util.parsing.combinator.Parsers.Parser<T>> p)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<T> guard (scala.Function0<scala.util.parsing.combinator.Parsers.Parser<T>> p)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.Function1<scala.util.parsing.combinator.Parsers.$tilde<T, scala.collection.immutable.List<T>>, scala.collection.immutable.List<T>> mkList ()  { throw new RuntimeException(); }
  static protected  scala.util.matching.Regex whiteSpace ()  { throw new RuntimeException(); }
  static public  boolean skipWhitespace ()  { throw new RuntimeException(); }
  static protected  int handleWhiteSpace (java.lang.CharSequence source, int offset)  { throw new RuntimeException(); }
  static public  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> literal (java.lang.String s)  { throw new RuntimeException(); }
  static public  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> regex (scala.util.matching.Regex r)  { throw new RuntimeException(); }
  static public <T extends scala.util.parsing.input.Positional> scala.util.parsing.combinator.Parsers.Parser<T> positioned (scala.Function0<scala.util.parsing.combinator.Parsers.Parser<T>> p)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.Parser<T> phrase (scala.util.parsing.combinator.Parsers.Parser<T> p)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.ParseResult<T> parseAll (scala.util.parsing.combinator.Parsers.Parser<T> p, scala.util.parsing.input.Reader<java.lang.Object> in)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.ParseResult<T> parseAll (scala.util.parsing.combinator.Parsers.Parser<T> p, java.io.Reader in)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.util.parsing.combinator.Parsers.ParseResult<T> parseAll (scala.util.parsing.combinator.Parsers.Parser<T> p, java.lang.CharSequence in)  { throw new RuntimeException(); }
}
