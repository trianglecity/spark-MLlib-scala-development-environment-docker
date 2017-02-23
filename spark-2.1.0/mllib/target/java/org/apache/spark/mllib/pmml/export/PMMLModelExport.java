package org.apache.spark.mllib.pmml.export;
  interface PMMLModelExport {
  /**
   * Holder of the exported model in PMML format
   * @return (undocumented)
   */
  public  org.dmg.pmml.PMML pmml ()  ;
  public  org.dmg.pmml.PMML getPmml ()  ;
}
