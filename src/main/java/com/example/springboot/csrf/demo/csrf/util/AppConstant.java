package com.example.springboot.csrf.demo.csrf.util;

public class AppConstant {
        public static final String FACES_REQUEST_HEADER = "faces-request";
        public static final String STAFF_INFO = "staff_info";
        public static final String CONFIG_INFO = "app_config";
        public static final String JWT_AUTHENTICATED = "JWT_AUTHENTICATED";
        public static final String ROLE_MODULE = "ROLE_MODULE";
        public static final String ROLE_COMPONENT = "ROLE_COMPONENT";
        public static final String MENU_TREE = "MENU_TREE";
        public static final String BYPASS_RESOURCE = "/javax.faces.resource";
        public static final String USERNAME_PATTERN = "^[a-z0-9]{2,20}$";
        public static final String LOGIN_NAME_PATTERN = "^[a-z0-9_]{6,20}$";
        //^[a-zA-Z0-9_.-]*$

        //((?=.*[a-zA-Z])(?=.*\\d)(?=\\S+$).{8,20})"
        //((?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,20})
        public static final String PW_PATTERN = "((?=.*[a-zA-Z])(?=.*\\d)(?=\\S+$).{8,20})";
        public static final String SECURITY_CODE_PATTERN = "^[0-9]{6}$";
        public static final String NAME_CHARACTER = "0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";

        public static final class LANGUAGE {
            public static final String BUNDLE_NAME = "i18n.lang";
            public static final String BUNDLE_EXTENSION = "properties";
            public static final String CHARSET = "UTF-8";
        }

        public static final class SORT {
            public static final String ASC = "ASC";
            public static final String ASCENDING = "ASCENDING";
            public static final String DESCENDING = "DESCENDING";
            public static final String DESC = "DESC";
        }

        public static final class BOOLEAN_STATUS {
            public static final String STR_ACTIVE = "MENU.STATUS_ACTIVE";
            public static final Integer ACTIVE_VALUE = 1;
            public static final String STR_IN_ACTIVE = "MENU.STATUS_IN_ACTIVE";
            public static final Integer IN_ACTIVE_VALUE = 0;
            public static final boolean ACTIVE = true;
            public static final boolean INACTIVE = false;
        }

        public static final class STATUS {
            public static final Integer ACTIVE = 1;
            public static final Integer INACTIVE = 0;
        }

