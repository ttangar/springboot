package com.tarun.bootlearn.model.frd_main;
// Generated 08-Jan-2018 14:20:32 by Hibernate Tools 4.3.1.Final

/**
 * TReportTemplateId generated by hbm2java
 */
public class TReportTemplateId
    implements java.io.Serializable {

    private int reportId;

    private String rptTemplate;

    public TReportTemplateId() {
    }

    public TReportTemplateId(int reportId, String rptTemplate) {
        this.reportId = reportId;
        this.rptTemplate = rptTemplate;
    }

    public int getReportId() {

        return this.reportId;
    }

    public void setReportId(int reportId) {

        this.reportId = reportId;
    }

    public String getRptTemplate() {

        return this.rptTemplate;
    }

    public void setRptTemplate(String rptTemplate) {

        this.rptTemplate = rptTemplate;
    }

    public boolean equals(Object other) {

        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TReportTemplateId))
            return false;
        TReportTemplateId castOther = (TReportTemplateId) other;

        return (this.getReportId() == castOther.getReportId())
            && ((this.getRptTemplate() == castOther.getRptTemplate())
                || (this.getRptTemplate() != null
                    && castOther.getRptTemplate() != null && this
                        .getRptTemplate().equals(castOther.getRptTemplate())));
    }

    public int hashCode() {

        int result = 17;

        result = 37 * result + this.getReportId();
        result = 37 * result
            + (getRptTemplate() == null ? 0 : this.getRptTemplate().hashCode());
        return result;
    }

}