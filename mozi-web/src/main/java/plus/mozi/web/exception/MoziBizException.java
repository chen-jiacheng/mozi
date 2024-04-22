package plus.mozi.web.exception;

import lombok.Getter;

/**
 * Created by chenjiacheng on 2024/4/18 23:04
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Getter
public class MoziBizException extends RuntimeException{

    private String code;
    private String msg;

    public MoziBizException(String code, String msg) {
        super("[code:"+code+",msg:"+msg+"]");
        this.code = code;
        this.msg = msg;
    }

    public MoziBizException(MoziBizCodeEnum bizCodeEnum) {
        this(bizCodeEnum.getCode(),bizCodeEnum.getMsg());
    }

}
