package com.neueda.bonds_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {


    @GetMapping("/")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/map1")
    public String map1Page() {
        return "map1";
    }


    @GetMapping("/chart1")
    public String chart1Page() {
        return "chart1";
    }

    @GetMapping("/addbond")
    public String addBondPage() {
        return "addbond";
    }
}