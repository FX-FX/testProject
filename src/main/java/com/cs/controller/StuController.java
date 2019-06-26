package com.cs.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cs.service.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by lorne on 2019/5/21.
 */
@Controller
public class StuController {

    @Reference
    private StuService service;

    @RequestMapping("list")
    public List stulist(){
        List list = service.stulist();
        return list;
    }



}
