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
public  class DFSReadWriteTest$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DFSReadWriteTest$ MODULE$ = null;
  public   DFSReadWriteTest$ ()  { throw new RuntimeException(); }
  private  java.io.File localFilePath ()  { throw new RuntimeException(); }
  private  java.lang.String dfsDirPath ()  { throw new RuntimeException(); }
  private  int NPARAMS ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.List<java.lang.String> readFile (java.lang.String filename)  { throw new RuntimeException(); }
  private  void printUsage ()  { throw new RuntimeException(); }
  private  void parseArgs (java.lang.String[] args)  { throw new RuntimeException(); }
  public  int runLocalWordCount (scala.collection.immutable.List<java.lang.String> fileContents)  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
