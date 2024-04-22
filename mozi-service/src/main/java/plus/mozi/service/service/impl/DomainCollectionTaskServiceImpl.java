package plus.mozi.service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plus.mozi.data.mapper.DomainNodeMapper;
import plus.mozi.service.service.DomainCollectionTaskService;
import plus.mozi.spider.core.MoziSpiderHandler;

/**
 * Created by chenjiacheng on 2024/4/22 00:47
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Service
public class DomainCollectionTaskServiceImpl implements DomainCollectionTaskService {

    @Autowired
    private DomainNodeMapper domainNodeMapper;

    @Autowired
    private MoziSpiderHandler moziSpiderHandler;

    @Override
    public void process() {
        //1. 查询种子库
        // 进度ID

        //2. 解析

        //3. 结束

        // 种子表 解析状态:0初始化 1受理 2处理中 3处理成功 4处理失败 节点ID 错误描述
        //种子表 -> 节点表 任务开始前:初始化，移动成功受理，开始解析，解析完毕处理成功
        // 节点表:
        // 节点表 解析状态:0初始化 1受理 2处理中 3处理完成 4处理失败  //处理中状态: 程序中断导致则重新处理，对已存在的数据进行修正
        // 域名类型: 种子、节点，

        // 种子表完成更新种子表、节点表、关系表，
        // 节点表完成更新节点表、关系表
        // 关系表

    }
}
