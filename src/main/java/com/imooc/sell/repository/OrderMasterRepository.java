package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {

    //查询单个订单
    @Query("select a from OrderMaster a where 1=1 and orderId =:orderId")
    OrderMaster getOrderMaster(@Param("orderId") String orderId);

    //通过微信openid进行查找数据
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
