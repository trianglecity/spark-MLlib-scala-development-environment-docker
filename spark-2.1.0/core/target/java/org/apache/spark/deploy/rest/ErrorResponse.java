package org.apache.spark.deploy.rest;
/**
 * An error response message used in the REST application submission protocol.
 */
  class ErrorResponse extends org.apache.spark.deploy.rest.SubmitRestProtocolResponse {
  public   ErrorResponse ()  { throw new RuntimeException(); }
  public  java.lang.String highestProtocolVersion ()  { throw new RuntimeException(); }
  protected  void doValidate ()  { throw new RuntimeException(); }
}
