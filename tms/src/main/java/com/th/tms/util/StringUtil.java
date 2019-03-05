package com.th.tms.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringUtil {
	
	/**
	 * 将实体类注解信息，解析成单独属性，获取其中name属性值
	 * @javax.persistence.Column(insertable=true, scale=0, unique=true, precision=0, columnDefinition=, name=DISP_ID, updatable=true, length=32, nullable=false, table=)
	 * @param sentence
	 * @param param
	 * @return
	 */
	public static String subParam(String sentence,String param){
		String paramValue = null;
		if(!"".equals(sentence)){
			sentence = sentence.replace("@javax.persistence.Column(", "").replace(")", "");
			String[] senArray = sentence.split(",");
			for(String senStr : senArray){
				if(!"".equals(senStr)){
					senStr = senStr.trim();
					String[] paramArray = senStr.split("=");
					for(String paramStr : paramArray){
						if(paramStr.equalsIgnoreCase(param)){
							paramValue = paramArray[1];
						}
					}
				}
			}
		}
		return paramValue;
	}
	
	/**
	 * 获取一个字符串中的汉字
	 * @param str
	 * @return
	 */
	public static String findAllChinese(String str){
		String chinese = "";
		try{
			  // 中文正则表达式
			  String regEx = "[\\u4e00-\\u9fa5]";
			  Pattern p = Pattern.compile(regEx);
			  Matcher m = p.matcher(str);
			  while (m.find()) {
				  chinese += m.group(0);
			  }
		}catch(Exception e){
			e.printStackTrace();
		}
		return chinese;
	}
	
	/**
	 * 替换特殊符号
	 * @param strHtml
	 * @return
	 */
	public static String delWildCart(String strHtml) 
	{ 
		 String regEx="[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？—_《》<<>>·x•]";  
	     Pattern   p   =   Pattern.compile(regEx);     
	     Matcher   m   =   p.matcher(strHtml);   
	     return   m.replaceAll("").trim();  
	}
	
	/**
	 * 过滤字符串中特殊字符
	 * @param strHtml
	 * @return
	 */
	public static String UrnHtml(String strHtml) 
	{ 
		String[] aryReg ={"'", "<", ">", "%","\"\"", ",", ">=", "=<", "-", "_", ";", "||", "[", "]", "&", "/", "-", "|"," ", }; 
		for (int i = 0; i < aryReg.length; i++) { 
			strHtml = strHtml.replace(aryReg[i], ""); 
		}
		return strHtml; 
	}
	
	/**
	 * 判断字符串是否为空，不为空返回true，为空返回false
	 * @param strHtml
	 * @return
	 */
	public static boolean checkNull(String strHtml){
		boolean tag = false;
		if(strHtml!=null && !"".equals(strHtml) && !"null".equals(strHtml) 
				&& !"undefined".equals(strHtml)){
			tag = true;
		}
		return tag;
	}
}
