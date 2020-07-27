package org.big.zoology.protection.common;

import lombok.Data;

import java.util.List;

/**
 * @ClassName PageResult
 * @Description: TODO
 * @Author NY
 * @Date: 2019/11/5 10:34
 * @return
 * @Version V1.0
 */
@Data
public class PageResult<T> {
    // 总条数
    private Long total;

    // 当前页起始条数
    private Integer thisPage;

    // 当前页数据
    private List<T> items;

    public PageResult() {
    }

    public PageResult(Long total, Integer thisPage, List<T> items) {
        this.total = total;
        this.thisPage = thisPage;
        this.items = items;
    }
}
