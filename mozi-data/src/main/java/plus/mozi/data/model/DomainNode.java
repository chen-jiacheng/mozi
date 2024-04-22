package plus.mozi.data.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by chenjiacheng on 2024/4/21 19:18
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Data
public class DomainNode {
    private Long id;
    private String domainName;
    private String domainDesc;
    private Date createdAt;
    private Date updatedAt;
    private Integer domainType;
    private Integer domainStatus;

}
