package com.dhdydtkd.server.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;

import java.util.Map;

public class MapUtils {
	public static Map<String,Object> convertJSONstringToMap(String json) throws JsonMappingException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map = Maps.newHashMap();
        
        map = mapper.readValue(json, new TypeReference<Map<String, Object>>() {});
        
        return map;
	}
    public static <K, V> Map<K, V> of(K k, V v) {
        Map<K, V> map = Maps.newHashMap();
        if (v != null) {
            map.put(k, v);
        }
        return map;
    }

    public static <K, V> Map<K, V> of(K k, V v, K k2, V v2) {
        Map<K, V> map = Maps.newHashMap();
        if (v != null) {
            map.put(k, v);
        }
        if (v2 != null) {
            map.putIfAbsent(k2, v2);
        }
        return map;
    }

    public static <K, V> Map<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        Map<K, V> map = Maps.newHashMap();
        if (v != null) {
            map.put(k, v);
        }
        if (v2 != null) {
            map.putIfAbsent(k2, v2);
        }
        if (v3 != null) {
            map.putIfAbsent(k3, v3);
        }
        return map;
    }

    public static <K, V> Map<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        Map<K, V> map = Maps.newHashMap();
        if (v != null) {
            map.put(k, v);
        }
        if (v2 != null) {
            map.putIfAbsent(k2, v2);
        }
        if (v3 != null) {
            map.putIfAbsent(k3, v3);
        }
        if (v4 != null) {
            map.putIfAbsent(k4, v4);
        }
        return map;
    }

    public static <K, V> void put(Map<K, V> map, K key, V value) {
        if (value == null) {
            return;
        }
        if (value instanceof String) {
            if (StringUtils.isEmpty((String) value)) {
                return;
            }
        }
        map.putIfAbsent(key, value);
    }
	public static <T> T keyToMap(Map param, String key) {
		return (T) param.get(key);
	}
}