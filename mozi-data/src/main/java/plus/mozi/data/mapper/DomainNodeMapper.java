package plus.mozi.data.mapper;

import plus.mozi.data.model.DomainNode;

import java.util.List;

/**
 * Created by chenjiacheng on 2024/4/21 19:19
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public interface DomainNodeMapper {

    Integer insert(DomainNode domainNode);

    List<DomainNode> findAll();

}
