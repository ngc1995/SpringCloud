package com.ngc.service_feign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi{


    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
