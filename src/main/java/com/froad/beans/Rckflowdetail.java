package com.froad.beans;

// Generated 2013-11-5 11:49:49 by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.froad.recon.importfile.model.IimpStatusDetail;

/**
 * Rckflowdetail generated by hbm2java
 */
@Entity
@Table(name = "RCKFLOWDETAIL")
public class Rckflowdetail implements Serializable {
	
    /**对账*/
    public static final String TYPE_RECON = "RECON";
    /**数据同步*/
    public static final String TYPE_SYNC_RECON = "R_RECON_RESULT";

	/**C:成功 E:异常 N:未执行 R:正在运行*/
	public static String FLOW_STATE_SUCCESS="C"; 
	public static String FLOW_STATE_EXCEPTION="E"; 
	public static String FLOW_STATE_NO="N"; 
	public static String FLOW_STATE_RUNNING="R"; 
    private RckflowdetailId id;
    private String flowname;
    private String flowstate;
    private Integer dealcount;
    private Integer successcount;
    private Integer failcount;
    private Date dealdatetime;
    private String exceptiondesc;
    private String isexecute;
    private String alowchange;
    private String msg;
    /**
     * 0:全部自动对账 
     * 1：部分末对账进行对账 
     */
    private String reconType;
    
    private IimpStatusDetail iimpStatusDetail;
    
    

    /**
	 * Getter method for property <tt>msg</tt>.
	 * 
	 * @return property value of msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * Setter method for property <tt>msg</tt>.
	 * 
	 * @param msg value to be assigned to property msg
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Rckflowdetail() {
    }

    public Rckflowdetail(RckflowdetailId id) {
        this.id = id;
    }

    public Rckflowdetail(RckflowdetailId id, String flowname, String flowstate,
                         Integer dealcount, Integer successcount, Integer failcount,
                         Date dealdatetime, String exceptiondesc, String isexecute,
                         String alowchange) {
        this.id = id;
        this.flowname = flowname;
        this.flowstate = flowstate;
        this.dealcount = dealcount;
        this.successcount = successcount;
        this.failcount = failcount;
        this.dealdatetime = dealdatetime;
        this.exceptiondesc = exceptiondesc;
        this.isexecute = isexecute;
        this.alowchange = alowchange;
    }

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "cleardate", column = @Column(name = "CLEARDATE", nullable = false, length = 16)),
            @AttributeOverride(name = "rcktype", column = @Column(name = "RCKTYPE", nullable = false, length = 20)),
            @AttributeOverride(name = "rckorder", column = @Column(name = "RCKORDER", nullable = false, precision = 9, scale = 0))})
    public RckflowdetailId getId() {
        return this.id;
    }

    public void setId(RckflowdetailId id) {
        this.id = id;
    }

    @Column(name = "FLOWNAME")
    public String getFlowname() {
        return this.flowname;
    }

    public void setFlowname(String flowname) {
        this.flowname = flowname;
    }

    @Column(name = "FLOWSTATE", length = 5)
    public String getFlowstate() {
        return this.flowstate;
    }

    public void setFlowstate(String flowstate) {
        this.flowstate = flowstate;
    }

    @Column(name = "DEALCOUNT", precision = 9, scale = 0)
    public Integer getDealcount() {
        return this.dealcount;
    }

    public void setDealcount(Integer dealcount) {
        this.dealcount = dealcount;
    }

    @Column(name = "SUCCESSCOUNT", precision = 9, scale = 0)
    public Integer getSuccesscount() {
        return this.successcount;
    }

    public void setSuccesscount(Integer successcount) {
        this.successcount = successcount;
    }

    @Column(name = "FAILCOUNT", precision = 9, scale = 0)
    public Integer getFailcount() {
        return this.failcount;
    }

    public void setFailcount(Integer failcount) {
        this.failcount = failcount;
    }

    @Column(name = "DEALDATETIME")
    public Serializable getDealdatetime() {
        return this.dealdatetime;
    }

    public void setDealdatetime(Date dealdatetime) {
        this.dealdatetime = dealdatetime;
    }

    @Column(name = "EXCEPTIONDESC")
    public String getExceptiondesc() {
        return this.exceptiondesc;
    }

    public void setExceptiondesc(String exceptiondesc) {
        this.exceptiondesc = exceptiondesc;
    }

    @Column(name = "ISEXECUTE", length = 5)
    public String getIsexecute() {
        return this.isexecute;
    }

    public void setIsexecute(String isexecute) {
        this.isexecute = isexecute;
    }

    @Column(name = "ALOWCHANGE", length = 5)
    public String getAlowchange() {
        return this.alowchange;
    }

    public void setAlowchange(String alowchange) {
        this.alowchange = alowchange;
    }

	public String getReconType() {
		if(reconType==null){
			reconType = "0";
		}
		return reconType;
	}

	public void setReconType(String reconType) {
		this.reconType = reconType;
	}

	public IimpStatusDetail getIimpStatusDetail() {
		if(this.iimpStatusDetail==null){
			this.iimpStatusDetail = new IimpStatusDetail();
		}
		return iimpStatusDetail;
	}

	public void setIimpStatusDetail(IimpStatusDetail iimpStatusDetail) {
		this.iimpStatusDetail = iimpStatusDetail;
	}

}