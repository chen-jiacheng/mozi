package plus.mozi.data.model;

import lombok.Data;

import java.util.Date;

/**
 * 域名种子表DO
 * Created by chenjiacheng on 2024/4/21 19:19
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Data
public class DomainSeedDO {
    /**
     * 节点ID
     */
    private Long id;
    /**
     * 域名
     */
    private String domainName;
    /**
     * 域名描述
     */
    private String domainDesc;
    /**
     * 域名类型:1.种子类型 2.普通类型
     */
    private Integer domainType;
    /**
     * 域名状态:0.正常 1.网络不可达
     */
    private Integer domainStatus;
    /**
     * 处理状态:0.初始化 1.受理 2.处理中 3.处理成功 4.处理失败
     */
    private Integer processStatus;
    /**
     * 创建时间
     */
    private Date createdAt;
    /**
     * 更新时间
     */
    private Date updatedAt;
}
