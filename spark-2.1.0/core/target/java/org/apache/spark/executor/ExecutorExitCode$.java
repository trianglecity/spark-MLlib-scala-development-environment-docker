package org.apache.spark.executor;
/**
 * These are exit codes that executors should use to provide the master with information about
 * executor failures assuming that cluster management framework can capture the exit codes (but
 * perhaps not log files). The exit code constants here are chosen to be unlikely to conflict
 * with "natural" exit statuses that may be caused by the JVM or user code. In particular,
 * exit codes 128+ arise on some Unix-likes as a result of signals, and it appears that the
 * OpenJDK JVM may use exit code 1 in some of its own "last chance" code.
 */
public  class ExecutorExitCode$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExecutorExitCode$ MODULE$ = null;
  public   ExecutorExitCode$ ()  { throw new RuntimeException(); }
  /** DiskStore failed to create a local temporary directory after many attempts. */
  public  int DISK_STORE_FAILED_TO_CREATE_DIR ()  { throw new RuntimeException(); }
  /** ExternalBlockStore failed to initialize after many attempts. */
  public  int EXTERNAL_BLOCK_STORE_FAILED_TO_INITIALIZE ()  { throw new RuntimeException(); }
  /** ExternalBlockStore failed to create a local temporary directory after many attempts. */
  public  int EXTERNAL_BLOCK_STORE_FAILED_TO_CREATE_DIR ()  { throw new RuntimeException(); }
  /**
   * Executor is unable to send heartbeats to the driver more than
   * "spark.executor.heartbeat.maxFailures" times.
   * @return (undocumented)
   */
  public  int HEARTBEAT_FAILURE ()  { throw new RuntimeException(); }
  public  java.lang.String explainExitCode (int exitCode)  { throw new RuntimeException(); }
}
