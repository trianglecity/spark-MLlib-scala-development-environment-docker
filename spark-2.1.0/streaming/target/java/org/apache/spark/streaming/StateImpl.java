package org.apache.spark.streaming;
/** Internal implementation of the {@link State} interface */
  class StateImpl<S extends java.lang.Object> extends org.apache.spark.streaming.State<S> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   StateImpl ()  { throw new RuntimeException(); }
  private  S state ()  { throw new RuntimeException(); }
  private  boolean defined ()  { throw new RuntimeException(); }
  private  boolean timingOut ()  { throw new RuntimeException(); }
  private  boolean updated ()  { throw new RuntimeException(); }
  private  boolean removed ()  { throw new RuntimeException(); }
  public  boolean exists ()  { throw new RuntimeException(); }
  public  S get ()  { throw new RuntimeException(); }
  public  void update (S newState)  { throw new RuntimeException(); }
  public  boolean isTimingOut ()  { throw new RuntimeException(); }
  public  void remove ()  { throw new RuntimeException(); }
  /** Whether the state has been marked for removing */
  public  boolean isRemoved ()  { throw new RuntimeException(); }
  /** Whether the state has been been updated */
  public  boolean isUpdated ()  { throw new RuntimeException(); }
  /**
   * Update the internal data and flags in <code>this</code> to the given state option.
   * This method allows <code>this</code> object to be reused across many state records.
   * @param optionalState (undocumented)
   */
  public  void wrap (scala.Option<S> optionalState)  { throw new RuntimeException(); }
  /**
   * Update the internal data and flags in <code>this</code> to the given state that is going to be timed out.
   * This method allows <code>this</code> object to be reused across many state records.
   * @param newState (undocumented)
   */
  public  void wrapTimingOutState (S newState)  { throw new RuntimeException(); }
}
