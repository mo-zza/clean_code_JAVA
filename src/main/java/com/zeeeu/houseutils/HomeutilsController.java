package com.zeeeu.houseutils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeutilsController {
    @RequestMapping("/")
    @ResponseBody
        public String index() {
            return "response success";
        }
}
