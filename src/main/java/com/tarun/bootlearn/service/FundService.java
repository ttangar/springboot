/**
 *
 */
package com.tarun.bootlearn.service;

import org.springframework.stereotype.Service;

import com.tarun.bootlearn.bo.FundBO;

/**
 * @author tarun.k.tangar
 *
 */
public interface FundService {

    FundBO getFundInfo(Integer fundId);

}
