package org.big.zoology.protection.common;

/**
 * <p><b>BaseResultsEnum</b></p>
 * <p> </p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfo Group) - 中国科学院动物研究所生物多样性信息学研究组</p>
 *
 * @Author NY
 * @Date: 2020/5/27 9:25
 * @Version V1.0
 * @since JDK 1.8.0_162
 */

public enum BaseResultsEnum {

    /**/
    SUCCESS(200, "OK"),
    Save_success(201, "保存成功"),
    BAD_REQUEST(400, "错误请求"),
    Api_error(401, "API密钥错误"),
    Api_num_error(402, "API请求次数达到上限"),
    FORBID_REQUEST(403, "禁止请求"),
    NOT_FOUND(404, "未找到文件"),
    Request_Too_Large(413, "请求的实体过大"),
    UNKNOWN_ERROR(500, "未知错误"),
    dbase_error(1100, "暂无数据源信息"),
    taxon_error(1500, "没有此物种"),
    des_type_error(1501, "暂无描述类型"),
    des_info_error(1502, "暂无描述信息");


    private Integer code;
    private String message;

    BaseResultsEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}

