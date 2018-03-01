package com.cy;

import com.cy.dao.TaskDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zxj
 * @date 2018/3/1 9:58
 */
@Controller
public class SampleController {

    @Autowired
    private TaskDAO taskDAO;

    @RequestMapping("a")
    @ResponseBody
    public String home() {
        return taskDAO.getNum(1L);
    }

    @RequestMapping("b")
    @ResponseBody
    public Map<String, String> b() {
        Map<String, String> map = new HashMap<String, String>(2);
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

    @RequestMapping("ftl")
    public String ftl() {
        return "ftl";
    }

}
