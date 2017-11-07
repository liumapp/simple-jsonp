package com.liumapp.controller;

import com.liumapp.config.StatusCode;
import com.liumapp.msg.RespInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSON;

/**
 * jsonp-controller
 * return jsonp msg
 * Created by liumapp on 9/28/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public String index () {

        RespInfo respInfo = new RespInfo();
        respInfo.setStatus(StatusCode.SUCCESS_CODE);
        respInfo.setMessage("hello jsonp");
        respInfo.setContent("hello world");

        return "callback(" + JSON.toJSONString(respInfo) +  ")";

    }

}
