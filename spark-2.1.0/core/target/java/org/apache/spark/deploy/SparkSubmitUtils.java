package org.apache.spark.deploy;
/** Provides utility functions to be used inside SparkSubmit. */
public  class SparkSubmitUtils {
  /**
   * Represents a Maven Coordinate
   * param:  groupId the groupId of the coordinate
   * param:  artifactId the artifactId of the coordinate
   * param:  version the version of the coordinate
   */
  static   class MavenCoordinate implements scala.Product, scala.Serializable {
    public  java.lang.String groupId ()  { throw new RuntimeException(); }
    public  java.lang.String artifactId ()  { throw new RuntimeException(); }
    public  java.lang.String version ()  { throw new RuntimeException(); }
    // not preceding
    public   MavenCoordinate (java.lang.String groupId, java.lang.String artifactId, java.lang.String version)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  static public  class MavenCoordinate$ extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.String, java.lang.String, org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final MavenCoordinate$ MODULE$ = null;
    public   MavenCoordinate$ ()  { throw new RuntimeException(); }
  }
  static public  java.io.PrintStream printStream ()  { throw new RuntimeException(); }
  /**
   * Extracts maven coordinates from a comma-delimited string. Coordinates should be provided
   * in the format <code>groupId:artifactId:version</code> or <code>groupId/artifactId:version</code>.
   * @param coordinates Comma-delimited string of maven coordinates
   * @return Sequence of Maven coordinates
   */
  static public  scala.collection.Seq<org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate> extractMavenCoordinates (java.lang.String coordinates)  { throw new RuntimeException(); }
  /** Path of the local Maven cache. */
  static   java.io.File m2Path ()  { throw new RuntimeException(); }
  /**
   * Extracts maven coordinates from a comma-delimited string
   * @param remoteRepos Comma-delimited string of remote repositories
   * @param ivySettings The Ivy settings for this session
   * @return A ChainResolver used by Ivy to search for and resolve dependencies.
   */
  static public  org.apache.ivy.plugins.resolver.ChainResolver createRepoResolvers (scala.Option<java.lang.String> remoteRepos, org.apache.ivy.core.settings.IvySettings ivySettings)  { throw new RuntimeException(); }
  /**
   * Output a comma-delimited list of paths for the downloaded jars to be added to the classpath
   * (will append to jars in SparkSubmit).
   * @param artifacts Sequence of dependencies that were resolved and retrieved
   * @param cacheDirectory directory where jars are cached
   * @return a comma-delimited list of paths for the dependencies
   */
  static public  java.lang.String resolveDependencyPaths (java.lang.Object[] artifacts, java.io.File cacheDirectory)  { throw new RuntimeException(); }
  /** Adds the given maven coordinates to Ivy's module descriptor. */
  static public  void addDependenciesToIvy (org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor md, scala.collection.Seq<org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate> artifacts, java.lang.String ivyConfName)  { throw new RuntimeException(); }
  /** Add exclusion rules for dependencies already included in the spark-assembly */
  static public  void addExclusionRules (org.apache.ivy.core.settings.IvySettings ivySettings, java.lang.String ivyConfName, org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor md)  { throw new RuntimeException(); }
  /** A nice function to use in tests as well. Values are dummy strings. */
  static public  org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor getModuleDescriptor ()  { throw new RuntimeException(); }
  /**
   * Resolves any dependencies that were supplied through maven coordinates
   * @param coordinates Comma-delimited string of maven coordinates
   * @param remoteRepos Comma-delimited string of remote repositories other than maven central
   * @param ivyPath The path to the local ivy repository
   * @param exclusions Exclusions to apply when resolving transitive dependencies
   * @return The comma-delimited path to the jars of the given maven artifacts including their
   *         transitive dependencies
   * @param isTest (undocumented)
   */
  static public  java.lang.String resolveMavenCoordinates (java.lang.String coordinates, scala.Option<java.lang.String> remoteRepos, scala.Option<java.lang.String> ivyPath, scala.collection.Seq<java.lang.String> exclusions, boolean isTest)  { throw new RuntimeException(); }
  static   org.apache.ivy.core.module.descriptor.ExcludeRule createExclusion (java.lang.String coords, org.apache.ivy.core.settings.IvySettings ivySettings, java.lang.String ivyConfName)  { throw new RuntimeException(); }
}
