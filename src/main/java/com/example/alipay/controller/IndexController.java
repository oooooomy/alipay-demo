package com.example.alipay.controller;

import com.example.alipay.service.PayService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Controller
public class IndexController {

    @Resource
    private PayService payService;

    @GetMapping("/pay")
    public String pay(Model model){
        model.addAttribute("form", payService.pay());
        return "pay";
    }

    @GetMapping("/notify")
    public String payNotify(){
        return "index";
    }

    @GetMapping("/return")
    public String payReturn(){
        return "index";
    }

}
