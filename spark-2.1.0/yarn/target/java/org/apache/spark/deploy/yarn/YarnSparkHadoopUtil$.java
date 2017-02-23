package org.apache.spark.deploy.yarn;
public  class YarnSparkHadoopUtil$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final YarnSparkHadoopUtil$ MODULE$ = null;
  public   YarnSparkHadoopUtil$ ()  { throw new RuntimeException(); }
  public  double MEMORY_OVERHEAD_FACTOR ()  { throw new RuntimeException(); }
  public  long MEMORY_OVERHEAD_MIN ()  { throw new RuntimeException(); }
  public  java.lang.String ANY_HOST ()  { throw new RuntimeException(); }
  public  int DEFAULT_NUMBER_EXECUTORS ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.api.records.Priority RM_REQUEST_PRIORITY ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.yarn.YarnSparkHadoopUtil get ()  { throw new RuntimeException(); }
  /**
   * Add a path variable to the given environment map.
   * If the map already contains this key, append the value to the existing value instead.
   * @param env (undocumented)
   * @param key (undocumented)
   * @param value (undocumented)
   */
  public  void addPathToEnvironment (scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env, java.lang.String key, java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Set zero or more environment variables specified by the given input string.
   * The input string is expected to take the form "KEY1=VAL1,KEY2=VAL2,KEY3=VAL3".
   * @param env (undocumented)
   * @param inputString (undocumented)
   */
  public  void setEnvFromInputString (scala.collection.mutable.HashMap<java.lang.String, java.lang.String> env, java.lang.String inputString)  { throw new RuntimeException(); }
  private  java.lang.String environmentVariableRegex ()  { throw new RuntimeException(); }
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
    void addOutOfMemoryErrorArgument (scala.collection.mutable.ListBuffer<java.lang.String> javaOpts)  { throw new RuntimeException(); }
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
  public  java.lang.String escapeForShell (java.lang.String arg)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.hadoop.yarn.api.records.ApplicationAccessType, java.lang.String> getApplicationAclsForYarn (org.apache.spark.SecurityManager securityMgr)  { throw new RuntimeException(); }
  /**
   * Expand environment variable using Yarn API.
   * If environment.$$() is implemented, return the result of it.
   * Otherwise, return the result of environment.$()
   * Note: $$() is added in Hadoop 2.4.
   * @return (undocumented)
   */
  private  java.lang.reflect.Method expandMethod ()  { throw new RuntimeException(); }
  public  java.lang.String expandEnvironment (org.apache.hadoop.yarn.api.ApplicationConstants.Environment environment)  { throw new RuntimeException(); }
  /**
   * Get class path separator using Yarn API.
   * If ApplicationConstants.CLASS_PATH_SEPARATOR is implemented, return it.
   * Otherwise, return File.pathSeparator
   * Note: CLASS_PATH_SEPARATOR is added in Hadoop 2.4.
   * @return (undocumented)
   */
  private  java.lang.reflect.Field classPathSeparatorField ()  { throw new RuntimeException(); }
  public  java.lang.String getClassPathSeparator ()  { throw new RuntimeException(); }
  /**
   * Getting the initial target number of executors depends on whether dynamic allocation is
   * enabled.
   * If not using dynamic allocation it gets the number of executors requested by the user.
   * @param conf (undocumented)
   * @param numExecutors (undocumented)
   * @return (undocumented)
   */
  public  int getInitialTargetExecutorNumber (org.apache.spark.SparkConf conf, int numExecutors)  { throw new RuntimeException(); }
}
