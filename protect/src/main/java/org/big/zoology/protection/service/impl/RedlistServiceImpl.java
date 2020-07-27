package org.big.zoology.protection.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.big.zoology.protection.common.QueryTool;
import org.big.zoology.protection.entity.Redlist;
import org.big.zoology.protection.repository.RedlistMapper;
import org.big.zoology.protection.service.RedlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p><b>RedlistServiceImpl</b></p>
 * <p> </p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfo Group) - 中国科学院动物研究所生物多样性信息学研究组</p>
 *
 * @Author NY
 * @Date: 2020/7/27 10:46
 * @Version V1.0
 * @since JDK 1.8.0_162
 */
@Service
public class RedlistServiceImpl implements RedlistService {

    @Autowired
    private RedlistMapper redlistMapper;

    @Override
    public JSON redlistList(String search, String sort, String order, String limit, String offset, String type) {
        JSON json = null;
        String searchText = search;
        if (searchText == null || searchText.length() <= 0) {
            searchText = "";
        }
        int limit_serch = Integer.parseInt(limit);
        int offset_serch = Integer.parseInt(offset);
        if (sort == null || sort.length() <= 0) {
            sort = "id";
        }
        if (order == null || order.length() <= 0) {
            order = "asc";
        }
        JSONObject thisTable = new JSONObject();
        JSONArray rows = new JSONArray();
        List<Redlist> thisList = new ArrayList<>();
        Page<Redlist> thisPage = null;
        if (type == null || type.length() <= 0) {
            thisPage = redlistMapper.findRedlist(searchText, QueryTool.buildPageRequest(offset_serch, limit_serch, sort, order));
        } else {
            thisPage = redlistMapper.findRedlistByType(searchText, type, QueryTool.buildPageRequest(offset_serch, limit_serch, sort, order));
        }
        thisTable.put("total", thisPage.getTotalElements());
        thisList = thisPage.getContent();
        String name = "";
        for (int i = 0; i < thisList.size(); i++) {
            JSONObject row = new JSONObject();
            name = "<i>" + thisList.get(i).getScientificname() + "</i>";
            row.put("chname", thisList.get(i).getChname());
            row.put("scientificname", name);
            row.put("familyC", thisList.get(i).getFamilyC());
            row.put("family", thisList.get(i).getFamily());
            row.put("status", thisList.get(i).getStatus());
            row.put("assess", thisList.get(i).getAssess());
            row.put("endemic", thisList.get(i).getEndemic());
            row.put("type", thisList.get(i).getType());
            rows.add(i, row);
        }
        thisTable.put("rows", rows);
        json = thisTable;
        return json;
    }
}
