package org.apache.spark.examples;
/**
 * Simple test for reading and writing to a distributed
 * file system.  This example does the following:
 * <p>
 *   1. Reads local file
 *   2. Computes word count on local file
 *   3. Writes local file to a DFS
 *   4. Reads the file back from the DFS
 *   5. Computes word count on the file using Spark
 *   6. Compares the word count results
 */
public  class DFSReadWriteTest {
  static private  java.io.File localFilePath ()  { throw new RuntimeException(); }
  static private  java.lang.String dfsDirPath ()  { throw new RuntimeException(); }
  static private  int NPARAMS ()  { throw new RuntimeException(); }
  static private  scala.collection.immutable.List<java.lang.String> readFile (java.lang.String filename)  { throw new RuntimeException(); }
  static private  void printUsage ()  { throw new RuntimeException(); }
  static private  void parseArgs (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  int runLocalWordCount (scala.collection.immutable.List<java.lang.String> fileContents)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
