package com.tarun.bootlearn.model.frd_main;
// Generated 08-Jan-2018 14:20:32 by Hibernate Tools 4.3.1.Final

/**
 * TEntityXreference generated by hbm2java
 */
public class TEntityXreference
    implements java.io.Serializable {

    private TEntityXreferenceId id;

    private String xrefId;

    public TEntityXreference() {
    }

    public TEntityXreference(TEntityXreferenceId id, String xrefId) {
        this.id = id;
        this.xrefId = xrefId;
    }

    public TEntityXreferenceId getId() {

        return this.id;
    }

    public void setId(TEntityXreferenceId id) {

        this.id = id;
    }

    public String getXrefId() {

        return this.xrefId;
    }

    public void setXrefId(String xrefId) {

        this.xrefId = xrefId;
    }

}