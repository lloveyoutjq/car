package com.accp.controller;

import com.accp.domain.ClientClientdata;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/service")
public class ServiceController {

    @RequestMapping("addClient")
    public Map addClient(@RequestBody ClientClientdata clientClientdata){
        Map<String,Object> map = new HashMap<>();
        map.put("code","0");
        map.put("msg","成功");
        map.put("data",clientClientdata);
        return map;
    }

}