        public static final class REST_API {
            public static final String COMMAND_ID = "coid";
            public static final String SUCCESS = "00";
            public static final String LOGIN_USER_INFO = "userInfo";
            public static final String LOGIN_SERVER_INFO = "serverInfo";
            public static final String LOGIN_CONFIG = "config";
            public static final String ERROR = "error";
            public static final String USER = "users";
            public static final String ERR_1_EXCEPTION = "1";
            public static final String EXCEPTION = "api.error.exception";
            public static final String ERR_10_MENU_NOT_EXIST = "10";
            public static final String MENU_NOT_EXIST = "api.error.menu.not.exist";
            public static final String ERR_11_USERNAME_WRONG_FORMAT = "11";
            public static final String USERNAME_WRONG_FORMAT = "api.error.";
            public static final String ERR_12_PWORD_WRONG_FORMAT = "12";
            public static final String PWORD_WRONG_FORMAT = "api.error.";
            public static final String ERR_13_NICKNAME_WRONG_FORMAT = "13";
            public static final String NICKNAME_WRONG_FORMAT = "api.error.";
            public static final String ERR_14_WRONG_CAPTCHA = "14";
            public static final String WRONG_CAPTCHA = "api.error.";
            public static final String ERR_15_NICKNAME_WARNING = "15";
            public static final String NICKNAME_WARNING = "api.error.";
            public static final String ERR_16_ACCOUNT_NOT_ENOUGHT_MONEY = "16";
            public static final String ACCOUNT_NOT_ENOUGHT_MONEY = "api.error.account.not.enough.money";
            public static final String ERR_17_SESSION_ID_NOT_EXIST = "17";
            public static final String SESSION_ID_NOT_EXIST = "api.error.session.id.not.exist";
            public static final String ERR_18_SESSION_ID_EXIST = "18";
            public static final String SESSION_ID_EXIST = "api.error.session.id.exist";
            public static final String ERR_19_USERNAME_NOT_EXIST = "19";
            public static final String USERNAME_NOT_EXIST = "api.error.username.not.exist";
            public static final String ERR_20_USERNAME_EXIST = "20";
            public static final String USERNAME_EXIST = "api.error.username.exist";
            public static final String ERR_21_WRONG_PWORD = "21";
            public static final String WRONG_PWORD = "api.error.wrong.password";
            public static final String ERR_22_NICKNAME_EXIST = "22";
            public static final String NICKNAME_EXIST = "api.error.nickname.exist";
            public static final String ERR_23_NICKNAME_DIFF_USERNAME = "23";
            public static final String NICKNAME_DIFF_USERNAME = "api.error.nickname.diff.username";
            public static final String ERR_24_WRONG_TOKEN = "24";
            public static final String WRONG_TOKEN = "api.error.wrong.token";
            public static final String ERR_25_TOKENT_TIMEOUT = "25";
            public static final String TOKENT_TIMEOUT = "api.error.token.timeout";
            public static final String ERR_26_NICKNAME_NOT_EXIST = "26";
            public static final String NICKNAME_NOT_EXIST = "api.error.nickname.not.exist";
            public static final String ERR_27_NICKNAME_MUST_ENTER = "27";
            public static final String NICKNAME_MUST_ENTER = "api.error.nickname.must.enter";
            public static final String ERR_28_PWOLD_DIFF_NEW = "28";
            public static final String PWOLD_DIFF_NEW = "api.error.password.diff.new";
            public static final String ERR_30_REQUIRE_QR_CODE = "30";
            public static final String REQUIRE_QR_CODE = "api.error.require.qr.code";
            public static final String ERR_31_QR_CODE_WRONG = "31";
            public static final String QR_CODE_WRONG = "api.error.qr.code.wrong";
            public static final String ERR_32_SECURITY_CODE_WRONG_FORMAT = "32"; // security code sai định dạng
            public static final String SECURITY_CODE_WRONG_FORMAT = "api.error.security.code.wrong.format";
            public static final String ERR_33_WRONG_SCURITY_CODE = "33"; // security code sai
            public static final String WRONG_SCURITY_CODE = "api.error.wrong.security.code";
            public static final String ERR_34_MUST_LOGIN_AGAIN = "34"; // khong co tren cache, can dang nhap lai
            public static final String MUST_LOGIN_AGAIN = "api.error.must.login.again";
            public static final String ERR_35_ADMIN_NO_PERMISSION = "35"; // admin ko co quyen
            public static final String ADMIN_NO_PERMISSION = "api.error.admin.no.permission";
            public static final String ERR_36_IS_BOT = "36"; // is bot
            public static final String IS_BOT = "api.error.is.bot";
            public static final String ERR_37_ACCOUNT_IS_FREEZE = "37"; // tài khoản đang bị đóng băng
            public static final String ACCOUNT_IS_FREEZE = "api.error.account.is.freeze";
            public static final String ERR_38_NOT_ADMIN_AGENT = "38"; // không phải là admin / đại lý
            public static final String NOT_ADMIN_AGENT = "api.error.not.admin.agent";
            public static final String ERR_39_WRONG_PASSWD = "39"; // sai pass
            public static final String WRONG_PASSWD = "api.error.wrong.password";
            public static final String ERR_40_NO_AGENT_PARENT = "40"; // khong phai dai ly cha
            public static final String NO_AGENT_PARENT = "api.error.no.agent.parent";
            public static final String ERR_41_NEW_CODE_WRONG_FORMAT = "41"; // code moi sai dinh dang
            public static final String NEW_CODE_WRONG_FORMAT = "api.error.new.code.wrong.format";
            public static final String ERR_42_NEW_CODE_MUST_DIFF_OLD_CODE = "42"; // code moi phai khac code cu
            public static final String NEW_CODE_MUST_DIFF_OLD_CODE = "api.error.new.code.must.diff.old.code";
            public static final String ERR_43_ONLY_UPDATE_USER = "43"; // api chi update cho user
            public static final String ONLY_UPDATE_USER = "api.error.only.update.user";
            public static final String ERR_101_SYSTEM_MAINTAIN = "101";
            public static final String SYSTEM_MAINTAIN = "api.error.system.maintain";
            public static final String ERR_102_BAN_LOGIN = "102";
            public static final String BAN_LOGIN = "api.error.ban.login";
            public static final String ERR_103_BAN_TRANSFER = "103";
            public static final String BAN_TRANSFER = "api.error.ban.transfer";
            public static final String ERR_104_BAN_PLAYGAME = "104";
            public static final String BAN_PLAYGAME = "api.error.ban.play.game";
        }

        public static final class API_COUNT_NEW_EMAIL {
            //       NICK_NAME, NEW_CODE, PARENT, ADMIN, SECURITY_CODE
            public static final String NICK_NAME = "nik";
            public static final String COMMAND_ID_VALUE = "17";

        }


