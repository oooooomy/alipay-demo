package com.example.alipay.controller;

import com.example.alipay.service.PayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class PayController {

    @Resource
    private PayService payService;

    @GetMapping("/pay")
    public String pay(String value){
        return payService.pay();
    }

}
