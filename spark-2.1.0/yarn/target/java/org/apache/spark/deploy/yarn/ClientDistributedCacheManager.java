package org.apache.spark.deploy.yarn;
/** Client side methods to setup the Hadoop distributed cache */
  class ClientDistributedCacheManager implements org.apache.spark.internal.Logging {
  public   ClientDistributedCacheManager ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ListBuffer<org.apache.spark.deploy.yarn.CacheEntry> distCacheEntries ()  { throw new RuntimeException(); }
  /**
   * Add a resource to the list of distributed cache resources. This list can
   * be sent to the ApplicationMaster and possibly the executors so that it can
   * be downloaded into the Hadoop distributed cache for use by this application.
   * Adds the LocalResource to the localResources HashMap passed in and saves
   * the stats of the resources to they can be sent to the executors and verified.
   * <p>
   * @param fs FileSystem
   * @param conf Configuration
   * @param destPath path to the resource
   * @param localResources localResource hashMap to insert the resource into
   * @param resourceType LocalResourceType
   * @param link link presented in the distributed cache to the destination
   * @param statCache cache to store the file/directory stats
   * @param appMasterOnly Whether to only add the resource to the app master
   */
  public  void addResource (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.fs.Path destPath, scala.collection.mutable.HashMap<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> localResources, org.apache.hadoop.yarn.api.records.LocalResourceType resourceType, java.lang.String link, scala.collection.mutable.Map<java.net.URI, org.apache.hadoop.fs.FileStatus> statCache, boolean appMasterOnly)  { throw new RuntimeException(); }
  /**
   * Writes down information about cached files needed in executors to the given configuration.
   * @param conf (undocumented)
   */
  public  void updateConfiguration (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Returns the local resource visibility depending on the cache file permissions
   * @return LocalResourceVisibility
   * @param conf (undocumented)
   * @param uri (undocumented)
   * @param statCache (undocumented)
   */
    org.apache.hadoop.yarn.api.records.LocalResourceVisibility getVisibility (org.apache.hadoop.conf.Configuration conf, java.net.URI uri, scala.collection.mutable.Map<java.net.URI, org.apache.hadoop.fs.FileStatus> statCache)  { throw new RuntimeException(); }
  /**
   * Returns a boolean to denote whether a cache file is visible to all (public)
   * @return true if the path in the uri is visible to all, false otherwise
   * @param conf (undocumented)
   * @param uri (undocumented)
   * @param statCache (undocumented)
   */
  private  boolean isPublic (org.apache.hadoop.conf.Configuration conf, java.net.URI uri, scala.collection.mutable.Map<java.net.URI, org.apache.hadoop.fs.FileStatus> statCache)  { throw new RuntimeException(); }
  /**
   * Returns true if all ancestors of the specified path have the 'execute'
   * permission set for all users (i.e. that other users can traverse
   * the directory hierarchy to the given path)
   * @return true if all ancestors have the 'execute' permission set for all users
   * @param fs (undocumented)
   * @param path (undocumented)
   * @param statCache (undocumented)
   */
  private  boolean ancestorsHaveExecutePermissions (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path path, scala.collection.mutable.Map<java.net.URI, org.apache.hadoop.fs.FileStatus> statCache)  { throw new RuntimeException(); }
  /**
   * Checks for a given path whether the Other permissions on it
   * imply the permission in the passed FsAction
   * @return true if the path in the uri is visible to all, false otherwise
   * @param fs (undocumented)
   * @param path (undocumented)
   * @param action (undocumented)
   * @param statCache (undocumented)
   */
  private  boolean checkPermissionOfOther (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path path, org.apache.hadoop.fs.permission.FsAction action, scala.collection.mutable.Map<java.net.URI, org.apache.hadoop.fs.FileStatus> statCache)  { throw new RuntimeException(); }
  /**
   * Checks to see if the given uri exists in the cache, if it does it
   * returns the existing FileStatus, otherwise it stats the uri, stores
   * it in the cache, and returns the FileStatus.
   * @return FileStatus
   * @param fs (undocumented)
   * @param uri (undocumented)
   * @param statCache (undocumented)
   */
    org.apache.hadoop.fs.FileStatus getFileStatus (org.apache.hadoop.fs.FileSystem fs, java.net.URI uri, scala.collection.mutable.Map<java.net.URI, org.apache.hadoop.fs.FileStatus> statCache)  { throw new RuntimeException(); }
}