        public static final class API_READ_NOTIFY {
            //       NICK_NAME, NEW_CODE, PARENT, ADMIN, SECURITY_CODE
            public static final String NICK_NAME = "nik";
            public static final String COMMAND_ID_VALUE = "18";
        }

        public static final class API_GET_CURRENT_BALANCE {
            //       NICK_NAME, NEW_CODE, PARENT, ADMIN, SECURITY_CODE
            public static final String NICK_NAME = "nik";
            public static final String COMMAND_ID_VALUE = "15";

            // 0,1,32,33,38
            //        0 - thành công
            public static final String GET_CURRENT_BALANCE_CODE_0_SUCCESS = "verify.security.success";
        }

        public static final class API_VERIFY_SECURITY_CODE {
            //       NICK_NAME, NEW_CODE, PARENT, ADMIN, SECURITY_CODE
            public static final String NICK_NAME = "nik";
            public static final String SECURITY_CODE = "secd";
            public static final String COMMAND_ID_VALUE = "14";

            // 0,1,32,33,38
            //        0 - thành công
            public static final String VERIFY_SECURITY_CODE_0_SUCCESS = "verify.security.success";
            public static final String VERIFY_SECURITY_CODE_1 = "1";
            public static final String VERIFY_SECURITY_CODE_32 = "32";
            public static final String VERIFY_SECURITY_CODE_33 = "33";
            public static final String VERIFY_SECURITY_CODE_38 = "38";
        }

        public static final class API_GET_MESSAGE {
            //      NICK_NAME, ACCESS_TOKEN, PAGE_NUMBER
            public static final String NICK_NAME = "nik";
            public static final String ACCESS_TOKEN = "acs";
            public static final String PAGE_NUMBER = "pgn";
            public static final String PAGE_SIZE = "pgs";
            public static final String COMMAND_ID_VALUE = "7";

            // 0,1,32,33,38
            //        0 - thành công
            public static final String GET_MESSAGE_CODE_0_SUCCESS = "get.message.success";
            public static final String GET_MESSAGE_CODE_1 = "1";
            public static final String GET_MESSAGE_CODE_24 = "24";

        }

        public static final class API_READ_EMAIL {
            //NICK_NAME, MAIL_ID, TYPE, ACCESS_TOKEN
            // 0,1,24
            public static final String TYPE = "type";
            public static final String NICK_NAME = "nik";
            public static final String MAIL_ID = "maid";
            public static final String ACCESS_TOKEN = "acs";
            public static final String COMMAND_ID_VALUE = "4";
            public static final String READ_EMAIL_0_SUCCESS = "read.email.success";
            public static final String READ_EMAIL_1 = "1";
            public static final String READ_EMAIL_24 = "24";
        }

        public static final class API_CHANGE_STATUS {
            //    "NICK_NAME, INDEX, ACTION, PARENT, ADMIN, SECURITY_CODE DESCRIPTION
            //            + INDEX: theo thứ tự đã note
            //+ ACTION: 0 - mở, 1 - khóa
            //+ PARENT: nickname đại lý cha reset cho con
            //+ ADMIN: nickname admin reset"
            //error: 0,1,26,32,33,38,40
            //"đổi status của user
            public static final String DESCRIPTION = "des";
            public static final String NICK_NAME = "nik";
            public static final String USER_NAME = "usn";
            public static final String INDEX = "idx";
            public static final String ACTION = "act";
            public static final String PARENT = "pa";
            public static final String ADMIN = "adm";
            public static final String SECURITY_CODE = "secd";
            public static final String COMMAND_ID_VALUE = "13";
            //error: 0,1,26,32,33,38,40
            public static final String USER_STATUS_0_SUCCESS = "user.status.success";
            public static final String USER_STATUS_1 = "1";
            public static final String USER_STATUS_26 = "26";
            public static final String USER_STATUS_32 = "32";
            public static final String USER_STATUS_33 = "33";
            public static final String USER_STATUS_38 = "38";
            public static final String USER_STATUS_40 = "40";
        }

        public static final class API_CHANGE_SECURITY_CODE {
            //NICK_NAME, NEW_CODE, SECURITY_CODE
//+ NEW_CODE: security code mới
            public static final String NICK_NAME = "nik";
            public static final String NEW_CODE = "ncd";
            public static final String SECURITY_CODE = "secd";
            public static final String COMMAND_ID_VALUE = "11";
            //error: 0,1,32,33,38,41,42
            public static final String CHANGE_SECURITY_CODE_0_SUCCESS = "change.security.code.success";
            public static final String CHANGE_SECURITY_CODE_1 = "1";
            public static final String CHANGE_SECURITY_CODE_32 = "32";
            public static final String CHANGE_SECURITY_CODE_33 = "33";
            public static final String CHANGE_SECURITY_CODE_38 = "38";
            public static final String CHANGE_SECURITY_CODE_41 = "41";
            public static final String CHANGE_SECURITY_CODE_42 = "42";
        }

