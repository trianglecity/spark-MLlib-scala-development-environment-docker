package org.apache.spark;
public  class TaskState {
  static public  scala.Enumeration.Value LAUNCHING ()  { throw new RuntimeException(); }
  static public  scala.Enumeration.Value RUNNING ()  { throw new RuntimeException(); }
  static public  scala.Enumeration.Value FINISHED ()  { throw new RuntimeException(); }
  static public  scala.Enumeration.Value FAILED ()  { throw new RuntimeException(); }
  static public  scala.Enumeration.Value KILLED ()  { throw new RuntimeException(); }
  static public  scala.Enumeration.Value LOST ()  { throw new RuntimeException(); }
  static private  scala.collection.immutable.Set<scala.Enumeration.Value> FINISHED_STATES ()  { throw new RuntimeException(); }
  static public  boolean isFailed (scala.Enumeration.Value state)  { throw new RuntimeException(); }
  static public  boolean isFinished (scala.Enumeration.Value state)  { throw new RuntimeException(); }
  static protected  java.lang.Object readResolve ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  scala.Enumeration.ValueSet values ()  { throw new RuntimeException(); }
  static protected  int nextId ()  { throw new RuntimeException(); }
  static protected  void nextId_$eq (int x$1)  { throw new RuntimeException(); }
  static protected  scala.collection.Iterator<java.lang.String> nextName ()  { throw new RuntimeException(); }
  static protected  void nextName_$eq (scala.collection.Iterator<java.lang.String> x$1)  { throw new RuntimeException(); }
  static public final  int maxId ()  { throw new RuntimeException(); }
  static public final  scala.Enumeration.Value apply (int x)  { throw new RuntimeException(); }
  static public final  scala.Enumeration.Value withName (java.lang.String s)  { throw new RuntimeException(); }
  static protected final  scala.Enumeration.Value Value ()  { throw new RuntimeException(); }
  static protected final  scala.Enumeration.Value Value (int i)  { throw new RuntimeException(); }
  static protected final  scala.Enumeration.Value Value (java.lang.String name)  { throw new RuntimeException(); }
  static protected final  scala.Enumeration.Value Value (int i, java.lang.String name)  { throw new RuntimeException(); }
}
