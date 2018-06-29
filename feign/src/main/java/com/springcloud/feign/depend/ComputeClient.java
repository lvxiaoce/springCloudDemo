package com.springcloud.feign.depend;

import com.alibaba.fastjson.JSONObject;
import com.springcloud.feign.bean.UserBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName:ComputeClient</br>
 * Function: ComputeClient，实现类</br>
 *
 * @author ce.lv</br>
 * @version 1.0</br>
 * @Date 2018/6/29 13:51</br>
 */
@FeignClient("compute-service")
public interface ComputeClient {

    @RequestMapping(method = RequestMethod.POST, value = "/add")
//    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b,@RequestBody JSONObject jsonObject);
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b,@RequestBody UserBean userBean);
}