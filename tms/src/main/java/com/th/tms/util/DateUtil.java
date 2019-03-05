package com.th.tms.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	private static String timezone;

	private static String DATE_FORMAT = "yyyy-MM-dd";
	private static String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static  String dateToString(Date pDate){
		//如果传入日期为null，则返回空字符串
		if(pDate==null){
			return "";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(pDate);
	}

	/**
	 * 将字符串类型: "yyyy-MM-dd"转换成Date类型.
	 */
	public static Date parseDate(String d) {
		try {
			return new SimpleDateFormat(DATE_FORMAT).parse(d);
		} catch (Exception e) {
		}
		return null;
	}
	/**
	 * 获取当前时间的上一个整数时间点  适用于能被10整除的间隔  用户计算利率使用
	 * @return
	 */
	public static long getNextNowDate(int step){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.MINUTE, 10);
		String time=sdf.format(cal.getTime());
		long nowTime=Long.parseLong(time);
		long offset=nowTime%step;
		return nowTime-offset;
	}
	
	/**
	 * 获取下一个利率时间
	 * @param step
	 * @return
	 */
	public static Date getNextRateTime(int step){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.MINUTE, 10);
		String time=sdf.format(cal.getTime());
		long nowTime=Long.parseLong(time);
		long offset=nowTime%step;
		cal.add(Calendar.MINUTE, -(int)offset);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();	
	}
	

	/**
	 * 获取当前的时间戳
	 * @return
	 */
	public static long getTimeLong(){
		return System.currentTimeMillis();
	} 
	/**
	 * 获取之后多少天0点的时间
	 * @return
	 */
	public static Date getNextDays(int days){
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, days);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}
	/**
	 * 获取之后days天houer点的时间
	 * @return
	 */
	public static Date getNextDays(int days,int houer){
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, days);
		cal.set(Calendar.HOUR_OF_DAY, houer);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}
	public static String getYyyyMMddHHmmss(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(getCurrentTime());
	}

	public static Date getCurrentTime() {
		return Calendar.getInstance().getTime();
	}

	/**
	 *判断日期格式
	 * @param str
	 * @return
	 */
	public static boolean isValidDate(String str) {
		boolean convertSuccess=true;
		// 指定日期格式为四位年/两位月份/两位日期，注意yyyy-MM-dd区分大小写；
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			// 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期
			format.setLenient(false);
			format.parse(str);
		} catch (ParseException e) {
			// e.printStackTrace();
			// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
			convertSuccess=false;
		}
		return convertSuccess;
	}

	/**
	 * 将字符串类型: "yyyy-MM-dd"转换成Date类型.
	 */
	public static Date parseDateTime(String d) {
		try {
			return new SimpleDateFormat(DATETIME_FORMAT).parse(d);
		} catch (Exception e) {
		}
		return null;
	}
}
