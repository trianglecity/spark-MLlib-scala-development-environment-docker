package org.apache.spark.api.python;
/**
 * A Wrapper for Python Broadcast, which is written into disk by Python. It also will
 * write the data into disk after deserialization, then Python can read it from disks.
 */
  class PythonBroadcast implements java.io.Serializable, org.apache.spark.internal.Logging {
  public  java.lang.String path ()  { throw new RuntimeException(); }
  // not preceding
  public   PythonBroadcast (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Read data from disks, then copy it to <code>out</code>
   * @param out (undocumented)
   */
  private  void writeObject (java.io.ObjectOutputStream out)  { throw new RuntimeException(); }
  /**
   * Write data into disk, using randomly generated name.
   * @param in (undocumented)
   */
  private  void readObject (java.io.ObjectInputStream in)  { throw new RuntimeException(); }
  /**
   * Delete the file once the object is GCed.
   */
  public  void finalize ()  { throw new RuntimeException(); }
}
