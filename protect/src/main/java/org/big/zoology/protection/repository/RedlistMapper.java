package org.big.zoology.protection.repository;

import org.big.zoology.protection.entity.Redlist;
import org.big.zoology.protection.repository.base.BaseMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

/**
 * <p><b>RedlistMapper</b></p>
 * <p> </p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfo Group) - 中国科学院动物研究所生物多样性信息学研究组</p>
 *
 * @Author NY
 * @Date: 2020/7/27 10:26
 * @Version V1.0
 * @since JDK 1.8.0_162
 */
public interface RedlistMapper extends BaseMapper<Redlist, String> {

    @Query(value = "select r from Redlist r where r.scientificname like %?1% or "
            + "r.chname like %?1%")
    Page<Redlist> findRedlist(String searchText, Pageable pageable);

    @Query(value = "select r from Redlist r where ( r.scientificname like  %?1% or r.chname like %?1%) and r.type = ?2")
    Page<Redlist> findRedlistByType(String searchText, String type, Pageable pageable);
}
