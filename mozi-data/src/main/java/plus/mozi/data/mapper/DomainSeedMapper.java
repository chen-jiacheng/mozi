package plus.mozi.data.mapper;

import plus.mozi.data.model.DomainNodeDO;

import java.util.List;

/**
 * Created by chenjiacheng on 2024/4/21 19:19
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public interface DomainSeedMapper {

    List<DomainNodeDO> findAll();

}
