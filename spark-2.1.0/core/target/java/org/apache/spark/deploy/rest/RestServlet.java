package org.apache.spark.deploy.rest;
/**
 * An abstract servlet for handling requests passed to the {@link RestSubmissionServer}.
 */
 abstract class RestServlet extends javax.servlet.http.HttpServlet implements org.apache.spark.internal.Logging {
  public   RestServlet ()  { throw new RuntimeException(); }
  /**
   * Serialize the given response message to JSON and send it through the response servlet.
   * This validates the response before sending it to ensure it is properly constructed.
   * @param responseMessage (undocumented)
   * @param responseServlet (undocumented)
   */
  protected  void sendResponse (org.apache.spark.deploy.rest.SubmitRestProtocolResponse responseMessage, javax.servlet.http.HttpServletResponse responseServlet)  { throw new RuntimeException(); }
  /**
   * Return any fields in the client request message that the server does not know about.
   * <p>
   * The mechanism for this is to reconstruct the JSON on the server side and compare the
   * diff between this JSON and the one generated on the client side. Any fields that are
   * only in the client JSON are treated as unexpected.
   * @param requestJson (undocumented)
   * @param requestMessage (undocumented)
   * @return (undocumented)
   */
  protected  java.lang.String[] findUnknownFields (java.lang.String requestJson, org.apache.spark.deploy.rest.SubmitRestProtocolMessage requestMessage)  { throw new RuntimeException(); }
  /** Return a human readable String representation of the exception. */
  protected  java.lang.String formatException (java.lang.Throwable e)  { throw new RuntimeException(); }
  /** Construct an error message to signal the fact that an exception has been thrown. */
  protected  org.apache.spark.deploy.rest.ErrorResponse handleError (java.lang.String message)  { throw new RuntimeException(); }
  /**
   * Parse a submission ID from the relative path, assuming it is the first part of the path.
   * For instance, we expect the path to take the form /[submission ID]/maybe/something/else.
   * The returned submission ID cannot be empty. If the path is unexpected, return None.
   * @param path (undocumented)
   * @return (undocumented)
   */
  protected  scala.Option<java.lang.String> parseSubmissionId (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Validate the response to ensure that it is correctly constructed.
   * <p>
   * If it is, simply return the message as is. Otherwise, return an error response instead
   * to propagate the exception back to the client and set the appropriate error code.
   * @param responseMessage (undocumented)
   * @param responseServlet (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.deploy.rest.SubmitRestProtocolResponse validateResponse (org.apache.spark.deploy.rest.SubmitRestProtocolResponse responseMessage, javax.servlet.http.HttpServletResponse responseServlet)  { throw new RuntimeException(); }
}
