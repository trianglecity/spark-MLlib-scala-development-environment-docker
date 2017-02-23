package org.apache.spark.storage;
/**
 * ::DeveloperApi::
 * TopologyMapper provides topology information for a given host
 * param:  conf SparkConf to get required properties, if needed
 */
public abstract class TopologyMapper {
  public   TopologyMapper (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Gets the topology information given the host name
   * <p>
   * @param hostname Hostname
   * @return topology information for the given hostname. One can use a 'topology delimiter'
   *         to make this topology information nested.
   *         For example : &amp;lsquo;/myrack/myhost&amp;rsquo;, where &amp;lsquo;/&amp;rsquo; is the topology delimiter,
   *         &amp;lsquo;myrack&amp;rsquo; is the topology identifier, and &amp;lsquo;myhost&amp;rsquo; is the individual host.
   *         This function only returns the topology information without the hostname.
   *         This information can be used when choosing executors for block replication
   *         to discern executors from a different rack than a candidate executor, for example.
   * <p>
   *         An implementation can choose to use empty strings or None in case topology info
   *         is not available. This would imply that all such executors belong to the same rack.
   */
  public abstract  scala.Option<java.lang.String> getTopologyForHost (java.lang.String hostname)  ;
}
