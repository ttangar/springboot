/**
 *
 */
package com.tarun.bootlearn.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.context.annotation.Bean;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * @author tarun.k.tangar
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Holding implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Integer fundId;
    private Date effMonthEndDate;
    private String holdingType;
    private String securityCode;
    private String securityType;
    private int shareCount;
    private float sharePrice;
    private BigDecimal secExposure;
    private BigDecimal secMktCap;
    private float tnaPct;
}
