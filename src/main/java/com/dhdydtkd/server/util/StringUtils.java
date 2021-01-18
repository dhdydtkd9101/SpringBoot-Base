package com.dhdydtkd.server.util;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class StringUtils {

    public static String sha256(String str){
        String SHA256 = "";
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(str.getBytes());
            byte byteData[] = md.digest();
            StringBuffer sb = new StringBuffer();
            for(int i = 0 ; i < byteData.length ; i++){
                sb.append(Integer.toString((byteData[i]&0xff) + 0x100, 16).substring(1));
            }
            SHA256 = sb.toString();
        }catch(NoSuchAlgorithmException e){
            e.printStackTrace();
            SHA256 = null;
        }
        return SHA256;
    }

    public static boolean isEmpty(CharSequence str) {
        return str == null || str.length() == 0;
    }

    public static String makeReserveId(Integer maxReserveIdx) {
    	String currDt = DateUtils.convertDateFormat(DateUtils.currentTimeToDate(), "yyyyMMdd");
        return currDt + "-" + String.format("%08d", maxReserveIdx);
    }

	public static String getCalendar(String start_dt, String end_dt) throws Exception {
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date sd = transFormat.parse(start_dt);
		Date ed = transFormat.parse(end_dt);

		int TOTAL_JOURNEY_DATE = (int) (ed.getTime() - sd.getTime()) / (24*60*60*1000);


		int nights = TOTAL_JOURNEY_DATE;
		int days = TOTAL_JOURNEY_DATE + 1;

		String calendar = nights + ";" + days;

		return calendar;
	}

    public static Map<String, Object> getQueryMap(String query){
        if (query==null) return null;

        int pos1=query.indexOf("?");
        if (pos1>=0) {
            query=query.substring(pos1+1);
        }

        String[] params = query.split("&");
        Map<String, Object> map = new HashMap<String, Object>();
        for (String param : params) {
            String[] splitParam = param.split("=");
            if(splitParam.length > 1){
                String name = splitParam[0];
                String value = null;
                try {
                    value = URLDecoder.decode(splitParam[1], "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                map.put(name, value);
            }
        }
        return map;
    }

}
