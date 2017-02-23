package org.apache.spark.deploy.rest;
/**
 * Helper methods to process serialized {@link SubmitRestProtocolMessage}s.
 */
public  class SubmitRestProtocolMessage$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SubmitRestProtocolMessage$ MODULE$ = null;
  public   SubmitRestProtocolMessage$ ()  { throw new RuntimeException(); }
  private  java.lang.String packagePrefix ()  { throw new RuntimeException(); }
  private  com.fasterxml.jackson.databind.ObjectMapper mapper ()  { throw new RuntimeException(); }
  /**
   * Parse the value of the action field from the given JSON.
   * If the action field is not found, throw a {@link SubmitRestMissingFieldException}.
   * @param json (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String parseAction (java.lang.String json)  { throw new RuntimeException(); }
  /**
   * Construct a {@link SubmitRestProtocolMessage} from its JSON representation.
   * <p>
   * This method first parses the action from the JSON and uses it to infer the message type.
   * Note that the action must represent one of the {@link SubmitRestProtocolMessage}s defined in
   * this package. Otherwise, a {@link ClassNotFoundException} will be thrown.
   * @param json (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.deploy.rest.SubmitRestProtocolMessage fromJson (java.lang.String json)  { throw new RuntimeException(); }
  /**
   * Construct a {@link SubmitRestProtocolMessage} from its JSON representation.
   * <p>
   * This method determines the type of the message from the class provided instead of
   * inferring it from the action field. This is useful for deserializing JSON that
   * represents custom user-defined messages.
   * @param json (undocumented)
   * @param clazz (undocumented)
   * @return (undocumented)
   */
  public <T extends org.apache.spark.deploy.rest.SubmitRestProtocolMessage> T fromJson (java.lang.String json, java.lang.Class<T> clazz)  { throw new RuntimeException(); }
}