        public static final class API_CHANGE_PASSWORD {
            //NICK_NAME, OLD_PASSWORD, NEW_PASSWORD, SECURITY_CODE
            //error: 0,1,32,33,38,41,42
            public static final String NICK_NAME = "nik";
            public static final String OLD_PASSWORD = "opa";
            public static final String NEW_PASSWORD = "npa";
            public static final String SECURITY_CODE = "secd";
            public static final String COMMAND_ID_VALUE = "9";
            //error: 0,1,32,33,38,39
            //        0 - thành công
            public static final String CHANGE_PASSWORD_0_SUCCESS = "change.password.success";
            public static final String CHANGE_PASSWORD_1 = "1";
            public static final String CHANGE_PASSWORD_32 = "32";
            public static final String CHANGE_PASSWORD_33 = "33";
            public static final String CHANGE_PASSWORD_38 = "38";
            public static final String CHANGE_PASSWORD_39 = "39";
        }

        public static final class API_RESET_PASSWORD {

            // NICK_NAME, PASS_WORD, PARENT, ADMIN, SECURITY_CODE USER_NAME
            //+ PASS_WORD: MD5()
            //+ PARENT: nickname đại lý cha reset cho con
            //+ ADMIN: nickname admin reset
            public static final String NICK_NAME = "nik";
            public static final String USER_NAME = "usn";
            public static final String PASS_WORD = "paw";
            public static final String PARENT = "pa";
            public static final String ADMIN = "adm";
            public static final String SECURITY_CODE = "secd";
            public static final String COMMAND_ID_VALUE = "8";
            // loi roi  0,1,26,32,33,38,40
            //        0 - thành công
            public static final String RESET_PASSWORD_0_SUCCESS = "reset.password.success";
            public static final String RESET_PASSWORD_1 = "1";
            public static final String RESET_PASSWORD_26 = "26";
            public static final String RESET_PASSWORD_32 = "32";
            public static final String RESET_PASSWORD_33 = "33";
            public static final String RESET_PASSWORD_38 = "38";
            public static final String RESET_PASSWORD_40 = "40";
        }


        public static final class API_CHANGE_TRANS_LIMIT {

            //    NICK_NAME, TRANS_LIMIT, PARENT, ADMIN, SECURITY_CODE, USER_NAME
//+ TRANS_LIMIT: mảng json cấu hình hạn mức
//+ PARENT: nickname đại lý cha reset cho con
//+ ADMIN: nickname admin reset
            public static final String NICK_NAME = "nik";
            public static final String USER_NAME = "usn";
            public static final String TRANS_LIMIT = "tlm";
            public static final String PARENT = "pa";
            public static final String ADMIN = "adm";
            public static final String SECURITY_CODE = "secd";
            public static final String COMMAND_ID_VALUE = "12";
            //error: 0,1,26,32,33,38,40
            public static final String CHANGE_TRANS_LIMIT_0_SUCCESS = "change.trans.limit.success";
            public static final String CHANGE_TRANS_LIMIT_1 = "1";
            public static final String CHANGE_TRANS_LIMIT_26 = "26";
            public static final String CHANGE_TRANS_LIMIT_32 = "32";
            public static final String CHANGE_TRANS_LIMIT_33 = "33";
            public static final String CHANGE_TRANS_LIMIT_38 = "38";
            public static final String CHANGE_TRANS_LIMIT_40 = "40";
        }

        public static final class API_RESET_SECURITY_CODE {
            //       NICK_NAME, NEW_CODE, PARENT, ADMIN, SECURITY_CODE
            public static final String NICK_NAME = "nik";
            public static final String NEW_CODE = "ncd";
            public static final String USER_NAME = "usn";
            public static final String PARENT = "pa";
            public static final String ADMIN = "adm";
            public static final String SECURITY_CODE = "secd";
            public static final String COMMAND_ID_VALUE = "10";

