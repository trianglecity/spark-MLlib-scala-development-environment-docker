package org.apache.spark.deploy.rest;
/**
 * A server that responds to requests submitted by the {@link RestSubmissionClient}.
 * This is intended to be embedded in the standalone Master and used in cluster mode only.
 * <p>
 * This server responds with different HTTP codes depending on the situation:
 *   200 OK - Request was processed successfully
 *   400 BAD REQUEST - Request was malformed, not successfully validated, or of unexpected type
 *   468 UNKNOWN PROTOCOL VERSION - Request specified a protocol this server does not understand
 *   500 INTERNAL SERVER ERROR - Server throws an exception internally while processing the request
 * <p>
 * The server always includes a JSON representation of the relevant {@link SubmitRestProtocolResponse}
 * in the HTTP body. If an error occurs, however, the server will include an {@link ErrorResponse}
 * instead of the one expected by the client. If the construction of this error response itself
 * fails, the response will consist of an empty body with a response code that indicates internal
 * server error.
 * <p>
 * param:  host the address this server should bind to
 * param:  requestedPort the port this server will attempt to bind to
 * param:  masterConf the conf used by the Master
 * param:  masterEndpoint reference to the Master endpoint to which requests can be sent
 * param:  masterUrl the URL of the Master new drivers will attempt to connect to
 */
  class StandaloneRestServer extends org.apache.spark.deploy.rest.RestSubmissionServer {
  public   StandaloneRestServer (java.lang.String host, int requestedPort, org.apache.spark.SparkConf masterConf, org.apache.spark.rpc.RpcEndpointRef masterEndpoint, java.lang.String masterUrl)  { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.rest.StandaloneSubmitRequestServlet submitRequestServlet ()  { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.rest.StandaloneKillRequestServlet killRequestServlet ()  { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.rest.StandaloneStatusRequestServlet statusRequestServlet ()  { throw new RuntimeException(); }
}
