package com.dhdydtkd.server.util;

import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JsonTextParserUtils {
	
	public static ObjectMapper objectMapper = new ObjectMapper();
	
	public static <T> T jsonTextParser(String url, Type valueType) throws Exception  {
        String result = new String(FileCopyUtils.copyToByteArray(
                new ClassPathResource(url).getInputStream()),
                StandardCharsets.UTF_8);
        return new Gson().fromJson(result, valueType);
	}
	
    public static <T> T jsonTextListParser(String url, Type valueType) throws Exception  {
        String result = new String(FileCopyUtils.copyToByteArray(
                new ClassPathResource(url).getInputStream()),
                StandardCharsets.UTF_8);
        return new Gson().fromJson(result, valueType);
    }
    
    public static <T> T getMapTypeDataByKey(Map param, String key) {
		return (T) param.get(key);
	}
}
