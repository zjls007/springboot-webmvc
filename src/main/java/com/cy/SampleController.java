package com.cy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zxj on 2018/2/27.
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("a")
    @ResponseBody
    public String home() {
        return "郑先建!";
    }

    @RequestMapping("b")
    @ResponseBody
    public Map<String, String> b() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "a");
        map.put("b", "b");
        return map;
    }

    @RequestMapping("c")
    @ResponseBody
    public String c(String c) {
        System.out.println(c);
        return c;
    }

    @RequestMapping("index")
    public String index() {
        return "index";
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }

}
