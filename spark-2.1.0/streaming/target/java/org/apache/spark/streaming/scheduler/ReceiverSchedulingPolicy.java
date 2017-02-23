package org.apache.spark.streaming.scheduler;
/**
 * A class that tries to schedule receivers with evenly distributed. There are two phases for
 * scheduling receivers.
 * <p>
 *  - The first phase is global scheduling when ReceiverTracker is starting and we need to schedule
 *    all receivers at the same time. ReceiverTracker will call <code>scheduleReceivers</code> at this phase.
 *    It will try to schedule receivers such that they are evenly distributed. ReceiverTracker
 *    should update its <code>receiverTrackingInfoMap</code> according to the results of <code>scheduleReceivers</code>.
 *    <code>ReceiverTrackingInfo.scheduledLocations</code> for each receiver should be set to a location list
 *    that contains the scheduled locations. Then when a receiver is starting, it will send a
 *    register request and <code>ReceiverTracker.registerReceiver</code> will be called. In
 *    <code>ReceiverTracker.registerReceiver</code>, if a receiver's scheduled locations is set, it should
 *    check if the location of this receiver is one of the scheduled locations, if not, the register
 *    will be rejected.
 *  - The second phase is local scheduling when a receiver is restarting. There are two cases of
 *    receiver restarting:
 *    - If a receiver is restarting because it's rejected due to the real location and the scheduled
 *      locations mismatching, in other words, it fails to start in one of the locations that
 *      <code>scheduleReceivers</code> suggested, <code>ReceiverTracker</code> should firstly choose the executors that
 *      are still alive in the list of scheduled locations, then use them to launch the receiver
 *      job.
 *    - If a receiver is restarting without a scheduled locations list, or the executors in the list
 *      are dead, <code>ReceiverTracker</code> should call <code>rescheduleReceiver</code>. If so, <code>ReceiverTracker</code>
 *      should not set <code>ReceiverTrackingInfo.scheduledLocations</code> for this receiver, instead, it
 *      should clear it. Then when this receiver is registering, we can know this is a local
 *      scheduling, and <code>ReceiverTrackingInfo</code> should call <code>rescheduleReceiver</code> again to check if
 *      the launching location is matching.
 * <p>
 * In conclusion, we should make a global schedule, try to achieve that exactly as long as possible,
 * otherwise do local scheduling.
 */
  class ReceiverSchedulingPolicy {
  public   ReceiverSchedulingPolicy ()  { throw new RuntimeException(); }
  /**
   * Try our best to schedule receivers with evenly distributed. However, if the
   * <code>preferredLocation</code>s of receivers are not even, we may not be able to schedule them evenly
   * because we have to respect them.
   * <p>
   * Here is the approach to schedule executors:
   * <ol>
   *   <li>First, schedule all the receivers with preferred locations (hosts), evenly among the
   *       executors running on those host.</li>
   *   <li>Then, schedule all other receivers evenly among all the executors such that overall
   *       distribution over all the receivers is even.</li>
   * </ol>
   * <p>
   * This method is called when we start to launch receivers at the first time.
   * <p>
   * @return a map for receivers and their scheduled locations
   * @param receivers (undocumented)
   * @param executors (undocumented)
   */
  public  scala.collection.Map<java.lang.Object, scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> scheduleReceivers (scala.collection.Seq<org.apache.spark.streaming.receiver.Receiver<?>> receivers, scala.collection.Seq<org.apache.spark.scheduler.ExecutorCacheTaskLocation> executors)  { throw new RuntimeException(); }
  /**
   * Return a list of candidate locations to run the receiver. If the list is empty, the caller can
   * run this receiver in arbitrary executor.
   * <p>
   * This method tries to balance executors' load. Here is the approach to schedule executors
   * for a receiver.
   * <ol>
   *   <li>
   *     If preferredLocation is set, preferredLocation should be one of the candidate locations.
   *   </li>
   *   <li>
   *     Every executor will be assigned to a weight according to the receivers running or
   *     scheduling on it.
   *     <ul>
   *       <li>
   *         If a receiver is running on an executor, it contributes 1.0 to the executor's weight.
   *       </li>
   *       <li>
   *         If a receiver is scheduled to an executor but has not yet run, it contributes
   *         <code>1.0 / #candidate_executors_of_this_receiver</code> to the executor's weight.</li>
   *     </ul>
   *     At last, if there are any idle executors (weight = 0), returns all idle executors.
   *     Otherwise, returns the executors that have the minimum weight.
   *   </li>
   * </ol>
   * <p>
   * This method is called when a receiver is registering with ReceiverTracker or is restarting.
   * @param receiverId (undocumented)
   * @param preferredLocation (undocumented)
   * @param receiverTrackingInfoMap (undocumented)
   * @param executors (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> rescheduleReceiver (int receiverId, scala.Option<java.lang.String> preferredLocation, scala.collection.Map<java.lang.Object, org.apache.spark.streaming.scheduler.ReceiverTrackingInfo> receiverTrackingInfoMap, scala.collection.Seq<org.apache.spark.scheduler.ExecutorCacheTaskLocation> executors)  { throw new RuntimeException(); }
  /**
   * This method tries to convert a receiver tracking info to executor weights. Every executor will
   * be assigned to a weight according to the receivers running or scheduling on it:
   * <p>
   * - If a receiver is running on an executor, it contributes 1.0 to the executor's weight.
   * - If a receiver is scheduled to an executor but has not yet run, it contributes
   * <code>1.0 / #candidate_executors_of_this_receiver</code> to the executor's weight.
   * @param receiverTrackingInfo (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<scala.Tuple2<org.apache.spark.scheduler.ExecutorCacheTaskLocation, java.lang.Object>> convertReceiverTrackingInfoToExecutorWeights (org.apache.spark.streaming.scheduler.ReceiverTrackingInfo receiverTrackingInfo)  { throw new RuntimeException(); }
}
