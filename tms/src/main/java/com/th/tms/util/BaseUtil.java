package com.th.tms.util;


import com.sun.org.apache.bcel.internal.generic.ObjectType;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.poi.ss.formula.functions.T;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.DecimalFormat;
import java.util.*;

import static org.apache.commons.codec.digest.DigestUtils.md5Hex;

/**
 * Created by caixiaowei on 2019/3/5.
 */
public class BaseUtil {


    public static boolean Base_HasValue(Object pValue) {
        Boolean HasValue = true;
        if (pValue == (null)) {
            HasValue = false;
        }
        return HasValue;
    }

    public static boolean Base_HasValue(String pValue) {
        Boolean HasValue = true;
        if (pValue == (null)) {
            HasValue = false;
        } else if ("".equals(pValue)) {
            HasValue = false;
        } else if ("".equals(pValue.trim())) {
            HasValue = false;
        } else if ("null".equals(pValue.trim())) {

        }
        return HasValue;
    }

    public static boolean Base_HasValue(Integer pValue) {
        Boolean HasValue = true;
        if (pValue == (null)) {
            HasValue = false;
        }
        return HasValue;
    }

    public static boolean Base_HasValue(Map pValue) {
        Boolean HasValue = true;
        if (pValue == (null) || pValue.size() < 1) {
            HasValue = false;
        }
        return HasValue;
    }

    public static boolean Base_HasValue(List pValue) {
        Boolean HasValue = true;
        if (pValue == (null) || pValue.size() < 1) {
            HasValue = false;
        }
        return HasValue;
    }

    public static boolean Base_HasValue(Double pValue) {
        Boolean HasValue = true;
        if (pValue == (null)) {
            HasValue = false;
        }
        return HasValue;
    }


    public static String[] Base_Split(String string, String divisionChar) {
        int i = 0;
        StringTokenizer tokenizer = new StringTokenizer(string, divisionChar);

        String[] str = new String[tokenizer.countTokens()];

        while (tokenizer.hasMoreTokens()) {
            str[i] = new String();
            str[i] = tokenizer.nextToken();
            i++;
        }

        return str;
    }

