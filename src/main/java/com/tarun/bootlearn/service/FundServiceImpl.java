/**
 *
 */
package com.tarun.bootlearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarun.bootlearn.bo.FundBO;
import com.tarun.bootlearn.dao.frd_main.EntityDAO;
import com.tarun.bootlearn.model.frd_main.TEntity;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tarun.k.tangar
 *
 */
@Slf4j
@Service
public class FundServiceImpl implements FundService {

    @Autowired
    private EntityDAO entityDAO;

    /* (non-Javadoc)
     * @see com.tarun.bootlearn.service.FundService#getFundInfo(java.lang.Integer)
     */
    @Override
    public FundBO getFundInfo(Integer fundId){
        FundBO fundInfo = new FundBO();
        try{
            TEntity entityT = entityDAO.findOne(fundId);
            if(entityT != null){
                fundInfo.setFundId(entityT.getEntityId());
                fundInfo.setFundReportName(entityT.getReportFundName());
                fundInfo.setFundSCName(entityT.getLglShareClassName());
                fundInfo.setFundType(entityT.getFundType());
                fundInfo.setStartDate(entityT.getStartDate());
                fundInfo.setFundStatus(entityT.getFundStatus());
                fundInfo.setEndDate(entityT.getEndDate());
            }
        }
        catch(Exception e){
            System.out.println("Exception Occurred in getFundInfo(Integer fundId): "+e.getMessage());
            log.error("Error Occurred", e);
        }
        return fundInfo;
    }

}
