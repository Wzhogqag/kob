package com.kob.matchingsystem;

import com.kob.matchingsystem.service.MatchingService;
import com.kob.matchingsystem.service.impl.MatchingServiceImpl;
import com.kob.matchingsystem.service.impl.utils.MatchingPool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 功能：
 * 作者： 程序员魏sir
 * 日期： 2025/5/16 19:06
 **/
@SpringBootApplication
public class MatchingSystemApplication {
    public static void main(String[] args){
        MatchingServiceImpl.matchingPool.start(); //启动匹配线程
        SpringApplication.run(MatchingSystemApplication.class,args);
    }
}
