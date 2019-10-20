package com.zzy.serviceB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ServiceB/user")
public class ServiceBController {

    @Autowired
    private ServiceAClient serviceA;

    @RequestMapping(value = "/Welcome/{id}", method = RequestMethod.GET)
    public String Welcome(@PathVariable("id") Long id,
                          @RequestParam("name") String name){
        return serviceA.Welcome(id,name);
    }
}
