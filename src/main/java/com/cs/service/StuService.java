package com.cs.service;

import com.alibaba.dubbo.config.annotation.Reference;

import java.util.List;

/**
 * Created by lorne on 2019/5/21.
 */
public interface StuService {

    List stulist();
}
