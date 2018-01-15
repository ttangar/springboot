/**
 *
 */
package com.tarun.bootlearn.bo;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author tarun.k.tangar
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@XmlRootElement(name="FUNDINFORMATION")
@XmlAccessorType(XmlAccessType.FIELD)
public class FundBO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @XmlElement(name="FUNDID")
    private Integer fundId;
    @XmlElement(name="FUNDREPORTINGNAME")
    private String fundReportName;
    @XmlElement(name="FUNDSHARECLASSNAME")
    private String fundSCName;
    @XmlElement(name="ISINNO")
    private String isinNo;
    @XmlElement(name="FUNDSTARTDATE")
    private Date startDate;
    @XmlElement(name="FUNDENDDATE")
    private Date endDate;
    @XmlElement(name="FUNDSTATUS")
    private String fundStatus;
    @XmlElement(name="FUNDTYPE")
    private String fundType;
}
