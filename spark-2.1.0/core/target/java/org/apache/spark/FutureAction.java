package org.apache.spark;
/**
 * A future for the result of an action to support cancellation. This is an extension of the
 * Scala Future interface to support cancellation.
 */
public  interface FutureAction<T extends java.lang.Object> extends scala.concurrent.Future<T> {
  /**
   * Cancels the execution of this action.
   */
  public  void cancel ()  ;
  /**
   * Blocks until this action completes.
   * <p>
   * @param atMost maximum wait time, which may be negative (no waiting is done), Duration.Inf
   *               for unbounded waiting, or a finite positive duration
   * @return this FutureAction
   * @param permit (undocumented)
   */
  public  org.apache.spark.FutureAction<T> ready (scala.concurrent.duration.Duration atMost, scala.concurrent.CanAwait permit)  ;
  /**
   * Awaits and returns the result (of type T) of this action.
   * <p>
   * @param atMost maximum wait time, which may be negative (no waiting is done), Duration.Inf
   *               for unbounded waiting, or a finite positive duration
   * @throws Exception exception during action execution
   * @return the result value if the action is completed within the specific maximum wait time
   * @param permit (undocumented)
   */
  public  T result (scala.concurrent.duration.Duration atMost, scala.concurrent.CanAwait permit) throws java.lang.Exception ;
  /**
   * When this action is completed, either through an exception, or a value, applies the provided
   * function.
   * @param func (undocumented)
   * @param executor (undocumented)
   */
  public <U extends java.lang.Object> void onComplete (scala.Function1<scala.util.Try<T>, U> func, scala.concurrent.ExecutionContext executor)  ;
  /**
   * Returns whether the action has already been completed with a value or an exception.
   * @return (undocumented)
   */
  public  boolean isCompleted ()  ;
  /**
   * Returns whether the action has been cancelled.
   * @return (undocumented)
   */
  public  boolean isCancelled ()  ;
  /**
   * The value of this Future.
   * <p>
   * If the future is not completed the returned value will be None. If the future is completed
   * the value will be Some(Success(t)) if it contains a valid result, or Some(Failure(error)) if
   * it contains an exception.
   * @return (undocumented)
   */
  public  scala.Option<scala.util.Try<T>> value ()  ;
  /**
   * Blocks and returns the result of this job.
   * @return (undocumented)
   */
  public  T get () throws org.apache.spark.SparkException ;
  /**
   * Returns the job IDs run by the underlying async operation.
   * <p>
   * This returns the current snapshot of the job list. Certain operations may run multiple
   * jobs, so multiple calls to this method may return different lists.
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.Object> jobIds ()  ;
}