            // loi roi 0,1,26,32,33,38,40,41
            //        0 - thành công
            public static final String RESET_SECURITY_CODE_0_SUCCESS = "reset.security.success";
            public static final String RESET_SECURITY_CODE_1 = "1";
            public static final String RESET_SECURITY_CODE_26 = "26";
            public static final String RESET_SECURITY_CODE_32 = "32";
            public static final String RESET_SECURITY_CODE_33 = "33";
            public static final String RESET_SECURITY_CODE_38 = "38";
            public static final String RESET_SECURITY_CODE_40 = "40";
            public static final String RESET_SECURITY_CODE_41 = "41";
        }

        public static final class API_TRANSFER_MONEY {
            //        NICK_NAME_SEND, NICK_NAME_RECEIVE, MONEY, REASON, SECURITY_CODE
            public static final String NICK_NAME_SEND = "nins";
            public static final String NICK_NAME_RECEIVE = "ninr";
            public static final String MONEY = "mn";
            public static final String REASON = "rs";
            public static final String SECURITY_CODE = "secd";
            public static final String COMMAND_ID_VALUE = "1";
            //        0 - thành công
            public static final String TRANSFER_0_SUCCESS = "transfer.api.success";
            //1 - lỗi hệ thống
            //2 - không đủ tiền
            public static final String ERR_TRANSFER_2_NOT_ENOUGH_MONEY = "2";
            public static final String TRANSFER_NOT_ENOUGH_MONEY = "transfer.api.error.not.enough.money";
            //3 - cấm chuyển tiền
            public static final String ERR_TRANSFER_3_BAN_TRANSFER = "3";
            public static final String TRANSFER_BAN_TRANSFER = "transfer.api.error.ban.transfer";
            //4 - không phải là cha con
            public static final String ERR_TRANSFER_4_NO_PARENT_CHILD = "4";
            public static final String TRANSFER_NO_PARENT_CHILD = "transfer.api.error.no.parent.child";
            //5 - tiền >= min
            public static final String ERR_TRANSFER_5_MIN_TRANSFER = "5";
            public static final String TRANSFER_MIN_TRANSFER = "transfer.api.error.min.transfer";
            //6- nickname không tồn tại
            public static final String ERR_TRANSFER_6_NICKNAME_NOT_EXIST = "6";
            public static final String TRANSFER_NICKNAME_NOT_EXIST = "transfer.api.error.nickname.not.exist";
            //7- tiền còn lại >= remain_min
            public static final String ERR_TRANSFER_7_MONEY_GT_REMAIN_MIN = "7";
            public static final String TRANSFER_MONEY_GT_REMAIN_MIN = "transfer.api.error.money.gt.remain.min";
            //8 - không thể ck đến tk bị khóa
            public static final String ERR_TRANSFER_8_ACCOUNT_RECEIVE_HAS_BAN = "8";
            public static final String TRANSFER_ACCOUNT_RECEIVE_HAS_BAN = "transfer.api.error.account.receive.has.ban";
            //9 - tài khoản đang đóng băng
            public static final String ERR_TRANSFER_9_ACCOUNT_RECEIVE_HAS_FREEZE = "9";
            public static final String TRANSFER_ACCOUNT_RECEIVE_HAS_FREEZE = "transfer.api.error.account.receive.has.freeze";
            //10 - security code invalid
            public static final String ERR_TRANSFER_10_SECURITY_CODE_INVALID = "10";
            public static final String TRANSFER_SECURITY_CODE_INVALID = "transfer.api.error.security.code.invalid";
            //11- security code sai
            public static final String ERR_TRANSFER_11_SECURITY_CODE_WRONG = "11";
            public static final String TRANSFER_SECURITY_CODE_WRONG = "transfer.api.error.security.code.wrong";

        }

        public static final class TRANSFER_MONEY_TYPE {
            public static final int TRANSFER_ALL = 0;
            public static final int TRANSFER_TO_MEMBER = 1;
            public static final int RECEIVE_FROM_MEMBER = 2;
            public static final int TRANSFER_TO_AGENT = 3;
            public static final int RECEIVE_FROM_AGENT = 4;

        }

        public static final class DATE_SPECIAL_TYPE {
            public static final int NO_CHOISE = 0;
            public static final int TO_DAY = 1;
            public static final int YESTERDAY = 2;
            public static final int THIS_WEEK = 3;
            public static final int LAST_WEEK = 4;
            public static final int THIS_MONTH = 5;
            public static final int LAST_MONTH = 6;
            public static final int FROM_LAST_MONTH = 7;

        }


        public static final class BOT_TYPE {
            public static final String NORMAL = "Tài khoản thường";
            public static final Integer NORMAL_VALUE = 0;
            public static final String BOT = "Tài khoản bot";
            public static final Integer BOT_VALUE = 1;
        }

