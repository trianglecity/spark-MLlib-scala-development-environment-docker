package org.apache.spark.deploy.rest;
/**
 * A servlet for handling submit requests passed to the {@link RestSubmissionServer}.
 */
 abstract class SubmitRequestServlet extends org.apache.spark.deploy.rest.RestServlet {
  public   SubmitRequestServlet ()  { throw new RuntimeException(); }
  /**
   * Submit an application to the Master with parameters specified in the request.
   * <p>
   * The request is assumed to be a {@link SubmitRestProtocolRequest} in the form of JSON.
   * If the request is successfully processed, return an appropriate response to the
   * client indicating so. Otherwise, return error instead.
   * @param requestServlet (undocumented)
   * @param responseServlet (undocumented)
   */
  protected  void doPost (javax.servlet.http.HttpServletRequest requestServlet, javax.servlet.http.HttpServletResponse responseServlet)  { throw new RuntimeException(); }
  protected abstract  org.apache.spark.deploy.rest.SubmitRestProtocolResponse handleSubmit (java.lang.String requestMessageJson, org.apache.spark.deploy.rest.SubmitRestProtocolMessage requestMessage, javax.servlet.http.HttpServletResponse responseServlet)  ;
}
