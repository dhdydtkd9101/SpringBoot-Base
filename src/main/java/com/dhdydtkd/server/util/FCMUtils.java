package com.dhdydtkd.server.util;

import org.springframework.stereotype.Service;
@Service
public class FCMUtils {
	/*
	private static final Logger logger = LoggerFactory.getLogger(FCMUtils.class);

//	@Value("${fcm.key}")
	private String FCM_KEY="key=AAAAutbCt4A:APA91bEr2E0uOK7xTruS4S0p6cUrAxZGEJrrDvG7vMrfa7YUHzQakfs8AHfaQFedmg9JOl0TdXdRFslZGiWKp1npog-SVn1zYpnteTrAMe7fL_Z9C2IgsFop07U6lWb5jwZO-sy31ox9";

//	@Value("${fcm.url}")
	private String FCM_URL="https://fcm.googleapis.com/fcm/send";

	public void FCMSend(String title, String body, String pushToken, DataModel data) throws JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		Charset utf8 = Charset.forName("UTF-8");
		MediaType mediaType = new MediaType("application", "json", utf8);
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", FCM_KEY);
		header.setContentType(mediaType);

		FCMsendModel FCMsend = new FCMsendModel();
		NotificationModel notification = new NotificationModel();
		// 데이터 참고 사이트
		//https://medium.com/@vdongbin/firebase%EB%A5%BC-%EC%9D%B4%EC%9A%A9%ED%95%9C-push-notification-5c8a83932472
		//https://firebase.google.com/docs/cloud-messaging/concept-options?hl=ko

		// notification 프로그래매틱 방식
		notification.setTitle(title);
		notification.setBody(body);
		FCMsend.setNotification(notification);

		FCMsend.setData(data);
		//Normal Doze상태 혹은 절전상태일때 처리 미룸
		// 현재 테스트 해야함.
		// Doze일때 알림안옴.
		FCMsend.setPriority("high");

		// 받는 기기의 토큰 값
		FCMsend.setTo(pushToken);
		ObjectMapper objectMapper = new ObjectMapper();
		String FCMsendJson = objectMapper.writeValueAsString(FCMsend);

		System.out.println("FCMsendJson"+FCMsendJson);
//		return FCMsendJson;
		try {
			ResponseEntity<Map> response = restTemplate.exchange(FCM_URL, HttpMethod.POST, new HttpEntity<>(FCMsendJson,header), Map.class);
			if(response != null){
				logger.debug("FCMUtils response.getStatusCode : " + response.getStatusCode());
				logger.debug("FCMUtils response.getBody() : " + response.getBody());
				if (response.getStatusCode() == HttpStatus.OK) {
					Map responseMap = response.getBody();
				}
			}

		} catch (HttpClientErrorException e) {
			e.getStackTrace();
			logger.error("FCMUtils HttpClientErrorException e.toString : " + e.toString());
			logger.error("FCMUtils HttpClientErrorException e.getMessage : " + e.getMessage());
		}
	}

	public DataModel setPopupInfo(String reserveId, PopupMessage popupInfo) {
		DataModel data = new DataModel();

		String reserve_id = reserveId;
		String message = popupInfo.buildTitle();
		String left_btn_code = popupInfo.buildMessage();
		String right_btn_code = popupInfo.buildTemplate();

		if(reserveId != null && reserveId != "") {
			data.setReserve_id(reserve_id);
		}
		if(popupInfo.buildTitle() != null && popupInfo.buildTitle() != "") {
			data.setPopup_msg(message);
		}
		if(popupInfo.buildMessage() != null && popupInfo.buildMessage() != "") {
			data.setLeft_btn_code(left_btn_code);
		}
		if(popupInfo.buildTemplate() != null && popupInfo.buildTemplate() != "") {
			data.setRight_btn_code(right_btn_code);
		}

		return data;
	}
	 */
}
