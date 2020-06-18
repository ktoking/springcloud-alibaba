package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.handler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimitController {

    @GetMapping("/byResource" )
    @SentinelResource(value = "byResource" , blockHandler = "handleException")
    public CommonResult byResource(){
        return new CommonResult(  200,  "按资源名称限流测试oK" ,new Payment(  2020L, "serial001"));
    }
    public CommonResult handleException(BlockException exception){
        return new CommonResult(  444,  exception.getClass().getCanonicalName()+"\t  服务不可用");
    }

    @GetMapping("/rateLimit/byUrl" )
    @SentinelResource(value = "byUr1")
    public CommonResult byUrl(){
        return new CommonResult(  200, "按ur1限流测试oK",new Payment( 2020L,  "seria1002"));
    }

    @GetMapping("/rateLimit/customerBlockHandler" )
    @SentinelResource(value = "customerBlockHandler",
                      blockHandlerClass = CustomerBlockHandler.class,blockHandler="handlerException2")
    public CommonResult customerBlockHandler(){
        return new CommonResult(  200, "按客户自定义",new Payment( 2020L,  "seria1003"));
    }
}



