package com.th.tms.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MathUtil {

//	DecimalFormat   df   =new   java.text.DecimalFormat("#.00");
	/**
     * 提供精确加法计算的add方法
     * @param value1 被加数
     * @param value2 加数
     * @return 两个参数的和
     */
    public static double add(double value1,double value2){
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1)).setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2)).setScale(2, BigDecimal.ROUND_HALF_UP);;
        return b1.add(b2).doubleValue();
    }


    /**
     * 提供精确加法计算的add方法
     * @param value1 被加数
     * @param value2 加数
     * @return 两个参数的和
     */
    public static double add(double value1,double value2, int csale){
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1)).setScale(csale, BigDecimal.ROUND_HALF_UP);
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2)).setScale(csale, BigDecimal.ROUND_HALF_UP);;
        return b1.add(b2).doubleValue();
    }

    /**
     * 提供精确减法运算的sub方法
     * @param value1 被减数
     * @param value2 减数
     * @return 两个参数的差
     */
    public static double sub(double value1,double value2){
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1)).setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2)).setScale(2, BigDecimal.ROUND_HALF_UP);
        return b1.subtract(b2).doubleValue();
    }
    public static double sub(double value1,double value2,int scale){
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1)).setScale(scale, BigDecimal.ROUND_HALF_UP);
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2)).setScale(scale, BigDecimal.ROUND_HALF_UP);
        return b1.subtract(b2).doubleValue();
    }
    public static double sub(double value1,double value2, double value3){
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1)).setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2)).setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal b3 = new BigDecimal(Double.valueOf(value3)).setScale(2, BigDecimal.ROUND_HALF_UP);
        return b1.subtract(b2).subtract(b3).doubleValue();
    }

    public static double sub(double value1,double value2, double value3, double value4, double value5, double value6){
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1)).setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2)).setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal b3 = new BigDecimal(Double.valueOf(value3)).setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal b4 = new BigDecimal(Double.valueOf(value4)).setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal b5 = new BigDecimal(Double.valueOf(value5)).setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal b6 = new BigDecimal(Double.valueOf(value6)).setScale(2, BigDecimal.ROUND_HALF_UP);
        return b1.subtract(b2).subtract(b3).subtract(b4).subtract(b5).subtract(b6).doubleValue();
    }


    /**
     * 提供精确乘法运算的mul方法
     * @param value1 被乘数
     * @param value2 乘数
     * @return 两个参数的积
     */
    public static double mul(double value1,double value2){
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1)).setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2)).setScale(2, BigDecimal.ROUND_HALF_UP);
        return b1.multiply(b2).doubleValue();
    }
    
    /**
     * 提供精确的除法运算方法div
     * @param value1 被除数
     * @param value2 除数
     * @param scale 精确范围
     * @return 两个参数的商
     * @throws IllegalAccessException
     */
    public static double div(double value1,double value2,int scale) throws IllegalAccessException{
        //如果精确范围小于0，抛出异常信息
        if(scale<0){         
            throw new IllegalAccessException("精确度不能小于0");
        }
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
        return b1.divide(b2, scale).doubleValue();    
    }
    
    /**
     * double保留小数的方法
     * @param value 要保留的数
     * @param scale 小数位数
     */
    public static double parse(double value ,int scale) throws IllegalAccessException{
    	return new BigDecimal(Double.valueOf(value)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();   
    }

    /**
     * 提供精确乘法运算的mul方法
     * @param value1 被乘数
     * @param value2 乘数
     * @param scale 精确范围
     * @return 两个参数的积
     */
    public static double mul(double value1,double value2, int scale){
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1)).setScale(scale, BigDecimal.ROUND_HALF_UP);
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2)).setScale(scale, BigDecimal.ROUND_HALF_UP);
        return b1.multiply(b2).doubleValue();
    }


}
