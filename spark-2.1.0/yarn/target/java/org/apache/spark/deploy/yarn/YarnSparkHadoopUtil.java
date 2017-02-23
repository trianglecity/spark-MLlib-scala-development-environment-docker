package org.apache.spark.deploy.yarn;
/**
 * Contains util methods to interact with Hadoop from spark.
 */
public  class YarnSparkHadoopUtil extends org.apache.spark.deploy.SparkHadoopUtil {
  static public  double MEMORY_OVERHEAD_FACTOR ()  { throw new RuntimeException(); }
  static public  long MEMORY_OVERHEAD_MIN ()  { throw new RuntimeException(); }
  static public  java.lang.String ANY_HOST ()  { throw new RuntimeException(); }
  static public  int DEFAULT_NUMBER_EXECUTORS ()  { throw new RuntimeException(); }
  static public  org.apache.hadoop.yarn.api.records.Priority RM_REQUEST_PRIORITY ()  { throw new RuntimeException(); }
  static public  org.apache.spark.deploy.yarn.YarnSparkHadoopUtil get ()  { throw new RuntimeException(); }
  /**
   * Add a path variable to the given environment map.
   * If the map already contains this key, append the value to the existing value instead.
   * @param env (undocumented)
   * @param key (undocumented)
   * @param value (undocumented)
   */
  static public  void addPathToEnvironment (scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env, java.lang.String key, java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Set zero or more environment variables specified by the given input string.
   * The input string is expected to take the form "KEY1=VAL1,KEY2=VAL2,KEY3=VAL3".
   * @param env (undocumented)
   * @param inputString (undocumented)
   */
  static public  void setEnvFromInputString (scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env, java.lang.String inputString)  { throw new RuntimeException(); }
  static private  java.lang.String environmentVariableRegex ()  { throw new RuntimeException(); }
  /**
   * Kill if OOM is raised - leverage yarn's failure handling to cause rescheduling.
   * Not killing the task leaves various aspects of the executor and (to some extent) the jvm in
   * an inconsistent state.
   * TODO: If the OOM is not recoverable by rescheduling it on different node, then do
   * 'something' to fail job ... akin to blacklisting trackers in mapred ?
   * <p>
   * The handler if an OOM Exception is thrown by the JVM must be configured on Windows
   * differently: the 'taskkill' command should be used, whereas Unix-based systems use 'kill'.
   * <p>
   * As the JVM interprets both %p and %%p as the same, we can use either of them. However,
   * some tests on Windows computers suggest, that the JVM only accepts '%%p'.
   * <p>
   * Furthermore, the behavior of the character '%' on the Windows command line differs from
   * the behavior of '%' in a .cmd file: it gets interpreted as an incomplete environment
   * variable. Windows .cmd files escape a '%' by '%%'. Thus, the correct way of writing
   * '%%p' in an escaped way is '%%%%p'.
   * @param javaOpts (undocumented)
   */
  static   void addOutOfMemoryErrorArgument (scala.collection.mutable.ListBuffer<java.lang.String> javaOpts)  { throw new RuntimeException(); }
  /**
   * Escapes a string for inclusion in a command line executed by Yarn. Yarn executes commands
   * using either
   * <p>
   * (Unix-based) <code>bash -c "command arg1 arg2"</code> and that means plain quoting doesn't really work.
   * The argument is enclosed in single quotes and some key characters are escaped.
   * <p>
   * (Windows-based) part of a .cmd file in which case windows escaping for each argument must be
   * applied. Windows is quite lenient, however it is usually Java that causes trouble, needing to
   * distinguish between arguments starting with '-' and class names. If arguments are surrounded
   * by ' java takes the following string as is, hence an argument is mistakenly taken as a class
   * name which happens to start with a '-'. The way to avoid this, is to surround nothing with
   * a ', but instead with a ".
   * <p>
   * @param arg A single argument.
   * @return Argument quoted for execution via Yarn's generated shell script.
   */
  static public  java.lang.String escapeForShell (java.lang.String arg)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<org.apache.hadoop.yarn.api.records.ApplicationAccessType, java.lang.String> getApplicationAclsForYarn (org.apache.spark.SecurityManager securityMgr)  { throw new RuntimeException(); }
  /**
   * Expand environment variable using Yarn API.
   * If environment.$$() is implemented, return the result of it.
   * Otherwise, return the result of environment.$()
   * Note: $$() is added in Hadoop 2.4.
   * @return (undocumented)
   */
  static private  java.lang.reflect.Method expandMethod ()  { throw new RuntimeException(); }
  static public  java.lang.String expandEnvironment (org.apache.hadoop.yarn.api.ApplicationConstants.Environment environment)  { throw new RuntimeException(); }
  /**
   * Get class path separator using Yarn API.
   * If ApplicationConstants.CLASS_PATH_SEPARATOR is implemented, return it.
   * Otherwise, return File.pathSeparator
   * Note: CLASS_PATH_SEPARATOR is added in Hadoop 2.4.
   * @return (undocumented)
   */
  static private  java.lang.reflect.Field classPathSeparatorField ()  { throw new RuntimeException(); }
  static public  java.lang.String getClassPathSeparator ()  { throw new RuntimeException(); }
  /**
   * Getting the initial target number of executors depends on whether dynamic allocation is
   * enabled.
   * If not using dynamic allocation it gets the number of executors requested by the user.
   * @param conf (undocumented)
   * @param numExecutors (undocumented)
   * @return (undocumented)
   */
  static public  int getInitialTargetExecutorNumber (org.apache.spark.SparkConf conf, int numExecutors)  { throw new RuntimeException(); }
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
  static public  org.apache.hadoop.conf.Configuration conf ()  { throw new RuntimeException(); }
  static public  void runAsSparkUser (scala.Function0<scala.runtime.BoxedUnit> func)  { throw new RuntimeException(); }
  static public  void appendS3AndSparkHadoopConfigurations (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  static public  void loginUserFromKeytab (java.lang.String principalName, java.lang.String keytabFilename)  { throw new RuntimeException(); }
  static   scala.Option<scala.Function0<java.lang.Object>> getFSBytesReadOnThreadCallback ()  { throw new RuntimeException(); }
  static   scala.Option<scala.Function0<java.lang.Object>> getFSBytesWrittenOnThreadCallback ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> listLeafStatuses (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path basePath)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> listLeafStatuses (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.FileStatus baseStatus)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> listLeafDirStatuses (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path basePath)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> listLeafDirStatuses (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.FileStatus baseStatus)  { throw new RuntimeException(); }
  static public  boolean isGlobPath (org.apache.hadoop.fs.Path pattern)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.hadoop.fs.Path> globPath (org.apache.hadoop.fs.Path pattern)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.hadoop.fs.Path> globPathIfNecessary (org.apache.hadoop.fs.Path pattern)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FileStatus[] listFilesSorted (org.apache.hadoop.fs.FileSystem remoteFs, org.apache.hadoop.fs.Path dir, java.lang.String prefix, java.lang.String exclusionSuffix)  { throw new RuntimeException(); }
  static   int getSuffixForCredentialsPath (org.apache.hadoop.fs.Path credentialsPath)  { throw new RuntimeException(); }
  static public  java.lang.String substituteHadoopVariables (java.lang.String text, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  static   org.apache.hadoop.conf.Configuration getConfBypassingFSCache (org.apache.hadoop.conf.Configuration hadoopConf, java.lang.String scheme)  { throw new RuntimeException(); }
  static   scala.collection.Iterable<java.lang.String> dumpTokens (org.apache.hadoop.security.Credentials credentials)  { throw new RuntimeException(); }
  static   java.lang.String tokenToString (org.apache.hadoop.security.token.Token<? extends org.apache.hadoop.security.token.TokenIdentifier> token)  { throw new RuntimeException(); }
  public   YarnSparkHadoopUtil ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.yarn.security.CredentialUpdater credentialUpdater ()  { throw new RuntimeException(); }
  public  void transferCredentials (org.apache.hadoop.security.UserGroupInformation source, org.apache.hadoop.security.UserGroupInformation dest)  { throw new RuntimeException(); }
  public  boolean isYarnMode ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration newConfiguration (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  void addCredentials (org.apache.hadoop.mapred.JobConf conf)  { throw new RuntimeException(); }
  public  org.apache.hadoop.security.Credentials getCurrentUserCredentials ()  { throw new RuntimeException(); }
  public  void addCurrentUserCredentials (org.apache.hadoop.security.Credentials creds)  { throw new RuntimeException(); }
  public  void addSecretKeyToUserCredentials (java.lang.String key, java.lang.String secret)  { throw new RuntimeException(); }
  public  byte[] getSecretKeyFromUserCredentials (java.lang.String key)  { throw new RuntimeException(); }
    void startCredentialUpdater (org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
    void stopCredentialUpdater ()  { throw new RuntimeException(); }
    org.apache.hadoop.yarn.api.records.ContainerId getContainerId ()  { throw new RuntimeException(); }
}
