package com.ngc.service_feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-hi")
public interface SchedualServiceHi {

    @RequestMapping("/hi")
    String sayHiFromClientOne(String name);
}
