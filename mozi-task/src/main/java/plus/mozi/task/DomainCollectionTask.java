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
public class DomainCollectionTask {

    @Scheduled(cron = "0 0/1 * * * ?")
    public void process() {
        log.info("Task init before.");

        log.info("Task init after.");
    }

}
