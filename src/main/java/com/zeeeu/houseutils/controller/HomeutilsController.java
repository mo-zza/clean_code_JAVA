package com.zeeeu.houseutils.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 서비스 health check를 위한 컨트롤러
 */
@Controller
public class HomeutilsController {
    @RequestMapping("/")
    @ResponseBody
        public String index() {
            return "response success";
        }
}
