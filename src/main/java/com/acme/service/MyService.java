package com.acme.service;

import com.acme.model.Car;
import com.googlecode.objectify.ObjectifyService;
import org.springframework.stereotype.Service;

/**
 * Created by mmonti on 8/9/16.
 */
@Service
public class MyService {

    public String callMe() {
        return "from service: cars..." + String.valueOf(ObjectifyService.ofy().load().type(Car.class).count());
    }
}
