package org.apache.spark.sql.internal;
/**
 * A helper class that enables substitution using syntax like
 * <code>${var}</code>, <code>${system:var}</code> and <code>${env:var}</code>.
 * <p>
 * Variable substitution is controlled by <code>SQLConf.variableSubstituteEnabled</code>.
 */
public  class VariableSubstitution {
  public   VariableSubstitution (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  private  java.lang.Object provider ()  { throw new RuntimeException(); }
  private  org.apache.spark.internal.config.ConfigReader reader ()  { throw new RuntimeException(); }
  /**
   * Given a query, does variable substitution and return the result.
   * @param input (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String substitute (java.lang.String input)  { throw new RuntimeException(); }
}
