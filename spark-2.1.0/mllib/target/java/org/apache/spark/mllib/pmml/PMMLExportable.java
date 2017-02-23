package org.apache.spark.mllib.pmml;
/**
 * :: DeveloperApi ::
 * Export model to the PMML format
 * Predictive Model Markup Language (PMML) is an XML-based file format
 * developed by the Data Mining Group (www.dmg.org).
 */
public  interface PMMLExportable {
  /**
   * Export the model to the stream result in PMML format
   * @param streamResult (undocumented)
   */
  public  void toPMML (javax.xml.transform.stream.StreamResult streamResult)  ;
  /**
   * Export the model to a local file in PMML format
   * @param localPath (undocumented)
   */
  public  void toPMML (java.lang.String localPath)  ;
  /**
   * Export the model to a directory on a distributed file system in PMML format
   * @param sc (undocumented)
   * @param path (undocumented)
   */
  public  void toPMML (org.apache.spark.SparkContext sc, java.lang.String path)  ;
  /**
   * Export the model to the OutputStream in PMML format
   * @param outputStream (undocumented)
   */
  public  void toPMML (java.io.OutputStream outputStream)  ;
  /**
   * Export the model to a String in PMML format
   * @return (undocumented)
   */
  public  java.lang.String toPMML ()  ;
}
