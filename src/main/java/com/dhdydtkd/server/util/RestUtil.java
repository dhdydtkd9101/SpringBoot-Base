package com.dhdydtkd.server.util;

import java.nio.charset.Charset;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

public class RestUtil {

	public static Map RestGetUtil(String url,HttpHeaders header) {
		RestTemplate restTemplate = new RestTemplate();
		Charset utf8 = Charset.forName("UTF-8");
		MediaType mediaType = new MediaType("application", "json", utf8);
		header.setContentType(mediaType);
		try {
			ResponseEntity<Map> response = restTemplate.exchange(
					url,
					HttpMethod.GET, new HttpEntity<Map>(header), Map.class);
			if (response.getStatusCode() == HttpStatus.OK) {
				return response.getBody();
			}
		} catch (HttpClientErrorException e) {
			return null;
		}
		return null;
	}

	public static Map RestPostUtil(String url,HttpHeaders header, Map<String, Object> param) {
		RestTemplate restTemplate = new RestTemplate();
		Charset utf8 = Charset.forName("UTF-8");
		MediaType mediaType = new MediaType("application", "json", utf8);
		header.setContentType(mediaType);
		try {
			ResponseEntity<Map> response = restTemplate.exchange(
					url,
					HttpMethod.POST, new HttpEntity<Map>(param,header), Map.class);
			if (response.getStatusCode() == HttpStatus.OK) {
				return response.getBody();
			}
		} catch (HttpClientErrorException e) {
			System.out.println(e);
		}
		return null;
	}

	public static String nodePost(String url, HttpHeaders header, Map<String, Object> param) {
		RestTemplate restTemplate = new RestTemplate();
		Charset utf8 = Charset.forName("UTF-8");
		MediaType mediaType = new MediaType("application", "json", utf8);
		header.setContentType(mediaType);
		try {
			ResponseEntity<String> response = restTemplate.exchange(
					url,
					HttpMethod.POST, new HttpEntity<Map>(param, header), String.class);
			if (response.getStatusCode() == HttpStatus.OK) {
				return response.getBody();
			}
		} catch (HttpClientErrorException e) {
			System.out.println(e);
		}
		return null;
	}

}
