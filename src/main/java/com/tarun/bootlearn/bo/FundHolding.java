/**
 *
 */
package com.tarun.bootlearn.bo;

import java.io.Serializable;
import java.util.List;

import org.springframework.context.annotation.Bean;

import lombok.AllArgsConstructor;
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
public class FundHolding implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private FundBO fundBO;
    private List<Holding> listHoldings;

}
