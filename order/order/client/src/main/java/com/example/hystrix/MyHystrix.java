package com.example.hystrix;

import com.example.pojo.Logistics;
import com.example.pojo.Order;
import com.example.service.HystrixService;
import com.example.service.UserFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Component;

//使用了Hystrix熔断器的Java类。它实现了UserFeignClient，该接口定义了一些方法用于处理订单和物流相关的操作。

import java.util.Map;

@Component
public class MyHystrix implements UserFeignClient {

    @Override
    public String add(Order order) {
        return "添加出错(熔断)";
    }

    @Override
    public String update(Logistics logistics) {
        return "更新出错(熔断)";
    }

    @Override
    public Order select(String id) {
        System.out.println("查询出错(熔断)");
        return null;
    }

    @Override
    public Map<String, Object> selectList() {
        System.out.println("查询所有出错(熔断)");
        return null;
    }

    @Override
    public String delete(String id) {
        return "删除出错(熔断)";
    }

    public Map<String, Object> MyHystrix() {
        System.out.println("查询所有出错(熔断)");
        return null;
    }

}
