package org.big.zoology.protection.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @ClassName BaseMapper
 * @Description: TODO
 * @Author NY
 * @Date: 2019/10/18 16:24
 * @return
 * @Version V1.0
 */
@NoRepositoryBean
public interface BaseMapper<T, ID extends Serializable> extends JpaRepository<T, ID> {
}
