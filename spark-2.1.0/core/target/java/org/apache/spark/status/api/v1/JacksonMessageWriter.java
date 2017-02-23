package org.apache.spark.status.api.v1;
/**
 * This class converts the POJO metric responses into json, using jackson.
 * <p>
 * This doesn't follow the standard jersey-jackson plugin options, because we want to stick
 * with an old version of jersey (since we have it from yarn anyway) and don't want to pull in lots
 * of dependencies from a new plugin.
 * <p>
 * Note that jersey automatically discovers this class based on its package and its annotations.
 */
  class JacksonMessageWriter implements javax.ws.rs.ext.MessageBodyWriter<java.lang.Object> {
  static public  java.text.SimpleDateFormat makeISODateFormat ()  { throw new RuntimeException(); }
  public   JacksonMessageWriter ()  { throw new RuntimeException(); }
  public  com.fasterxml.jackson.databind.ObjectMapper mapper ()  { throw new RuntimeException(); }
  public  boolean isWriteable (java.lang.Class<?> aClass, java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotations, javax.ws.rs.core.MediaType mediaType)  { throw new RuntimeException(); }
  public  void writeTo (java.lang.Object t, java.lang.Class<?> aClass, java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotations, javax.ws.rs.core.MediaType mediaType, javax.ws.rs.core.MultivaluedMap<java.lang.String, java.lang.Object> multivaluedMap, java.io.OutputStream outputStream)  { throw new RuntimeException(); }
  public  long getSize (java.lang.Object t, java.lang.Class<?> aClass, java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotations, javax.ws.rs.core.MediaType mediaType)  { throw new RuntimeException(); }
}
