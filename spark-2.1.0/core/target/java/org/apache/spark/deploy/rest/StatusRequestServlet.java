package org.apache.spark.deploy.rest;
/**
 * A servlet for handling status requests passed to the {@link RestSubmissionServer}.
 */
 abstract class StatusRequestServlet extends org.apache.spark.deploy.rest.RestServlet {
  public   StatusRequestServlet ()  { throw new RuntimeException(); }
  /**
   * If a submission ID is specified in the URL, request the status of the corresponding
   * driver from the Master and include it in the response. Otherwise, return error.
   * @param request (undocumented)
   * @param response (undocumented)
   */
  protected  void doGet (javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)  { throw new RuntimeException(); }
  protected abstract  org.apache.spark.deploy.rest.SubmissionStatusResponse handleStatus (java.lang.String submissionId)  ;
}
