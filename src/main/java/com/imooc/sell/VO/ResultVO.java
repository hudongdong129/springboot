package com.imooc.sell.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 */
@Data
public class ResultVO<T> {

    /** 错误码 */
    private Integer code;

    /** 说明 */
    private String msg;

    /** 内部对象 */
    private T data;


}
