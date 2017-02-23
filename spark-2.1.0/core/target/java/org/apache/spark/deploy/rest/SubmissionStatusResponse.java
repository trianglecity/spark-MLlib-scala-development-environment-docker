package org.apache.spark.deploy.rest;
/**
 * A response to a status request in the REST application submission protocol.
 */
  class SubmissionStatusResponse extends org.apache.spark.deploy.rest.SubmitRestProtocolResponse {
  public   SubmissionStatusResponse ()  { throw new RuntimeException(); }
  public  java.lang.String submissionId ()  { throw new RuntimeException(); }
  public  java.lang.String driverState ()  { throw new RuntimeException(); }
  public  java.lang.String workerId ()  { throw new RuntimeException(); }
  public  java.lang.String workerHostPort ()  { throw new RuntimeException(); }
  protected  void doValidate ()  { throw new RuntimeException(); }
}
