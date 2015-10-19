package com.opris.colorcombat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping(value = {"/"})
public class MainPageController {

    @RequestMapping(value = {"/MainPage"})
    public String mainPage() {
        return "MainPage";
    }

    @RequestMapping(value = {"/"})
    public String reMainPage() {
        
        return "redirect:/MainPage";

    }
}