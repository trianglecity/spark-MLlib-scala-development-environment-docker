package org.apache.spark.repl;
/**
 *  A Spark-specific interactive shell.
 */
public  class SparkILoop extends scala.tools.nsc.interpreter.ILoop {
  /**
   * Creates an interpreter loop with default settings and feeds
   * the given code to it as input.
   * @param code (undocumented)
   * @param sets (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String run (java.lang.String code, scala.tools.nsc.Settings sets)  { throw new RuntimeException(); }
  static public  java.lang.String run (scala.collection.immutable.List<java.lang.String> lines)  { throw new RuntimeException(); }
  static protected  java.io.PrintWriter out ()  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.IMain interpreter ()  { throw new RuntimeException(); }
  static public  void interpreter_$eq (scala.tools.nsc.Interpreter i)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.InteractiveReader in ()  { throw new RuntimeException(); }
  static public  void in_$eq (scala.tools.nsc.interpreter.InteractiveReader x$1)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.Settings settings ()  { throw new RuntimeException(); }
  static public  void settings_$eq (scala.tools.nsc.Settings x$1)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.IMain intp ()  { throw new RuntimeException(); }
  static public  void intp_$eq (scala.tools.nsc.interpreter.IMain x$1)  { throw new RuntimeException(); }
  static protected  void asyncMessage (java.lang.String msg)  { throw new RuntimeException(); }
  static public  void echoCommandMessage (java.lang.String msg)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.Power<scala.tools.nsc.interpreter.StdReplVals> power ()  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.session.History history ()  { throw new RuntimeException(); }
  static public  java.lang.String addedClasspath ()  { throw new RuntimeException(); }
  static public  void addedClasspath_$eq (java.lang.String x$1)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.List<java.lang.String> replayCommandStack ()  { throw new RuntimeException(); }
  static public  void replayCommandStack_$eq (scala.collection.immutable.List<java.lang.String> x$1)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.List<java.lang.String> replayCommands ()  { throw new RuntimeException(); }
  static public  void addReplay (java.lang.String cmd)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T savingReplayStack (scala.Function0<T> body)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T savingReader (scala.Function0<T> body)  { throw new RuntimeException(); }
  static public  void closeInterpreter ()  { throw new RuntimeException(); }
  static public  void createInterpreter ()  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.Result helpCommand (java.lang.String line)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.LoopCommand historyCommand ()  { throw new RuntimeException(); }
  static protected  void echoAndRefresh (java.lang.String msg)  { throw new RuntimeException(); }
  static protected  void echo (java.lang.String msg)  { throw new RuntimeException(); }
  static public  void searchHistory (java.lang.String _cmdline)  { throw new RuntimeException(); }
  static public  java.lang.String prompt ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.List<scala.tools.nsc.interpreter.LoopCommands.LoopCommand> standardCommands ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.List<scala.tools.nsc.interpreter.LoopCommands.LoopCommand> powerCommands ()  { throw new RuntimeException(); }
  static protected  scala.tools.nsc.interpreter.JavapClass newJavap ()  { throw new RuntimeException(); }
  static public  java.lang.String replayQuestionMessage ()  { throw new RuntimeException(); }
  static public  boolean processLine (java.lang.String line)  { throw new RuntimeException(); }
  static public final  scala.Enumeration.Value loop ()  { throw new RuntimeException(); }
  static public  void interpretAllFrom (scala.reflect.io.File file, boolean verbose)  { throw new RuntimeException(); }
  static public  void replayCommand (java.lang.String line)  { throw new RuntimeException(); }
  static public  void replay ()  { throw new RuntimeException(); }
  static public  void reset ()  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.Result lineCommand (java.lang.String what)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.Result editCommand (java.lang.String what)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.Result editCommand (java.lang.String what, scala.Option<java.lang.String> editor)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.LoopCommand shCommand ()  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.Option<A> withFile (java.lang.String filename, scala.Function1<scala.reflect.io.File, A> action)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.Result loadCommand (java.lang.String arg)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.Result saveCommand (java.lang.String filename)  { throw new RuntimeException(); }
  static public  void addClasspath (java.lang.String arg)  { throw new RuntimeException(); }
  static public  void require (java.lang.String arg)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.Result powerCmd ()  { throw new RuntimeException(); }
  static public  void enablePowerMode (boolean isDuringInit)  { throw new RuntimeException(); }
  static public  void asyncEcho (boolean async, scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static public  void verbosity ()  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.Result command (java.lang.String line)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.LoopCommands.Result pasteCommand (java.lang.String arg)  { throw new RuntimeException(); }
  static public final  scala.Option<java.lang.String> interpretStartingWith (java.lang.String code)  { throw new RuntimeException(); }
  static public  scala.tools.nsc.interpreter.InteractiveReader chooseReader (scala.tools.nsc.Settings settings)  { throw new RuntimeException(); }
  static public  boolean process (scala.tools.nsc.Settings settings)  { throw new RuntimeException(); }
  static public  void main (scala.tools.nsc.Settings settings)  { throw new RuntimeException(); }
  static public  boolean interpretAllFrom$default$2 ()  { throw new RuntimeException(); }
  public   SparkILoop (scala.Option<java.io.BufferedReader> in0, java.io.PrintWriter out)  { throw new RuntimeException(); }
  public   SparkILoop (java.io.BufferedReader in0, java.io.PrintWriter out)  { throw new RuntimeException(); }
  public   SparkILoop ()  { throw new RuntimeException(); }
  public  void initializeSpark ()  { throw new RuntimeException(); }
  /** Print a welcome message */
  public  void printWelcome ()  { throw new RuntimeException(); }
  /** Add repl commands that needs to be blocked. e.g. reset */
  private  scala.collection.immutable.Set<java.lang.String> blockedCommands ()  { throw new RuntimeException(); }
  /** Standard commands */
  public  scala.collection.immutable.List<scala.tools.nsc.interpreter.LoopCommands.LoopCommand> sparkStandardCommands ()  { throw new RuntimeException(); }
  /** Available commands */
  public  scala.collection.immutable.List<scala.tools.nsc.interpreter.LoopCommands.LoopCommand> commands ()  { throw new RuntimeException(); }
  /**
   * We override <code>loadFiles</code> because we need to initialize Spark *before* the REPL
   * sees any files, so that the Spark context is visible in those files. This is a bit of a
   * hack, but there isn't another hook available to us at this point.
   * @param settings (undocumented)
   */
  public  void loadFiles (scala.tools.nsc.Settings settings)  { throw new RuntimeException(); }
  public  void resetCommand (java.lang.String line)  { throw new RuntimeException(); }
}
