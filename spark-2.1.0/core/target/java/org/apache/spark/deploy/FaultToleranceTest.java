package org.apache.spark.deploy;
/**
 * This suite tests the fault tolerance of the Spark standalone scheduler, mainly the Master.
 * In order to mimic a real distributed cluster more closely, Docker is used.
 * Execute using
 * ./bin/spark-class org.apache.spark.deploy.FaultToleranceTest
 * <p>
 * Make sure that that the environment includes the following properties in SPARK_DAEMON_JAVA_OPTS
 * *and* SPARK_JAVA_OPTS:
 *   - spark.deploy.recoveryMode=ZOOKEEPER
 *   - spark.deploy.zookeeper.url=172.17.42.1:2181
 * Note that 172.17.42.1 is the default docker ip for the host and 2181 is the default ZK port.
 * <p>
 * In case of failure, make sure to kill off prior docker containers before restarting:
 *   docker kill $(docker ps -q)
 * <p>
 * Unfortunately, due to the Docker dependency this suite cannot be run automatically without a
 * working installation of Docker. In addition to having Docker, the following are assumed:
 *   - Docker can run without sudo (see http://docs.docker.io/en/latest/use/basics/)
 *   - The docker images tagged spark-test-master and spark-test-worker are built from the
 *     docker/ directory. Run 'docker/spark-test/build' to generate these.
 */
public  class FaultToleranceTest {
  static private  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  static private  java.lang.String ZK_DIR ()  { throw new RuntimeException(); }
  static private  scala.collection.mutable.ListBuffer<org.apache.spark.deploy.TestMasterInfo> masters ()  { throw new RuntimeException(); }
  static private  scala.collection.mutable.ListBuffer<org.apache.spark.deploy.TestWorkerInfo> workers ()  { throw new RuntimeException(); }
  static private  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  static private  org.apache.curator.framework.CuratorFramework zk ()  { throw new RuntimeException(); }
  static private  int numPassed ()  { throw new RuntimeException(); }
  static private  int numFailed ()  { throw new RuntimeException(); }
  static private  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  static private  java.lang.String containerSparkHome ()  { throw new RuntimeException(); }
  static private  java.lang.String dockerMountDir ()  { throw new RuntimeException(); }
  static private  void afterEach ()  { throw new RuntimeException(); }
  static private  void test (java.lang.String name, scala.Function0<scala.runtime.BoxedUnit> fn)  { throw new RuntimeException(); }
  static private  void addMasters (int num)  { throw new RuntimeException(); }
  static private  void addWorkers (int num)  { throw new RuntimeException(); }
  /** Creates a SparkContext, which constructs a Client to interact with our cluster. */
  static private  void createClient ()  { throw new RuntimeException(); }
  static private  java.lang.String getMasterUrls (scala.collection.Seq<org.apache.spark.deploy.TestMasterInfo> masters)  { throw new RuntimeException(); }
  static private  org.apache.spark.deploy.TestMasterInfo getLeader ()  { throw new RuntimeException(); }
  static private  void killLeader ()  { throw new RuntimeException(); }
  static private  void delay (scala.concurrent.duration.Duration secs)  { throw new RuntimeException(); }
  static private  void terminateCluster ()  { throw new RuntimeException(); }
  /** This includes Client retry logic, so it may take a while if the cluster is recovering. */
  static private  void assertUsable ()  { throw new RuntimeException(); }
  /**
   * Asserts that the cluster is usable and that the expected masters and workers
   * are all alive in a proper configuration (e.g., only one leader).
   */
  static private  void assertValidClusterState ()  { throw new RuntimeException(); }
  static private  void assertTrue (boolean bool, java.lang.String message)  { throw new RuntimeException(); }
  static public  long executionStart ()  { throw new RuntimeException(); }
  static protected  java.lang.String[] args ()  { throw new RuntimeException(); }
  static public  void delayedInit (scala.Function0<scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
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
