package com.stylefeng.guns.order;

import com.baomidou.mybatisplus.plugins.Page;
import com.stylefeng.guns.order.vo.OrderVO;

import java.util.List;

public interface OrderAPI {

    //验证售出的票是否为真
    boolean isTrueSeats(String fieldId,String seats);

    //已经销售的座位里，有没有这些座位
    boolean isNotSoldSeats(String fieldId,String seats);

    //创建订单信息
    OrderVO saveOrderInfo(Integer fieldId,String soldSeats,String seatsName,Integer userId);

    //使用当前登陆人获取已经购买的订单
    Page<OrderVO> getOrderByUserId(Integer userId, Page<OrderVO> page);

    //根据fieldId 获取所有已经销售的座位编号
    String getSoldSeatsByFieldId(Integer fieldId);

}