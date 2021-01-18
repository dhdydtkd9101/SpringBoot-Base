package com.dhdydtkd.server.util;

public class ErrorTransUtils {
	/*
	static Logger logger = LoggerFactory.getLogger(ErrorTransUtils.class);

	public static ErrorType getErrorDescTrans(String lang, ErrorType error) throws Exception {
		if(lang.equals(LNG.KO.getCode())) {
			String msg = KO_CODE.valueOf(error.name()).getDesc();
			error.message = msg;
		}
		if(lang.equals(LNG.EN.getCode())) {
			String msg = ENG_CODE.valueOf(error.name()).getDesc();
			error.message = msg;
		}
		if(lang.equals(LNG.JA.getCode())) {
			String msg = JA_CODE.valueOf(error.name()).getDesc();
			error.message = msg;
		}
		if(lang.equals(LNG.ZH_CN.getCode())) {
			String msg = CN_CODE.valueOf(error.name()).getDesc();
			error.message = msg;
		}
		if(lang.equals(LNG.ZH_TW.getCode())) {
			String msg = CN_CODE.valueOf(error.name()).getDesc();
			error.message = msg;
		}

		return error;
	}

	@Getter
	public enum KO_CODE {
		user_email_no_registered("10007", "등록된 E-mail이 아닙니다.\n확인 후 다시 입력해주세요."),
		user_pwd_no_registered("10008", "등록된 비밀번호가 아닙니다.\n확인 후 다시 입력해주세요."),
		user_leave_fail_reason("10009","완료되지 않은 모빌티티 예약 건이 존재하여 탈퇴 할 수 없습니다.\n 모빌리티 예약을 확인해주세요."),
		user_no_match_current_pwd("10010", "현재 비밀번호와 일치하지 않습니다.\n확인 후 다시 입력해주세요."),
		reservation_registered_journey("70002", "모빌리티 예약이 있을 경우, 여정을 수정할 수 없습니다."),
		reserve_exist_for_journey("80004", "여정에 대해 예약 건이 존재합니다."),
		reserve_exist_driver_journey("80005", "해당 기사님은 선택하신 여정과 같은 날 운행을 진행하는 여정이 존재합니다."),
		already_reserve_drive_fail("80009", "죄송합니다.\n확인 결과, 기사가 이미 예약을 취소했습니다.\n차량을 다시 선택해주세요.")
		;

		private String code;
		private String desc;

		KO_CODE(String string, String desc) {
			this.code = string;
			this.desc = desc;
		}

		public static KO_CODE byCode(String code) {
			for (KO_CODE item : KO_CODE.values()) {
				if (item.code == code) return item;
			}
			return null;
		}

	}

	@Getter
	public enum ENG_CODE {
		user_email_no_registered("10007", "It is not a registered E-mail. Please check and enter again."),
		user_pwd_no_registered("10008", "It is not a registered password. Please check and enter again."),
		user_leave_fail_reason("10009", "Unable to withdraw because there is a Mobility reservation that has not been completed. Please check the Mobility reservation."),
		user_no_match_current_pwd("10010", "Doesn't match the current password. Please check and enter again."),
		reservation_registered_journey("70002", "If there is a mobility reservation, the itinerary cannot be modified."),
		reserve_exist_for_journey("80004", "Reservations exist for the itinerary."),
		reserve_exist_driver_journey("80005", "This driver is currently not available for selection. Please select another article from the list."),
		already_reserve_drive_fail("80009", "Sorry.\nAs a result of confirmation, the driver has already canceled the reservation.\nPlease select your vehicle again.")
		;

		private String code;
		private String desc;

		ENG_CODE(String string, String desc) {
			this.code = string;
			this.desc = desc;
		}

		public static ENG_CODE byCode(String code) {
			for (ENG_CODE item : ENG_CODE.values()) {
				if (item.code == code) return item;
			}
			return null;
		}

	}

	@Getter
	public enum JA_CODE {
		user_email_no_registered("10007", "登録されたE-mailはありません。 確認後、もう一度入力してください。"),
		user_pwd_no_registered("10008", "登録されたパスワードがありません。 確認後、もう一度入力してください"),
		user_leave_fail_reason("10009", "未完了のモビリティ予約があるため、退会できません。モビリティ予約を確認してください。"),
		user_no_match_current_pwd("10010", "現在のパスワードと一致しません。 確認後、もう一度入力してください。"),
		reservation_registered_journey("70002", "モビリティ予約がある場合は旅程を変更することができません。"),
		reserve_exist_for_journey("80004", "旅の予約件存在します。"),
		reserve_exist_driver_journey("80005", "その運転手さんは、現在の選択ができません。リストの他の運転手さんを選択してください。"),
		already_reserve_drive_fail("80009", "申し訳ありません。\n確認の結果、記事がすでに予約をキャンセルしました。\n車両を再度選択してください。")
		;

		private String code;
		private String desc;

		JA_CODE(String string, String desc) {
			this.code = string;
			this.desc = desc;
		}

		public static JA_CODE byCode(String code) {
			for (JA_CODE item : JA_CODE.values()) {
				if (item.code == code) return item;
			}
			return null;
		}

	}

	@Getter
	public enum CN_CODE {
		user_email_no_registered("10007", "并非已登记的E-mail。 请确认后重新输入。"),
		user_pwd_no_registered("10008", "并非已登记的密码。请确认后重新输入。"),
		user_leave_fail_reason("10009", "存在未完成的移动出行预约，故无法注销。请确认移动出行预约。"),
		user_no_match_current_pwd("10010", "与当前密码不一致。请确认后重新输入。"),
		reservation_registered_journey("70002", "如果有流动性预留，则无法修改行程。"),
		reserve_exist_for_journey("80004", "预定行程。"),
		reserve_exist_driver_journey("80005", "该驱动程序当前不可用于选择。 请从列表中选择另一篇文章。"),
		already_reserve_drive_fail("80009", "抱歉。\n作为确认的结果，驾驶员已经取消了预订。\n请再次选择您的车辆。")
		;

		private String code;
		private String desc;

		CN_CODE(String string, String desc) {
			this.code = string;
			this.desc = desc;
		}

		public static CN_CODE byCode(String code) {
			for (CN_CODE item : CN_CODE.values()) {
				if (item.code == code) return item;
			}
			return null;
		}

	}
	*/
}
