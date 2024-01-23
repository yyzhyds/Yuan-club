package com.zhy.wx.handler;

import java.util.Map;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 22/1/2024 下午3:39
 */

public interface WxChatMsgHandler {
    WxChatMsgTypeEnum getMsgType();
    String dealMsg(Map<String, String> messageMap);
}