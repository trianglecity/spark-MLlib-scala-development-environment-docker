package org.apache.spark.deploy.yarn;
  class Client implements org.apache.spark.internal.Logging {
  static public  void main (java.lang.String[] argStrings)  { throw new RuntimeException(); }
  static public  java.lang.String APP_JAR_NAME ()  { throw new RuntimeException(); }
  static public  java.lang.String LOCAL_SCHEME ()  { throw new RuntimeException(); }
  static public  java.lang.String SPARK_STAGING ()  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.permission.FsPermission STAGING_DIR_PERMISSION ()  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.permission.FsPermission APP_FILE_PERMISSION ()  { throw new RuntimeException(); }
  static public  java.lang.String ENV_DIST_CLASSPATH ()  { throw new RuntimeException(); }
  static public  java.lang.String LOCALIZED_CONF_DIR ()  { throw new RuntimeException(); }
  static public  java.lang.String LOCALIZED_CONF_ARCHIVE ()  { throw new RuntimeException(); }
  static public  java.lang.String SPARK_CONF_FILE ()  { throw new RuntimeException(); }
  static public  java.lang.String LOCALIZED_PYTHON_DIR ()  { throw new RuntimeException(); }
  static public  java.lang.String LOCALIZED_LIB_DIR ()  { throw new RuntimeException(); }
  /**
   * Return the path to the given application's staging directory.
   * @param appId (undocumented)
   * @return (undocumented)
   */
  static private  java.lang.String getAppStagingDir (org.apache.hadoop.yarn.api.records.ApplicationId appId)  { throw new RuntimeException(); }
  /**
   * Populate the classpath entry in the given environment map with any application
   * classpath specified through the Hadoop and Yarn configurations.
   * @param conf (undocumented)
   * @param env (undocumented)
   */
  static   void populateHadoopClasspath (org.apache.hadoop.conf.Configuration conf, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
  static private  scala.Option<scala.collection.Seq<java.lang.String>> getYarnAppClasspath (org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  static private  scala.Option<scala.collection.Seq<java.lang.String>> getMRAppClasspath (org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  static   scala.Option<scala.collection.Seq<java.lang.String>> getDefaultYarnApplicationClasspath ()  { throw new RuntimeException(); }
  static   scala.Option<scala.collection.Seq<java.lang.String>> getDefaultMRApplicationClasspath ()  { throw new RuntimeException(); }
  /**
   * Populate the classpath entry in the given environment map.
   * <p>
   * User jars are generally not added to the JVM's system classpath; those are handled by the AM
   * and executor backend. When the deprecated <code>spark.yarn.user.classpath.first</code> is used, user jars
   * are included in the system classpath, though. The extra class path and other uploaded files are
   * always made available through the system class path.
   * <p>
   * @param args Client arguments (when starting the AM) or null (when starting executors).
   * @param conf (undocumented)
   * @param sparkConf (undocumented)
   * @param env (undocumented)
   * @param extraClassPath (undocumented)
   */
  static   void populateClasspath (org.apache.spark.deploy.yarn.ClientArguments args, org.apache.hadoop.conf.Configuration conf, org.apache.spark.SparkConf sparkConf, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env, scala.Option<java.lang.String> extraClassPath)  { throw new RuntimeException(); }
  /**
   * Returns a list of URIs representing the user classpath.
   * <p>
   * @param conf Spark configuration.
   * @return (undocumented)
   */
  static public  java.net.URI[] getUserClasspath (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static private  scala.Option<java.net.URI> getMainJarUri (scala.Option<java.lang.String> mainJar)  { throw new RuntimeException(); }
  static private  scala.collection.Seq<java.net.URI> getSecondaryJarUris (scala.Option<scala.collection.Seq<java.lang.String>> secondaryJars)  { throw new RuntimeException(); }
  /**
   * Adds the given path to the classpath, handling "local:" URIs correctly.
   * <p>
   * If an alternate name for the file is given, and it's not a "local:" file, the alternate
   * name will be added to the classpath (relative to the job's work directory).
   * <p>
   * If not a "local:" file and no alternate name, the linkName will be added to the classpath.
   * <p>
   * @param conf        Spark configuration.
   * @param hadoopConf  Hadoop configuration.
   * @param uri         URI to add to classpath (optional).
   * @param fileName    Alternate name for the file (optional).
   * @param env         Map holding the environment variables.
   */
  static private  void addFileToClasspath (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf, java.net.URI uri, java.lang.String fileName, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
  /**
   * Add the given path to the classpath entry of the given environment map.
   * If the classpath is already set, this appends the new path to the existing classpath.
   * @param path (undocumented)
   * @param env (undocumented)
   */
  static private  void addClasspathEntry (java.lang.String path, scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
  /**
   * Returns the path to be sent to the NM for a path that is valid on the gateway.
   * <p>
   * This method uses two configuration values:
   * <p>
   *  - spark.yarn.config.gatewayPath: a string that identifies a portion of the input path that may
   *    only be valid in the gateway node.
   *  - spark.yarn.config.replacementPath: a string with which to replace the gateway path. This may
   *    contain, for example, env variable references, which will be expanded by the NMs when
   *    starting containers.
   * <p>
   * If either config is not available, the input path is returned.
   * @param conf (undocumented)
   * @param path (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String getClusterPath (org.apache.spark.SparkConf conf, java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Return whether the two file systems are the same.
   * @param srcFs (undocumented)
   * @param destFs (undocumented)
   * @return (undocumented)
   */
  static private  boolean compareFs (org.apache.hadoop.fs.FileSystem srcFs, org.apache.hadoop.fs.FileSystem destFs)  { throw new RuntimeException(); }
  /**
   * Given a local URI, resolve it and return a qualified local path that corresponds to the URI.
   * This is used for preparing local resources to be included in the container launch context.
   * @param localURI (undocumented)
   * @param hadoopConf (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.hadoop.fs.Path getQualifiedLocalPath (java.net.URI localURI, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /**
   * Whether to consider jars provided by the user to have precedence over the Spark jars when
   * loading user classes.
   * @param conf (undocumented)
   * @param isDriver (undocumented)
   * @return (undocumented)
   */
  static public  boolean isUserClassPathFirst (org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  /**
   * Joins all the path components using Path.SEPARATOR.
   * @param components (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String buildPath (scala.collection.Seq<java.lang.String> components)  { throw new RuntimeException(); }
  /** Returns whether the URI is a "local:" URI. */
  static public  boolean isLocalUri (java.lang.String uri)  { throw new RuntimeException(); }
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
  public  org.apache.spark.deploy.yarn.ClientArguments args ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  // not preceding
  public   Client (org.apache.spark.deploy.yarn.ClientArguments args, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  public   Client (org.apache.spark.deploy.yarn.ClientArguments clientArgs, org.apache.spark.SparkConf spConf)  { throw new RuntimeException(); }
  private  org.apache.hadoop.yarn.client.api.YarnClient yarnClient ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.yarn.conf.YarnConfiguration yarnConf ()  { throw new RuntimeException(); }
  private  boolean isClusterMode ()  { throw new RuntimeException(); }
  private  int amMemory ()  { throw new RuntimeException(); }
  private  int amMemoryOverhead ()  { throw new RuntimeException(); }
  private  int amCores ()  { throw new RuntimeException(); }
  private  long executorMemory ()  { throw new RuntimeException(); }
  private  int executorMemoryOverhead ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.yarn.ClientDistributedCacheManager distCacheMgr ()  { throw new RuntimeException(); }
  private  boolean loginFromKeytab ()  { throw new RuntimeException(); }
  private  java.lang.String principal ()  { throw new RuntimeException(); }
  private  java.lang.String keytab ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.security.Credentials credentials ()  { throw new RuntimeException(); }
  private  org.apache.spark.launcher.LauncherBackend launcherBackend ()  { throw new RuntimeException(); }
  private  boolean fireAndForget ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.yarn.api.records.ApplicationId appId ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path appStagingBaseDir ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.yarn.security.ConfigurableCredentialManager credentialManager ()  { throw new RuntimeException(); }
  public  void reportLauncherState (org.apache.spark.launcher.SparkAppHandle.State state)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Submit an application running our ApplicationMaster to the ResourceManager.
   * <p>
   * The stable Yarn API provides a convenience method (YarnClient#createApplication) for
   * creating applications and setting up the application submission context. This was not
   * available in the alpha API.
   * @return (undocumented)
   */
  public  org.apache.hadoop.yarn.api.records.ApplicationId submitApplication ()  { throw new RuntimeException(); }
  /**
   * Cleanup application staging directory.
   * @param appId (undocumented)
   */
  private  void cleanupStagingDir (org.apache.hadoop.yarn.api.records.ApplicationId appId)  { throw new RuntimeException(); }
  /**
   * Set up the context for submitting our ApplicationMaster.
   * This uses the YarnClientApplication not available in the Yarn alpha API.
   * @param newApp (undocumented)
   * @param containerContext (undocumented)
   * @return (undocumented)
   */
  public  org.apache.hadoop.yarn.api.records.ApplicationSubmissionContext createApplicationSubmissionContext (org.apache.hadoop.yarn.client.api.YarnClientApplication newApp, org.apache.hadoop.yarn.api.records.ContainerLaunchContext containerContext)  { throw new RuntimeException(); }
  /** Set up security tokens for launching our ApplicationMaster container. */
  private  void setupSecurityToken (org.apache.hadoop.yarn.api.records.ContainerLaunchContext amContainer)  { throw new RuntimeException(); }
  /** Get the application report from the ResourceManager for an application we have submitted. */
  public  org.apache.hadoop.yarn.api.records.ApplicationReport getApplicationReport (org.apache.hadoop.yarn.api.records.ApplicationId appId)  { throw new RuntimeException(); }
  /**
   * Return the security token used by this client to communicate with the ApplicationMaster.
   * If no security is enabled, the token returned by the report is null.
   * @param report (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String getClientToken (org.apache.hadoop.yarn.api.records.ApplicationReport report)  { throw new RuntimeException(); }
  /**
   * Fail fast if we have requested more resources per container than is available in the cluster.
   * @param newAppResponse (undocumented)
   */
  private  void verifyClusterResources (org.apache.hadoop.yarn.api.protocolrecords.GetNewApplicationResponse newAppResponse)  { throw new RuntimeException(); }
  /**
   * Copy the given file to a remote file system (e.g. HDFS) if needed.
   * The file is only copied if the source and destination file systems are different. This is used
   * for preparing resources for launching the ApplicationMaster container. Exposed for testing.
   * @param destDir (undocumented)
   * @param srcPath (undocumented)
   * @param replication (undocumented)
   * @param force (undocumented)
   * @param destName (undocumented)
   * @return (undocumented)
   */
    org.apache.hadoop.fs.Path copyFileToRemote (org.apache.hadoop.fs.Path destDir, org.apache.hadoop.fs.Path srcPath, short replication, boolean force, scala.Option<java.lang.String> destName)  { throw new RuntimeException(); }
  /**
   * Upload any resources to the distributed cache if needed. If a resource is intended to be
   * consumed locally, set up the appropriate config for downstream code to handle it properly.
   * This is used for setting up a container launch context for our ApplicationMaster.
   * Exposed for testing.
   * @param destDir (undocumented)
   * @param pySparkArchives (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> prepareLocalResources (org.apache.hadoop.fs.Path destDir, scala.collection.Seq<java.lang.String> pySparkArchives)  { throw new RuntimeException(); }
  /**
   * Create an archive with the config files for distribution.
   * <p>
   * These will be used by AM and executors. The files are zipped and added to the job as an
   * archive, so that YARN will explode it when distributing to AM and executors. This directory
   * is then added to the classpath of AM and executor process, just to make sure that everybody
   * is using the same default config.
   * <p>
   * This follows the order of precedence set by the startup scripts, in which HADOOP_CONF_DIR
   * shows up in the classpath before YARN_CONF_DIR.
   * <p>
   * Currently this makes a shallow copy of the conf directory. If there are cases where a
   * Hadoop config directory contains subdirectories, this code will have to be fixed.
   * <p>
   * The archive also contains some Spark configuration. Namely, it saves the contents of
   * SparkConf in a file to be loaded by the AM process.
   * @return (undocumented)
   */
  private  java.io.File createConfArchive ()  { throw new RuntimeException(); }
  /**
   * Set up the environment for launching our ApplicationMaster container.
   * @param stagingDirPath (undocumented)
   * @param pySparkArchives (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> setupLaunchEnv (org.apache.hadoop.fs.Path stagingDirPath, scala.collection.Seq<java.lang.String> pySparkArchives)  { throw new RuntimeException(); }
  /**
   * Set up a ContainerLaunchContext to launch our ApplicationMaster container.
   * This sets up the launch environment, java options, and the command for launching the AM.
   * @param newAppResponse (undocumented)
   * @return (undocumented)
   */
  private  org.apache.hadoop.yarn.api.records.ContainerLaunchContext createContainerLaunchContext (org.apache.hadoop.yarn.api.protocolrecords.GetNewApplicationResponse newAppResponse)  { throw new RuntimeException(); }
  public  void setupCredentials ()  { throw new RuntimeException(); }
  /**
   * Report the state of an application until it has exited, either successfully or
   * due to some failure, then return a pair of the yarn application state (FINISHED, FAILED,
   * KILLED, or RUNNING) and the final application state (UNDEFINED, SUCCEEDED, FAILED,
   * or KILLED).
   * <p>
   * @param appId ID of the application to monitor.
   * @param returnOnRunning Whether to also return the application state when it is RUNNING.
   * @param logApplicationReport Whether to log details of the application report every iteration.
   * @return A pair of the yarn application state and the final application state.
   */
  public  scala.Tuple2<org.apache.hadoop.yarn.api.records.YarnApplicationState, org.apache.hadoop.yarn.api.records.FinalApplicationStatus> monitorApplication (org.apache.hadoop.yarn.api.records.ApplicationId appId, boolean returnOnRunning, boolean logApplicationReport)  { throw new RuntimeException(); }
  private  java.lang.String formatReportDetails (org.apache.hadoop.yarn.api.records.ApplicationReport report)  { throw new RuntimeException(); }
  /**
   * Submit an application to the ResourceManager.
   * If set spark.yarn.submit.waitAppCompletion to true, it will stay alive
   * reporting the application's status until the application has exited for any reason.
   * Otherwise, the client process will exit after submission.
   * If the application finishes with a failed, killed, or undefined status,
   * throw an appropriate SparkException.
   */
  public  void run ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> findPySparkArchives ()  { throw new RuntimeException(); }
}
