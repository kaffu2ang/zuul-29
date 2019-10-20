package com.zzy.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/user")
public interface ServiceAInterface {

    @RequestMapping(value = "/Welcome/{id}", method = RequestMethod.GET)
    String Welcome(@PathVariable("id") Long id,@RequestParam("name") String name);

}
