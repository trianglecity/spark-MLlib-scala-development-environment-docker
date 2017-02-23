package org.apache.spark.ui.jobs;
/**
 * Names of the CSS classes corresponding to each type of task detail. Used to allow users
 * to optionally show/hide columns.
 * <p>
 * If new optional metrics are added here, they should also be added to the end of webui.css
 * to have the style set to "display: none;" by default.
 */
public  class TaskDetailsClassNames$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TaskDetailsClassNames$ MODULE$ = null;
  public   TaskDetailsClassNames$ ()  { throw new RuntimeException(); }
  public  java.lang.String SCHEDULER_DELAY ()  { throw new RuntimeException(); }
  public  java.lang.String TASK_DESERIALIZATION_TIME ()  { throw new RuntimeException(); }
  public  java.lang.String SHUFFLE_READ_BLOCKED_TIME ()  { throw new RuntimeException(); }
  public  java.lang.String SHUFFLE_READ_REMOTE_SIZE ()  { throw new RuntimeException(); }
  public  java.lang.String RESULT_SERIALIZATION_TIME ()  { throw new RuntimeException(); }
  public  java.lang.String GETTING_RESULT_TIME ()  { throw new RuntimeException(); }
  public  java.lang.String PEAK_EXECUTION_MEMORY ()  { throw new RuntimeException(); }
}
