package com.acme.service;

import org.springframework.stereotype.Service;

/**
 * Created by mmonti on 8/9/16.
 */
@Service
public class MyService {

    public String callMe() {
        return "from service....";
    }
}
