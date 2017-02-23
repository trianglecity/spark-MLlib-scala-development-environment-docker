package org.apache.spark.sql.catalyst.util;
/**
 * Helper functions for converting between internal and external date and time representations.
 * Dates are exposed externally as java.sql.Date and are represented internally as the number of
 * dates since the Unix epoch (1970-01-01). Timestamps are exposed externally as java.sql.Timestamp
 * and are stored internally as longs, which are capable of storing timestamps with 100 nanosecond
 * precision.
 */
public  class DateTimeUtils {
  static public final  int JULIAN_DAY_OF_EPOCH ()  { throw new RuntimeException(); }
  static public final  long SECONDS_PER_DAY ()  { throw new RuntimeException(); }
  static public final  long MICROS_PER_SECOND ()  { throw new RuntimeException(); }
  static public final  long NANOS_PER_SECOND ()  { throw new RuntimeException(); }
  static public final  long MICROS_PER_DAY ()  { throw new RuntimeException(); }
  static public final  long MILLIS_PER_DAY ()  { throw new RuntimeException(); }
  static public final  int daysIn400Years ()  { throw new RuntimeException(); }
  static public final  int to2001 ()  { throw new RuntimeException(); }
  static public final  int YearZero ()  { throw new RuntimeException(); }
  static public final  int toYearZero ()  { throw new RuntimeException(); }
  static public final  java.util.TimeZone TimeZoneGMT ()  { throw new RuntimeException(); }
  static public final  scala.collection.immutable.Set<java.lang.Object> MonthOf31Days ()  { throw new RuntimeException(); }
  static public  java.util.TimeZone defaultTimeZone ()  { throw new RuntimeException(); }
  static private  java.lang.ThreadLocal<java.util.Calendar> threadLocalGmtCalendar ()  { throw new RuntimeException(); }
  static private  java.lang.ThreadLocal<java.util.TimeZone> threadLocalLocalTimeZone ()  { throw new RuntimeException(); }
  static public  java.lang.ThreadLocal<java.text.DateFormat> threadLocalTimestampFormat ()  { throw new RuntimeException(); }
  static private  java.lang.ThreadLocal<java.text.DateFormat> threadLocalDateFormat ()  { throw new RuntimeException(); }
  static public  int millisToDays (long millisUtc)  { throw new RuntimeException(); }
  static public  long daysToMillis (int days)  { throw new RuntimeException(); }
  static public  java.lang.String dateToString (int days)  { throw new RuntimeException(); }
  static public  java.lang.String timestampToString (long us)  { throw new RuntimeException(); }
  static public  java.util.Date stringToTime (java.lang.String s)  { throw new RuntimeException(); }
  /**
   * Returns the number of days since epoch from from java.sql.Date.
   * @param date (undocumented)
   * @return (undocumented)
   */
  static public  int fromJavaDate (java.sql.Date date)  { throw new RuntimeException(); }
  /**
   * Returns a java.sql.Date from number of days since epoch.
   * @param daysSinceEpoch (undocumented)
   * @return (undocumented)
   */
  static public  java.sql.Date toJavaDate (int daysSinceEpoch)  { throw new RuntimeException(); }
  /**
   * Returns a java.sql.Timestamp from number of micros since epoch.
   * @param us (undocumented)
   * @return (undocumented)
   */
  static public  java.sql.Timestamp toJavaTimestamp (long us)  { throw new RuntimeException(); }
  /**
   * Returns the number of micros since epoch from java.sql.Timestamp.
   * @param t (undocumented)
   * @return (undocumented)
   */
  static public  long fromJavaTimestamp (java.sql.Timestamp t)  { throw new RuntimeException(); }
  /**
   * Returns the number of microseconds since epoch from Julian day
   * and nanoseconds in a day
   * @param day (undocumented)
   * @param nanoseconds (undocumented)
   * @return (undocumented)
   */
  static public  long fromJulianDay (int day, long nanoseconds)  { throw new RuntimeException(); }
  /**
   * Returns Julian day and nanoseconds in a day from the number of microseconds
   * <p>
   * Note: support timestamp since 4717 BC (without negative nanoseconds, compatible with Hive).
   * @param us (undocumented)
   * @return (undocumented)
   */
  static public  scala.Tuple2<java.lang.Object, java.lang.Object> toJulianDay (long us)  { throw new RuntimeException(); }
  /**
   * Parses a given UTF8 date string to the corresponding a corresponding {@link Long} value.
   * The return type is {@link Option} in order to distinguish between 0L and null. The following
   * formats are allowed:
   * <p>
   * <code>yyyy</code>
   * <code>yyyy-[m]m</code>
   * <code>yyyy-[m]m-[d]d</code>
   * <code>yyyy-[m]m-[d]d </code>
   * <code>yyyy-[m]m-[d]d [h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]</code>
   * <code>yyyy-[m]m-[d]d [h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]Z</code>
   * <code>yyyy-[m]m-[d]d [h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]-[h]h:[m]m</code>
   * <code>yyyy-[m]m-[d]d [h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]+[h]h:[m]m</code>
   * <code>yyyy-[m]m-[d]dT[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]</code>
   * <code>yyyy-[m]m-[d]dT[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]Z</code>
   * <code>yyyy-[m]m-[d]dT[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]-[h]h:[m]m</code>
   * <code>yyyy-[m]m-[d]dT[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]+[h]h:[m]m</code>
   * <code>[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]</code>
   * <code>[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]Z</code>
   * <code>[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]-[h]h:[m]m</code>
   * <code>[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]+[h]h:[m]m</code>
   * <code>T[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]</code>
   * <code>T[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]Z</code>
   * <code>T[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]-[h]h:[m]m</code>
   * <code>T[h]h:[m]m:[s]s.[ms][ms][ms][us][us][us]+[h]h:[m]m</code>
   * @param s (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<java.lang.Object> stringToTimestamp (org.apache.spark.unsafe.types.UTF8String s)  { throw new RuntimeException(); }
  /**
   * Parses a given UTF8 date string to the corresponding a corresponding {@link Int} value.
   * The return type is {@link Option} in order to distinguish between 0 and null. The following
   * formats are allowed:
   * <p>
   * <code>yyyy</code>,
   * <code>yyyy-[m]m</code>
   * <code>yyyy-[m]m-[d]d</code>
   * <code>yyyy-[m]m-[d]d </code>
   * <code>yyyy-[m]m-[d]d *</code>
   * <code>yyyy-[m]m-[d]dT*</code>
   * @param s (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<java.lang.Object> stringToDate (org.apache.spark.unsafe.types.UTF8String s)  { throw new RuntimeException(); }
  /**
   * Return true if the date is invalid.
   * @param year (undocumented)
   * @param month (undocumented)
   * @param day (undocumented)
   * @return (undocumented)
   */
  static private  boolean isInvalidDate (int year, int month, int day)  { throw new RuntimeException(); }
  /**
   * Returns the microseconds since year zero (-17999) from microseconds since epoch.
   * @param microsec (undocumented)
   * @return (undocumented)
   */
  static private  long absoluteMicroSecond (long microsec)  { throw new RuntimeException(); }
  static private  long localTimestamp (long microsec)  { throw new RuntimeException(); }
  /**
   * Returns the hour value of a given timestamp value. The timestamp is expressed in microseconds.
   * @param microsec (undocumented)
   * @return (undocumented)
   */
  static public  int getHours (long microsec)  { throw new RuntimeException(); }
  /**
   * Returns the minute value of a given timestamp value. The timestamp is expressed in
   * microseconds.
   * @param microsec (undocumented)
   * @return (undocumented)
   */
  static public  int getMinutes (long microsec)  { throw new RuntimeException(); }
  /**
   * Returns the second value of a given timestamp value. The timestamp is expressed in
   * microseconds.
   * @param microsec (undocumented)
   * @return (undocumented)
   */
  static public  int getSeconds (long microsec)  { throw new RuntimeException(); }
  static private  boolean isLeapYear (int year)  { throw new RuntimeException(); }
  /**
   * Return the number of days since the start of 400 year period.
   * The second year of a 400 year period (year 1) starts on day 365.
   * @param year (undocumented)
   * @return (undocumented)
   */
  static private  int yearBoundary (int year)  { throw new RuntimeException(); }
  /**
   * Calculates the number of years for the given number of days. This depends
   * on a 400 year period.
   * @param days days since the beginning of the 400 year period
   * @return (number of year, days in year)
   */
  static private  scala.Tuple2<java.lang.Object, java.lang.Object> numYears (int days)  { throw new RuntimeException(); }
  /**
   * Calculates the year and and the number of the day in the year for the given
   * number of days. The given days is the number of days since 1.1.1970.
   * <p>
   * The calculation uses the fact that the period 1.1.2001 until 31.12.2400 is
   * equals to the period 1.1.1601 until 31.12.2000.
   * @param daysSince1970 (undocumented)
   * @return (undocumented)
   */
  static private  scala.Tuple2<java.lang.Object, java.lang.Object> getYearAndDayInYear (int daysSince1970)  { throw new RuntimeException(); }
  /**
   * Returns the 'day in year' value for the given date. The date is expressed in days
   * since 1.1.1970.
   * @param date (undocumented)
   * @return (undocumented)
   */
  static public  int getDayInYear (int date)  { throw new RuntimeException(); }
  /**
   * Returns the year value for the given date. The date is expressed in days
   * since 1.1.1970.
   * @param date (undocumented)
   * @return (undocumented)
   */
  static public  int getYear (int date)  { throw new RuntimeException(); }
  /**
   * Returns the quarter for the given date. The date is expressed in days
   * since 1.1.1970.
   * @param date (undocumented)
   * @return (undocumented)
   */
  static public  int getQuarter (int date)  { throw new RuntimeException(); }
  /**
   * Split date (expressed in days since 1.1.1970) into four fields:
   * year, month (Jan is Month 1), dayInMonth, daysToMonthEnd (0 if it's last day of month).
   * @param date (undocumented)
   * @return (undocumented)
   */
  static public  scala.Tuple4<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> splitDate (int date)  { throw new RuntimeException(); }
  /**
   * Returns the month value for the given date. The date is expressed in days
   * since 1.1.1970. January is month 1.
   * @param date (undocumented)
   * @return (undocumented)
   */
  static public  int getMonth (int date)  { throw new RuntimeException(); }
  /**
   * Returns the 'day of month' value for the given date. The date is expressed in days
   * since 1.1.1970.
   * @param date (undocumented)
   * @return (undocumented)
   */
  static public  int getDayOfMonth (int date)  { throw new RuntimeException(); }
  /**
   * The number of days for each month (not leap year)
   * @return (undocumented)
   */
  static private  int[] monthDays ()  { throw new RuntimeException(); }
  /**
   * Returns the date value for the first day of the given month.
   * The month is expressed in months since year zero (17999 BC), starting from 0.
   * @param absoluteMonth (undocumented)
   * @return (undocumented)
   */
  static private  int firstDayOfMonth (int absoluteMonth)  { throw new RuntimeException(); }
  /**
   * Returns the date value for January 1 of the given year.
   * The year is expressed in years since year zero (17999 BC), starting from 0.
   * @param absoluteYear (undocumented)
   * @return (undocumented)
   */
  static private  int getDateFromYear (int absoluteYear)  { throw new RuntimeException(); }
  /**
   * Add date and year-month interval.
   * Returns a date value, expressed in days since 1.1.1970.
   * @param days (undocumented)
   * @param months (undocumented)
   * @return (undocumented)
   */
  static public  int dateAddMonths (int days, int months)  { throw new RuntimeException(); }
  /**
   * Add timestamp and full interval.
   * Returns a timestamp value, expressed in microseconds since 1.1.1970 00:00:00.
   * @param start (undocumented)
   * @param months (undocumented)
   * @param microseconds (undocumented)
   * @return (undocumented)
   */
  static public  long timestampAddInterval (long start, int months, long microseconds)  { throw new RuntimeException(); }
  /**
   * Returns number of months between time1 and time2. time1 and time2 are expressed in
   * microseconds since 1.1.1970.
   * <p>
   * If time1 and time2 having the same day of month, or both are the last day of month,
   * it returns an integer (time under a day will be ignored).
   * <p>
   * Otherwise, the difference is calculated based on 31 days per month, and rounding to
   * 8 digits.
   * @param time1 (undocumented)
   * @param time2 (undocumented)
   * @return (undocumented)
   */
  static public  double monthsBetween (long time1, long time2)  { throw new RuntimeException(); }
  static public  int getDayOfWeekFromString (org.apache.spark.unsafe.types.UTF8String string)  { throw new RuntimeException(); }
  /**
   * Returns the first date which is later than startDate and is of the given dayOfWeek.
   * dayOfWeek is an integer ranges in [0, 6], and 0 is Thu, 1 is Fri, etc,.
   * @param startDate (undocumented)
   * @param dayOfWeek (undocumented)
   * @return (undocumented)
   */
  static public  int getNextDateForDayOfWeek (int startDate, int dayOfWeek)  { throw new RuntimeException(); }
  /**
   * Returns last day of the month for the given date. The date is expressed in days
   * since 1.1.1970.
   * @param date (undocumented)
   * @return (undocumented)
   */
  static public  int getLastDayOfMonth (int date)  { throw new RuntimeException(); }
  static private  int TRUNC_TO_YEAR ()  { throw new RuntimeException(); }
  static private  int TRUNC_TO_MONTH ()  { throw new RuntimeException(); }
  static private  int TRUNC_INVALID ()  { throw new RuntimeException(); }
  /**
   * Returns the trunc date from original date and trunc level.
   * Trunc level should be generated using <code>parseTruncLevel()</code>, should only be 1 or 2.
   * @param d (undocumented)
   * @param level (undocumented)
   * @return (undocumented)
   */
  static public  int truncDate (int d, int level)  { throw new RuntimeException(); }
  /**
   * Returns the truncate level, could be TRUNC_YEAR, TRUNC_MONTH, or TRUNC_INVALID,
   * TRUNC_INVALID means unsupported truncate level.
   * @param format (undocumented)
   * @return (undocumented)
   */
  static public  int parseTruncLevel (org.apache.spark.unsafe.types.UTF8String format)  { throw new RuntimeException(); }
  /**
   * Lookup the offset for given millis seconds since 1970-01-01 00:00:00 in given timezone.
   * TODO: Improve handling of normalization differences.
   * TODO: Replace with JSR-310 or similar system - see SPARK-16788
   * @param millisLocal (undocumented)
   * @param tz (undocumented)
   * @return (undocumented)
   */
  static   long getOffsetFromLocalMillis (long millisLocal, java.util.TimeZone tz)  { throw new RuntimeException(); }
  /**
   * Convert the timestamp <code>ts</code> from one timezone to another.
   * <p>
   * TODO: Because of DST, the conversion between UTC and human time is not exactly one-to-one
   * mapping, the conversion here may return wrong result, we should make the timestamp
   * timezone-aware.
   * @param ts (undocumented)
   * @param fromZone (undocumented)
   * @param toZone (undocumented)
   * @return (undocumented)
   */
  static public  long convertTz (long ts, java.util.TimeZone fromZone, java.util.TimeZone toZone)  { throw new RuntimeException(); }
  /**
   * Returns a timestamp of given timezone from utc timestamp, with the same string
   * representation in their timezone.
   * @param time (undocumented)
   * @param timeZone (undocumented)
   * @return (undocumented)
   */
  static public  long fromUTCTime (long time, java.lang.String timeZone)  { throw new RuntimeException(); }
  /**
   * Returns a utc timestamp from a given timestamp from a given timezone, with the same
   * string representation in their timezone.
   * @param time (undocumented)
   * @param timeZone (undocumented)
   * @return (undocumented)
   */
  static public  long toUTCTime (long time, java.lang.String timeZone)  { throw new RuntimeException(); }
  /**
   * Re-initialize the current thread's thread locals. Exposed for testing.
   */
  static   void resetThreadLocals ()  { throw new RuntimeException(); }
}
