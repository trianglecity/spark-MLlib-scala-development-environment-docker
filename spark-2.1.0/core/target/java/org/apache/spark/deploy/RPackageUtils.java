package org.apache.spark.deploy;
public  class RPackageUtils {
  /** The key in the MANIFEST.mf that we look for, in case a jar contains R code. */
  static private final  java.lang.String hasRPackage ()  { throw new RuntimeException(); }
  /** Base of the shell command used in order to install R packages. */
  static private final  scala.collection.Seq<java.lang.String> baseInstallCmd ()  { throw new RuntimeException(); }
  /** R source code should exist under R/pkg in a jar. */
  static private final  java.lang.String RJarEntries ()  { throw new RuntimeException(); }
  /** Documentation on how the R source file layout should be in the jar. */
  static  final  java.lang.String RJarDoc ()  { throw new RuntimeException(); }
  /** Internal method for logging. We log to a printStream in tests, for debugging purposes. */
  static private  void print (java.lang.String msg, java.io.PrintStream printStream, java.util.logging.Level level, java.lang.Throwable e)  { throw new RuntimeException(); }
  /**
   * Checks the manifest of the Jar whether there is any R source code bundled with it.
   * Exposed for testing.
   * @param jar (undocumented)
   * @return (undocumented)
   */
  static   boolean checkManifestForR (java.util.jar.JarFile jar)  { throw new RuntimeException(); }
  /**
   * Runs the standard R package installation code to build the R package from source.
   * Multiple runs don't cause problems.
   * @param dir (undocumented)
   * @param printStream (undocumented)
   * @param verbose (undocumented)
   * @param libDir (undocumented)
   * @return (undocumented)
   */
  static private  boolean rPackageBuilder (java.io.File dir, java.io.PrintStream printStream, boolean verbose, java.lang.String libDir)  { throw new RuntimeException(); }
  /**
   * Extracts the files under /R in the jar to a temporary directory for building.
   * @param jar (undocumented)
   * @param printStream (undocumented)
   * @param verbose (undocumented)
   * @return (undocumented)
   */
  static private  java.io.File extractRFolder (java.util.jar.JarFile jar, java.io.PrintStream printStream, boolean verbose)  { throw new RuntimeException(); }
  /**
   * Extracts the files under /R in the jar to a temporary directory for building.
   * @param jars (undocumented)
   * @param printStream (undocumented)
   * @param verbose (undocumented)
   */
  static   void checkAndBuildRPackage (java.lang.String jars, java.io.PrintStream printStream, boolean verbose)  { throw new RuntimeException(); }
  static private  scala.collection.immutable.Set<java.io.File> listFilesRecursively (java.io.File dir, scala.collection.Seq<java.lang.String> excludePatterns)  { throw new RuntimeException(); }
  /** Zips all the R libraries built for distribution to the cluster. */
  static   java.io.File zipRLibraries (java.io.File dir, java.lang.String name)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
}
