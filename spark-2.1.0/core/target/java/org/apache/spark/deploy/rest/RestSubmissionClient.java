package org.apache.spark.deploy.rest;
/**
 * A client that submits applications to a {@link RestSubmissionServer}.
 * <p>
 * In protocol version v1, the REST URL takes the form http://[host:port]/v1/submissions/[action],
 * where [action] can be one of create, kill, or status. Each type of request is represented in
 * an HTTP message sent to the following prefixes:
 *   (1) submit - POST to /submissions/create
 *   (2) kill - POST /submissions/kill/[submissionId]
 *   (3) status - GET /submissions/status/[submissionId]
 * <p>
 * In the case of (1), parameters are posted in the HTTP body in the form of JSON fields.
 * Otherwise, the URL fully specifies the intended action of the client.
 * <p>
 * Since the protocol is expected to be stable across Spark versions, existing fields cannot be
 * added or removed, though new optional fields can be added. In the rare event that forward or
 * backward compatibility is broken, Spark must introduce a new protocol version (e.g. v2).
 * <p>
 * The client and the server must communicate using the same version of the protocol. If there
 * is a mismatch, the server will respond with the highest protocol version it supports. A future
 * implementation of this client can use that information to retry using the version specified
 * by the server.
 */
  class RestSubmissionClient implements org.apache.spark.internal.Logging {
  static private  int REPORT_DRIVER_STATUS_INTERVAL ()  { throw new RuntimeException(); }
  static private  int REPORT_DRIVER_STATUS_MAX_TRIES ()  { throw new RuntimeException(); }
  static public  java.lang.String PROTOCOL_VERSION ()  { throw new RuntimeException(); }
  /**
   * Submit an application, assuming Spark parameters are specified through the given config.
   * This is abstracted to its own method for testing purposes.
   * @param appResource (undocumented)
   * @param mainClass (undocumented)
   * @param appArgs (undocumented)
   * @param conf (undocumented)
   * @param env (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.deploy.rest.SubmitRestProtocolResponse run (java.lang.String appResource, java.lang.String mainClass, java.lang.String[] appArgs, org.apache.spark.SparkConf conf, scala.collection.immutable.Map<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  /**
   * Filter non-spark environment variables from any environment.
   * @param env (undocumented)
   * @return (undocumented)
   */
  static   scala.collection.immutable.Map<java.lang.String, java.lang.String> filterSystemEnvironment (scala.collection.immutable.Map<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
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
  public   RestSubmissionClient (java.lang.String master)  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> supportedMasterPrefixes ()  { throw new RuntimeException(); }
  private  java.lang.String[] masters ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<java.lang.String> lostMasters ()  { throw new RuntimeException(); }
  /**
   * Submit an application specified by the parameters in the provided request.
   * <p>
   * If the submission was successful, poll the status of the submission and report
   * it to the user. Otherwise, report the error message provided by the server.
   * @param request (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.deploy.rest.SubmitRestProtocolResponse createSubmission (org.apache.spark.deploy.rest.CreateSubmissionRequest request)  { throw new RuntimeException(); }
  /** Request that the server kill the specified submission. */
  public  org.apache.spark.deploy.rest.SubmitRestProtocolResponse killSubmission (java.lang.String submissionId)  { throw new RuntimeException(); }
  /** Request the status of a submission from the server. */
  public  org.apache.spark.deploy.rest.SubmitRestProtocolResponse requestSubmissionStatus (java.lang.String submissionId, boolean quiet)  { throw new RuntimeException(); }
  /** Construct a message that captures the specified parameters for submitting an application. */
  public  org.apache.spark.deploy.rest.CreateSubmissionRequest constructSubmitRequest (java.lang.String appResource, java.lang.String mainClass, java.lang.String[] appArgs, scala.collection.immutable.Map<java.lang.String, java.lang.String> sparkProperties, scala.collection.immutable.Map<java.lang.String, java.lang.String> environmentVariables)  { throw new RuntimeException(); }
  /** Send a GET request to the specified URL. */
  private  org.apache.spark.deploy.rest.SubmitRestProtocolResponse get (java.net.URL url)  { throw new RuntimeException(); }
  /** Send a POST request to the specified URL. */
  private  org.apache.spark.deploy.rest.SubmitRestProtocolResponse post (java.net.URL url)  { throw new RuntimeException(); }
  /** Send a POST request with the given JSON as the body to the specified URL. */
  private  org.apache.spark.deploy.rest.SubmitRestProtocolResponse postJson (java.net.URL url, java.lang.String json)  { throw new RuntimeException(); }
  /**
   * Read the response from the server and return it as a validated {@link SubmitRestProtocolResponse}.
   * If the response represents an error, report the embedded message to the user.
   * Exposed for testing.
   * @param connection (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.deploy.rest.SubmitRestProtocolResponse readResponse (java.net.HttpURLConnection connection)  { throw new RuntimeException(); }
  /** Return the REST URL for creating a new submission. */
  private  java.net.URL getSubmitUrl (java.lang.String master)  { throw new RuntimeException(); }
  /** Return the REST URL for killing an existing submission. */
  private  java.net.URL getKillUrl (java.lang.String master, java.lang.String submissionId)  { throw new RuntimeException(); }
  /** Return the REST URL for requesting the status of an existing submission. */
  private  java.net.URL getStatusUrl (java.lang.String master, java.lang.String submissionId)  { throw new RuntimeException(); }
  /** Return the base URL for communicating with the server, including the protocol version. */
  private  java.lang.String getBaseUrl (java.lang.String master)  { throw new RuntimeException(); }
  /** Throw an exception if this is not standalone mode. */
  private  void validateMaster (java.lang.String master)  { throw new RuntimeException(); }
  /** Report the status of a newly created submission. */
  private  void reportSubmissionStatus (org.apache.spark.deploy.rest.CreateSubmissionResponse submitResponse)  { throw new RuntimeException(); }
  /**
   * Poll the status of the specified submission and log it.
   * This retries up to a fixed number of times before giving up.
   * @param submissionId (undocumented)
   */
  private  void pollSubmissionStatus (java.lang.String submissionId)  { throw new RuntimeException(); }
  /** Log the response sent by the server in the REST application submission protocol. */
  private  void handleRestResponse (org.apache.spark.deploy.rest.SubmitRestProtocolResponse response)  { throw new RuntimeException(); }
  /** Log an appropriate error if the response sent by the server is not of the expected type. */
  private  void handleUnexpectedRestResponse (org.apache.spark.deploy.rest.SubmitRestProtocolResponse unexpected)  { throw new RuntimeException(); }
  /**
   * When a connection exception is caught, return true if all masters are lost.
   * Note that the heuristic used here does not take into account that masters
   * can recover during the lifetime of this client. This assumption should be
   * harmless because this client currently does not support retrying submission
   * on failure yet (SPARK-6443).
   * @param masterUrl (undocumented)
   * @return (undocumented)
   */
  private  boolean handleConnectionException (java.lang.String masterUrl)  { throw new RuntimeException(); }
}
