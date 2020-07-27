package org.big.zoology.protection.service;

import com.alibaba.fastjson.JSON;

/**
 * <p><b>RedlistService</b></p>
 * <p> </p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfo Group) - 中国科学院动物研究所生物多样性信息学研究组</p>
 *
 * @Author NY
 * @Date: 2020/4/17 14:39
 * @Version V1.0
 * @since JDK 1.8.0_162
 */
public interface RedlistService {

    /**
     * <p><b>红色名录数据库回显<b><p>
     * <p>红色名录<p>
     *
     * @Author: Ny
     * @date 2020/4/20
     */
    JSON redlistList(String search, String sort, String order, String limit, String offset, String type);
}
