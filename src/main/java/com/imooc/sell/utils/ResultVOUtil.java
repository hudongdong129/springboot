package com.imooc.sell.utils;

import com.imooc.sell.VO.ResultVO;

/**
 * 返回给前端的json
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("返回成功");
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO success() {
        return null;
    }

}
