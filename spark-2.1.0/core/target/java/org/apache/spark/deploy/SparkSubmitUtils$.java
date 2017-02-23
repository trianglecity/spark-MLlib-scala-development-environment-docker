package org.apache.spark.deploy;
/** Provides utility functions to be used inside SparkSubmit. */
public  class SparkSubmitUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkSubmitUtils$ MODULE$ = null;
  public   SparkSubmitUtils$ ()  { throw new RuntimeException(); }
  public  java.io.PrintStream printStream ()  { throw new RuntimeException(); }
  /**
   * Extracts maven coordinates from a comma-delimited string. Coordinates should be provided
   * in the format <code>groupId:artifactId:version</code> or <code>groupId/artifactId:version</code>.
   * @param coordinates Comma-delimited string of maven coordinates
   * @return Sequence of Maven coordinates
   */
  public  scala.collection.Seq<org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate> extractMavenCoordinates (java.lang.String coordinates)  { throw new RuntimeException(); }
  /** Path of the local Maven cache. */
    java.io.File m2Path ()  { throw new RuntimeException(); }
  /**
   * Extracts maven coordinates from a comma-delimited string
   * @param remoteRepos Comma-delimited string of remote repositories
   * @param ivySettings The Ivy settings for this session
   * @return A ChainResolver used by Ivy to search for and resolve dependencies.
   */
  public  org.apache.ivy.plugins.resolver.ChainResolver createRepoResolvers (scala.Option<java.lang.String> remoteRepos, org.apache.ivy.core.settings.IvySettings ivySettings)  { throw new RuntimeException(); }
  /**
   * Output a comma-delimited list of paths for the downloaded jars to be added to the classpath
   * (will append to jars in SparkSubmit).
   * @param artifacts Sequence of dependencies that were resolved and retrieved
   * @param cacheDirectory directory where jars are cached
   * @return a comma-delimited list of paths for the dependencies
   */
  public  java.lang.String resolveDependencyPaths (java.lang.Object[] artifacts, java.io.File cacheDirectory)  { throw new RuntimeException(); }
  /** Adds the given maven coordinates to Ivy's module descriptor. */
  public  void addDependenciesToIvy (org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor md, scala.collection.Seq<org.apache.spark.deploy.SparkSubmitUtils.MavenCoordinate> artifacts, java.lang.String ivyConfName)  { throw new RuntimeException(); }
  /** Add exclusion rules for dependencies already included in the spark-assembly */
  public  void addExclusionRules (org.apache.ivy.core.settings.IvySettings ivySettings, java.lang.String ivyConfName, org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor md)  { throw new RuntimeException(); }
  /** A nice function to use in tests as well. Values are dummy strings. */
  public  org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor getModuleDescriptor ()  { throw new RuntimeException(); }
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
  public  java.lang.String resolveMavenCoordinates (java.lang.String coordinates, scala.Option<java.lang.String> remoteRepos, scala.Option<java.lang.String> ivyPath, scala.collection.Seq<java.lang.String> exclusions, boolean isTest)  { throw new RuntimeException(); }
    org.apache.ivy.core.module.descriptor.ExcludeRule createExclusion (java.lang.String coords, org.apache.ivy.core.settings.IvySettings ivySettings, java.lang.String ivyConfName)  { throw new RuntimeException(); }
}
