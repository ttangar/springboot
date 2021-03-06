package com.tarun.bootlearn.model.frd_main;
// Generated 08-Jan-2018 14:20:32 by Hibernate Tools 4.3.1.Final

/**
 * TReportEntityId generated by hbm2java
 */
public class TReportEntityId
    implements java.io.Serializable {

    private int entityId;

    private int reportId;

    public TReportEntityId() {
    }

    public TReportEntityId(int entityId, int reportId) {
        this.entityId = entityId;
        this.reportId = reportId;
    }

    public int getEntityId() {

        return this.entityId;
    }

    public void setEntityId(int entityId) {

        this.entityId = entityId;
    }

    public int getReportId() {

        return this.reportId;
    }

    public void setReportId(int reportId) {

        this.reportId = reportId;
    }

    public boolean equals(Object other) {

        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TReportEntityId))
            return false;
        TReportEntityId castOther = (TReportEntityId) other;

        return (this.getEntityId() == castOther.getEntityId())
            && (this.getReportId() == castOther.getReportId());
    }

    public int hashCode() {

        int result = 17;

        result = 37 * result + this.getEntityId();
        result = 37 * result + this.getReportId();
        return result;
    }

}
