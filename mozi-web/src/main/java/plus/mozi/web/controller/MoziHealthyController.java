package plus.mozi.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import plus.mozi.web.model.Result;

/**
 * Created by chenjiacheng on 2024/4/18 23:01
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@RequestMapping("/mozi")
@RestController
public class MoziHealthyController {

    @RequestMapping(method = RequestMethod.GET,path = "/healthy")
    public Result<String> healthy(){
        return Result.ofSuccess("I'm ok.");
    }

    @RequestMapping(method = RequestMethod.GET,path = "/exception")
    public Result<String> exception(){
        if(true){
            throw new IllegalArgumentException("xxx can't be null.");
        }
        // 实现方式一: 切面
        // 实现方式二: 拦截器
        return Result.ofSuccess("I'm ok.");
    }

}
