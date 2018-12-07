package com.ngc.service_feign.service;

public class SchedualServiceHiHystrix implements SchedualServiceHi{


    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
