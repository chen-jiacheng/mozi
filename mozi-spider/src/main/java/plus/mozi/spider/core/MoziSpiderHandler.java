package plus.mozi.spider.core;

import java.io.IOException;
import java.util.List;

/**
 * Created by chenjiacheng on 2024/4/21 23:01
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public interface MoziSpiderHandler {

    List<String> process(String domain) throws IOException;

}
