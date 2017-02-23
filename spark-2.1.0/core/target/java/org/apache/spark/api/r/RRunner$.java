package org.apache.spark.api.r;
public  class RRunner$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RRunner$ MODULE$ = null;
  public   RRunner$ ()  { throw new RuntimeException(); }
  /**
   * Start a thread to print the process's stderr to ours
   * @param proc (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.api.r.BufferedStreamThread startStdoutThread (java.lang.Process proc)  { throw new RuntimeException(); }
  private  org.apache.spark.api.r.BufferedStreamThread createRProcess (int port, java.lang.String script)  { throw new RuntimeException(); }
  /**
   * ProcessBuilder used to launch worker R processes.
   * @param port (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.r.BufferedStreamThread createRWorker (int port)  { throw new RuntimeException(); }
}
