package plus.mozi.web.exception;

import lombok.Getter;

/**
 * Created by chenjiacheng on 2024/4/18 23:05
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Getter
public enum MoziBizCodeEnum {

    // code biz_code msg [200,000000,Ok] [500,000001,Error]
    // biz_code: 系统00 模块00 错误码00
    SUCCESS("000000","Success"),
    FAIL("000001","Fail"),
    SYSTEM_ERROR("000002","System error."),
    ;
    private String code;
    private String msg;

    MoziBizCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
