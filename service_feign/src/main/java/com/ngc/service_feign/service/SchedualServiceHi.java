package com.ngc.service_feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @FeignClient 注解中添加fallback指定熔断后调用的类
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystrix.class)
public interface SchedualServiceHi {

    @RequestMapping("/hi")
    String sayHiFromClientOne(String name);
}
