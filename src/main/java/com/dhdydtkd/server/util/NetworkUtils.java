package com.dhdydtkd.server.util;

import javax.servlet.http.HttpServletRequest;

public class NetworkUtils {

    // proxy 서버일 경우 remote ip 가져오기
    public static String getRemoteIp(HttpServletRequest req) {
        String ip = req.getHeader("x-forwarded-for"); // apache
    	
    	if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
    		ip = req.getRemoteAddr();
    	}
        return ip;
    }

}