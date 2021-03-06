package com.tarun.bootlearn.model.frd_main;
// Generated 08-Jan-2018 14:20:32 by Hibernate Tools 4.3.1.Final

/**
 * TSecurityIssuer generated by hbm2java
 */
public class TSecurityIssuer
    implements java.io.Serializable {

    private String issuerId;

    private String issuerName;

    private String issuerType;

    private Short issuerMktcap;

    private Integer issuerExpCount;

    private Integer issuerExpAmount;

    public TSecurityIssuer() {
    }

    public TSecurityIssuer(String issuerId) {
        this.issuerId = issuerId;
    }

    public TSecurityIssuer(String issuerId, String issuerName,
                           String issuerType, Short issuerMktcap,
                           Integer issuerExpCount, Integer issuerExpAmount) {
        this.issuerId = issuerId;
        this.issuerName = issuerName;
        this.issuerType = issuerType;
        this.issuerMktcap = issuerMktcap;
        this.issuerExpCount = issuerExpCount;
        this.issuerExpAmount = issuerExpAmount;
    }

    public String getIssuerId() {

        return this.issuerId;
    }

    public void setIssuerId(String issuerId) {

        this.issuerId = issuerId;
    }

    public String getIssuerName() {

        return this.issuerName;
    }

    public void setIssuerName(String issuerName) {

        this.issuerName = issuerName;
    }

    public String getIssuerType() {

        return this.issuerType;
    }

    public void setIssuerType(String issuerType) {

        this.issuerType = issuerType;
    }

    public Short getIssuerMktcap() {

        return this.issuerMktcap;
    }

    public void setIssuerMktcap(Short issuerMktcap) {

        this.issuerMktcap = issuerMktcap;
    }

    public Integer getIssuerExpCount() {

        return this.issuerExpCount;
    }

    public void setIssuerExpCount(Integer issuerExpCount) {

        this.issuerExpCount = issuerExpCount;
    }

    public Integer getIssuerExpAmount() {

        return this.issuerExpAmount;
    }

    public void setIssuerExpAmount(Integer issuerExpAmount) {

        this.issuerExpAmount = issuerExpAmount;
    }

}
