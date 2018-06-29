package com.springcloud.commonservice.controller;

import com.alibaba.fastjson.JSONObject;
import com.springcloud.commonservice.bean.UserBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName:ServiceInstanceRestController</br>
 * Function: ServiceInstanceRestController，实现类</br>
 *
 * @author ce.lv</br>
 * @version 1.0</br>
 * @Date 2018/6/29 11:30</br>
 */
@RestController
public class ServiceInstanceRestController {

    private static final Logger logger = LoggerFactory.getLogger(ServiceInstanceRestController.class);

    @Value("${server.port}")
    String serverPort;

    @Autowired
    private DiscoveryClient discoveryClient; //服务发现客户端

    @PostMapping(value = "/add")
//    public Integer add(@RequestParam Integer a, @RequestParam Integer b,@RequestBody JSONObject jsonObject) {
    public Integer add(@RequestParam Integer a, @RequestParam Integer b,@RequestBody UserBean userBean) {
//        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        Integer r = a + b;
//        logger.info("/add, host:" + serverPort + ", result:" + r+", jsonObject:" + jsonObject.toString()+");
        logger.info("/add, host:" + serverPort + ", result:" + r+", userBean:" + userBean.toString());
        return r;
    }
}