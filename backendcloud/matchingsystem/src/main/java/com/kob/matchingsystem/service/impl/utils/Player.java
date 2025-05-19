package com.kob.matchingsystem.service.impl.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能：
 * 作者： 程序员魏sir
 * 日期： 2025/5/16 21:00
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private Integer userId;
    private Integer rating;
    private Integer botId;
    private Integer waitingTime;
}
