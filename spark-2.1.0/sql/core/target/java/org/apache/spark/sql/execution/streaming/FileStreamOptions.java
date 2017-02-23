package org.apache.spark.sql.execution.streaming;
/**
 * User specified options for file streams.
 */
public  class FileStreamOptions implements org.apache.spark.internal.Logging {
  public   FileStreamOptions (org.apache.spark.sql.catalyst.util.CaseInsensitiveMap parameters)  { throw new RuntimeException(); }
  public   FileStreamOptions (scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxFilesPerTrigger ()  { throw new RuntimeException(); }
  /**
   * Maximum age of a file that can be found in this directory, before it is deleted.
   * <p>
   * The max age is specified with respect to the timestamp of the latest file, and not the
   * timestamp of the current system. That this means if the last file has timestamp 1000, and the
   * current system time is 2000, and max age is 200, the system will purge files older than
   * 800 (rather than 1800) from the internal state.
   * <p>
   * Default to a week.
   * @return (undocumented)
   */
  public  long maxFileAgeMs ()  { throw new RuntimeException(); }
  /** Options as specified by the user, in a case-insensitive map, without "path" set. */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> optionMapWithoutPath ()  { throw new RuntimeException(); }
  /**
   * Whether to scan latest files first. If it's true, when the source finds unprocessed files in a
   * trigger, it will first process the latest files.
   * @return (undocumented)
   */
  public  boolean latestFirst ()  { throw new RuntimeException(); }
}
