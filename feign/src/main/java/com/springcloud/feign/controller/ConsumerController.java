package com.springcloud.feign.controller;

import com.alibaba.fastjson.JSONObject;
import com.springcloud.feign.bean.UserBean;
import com.springcloud.feign.depend.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:ConsumerController</br>
 * Function: ConsumerController，实现类</br>
 *
 * @author ce.lv</br>
 * @version 1.0</br>
 * @Date 2018/6/29 14:01</br>
 */
@RestController
public class ConsumerController {

    @Autowired
    private ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Integer add(Long userId) {
        System.out.println(userId);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("aaa",111);
        jsonObject.put("bbb","helloWorld");
        UserBean userBean = new UserBean();
        userBean.setName("张三");
        userBean.setAge(22);
        userBean.setSex("男");
//        return computeClient.add(10, 20,jsonObject);
        return computeClient.add(10, 20,userBean);
    }
}
