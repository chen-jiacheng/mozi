package plus.mozi.web.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.http.HttpStatus;
import plus.mozi.web.exception.MoziBizCodeEnum;
import plus.mozi.web.exception.MoziBizException;

import java.io.Serializable;

/**
 * Created by chenjiacheng on 2024/4/18 23:02
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Data
public class Result<T> implements Serializable {
    @JsonIgnore
    private int httpCode;
    private String code;
    private String msg;
    private T data;

    public Result(int httpCode,String code, String msg, T data) {
        this.httpCode = httpCode;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Result<T> ofSuccess(T data) {
        return new Result<>(
                HttpStatus.OK.value(),
                MoziBizCodeEnum.SUCCESS.getCode(),
                MoziBizCodeEnum.SUCCESS.getMsg(),
                data
        );
    }

    public static <T> Result<T> ofFail(MoziBizException e) {
        return new Result<>(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                e.getCode(), e.getMsg(), null);
    }

    public static <T> Result<T> ofFail(String code,String  msg) {
        return new Result<>(HttpStatus.INTERNAL_SERVER_ERROR.value(),code, msg, null);
    }


}
