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
public class DomainSeedCollectionTask {

    @Scheduled(cron = "0 0/1 * * * ?")
    public void process() {
        log.info("Task init before.");
        //时间范围: 7day
        //1. 查询种子表7天内的数据
        //2. 循环将种子表数据，受理状态-存入域节点表
        //3. 修改种子表状态
        log.info("Task init after.");
    }

}
