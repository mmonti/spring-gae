package com.acme.controller;

import com.acme.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MyController {

    @Autowired
    private MyService myService;

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/nest", method = RequestMethod.GET)
    public HttpEntity entity(@RequestParam(value = "param", required = false) String paramValue) {
        if (paramValue != null) {
            return ResponseEntity.ok().body("Received Param="+paramValue);
        }
        return ResponseEntity.ok().body("No parameter received. Calling service="+myService.callMe());
    }
}
