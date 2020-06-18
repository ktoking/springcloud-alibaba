package com.atguigu.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException e){
        return new CommonResult(  444, "按客户自定义,global handlerException-------1 ");
    }

    public static CommonResult handlerException2(BlockException e){
        return new CommonResult(  444, "按客户自定义,global handlerException-------2 ");
    }
}
