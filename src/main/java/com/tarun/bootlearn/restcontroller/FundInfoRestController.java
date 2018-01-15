/**
 *
 */
package com.tarun.bootlearn.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tarun.bootlearn.bo.FundBO;
import com.tarun.bootlearn.service.FundServiceImpl;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tarun.k.tangar
 *
 */
@Slf4j
@RestController
@RequestMapping("/api/fundinfo")
public class FundInfoRestController {

    @Autowired
    FundServiceImpl fundService;

    @RequestMapping(value="/byid/{fundId}", method=RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<FundBO> getFundInfoById(@PathVariable("fundId") Integer fundId){
        log.info("getFundInfoById called with id: "+fundId.toString());
        return new ResponseEntity<FundBO>(fundService.getFundInfo(fundId), HttpStatus.OK);
    }
}