        public static final class ACTION_TYPE {
            public static final String FUNCTION_OBJECT_KEY = "FUNCTION_OBJECT";
            public static final String FUNCTION_OBJECT_VALUE = "Thêm mới chức năng";
            public static final String GAME_CONFIG_TYPE_UPDATE_KEY = "GAME_CONFIG_TYPE_UPDATE";
            public static final String GAME_CONFIG_TYPE_UPDATE_VALUE = "Cập nhật config game";
        }

        public static final class ADMIN_TYPE {
            public static final String NORMAL = "Tài khoản thường";
            public static final Integer NORMAL_VALUE = 0;
            public static final String ADMIN = "Tài khoản Admin";
            public static final Integer ADMIN_VALUE = 1;
        }

        public static final class APPLICATION_TOOL {
            public static final String ADMIN_TOOL = "MENU.APP_TYPE.ADMIN";
            public static final Integer ADMIN_TOOL_VALUE = 1;
            public static final String AGENT_TOOL = "MENU.APP_TYPE.AGENT";
            public static final Integer AGENT_TOOL_VALUE = 2;
        }

        public static final class LOCK_TYPE {
            public static final String LOCK_SANBOX = "Login Sanbox";
            public static final Integer LOCK_SANBOX_VALUE = 1;
            public static final String LOCK_LOGIN_NORMAL = "Khóa Login";
            public static final Integer LOCK_LOGIN_NORMAL_VALUE = 2;
            public static final String LOCK_TRANSFER = "Khóa chuyển khoản";
            public static final Integer LOCK_TRANSFER_VALUE = 3;
            public static final String HAS_SECURITY = "Bảo mật ";
            public static final Integer HAS_SECURITY_VALUE = 4;
            public static final String DISABLE_BARCODE = "Disable barcode ";
            public static final Integer DISABLE_BARCODE_VALUE = 5;
        }

        public static final class AGENT_TYPE {
            public static final short AGENT_SUPER_MASTER = 1;
            public static final short AGENT_MASTER = 2;
            public static final short AGENT_LEVEL_ONE = 3;
            public static final short AGENT_LEVEL_TWO = 100;
            public static final short PLAYER_ACCOUNT = 0;
            public static final short SUPER_SUPER_MASTER = 999;
        }

        public static final class DAILY_TYPE {
            public static final String NORMAL = "Tài khoản người chơi";
            public static final int NORMAL_VALUE = 0;
            public static final String AGENT_LV_SUPER_MASTER_NAME = "Super Master";
            public static final int AGENT_LV_SUPER_MASTER_VALUE = 1;
            public static final String AGENT_LV_MASTER_NAME = "Master";
            public static final int AGENT_LV_MASTER_VALUE = 2;
            public static final String AGENT_LV_1_VALUE = "Đại lý cấp 1";
            public static final int AGENT_LV1_VALUE = 3;
            public static final String AGENT_LV2_NAME = "Đại lý cấp 2";
            public static final int AGENT_LV2_VALUE = 100;
            public static final String GAME_DETAIL_NAME = "Chi tiết game";
            public static final int GAME_DETAIL_VALUE = -1;
        }


        public static final class MENU {
            public static final Short MODULE = 1;
            public static final Short COMPONENT = 2;
        }

        public static final class TABLE_COLUMN {
            public static final String USERS_VIPPOINT = "vipPoint";
            public static final String USERS_VIPPOINT_SAVE = "vipPointSave";
            public static final String USERS_SAFE = "safe";
            public static final String USERS_RECHARGE_MONEY = "rechargeMoney";
            public static final String USERS_XU = "xu";
            public static final String USERS_GOLD = "gold";
        }


        public static final class ACTION_LOG {
            //GHI LOG CHO BANG AP_DOMAIN
            public static final String AP_DOMAIN_TYPE = "AP_DOMAIN";
            public static final String AP_DOMAIN_TYPE_ADD_NEW = "ams.catalog.actionLog.add";
            public static final String AP_DOMAIN_TYPE_UPDATE = "ams.catalog.actionLog.edit";
            public static final String AP_DOMAIN_TYPE_DELETE = "Thay đổi trạng thái tham số có ID là";

            //GHI LOG CHO BANG BANK_ALIAS
            public static final String BANK_ALIAS_TYPE = "BANK_ALIAS";
            public static final String BANK_ALIAS_TYPE_ADD_NEW = "action.alias.add";
            public static final String BANK_ALIAS_TYPE_UPDATE = "action.alias.update";
            public static final String BANK_ALIAS_TYPE_DELETE = "action.alias.delete";

