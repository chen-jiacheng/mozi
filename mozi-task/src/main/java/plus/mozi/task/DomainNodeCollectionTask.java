package plus.mozi.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by chenjiacheng on 2024/4/21 22:49
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Slf4j
@Component
public class DomainNodeCollectionTask {

    @Scheduled(cron = "0 0/1 * * * ?")
    public void process() {
        log.info("Task init before.");
        //时间范围: 不限 条数100条
        //1. 查询域名节点表 -> 放入队列中,队列满，则本次不处理，否则添加到队列中
        //2. 循环处理
        //2.1 校验域名状态
        //2.2 解析
        //2.3 存入数据库
        //2.4 修改状态，若是种子域名，状态也修改
        //3. 循环处理结束

        log.info("Task init after.");
    }

}
