package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * 功能：
 * 作者： 程序员魏sir
 * 日期： 2025/4/22 19:55
 **/

public interface LoginService {
    Map<String,String> getToken(String username,String password);

}
