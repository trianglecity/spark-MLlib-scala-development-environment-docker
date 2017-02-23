package org.apache.spark.deploy.rest;
/**
 * An abstract request sent from the client in the REST application submission protocol.
 */
 abstract class SubmitRestProtocolRequest extends org.apache.spark.deploy.rest.SubmitRestProtocolMessage {
  public   SubmitRestProtocolRequest ()  { throw new RuntimeException(); }
  public  java.lang.String clientSparkVersion ()  { throw new RuntimeException(); }
  protected  void doValidate ()  { throw new RuntimeException(); }
}
