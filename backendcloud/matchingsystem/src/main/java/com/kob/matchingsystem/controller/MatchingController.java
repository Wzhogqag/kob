package com.kob.matchingsystem.controller;

import com.kob.matchingsystem.service.MatchingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * 功能：
 * 作者： 程序员魏sir
 * 日期： 2025/5/16 19:12
 **/
@RestController
public class MatchingController {
    @Autowired
    private MatchingService matchingService;

    @PostMapping ("/player/add/")
    public String addPlayer(@RequestParam MultiValueMap<String,String>data){
        Integer userId = Integer.parseInt(Objects.requireNonNull(data.getFirst("user_id")));
        Integer rating = Integer.parseInt(Objects.requireNonNull(data.getFirst("rating")));
        Integer botId = Integer.parseInt(Objects.requireNonNull(data.getFirst("bot_id")));
        return matchingService.addPlayer(userId,rating,botId);
    }

    @PostMapping ("/player/remove/")
    public String removePlayer(@RequestParam MultiValueMap<String,String>data){
        Integer userId = Integer.parseInt(Objects.requireNonNull(data.getFirst("user_id")));
        return matchingService.removePlayer(userId);
    }

}
