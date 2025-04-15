package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能：
 * 作者： 程序员魏sir
 * 日期： 2025/4/15 16:21
 **/
@RestController
@RequestMapping("/pk/")
public class IndexController {

    @RequestMapping("getbotinfo/")
    public Map<String,String> getbotinfo() {
        Map<String,String>bot1 = new HashMap<>();
        bot1.put("name","tiger");
        bot1.put("rating","1500");

        return bot1;
    }
}
