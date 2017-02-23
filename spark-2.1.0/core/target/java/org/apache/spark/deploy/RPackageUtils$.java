package org.apache.spark.deploy;
public  class RPackageUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RPackageUtils$ MODULE$ = null;
  public   RPackageUtils$ ()  { throw new RuntimeException(); }
  /** The key in the MANIFEST.mf that we look for, in case a jar contains R code. */
  private final  java.lang.String hasRPackage ()  { throw new RuntimeException(); }
  /** Base of the shell command used in order to install R packages. */
  private final  scala.collection.Seq<java.lang.String> baseInstallCmd ()  { throw new RuntimeException(); }
  /** R source code should exist under R/pkg in a jar. */
  private final  java.lang.String RJarEntries ()  { throw new RuntimeException(); }
  /** Documentation on how the R source file layout should be in the jar. */
   final  java.lang.String RJarDoc ()  { throw new RuntimeException(); }
  /** Internal method for logging. We log to a printStream in tests, for debugging purposes. */
  private  void print (java.lang.String msg, java.io.PrintStream printStream, java.util.logging.Level level, java.lang.Throwable e)  { throw new RuntimeException(); }
  /**
   * Checks the manifest of the Jar whether there is any R source code bundled with it.
   * Exposed for testing.
   * @param jar (undocumented)
   * @return (undocumented)
   */
    boolean checkManifestForR (java.util.jar.JarFile jar)  { throw new RuntimeException(); }
  /**
   * Runs the standard R package installation code to build the R package from source.
   * Multiple runs don't cause problems.
   * @param dir (undocumented)
   * @param printStream (undocumented)
   * @param verbose (undocumented)
   * @param libDir (undocumented)
   * @return (undocumented)
   */
  private  boolean rPackageBuilder (java.io.File dir, java.io.PrintStream printStream, boolean verbose, java.lang.String libDir)  { throw new RuntimeException(); }
  /**
   * Extracts the files under /R in the jar to a temporary directory for building.
   * @param jar (undocumented)
   * @param printStream (undocumented)
   * @param verbose (undocumented)
   * @return (undocumented)
   */
  private  java.io.File extractRFolder (java.util.jar.JarFile jar, java.io.PrintStream printStream, boolean verbose)  { throw new RuntimeException(); }
  /**
   * Extracts the files under /R in the jar to a temporary directory for building.
   * @param jars (undocumented)
   * @param printStream (undocumented)
   * @param verbose (undocumented)
   */
    void checkAndBuildRPackage (java.lang.String jars, java.io.PrintStream printStream, boolean verbose)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.io.File> listFilesRecursively (java.io.File dir, scala.collection.Seq<java.lang.String> excludePatterns)  { throw new RuntimeException(); }
  /** Zips all the R libraries built for distribution to the cluster. */
    java.io.File zipRLibraries (java.io.File dir, java.lang.String name)  { throw new RuntimeException(); }
}
