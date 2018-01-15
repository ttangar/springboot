/**
 *
 */
package com.tarun.bootlearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tarun.k.tangar
 *
 */
@Controller
public class MainController {
    @RequestMapping("/helloc")
    public String SayHello(){
        return "HelloDude";
    }

}
