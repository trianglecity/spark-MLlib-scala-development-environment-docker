package org.apache.spark.streaming;
  class ContextWaiter {
  public   ContextWaiter ()  { throw new RuntimeException(); }
  private  java.util.concurrent.locks.ReentrantLock lock ()  { throw new RuntimeException(); }
  private  java.util.concurrent.locks.Condition condition ()  { throw new RuntimeException(); }
  private  java.lang.Throwable error ()  { throw new RuntimeException(); }
  private  boolean stopped ()  { throw new RuntimeException(); }
  public  void notifyError (java.lang.Throwable e)  { throw new RuntimeException(); }
  public  void notifyStop ()  { throw new RuntimeException(); }
  /**
   * Return <code>true</code> if it's stopped; or throw the reported error if <code>notifyError</code> has been called; or
   * <code>false</code> if the waiting time detectably elapsed before return from the method.
   * @param timeout (undocumented)
   * @return (undocumented)
   */
  public  boolean waitForStopOrError (long timeout)  { throw new RuntimeException(); }
}
