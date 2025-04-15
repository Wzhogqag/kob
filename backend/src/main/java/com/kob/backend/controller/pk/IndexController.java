package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能：
 * 作者： 程序员魏sir
 * 日期： 2025/4/15 16:21
 **/
@Controller
@RequestMapping("/pk/")
public class IndexController {

    @RequestMapping("index/")
    public String index()
    {
        return "pk/index";
    }
}
