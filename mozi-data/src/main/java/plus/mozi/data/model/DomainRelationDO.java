package plus.mozi.data.model;

import lombok.Data;

import java.util.Date;

/**
 * 域名关系表DO
 * Created by chenjiacheng on 2024/4/21 19:18
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Data
public class DomainRelationDO {

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 源节点ID
     */
    private Long sid;
    /**
     * 目标节点ID
     */
    private Long tid;
    /**
     * 关系类型: 0.内链 1.外链
     */
    private Integer relationType;
    /**
     * 创建时间
     */
    private Date createdAt;
    /**
     * 更新时间
     */
    private Date updatedAt;

}
