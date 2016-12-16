package com.ctrip.smarttrip.tools.refmgr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SoaController {
    @RequestMapping(value = {"/", "/soa/list"})
    public String list(){
        return "index";
    }
}
