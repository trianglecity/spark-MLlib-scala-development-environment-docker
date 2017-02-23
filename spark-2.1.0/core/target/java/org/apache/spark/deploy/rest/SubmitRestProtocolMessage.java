package org.apache.spark.deploy.rest;
/**
 * An abstract message exchanged in the REST application submission protocol.
 * <p>
 * This message is intended to be serialized to and deserialized from JSON in the exchange.
 * Each message can either be a request or a response and consists of three common fields:
 *   (1) the action, which fully specifies the type of the message
 *   (2) the Spark version of the client / server
 *   (3) an optional message
 */
 abstract class SubmitRestProtocolMessage {
  static private  java.lang.String packagePrefix ()  { throw new RuntimeException(); }
  static private  com.fasterxml.jackson.databind.ObjectMapper mapper ()  { throw new RuntimeException(); }
  /**
   * Parse the value of the action field from the given JSON.
   * If the action field is not found, throw a {@link SubmitRestMissingFieldException}.
   * @param json (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String parseAction (java.lang.String json)  { throw new RuntimeException(); }
  /**
   * Construct a {@link SubmitRestProtocolMessage} from its JSON representation.
   * <p>
   * This method first parses the action from the JSON and uses it to infer the message type.
   * Note that the action must represent one of the {@link SubmitRestProtocolMessage}s defined in
   * this package. Otherwise, a {@link ClassNotFoundException} will be thrown.
   * @param json (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.deploy.rest.SubmitRestProtocolMessage fromJson (java.lang.String json)  { throw new RuntimeException(); }
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
  static public <T extends org.apache.spark.deploy.rest.SubmitRestProtocolMessage> T fromJson (java.lang.String json, java.lang.Class<T> clazz)  { throw new RuntimeException(); }
  public   SubmitRestProtocolMessage ()  { throw new RuntimeException(); }
  public  java.lang.String messageType ()  { throw new RuntimeException(); }
  public  java.lang.String action ()  { throw new RuntimeException(); }
  public  java.lang.String message ()  { throw new RuntimeException(); }
  private  void setAction (java.lang.String a)  { throw new RuntimeException(); }
  /**
   * Serialize the message to JSON.
   * This also ensures that the message is valid and its fields are in the expected format.
   * @return (undocumented)
   */
  public  java.lang.String toJson ()  { throw new RuntimeException(); }
  /**
   * Assert the validity of the message.
   * If the validation fails, throw a {@link SubmitRestProtocolException}.
   */
  public final  void validate ()  { throw new RuntimeException(); }
  /** Assert the validity of the message */
  protected  void doValidate ()  { throw new RuntimeException(); }
  /** Assert that the specified field is set in this message. */
  protected <T extends java.lang.Object> void assertFieldIsSet (T value, java.lang.String name)  { throw new RuntimeException(); }
}
