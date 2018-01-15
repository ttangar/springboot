package com.tarun.bootlearn.model.frd_main;
// Generated 08-Jan-2018 14:20:32 by Hibernate Tools 4.3.1.Final

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * TEntity generated by hbm2java
 */
@Entity
@Table(name="t_entity")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TEntity implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private int entityId;
    private String lglFundName;
    private String reportFundName;
    private String lglShareClassName;
    private String fundType;
    private Date startDate;
    private Date endDate;
    private String fundStatus;
}