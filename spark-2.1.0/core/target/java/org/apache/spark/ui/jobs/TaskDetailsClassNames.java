package org.apache.spark.ui.jobs;
/**
 * Names of the CSS classes corresponding to each type of task detail. Used to allow users
 * to optionally show/hide columns.
 * <p>
 * If new optional metrics are added here, they should also be added to the end of webui.css
 * to have the style set to "display: none;" by default.
 */
public  class TaskDetailsClassNames {
  static public  java.lang.String SCHEDULER_DELAY ()  { throw new RuntimeException(); }
  static public  java.lang.String TASK_DESERIALIZATION_TIME ()  { throw new RuntimeException(); }
  static public  java.lang.String SHUFFLE_READ_BLOCKED_TIME ()  { throw new RuntimeException(); }
  static public  java.lang.String SHUFFLE_READ_REMOTE_SIZE ()  { throw new RuntimeException(); }
  static public  java.lang.String RESULT_SERIALIZATION_TIME ()  { throw new RuntimeException(); }
  static public  java.lang.String GETTING_RESULT_TIME ()  { throw new RuntimeException(); }
  static public  java.lang.String PEAK_EXECUTION_MEMORY ()  { throw new RuntimeException(); }
}
