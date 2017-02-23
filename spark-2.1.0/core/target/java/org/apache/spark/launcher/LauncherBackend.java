package org.apache.spark.launcher;
/**
 * A class that can be used to talk to a launcher server. Users should extend this class to
 * provide implementation for the abstract methods.
 * <p>
 * See <code>LauncherServer</code> for an explanation of how launcher communication works.
 */
 abstract class LauncherBackend {
  private  class BackendConnection extends org.apache.spark.launcher.LauncherConnection {
    public   BackendConnection (java.net.Socket s)  { throw new RuntimeException(); }
    protected  void handle (org.apache.spark.launcher.LauncherProtocol.Message m)  { throw new RuntimeException(); }
    public  void close ()  { throw new RuntimeException(); }
  }
  static public  java.util.concurrent.ThreadFactory threadFactory ()  { throw new RuntimeException(); }
  public   LauncherBackend ()  { throw new RuntimeException(); }
  private  java.lang.Thread clientThread ()  { throw new RuntimeException(); }
  private  org.apache.spark.launcher.LauncherBackend.BackendConnection connection ()  { throw new RuntimeException(); }
  private  org.apache.spark.launcher.SparkAppHandle.State lastState ()  { throw new RuntimeException(); }
  private  boolean _isConnected ()  { throw new RuntimeException(); }
  public  void connect ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  void setAppId (java.lang.String appId)  { throw new RuntimeException(); }
  public  void setState (org.apache.spark.launcher.SparkAppHandle.State state)  { throw new RuntimeException(); }
  /** Return whether the launcher handle is still connected to this backend. */
  public  boolean isConnected ()  { throw new RuntimeException(); }
  /**
   * Implementations should provide this method, which should try to stop the application
   * as gracefully as possible.
   */
  protected abstract  void onStopRequest ()  ;
  /**
   * Callback for when the launcher handle disconnects from this backend.
   */
  protected  void onDisconnected ()  { throw new RuntimeException(); }
  private  void fireStopRequest ()  { throw new RuntimeException(); }
}