            //GHI LOG CHO BANG ACTION
            public static final String ACTION_TYPE = "ACTION";
            public static final String ACTION_TYPE_ADD_NEW = "action.action.add.new";
            public static final String ACTION_TYPE_UPDATE = "action.action.update";
            public static final String ACTION_TYPE_DELETE = "action.action.delete";

            //GHI LOG CHO BANG CHAN_SHOP - cua hang chuoi
            public static final String CHAIN_SHOP_TYPE = "CHAIN_SHOP";
            public static final String CHAIN_SHOP_TYPE_ADD_NEW = "action.chain.shop.add.new";
            public static final String CHAIN_SHOP_TYPE_UPDATE = "action.chain.shop.update";
            public static final String CHAIN_SHOP_TYPE_DELETE = "action.chain.shop.delete";
            public static final String CHAIN_SHOP_TYPE_IMPORT = "action.chain.shop.import";

            //GHI LOG CHO BANG MENU_FUNCTION - chuc nang
            public static final String MENU_FUNCTION_TABLE = "menu_function";
            public static final String MENU_FUNCTION_TYPE_CREATE = "MENU_FUNCTION_TYPE_CREATE";
            public static final String MENU_FUNCTION_TYPE_UPDATE = "MENU_FUNCTION_TYPE_UPDATE";
            public static final String MENU_FUNCTION_TYPE_DELETE = "MENU_FUNCTION_TYPE_DELETE";
            public static final String MENU_FUNCTION_TYPE_CREATE_VALUE = "action.menu.function.add.new";
            public static final String MENU_FUNCTION_TYPE_UPDATE_VALUE = "action.menu.function.update";
            public static final String MENU_FUNCTION_TYPE_DELETE_VALUE = "action.menu.function.delete";

            // Ghi log cho bang GAME_CONFIG
            public static final String GAME_CONFIG_TABLE = "game_config";
            public static final String GAME_CONFIG_TYPE_CREATE = "GAME_CONFIG_TYPE_CREATE";
            public static final String GAME_CONFIG_TYPE_UPDATE = "GAME_CONFIG_TYPE_UPDATE";
            public static final String GAME_CONFIG_TYPE_DELETE = "GAME_CONFIG_TYPE_DELETE";
            public static final String GAME_CONFIG_TYPE_CREATE_VALUE = "FFF";
            public static final String GAME_CONFIG_TYPE_UPDATE_VALUE = "GAME_CONFIG_TYPE_UPDATE";
            public static final String GAME_CONFIG_TYPE_DELETE_VALUE = "GAME_CONFIG_TYPE_DELETE";
            public static final String GAME_CONFIG_TYPE_CREATE_DESCRIPTION = "action.game.config.create";
            public static final String GAME_CONFIG_TYPE_DELETE_DESCRIPTION = "action.game.config.delete";
            public static final String GAME_CONFIG_TYPE_UPDATE_DESCRIPTION = "action.game.config.update";

            //Ghi log cho chuc nang nhom  nguoi dung
            public static final String GROUP_TABLE = "group";
            public static final String GROUP_TYPE_CREATE = "GROUP_TYPE_CREATE";
            public static final String GROUP_TYPE_UPDATE = "GROUP_TYPE_UPDATE";
            public static final String GROUP_TYPE_DELETE = "GROUP_TYPE_DELETE";
            public static final String GROUP_TYPE_CREATE_DESCRIPTION = "action.group.create";
            public static final String GROUP_TYPE_UPDATE_DESCRIPTION = "action.group.update";
            public static final String GROUP_TYPE_DELETE_DESCRIPTION = "action.group.delete";

