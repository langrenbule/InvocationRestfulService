package com.example.controller;

import com.example.entity.Response;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project: Invocation
 * Author: Sendya <18x@loacg.com>
 * Time: 8/18/2016 11:11 AM
 */
@RestController
@RequestMapping("/api")
public class TestController {

    @RequestMapping(value = "/time")
    public @ResponseBody Response nowTime() {
        long time = System.currentTimeMillis()/1000;
        return Response.build().setStatus(time + "", 0);
    }

    @RequestMapping(value = "/shit/{text}")
    public Response Shit(@PathVariable("text") String str, String type) {
        Response response = Response.build();
        response.setMessage(str);
        if (StringUtils.isEmpty(type)) {
            response.setStatus(-1);
        } else {
            response.setStatus(0);
        }
        return response;
    }
}