    public static String Base_ValueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();

    }

    public static String Base_GetDataToMd5(JSONObject jsonObject, String Keys) {
        String[] tmpKeys = Base_Split(Keys, ",");
        String resultMd5 = "";
        for (String key : tmpKeys) {
            String tmpMd5 = md5Hex(Base_ValueOf(jsonObject.get(key)));
            resultMd5 += tmpMd5;
        }
        return resultMd5;
    }

    /**
     * Json 数组按照 key 进行去重
     *
     * @param jsonArray 源Json数组对象
     * @param Keys      按照 key 进行比较 ; 可以采用多个 key 进行比较用 , 作为分隔符。
     * @return
     */
    public static JSONArray Base_DistinctData(JSONArray jsonArray, String Keys) {

        Map<String, Object> map = new HashMap<>();

        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String resultMd5 = Base_GetDataToMd5(jsonObject, Keys);
            if (!Base_HasValue(map.get(resultMd5))) {
                map.put(resultMd5, jsonObject);
            }
        }

        JSONArray resultArray = new JSONArray();
        Iterator<Map.Entry<String, Object>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Object> entry = entries.next();
            resultArray.add(entry.getValue());
        }
        return resultArray;
    }

    public static Map Base_DistinctData(Map pMap, String Keys) {
        Iterator it = pMap.keySet().iterator();
        while (it.hasNext()) {
            String key;
            String value;
            key = it.next().toString();
            value = (String) pMap.get(key);
            System.out.println(key + "--" + value);
        }
        return null;
    }

    public static Object Base_getDefValue(Object pValue, Object pDefValue) {
        if (Base_HasValue(pValue)) {
            return pValue;
        } else {
            return pDefValue;
        }
    }

    public static String Base_encodeUTF8(String str) {

        try {
            if (Base_HasValue(str)) {
                str = URLDecoder.decode(str, "UTF-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return str;
    }

    /**
     * @param pName  name
     * @param pValue value
     * @return sql条件尾串
     */
    public static String getLocSqlText(String pName, String pValue) {
        String sqlText = String.format(" AND %s ", pName);
        sqlText = String.format(sqlText + " = %s  ", "'" + pValue + "'");
        return sqlText;
    }

    /**
     * 将fromList的数据添加到toList
     *
     * @param toArray   目标list
     * @param fromArray 数据源
     * @return
     */
    public static JSONArray copyJsonArray(JSONArray toArray, JSONArray fromArray) {

        if (Base_HasValue(fromArray)) {
            for (int i = 0; i < fromArray.size(); i++) {
                JSONObject o = fromArray.getJSONObject(i);
                toArray.add(o);
            }
        }

        return toArray;
    }

    /**
     * 将fromList的数据添加到toList
     *
     * @param toList   目标list
     * @param fromList 数据源
     * @return
     */
    public static List copyList(List toList, List fromList) {

        if (Base_HasValue(fromList)) {
            for (Object o : fromList) {
                fromList.add(o);
            }
        }

        return toList;
    }

    public static void removeDuplicate(List list) {
        HashSet h = new HashSet(list);
        list.clear();
        list.addAll(h);
    }

    public static Object getMinKey(Map<Double, Object> map) {
        if (map == null) return null;
        Set<Double> set = map.keySet();
        Object[] obj = set.toArray();
        Arrays.sort(obj);
        return obj[0];
    }

    public static void Base_CheckHasValue(String Msg, Object pValue) {
        if (!Base_HasValue(pValue)) {
            throw new Error(Msg + " : 是空值");
        }
    }

    public static void Base_CheckHasValue(String Msg, String pValue) {
        if (!Base_HasValue(pValue)) {
            throw new Error(Msg + " : 是空值");
        }
    }

    public static void Base_CheckHasValue(String Msg, Integer pValue) {
        if (!Base_HasValue(pValue)) {
            throw new Error(Msg + " : 是空值");
        }
    }

    public static void Base_CheckHasValue(String Msg, Map pValue) {
        if (!Base_HasValue(pValue)) {
            throw new Error(Msg + " : 是空值");
        }
    }

    public static void Base_CheckHasValue(String Msg, List pValue) {
        if (!Base_HasValue(pValue)) {
            throw new Error(Msg + " : 是空值");
        }
    }

    public static void Base_CheckHasValue(String Msg, Double pValue) {
        if (!Base_HasValue(pValue)) {
            throw new Error(Msg + " : 是空值");
        }
    }

    /**
     * 以减法实现的除法
     *
     * @param denNum 分母
     * @param molNum 分子
     */
    public static int subToDiv(double denNum,double molNum){
        int result = 0;
        boolean isCheck =false;
        while (!isCheck){
            if(denNum < molNum){
                isCheck = true;
            }else{
                result ++;
                denNum = denNum - molNum;
            }
        }
        return result;
    }

    /**
     * 以减法实现的取余
     *
     * @param denNum 分母
     * @param molNum 分子
     */
    public static double subToRem(double denNum,double molNum){
        boolean isCheck =false;
        while (!isCheck){
            if(denNum < molNum){
                isCheck = true;
            }else{
                denNum = denNum - molNum;
            }
        }
        return denNum;
    }

    /**
     * 将double格式化为指定小数位的String，不足小数位用0补全
     *
     * @param v     需要格式化的数字
     * @param scale 小数点后保留几位
     * @return
     */
    public static String roundByScale(double v, int scale) throws Exception {
        if (scale < 0) {
            throw new Exception("保留小数点位数不能为零");

        }
        if (scale == 0) {
            return new DecimalFormat("0").format(v);
        }
        String formatStr = "0.";
        for (int i = 0; i < scale; i++) {
            formatStr = formatStr + "0";
        }
        return new DecimalFormat(formatStr).format(v);

    }
}
