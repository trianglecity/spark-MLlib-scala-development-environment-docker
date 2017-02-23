package org.apache.spark.deploy.rest;
/**
 * A request to launch a new application in the REST application submission protocol.
 */
  class CreateSubmissionRequest extends org.apache.spark.deploy.rest.SubmitRestProtocolRequest {
  public   CreateSubmissionRequest ()  { throw new RuntimeException(); }
  public  java.lang.String appResource ()  { throw new RuntimeException(); }
  public  java.lang.String mainClass ()  { throw new RuntimeException(); }
  public  java.lang.String[] appArgs ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> sparkProperties ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> environmentVariables ()  { throw new RuntimeException(); }
  protected  void doValidate ()  { throw new RuntimeException(); }
  private  void assertPropertyIsSet (java.lang.String key)  { throw new RuntimeException(); }
  private  void assertPropertyIsBoolean (java.lang.String key)  { throw new RuntimeException(); }
  private  void assertPropertyIsNumeric (java.lang.String key)  { throw new RuntimeException(); }
  private  void assertPropertyIsMemory (java.lang.String key)  { throw new RuntimeException(); }
  /** Assert that a Spark property can be converted to a certain type. */
  private <T extends java.lang.Object> void assertProperty (java.lang.String key, java.lang.String valueType, scala.Function1<java.lang.String, T> convert)  { throw new RuntimeException(); }
}
