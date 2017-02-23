package org.apache.spark.api.r;
/**
 * Counter that tracks JVM objects returned to R.
 * This is useful for referencing these objects in RPC calls.
 */
  class JVMObjectTracker {
  public   JVMObjectTracker ()  { throw new RuntimeException(); }
  /**
   * Returns the JVM object associated with the input key or None if not found.
   * @param id (undocumented)
   * @return (undocumented)
   */
  public final  scala.Option<java.lang.Object> get (org.apache.spark.api.r.JVMObjectId id)  { throw new RuntimeException(); }
  /**
   * Returns the JVM object associated with the input key or throws an exception if not found.
   * @param id (undocumented)
   * @return (undocumented)
   */
  public final  java.lang.Object apply (org.apache.spark.api.r.JVMObjectId id) throws java.util.NoSuchElementException { throw new RuntimeException(); }
  /**
   * Adds a JVM object to track and returns assigned ID, which is unique within this tracker.
   * @param obj (undocumented)
   * @return (undocumented)
   */
  public final  org.apache.spark.api.r.JVMObjectId addAndGetId (java.lang.Object obj)  { throw new RuntimeException(); }
  /**
   * Removes and returns a JVM object with the specific ID from the tracker, or None if not found.
   * @param id (undocumented)
   * @return (undocumented)
   */
  public final  scala.Option<java.lang.Object> remove (org.apache.spark.api.r.JVMObjectId id)  { throw new RuntimeException(); }
  /**
   * Number of JVM objects being tracked.
   * @return (undocumented)
   */
  public final  int size ()  { throw new RuntimeException(); }
  /**
   * Clears the tracker.
   */
  public final  void clear ()  { throw new RuntimeException(); }
}
