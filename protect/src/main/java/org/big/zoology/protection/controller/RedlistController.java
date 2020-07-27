package org.big.zoology.protection.controller;

import com.alibaba.fastjson.JSON;
import org.big.zoology.protection.service.RedlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p><b>RedlistController</b></p>
 * <p> </p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfo Group) - 中国科学院动物研究所生物多样性信息学研究组</p>
 *
 * @Author NY
 * @Date: 2020/7/27 10:57
 * @Version V1.0
 * @since JDK 1.8.0_162
 */
@RestController
@RequestMapping("/redlist")
public class RedlistController {

    @Autowired
    private RedlistService redlistService;

    @GetMapping("/list")
    public JSON redlistList(@RequestParam("search") String search, @RequestParam("sort") String sort,
                            @RequestParam("order") String order, @RequestParam("limit") String limit,
                            @RequestParam("offset") String offset, @RequestParam("type") String type) {
        JSON json = redlistService.redlistList(search, sort, order, limit, offset, type);
        return json;
    }
}
