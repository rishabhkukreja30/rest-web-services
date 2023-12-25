package com.example.webservices.restwebservices.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping(path = "/filtering")
    public SomeBean getSomeBean() {
        return new SomeBean("value1", "value2", "value3");
    }

    @GetMapping(path = "/filtering-list")
    public List<SomeBean> getAllSomeBean() {
        return Arrays.asList(new SomeBean("value1", "value2", "value3"),
                new SomeBean("value4", "value5", "value6"));
    }

}