            //Ghi log cho chức năng tạo mới user và super_user
            public static final String USERS_TABLE = "users";
            public static final String USERS_TYPE_CREATE = "USERS_TYPE_CREATE_AGENT";
            public static final String USERS_TYPE_UPDATE_INFO = "USERS_TYPE_UPDATE_INFO";
            public static final String USERS_TYPE_UPDATE_INFO_DESCRIPTION = "USERS_TYPE_UPDATE_INFO_DESCRIPTION";
            public static final String USERS_TYPE_UPDATE_TRANS_LIMIT = "USERS_TYPE_UPDATE_TRANS_LIMIT";
            public static final String USERS_TYPE_UPDATE_TRANS_LIMIT_DESCRIPTION = "USERS_TYPE_UPDATE_TRANS_LIMIT_DESCRIPTION";
            public static final String USERS_TYPE_RESET_PW = "USERS_TYPE_RESET_PW";
            public static final String USERS_TYPE_RESET_PW_DESCRIPTION = "USERS_TYPE_RESET_PW_DESCRIPTION";
            public static final String USERS_TYPE_RESET_SECURITY_CODE = "USERS_TYPE_RESET_SECURITY_CODE";
            public static final String USERS_TYPE_RESET_SECURITY_CODE_DESCRIPTION = "USERS_TYPE_RESET_SECURITY_CODE_DESCRIPTION";
            public static final String USERS_TYPE_CHANGE_PW = "USERS_TYPE_CHANGE_PW";
            public static final String USERS_TYPE_LOCK_ACCOUNT = "USERS_TYPE_LOCK_ACCOUNT";
            public static final String USERS_TYPE_CREATE_PLAYER = "USERS_TYPE_CREATE_MEMBER";
            public static final String USERS_TYPE_CHANGE_STATUS = "USERS_TYPE_CHANGE_STATUS";
            public static final String USERS_TYPE_CHANGE_STATUS_DESCRIPTION = "USERS_TYPE_CHANGE_STATUS_DESCRIPTION";
            public static final String USERS_TYPE_CREATE_DESCRIPTION = "USERS_TYPE_CREATE_DESCRIPTION";
            public static final String USERS_TYPE_CREATE_PLAYER_DESCRIPTION = "USERS_TYPE_CREATE_PLAYER_DESCRIPTION";
            public static final String USERS_TYPE_UPDATE_DESCRIPTION = "USERS_TYPE_UPDATE";
            public static final String USERS_TYPE_CHANGE_PW_DESCRIPTION = "USERS_TYPE_CHANGE_PW";
            public static final String USERS_TYPE_LOCK_ACCOUNT_DESCRIPTION = "USERS_TYPE_LOCK_ACCOUNT";
            public static final String SUPER_USER_TABLE = "super_user";
            public static final String SUPER_USER_TYPE_CREATE = "SUPER_USER_TYPE_CREATE";
            public static final String SUPER_USER_TYPE_UPDATE = "SUPER_USER_TYPE_UPDATE";
            public static final String SUPER_USER_TYPE_LOCK_ACCOUNT = "SUPER_USER_TYPE_LOCK_ACCOUNT";
            public static final String SUPER_USER_TYPE_CREATE_DESCRIPTION = "SUPER_USER_TYPE_CREATE";
            public static final String SUPER_USER_TYPE_UPDATE_DESCRIPTION = "SUPER_USER_TYPE_UPDATE";
            public static final String SUPER_USER_TYPE_LOCK_ACCOUNT_DESCRIPTION = "SUPER_USER_TYPE_LOCK_ACCOUNT";

            // ghi log cap nhat nickname
            public static final String USERS_TYPE_UPDATE_NICKNAME = "USERS_TYPE_UPDATE_NICKNAME";
            public static final String USERS_TYPE_UPDATE_NICKNAME_DESCRIPTION = "action.update.nickname";
        }




        public static final class DATE_FORMAT {
            public static final String YYYYMMDD = "yyyy-MM-dd";
            public static final String DDMMYYYY = "dd/MM/yyyy";
            public static final String DDMMYYYYHHMMSS = " dd/MM/yyyy HH:mm:ss";
            public static final String MYSQL_DATE_FORMAT_SQL_YMD = "%Y-%m-%d %H:%i:%s";
            public static final String MYSQL_DATE_FORMAT_SQL_DMY = "%d-%m-%Y %H:%i:%s";
        }

        public static final class REGEX {
            public static final String CODE = "[0-9a-zA-Z_-]+";
            public static final String NUMBER = "(^[0-9]+$|^$)";
        }


        public static final class PERSISTENT_UNIT {
            public static final String QLNS_ADMIN = "QLNS_ADMIN";
            public static final String QLNS_REPORT = "QLNS_REPORT";
        }

        public static final class HAZELCAST_SERVER {
            public static final String YYYYMMDD = "yyyy-MM-dd";
            public static final String DDMMYYYY = "dd/MM/yyyy";
            public static final String MYSQL_DATE_FORMAT_SQL = "%Y-%m-%d %H:%i:%s";
        }

        public static final class MONGODB_SERVER {
            public static final String YYYYMMDD = "yyyy-MM-dd";
            public static final String DDMMYYYY = "dd/MM/yyyy";
            public static final String MYSQL_DATE_FORMAT_SQL = "%Y-%m-%d %H:%i:%s";
        }

        public static final class RABIMQ_SERVER {
            public static final String YYYYMMDD = "yyyy-MM-dd";
            public static final String DDMMYYYY = "dd/MM/yyyy";
            public static final String MYSQL_DATE_FORMAT_SQL = "%Y-%m-%d %H:%i:%s";
        }




}
