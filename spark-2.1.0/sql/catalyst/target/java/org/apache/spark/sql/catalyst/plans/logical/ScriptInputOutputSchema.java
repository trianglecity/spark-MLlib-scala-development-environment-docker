package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Input and output properties when passing data to a script.
 * For example, in Hive this would specify which SerDes to use.
 */
public  class ScriptInputOutputSchema implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> inputRowFormat ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> outputRowFormat ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> inputSerdeClass ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> outputSerdeClass ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> inputSerdeProps ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> outputSerdeProps ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> recordReaderClass ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> recordWriterClass ()  { throw new RuntimeException(); }
  public  boolean schemaLess ()  { throw new RuntimeException(); }
  // not preceding
  public   ScriptInputOutputSchema (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> inputRowFormat, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> outputRowFormat, scala.Option<java.lang.String> inputSerdeClass, scala.Option<java.lang.String> outputSerdeClass, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> inputSerdeProps, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> outputSerdeProps, scala.Option<java.lang.String> recordReaderClass, scala.Option<java.lang.String> recordWriterClass, boolean schemaLess)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> inputRowFormatSQL ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> outputRowFormatSQL ()  { throw new RuntimeException(); }
  /**
   * Get the row format specification
   * Note:
   * 1. Changes are needed when readerClause and writerClause are supported.
   * 2. Changes are needed when "ESCAPED BY" is supported.
   * @param rowFormat (undocumented)
   * @param serdeClass (undocumented)
   * @param serdeProps (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<java.lang.String> getRowFormatSQL (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> rowFormat, scala.Option<java.lang.String> serdeClass, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> serdeProps)  { throw new RuntimeException(); }
}
