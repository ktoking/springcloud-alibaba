package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService{
    @Override
    public String paymentInfoOK(Integer id) {
        return "PaymentHystrixServiceImpl的OK的单独异常处理类";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "PaymentHystrixServiceImpl的timeout的单独异常处理类";
    }
}
