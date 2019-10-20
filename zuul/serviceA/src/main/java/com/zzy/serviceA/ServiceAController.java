package com.zzy.serviceA;


import org.springframework.web.bind.annotation.RestController;

import com.zzy.api.ServiceAInterface;

@RestController
public class ServiceAController implements ServiceAInterface{


    @Override
    public String Welcome(Long id, String name) {
        if(name.equals("zzy")){
            return "{'欢迎:"+name+"'}";
        }else
        {
            return "？？？？？！！";}
    }
}
