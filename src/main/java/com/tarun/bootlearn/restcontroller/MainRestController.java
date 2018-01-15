/*
 *
 */
package com.tarun.bootlearn.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarun.bootlearn.dao.frd_main.EntityDAO;

/**
 * @author tarun.k.tangar
 *
 */
@RestController
@RequestMapping("/api/posts")
public class MainRestController {

    @Autowired
    EntityDAO tEntityDAO;

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello";
    }

    @RequestMapping("/fund")
    public String checkFunds(){
        Long count = tEntityDAO.count();
        if(count == 0){
            return "No Data Found";
        }
        else{
            return "Data Found";
        }
    }

}
