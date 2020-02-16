package com.mycomp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    // ".action"可以省略不写
    @RequestMapping("/first.action")
    public ModelAndView show1() {
        ModelAndView modelAndView = new ModelAndView();

        // 请求过来后, 跳转到另一个界面, 往另一个界面中传一些数据
        modelAndView.addObject("name", "zzq");

        // 设置跳转的视图
        // 这里, 需要到springmvc.xml配置视图解析器(配置前缀和后缀)
        // 这是请求转发
        modelAndView.setViewName("result1");

        return modelAndView;
    }

    /*
     * 如果不需要设置数据, 只需要转发, 则可以直接返回一个String, 就像Struts2
     */
    @RequestMapping("second.action")
    public String show2() {
        // 这也是请求转发
        return "result1";
    }

    /*
     * 重定向:
     * 不论是用ModelAndView的setViewName()设置视图并返回, 还是直接返回一个字符串,
     * 只需要在前面加上"redirect: ", 就是重定向;
     */
    @RequestMapping("third.action")
    public String show3() {
        // 这是重定向
        return "redirect: /results/result1.jsp";
    }
}
