package plus.mozi.web.advise;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import plus.mozi.web.exception.MoziBizCodeEnum;
import plus.mozi.web.exception.MoziBizException;
import plus.mozi.web.model.Result;

/**
 * Created by chenjiacheng on 2024/4/18 23:25
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Slf4j
@RestControllerAdvice
public class MoziExceptionHandler {

    @ExceptionHandler(value = MoziBizException.class)
    public Result<?> moziBizExceptionProcess(MoziBizException e){
        log.error("业务异常处理:",e);
        return Result.ofFail(e);
    }

    @ExceptionHandler(value = Exception.class)
    public Result<?> exceptionProcess(Exception e){
        log.error("未知异常处理:",e);
        return Result.ofFail(MoziBizCodeEnum.SYSTEM_ERROR.getCode(),e.getMessage());
    }

}
