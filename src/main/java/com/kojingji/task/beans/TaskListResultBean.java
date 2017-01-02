package com.kojingji.task.beans;

import java.util.Date;

public class TaskListResultBean {

	private Long id;
	
	private String name;
	
	private String image;
	
	private String remark;
	
	private Long category;
	
	private String categoryName;
	
	private Integer status;
	
	private Integer registMax;
	
	private Long registIsCharge;
	
	private Long registFee;
	
	private Date registEndTime;
	
	private Integer isCanCancel;
	
	private Date canCancelTime;

	private Integer isOnline;

	private Integer isLive;

	private String liveUrl;

	private Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getCategory() {
		return category;
	}

	public void setCategory(Long category) {
		this.category = category;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getRegistMax() {
		return registMax;
	}

	public void setRegistMax(Integer registMax) {
		this.registMax = registMax;
	}

	public Long getRegistIsCharge() {
		return registIsCharge;
	}

	public void setRegistIsCharge(Long registIsCharge) {
		this.registIsCharge = registIsCharge;
	}

	public Long getRegistFee() {
		return registFee;
	}

	public void setRegistFee(Long registFee) {
		this.registFee = registFee;
	}

	public Date getRegistEndTime() {
		return registEndTime;
	}

	public void setRegistEndTime(Date registEndTime) {
		this.registEndTime = registEndTime;
	}

	public Integer getIsCanCancel() {
		return isCanCancel;
	}

	public void setIsCanCancel(Integer isCanCancel) {
		this.isCanCancel = isCanCancel;
	}

	public Date getCanCancelTime() {
		return canCancelTime;
	}

	public void setCanCancelTime(Date canCancelTime) {
		this.canCancelTime = canCancelTime;
	}

	public Integer getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(Integer isOnline) {
		this.isOnline = isOnline;
	}

	public Integer getIsLive() {
		return isLive;
	}

	public void setIsLive(Integer isLive) {
		this.isLive = isLive;
	}

	public String getLiveUrl() {
		return liveUrl;
	}

	public void setLiveUrl(String liveUrl) {
		this.liveUrl = liveUrl;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	
}
