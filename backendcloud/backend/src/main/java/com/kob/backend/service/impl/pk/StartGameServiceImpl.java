package com.kob.backend.service.impl.pk;

import com.kob.backend.consumer.WebSocketServer;
import com.kob.backend.service.pk.StartGameService;
import org.springframework.stereotype.Service;

/**
 * 功能：
 * 作者： 程序员魏sir
 * 日期： 2025/5/16 21:31
 **/

@Service
public class StartGameServiceImpl implements StartGameService {
    @Override
    public String startGame(Integer aId, Integer aBotId, Integer bId, Integer bBotId) {
        System.out.println("start game:"+aId+" "+bId);
        WebSocketServer.startGame(aId,aBotId,bId,bBotId);
        return "start game success";
    }
}
