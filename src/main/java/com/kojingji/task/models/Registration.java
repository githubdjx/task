package com.kojingji.task.models;

import java.util.Date;

public class Registration {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column registration.id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column registration.c_id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private Long cId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column registration.qq_id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private String qqId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column registration.status
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private Integer status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column registration.regist_fee
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private Long registFee;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column registration.is_need_pay
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private Integer isNeedPay;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column registration.is_pay
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private Integer isPay;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column registration.pay_time
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private Date payTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column registration.regist_time
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private Date registTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column registration.cancel_time
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private Date cancelTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column registration.id
	 * @return  the value of registration.id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column registration.id
	 * @param id  the value for registration.id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column registration.c_id
	 * @return  the value of registration.c_id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public Long getcId() {
		return cId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column registration.c_id
	 * @param cId  the value for registration.c_id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setcId(Long cId) {
		this.cId = cId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column registration.qq_id
	 * @return  the value of registration.qq_id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public String getQqId() {
		return qqId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column registration.qq_id
	 * @param qqId  the value for registration.qq_id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setQqId(String qqId) {
		this.qqId = qqId == null ? null : qqId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column registration.status
	 * @return  the value of registration.status
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column registration.status
	 * @param status  the value for registration.status
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column registration.regist_fee
	 * @return  the value of registration.regist_fee
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public Long getRegistFee() {
		return registFee;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column registration.regist_fee
	 * @param registFee  the value for registration.regist_fee
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setRegistFee(Long registFee) {
		this.registFee = registFee;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column registration.is_need_pay
	 * @return  the value of registration.is_need_pay
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public Integer getIsNeedPay() {
		return isNeedPay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column registration.is_need_pay
	 * @param isNeedPay  the value for registration.is_need_pay
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setIsNeedPay(Integer isNeedPay) {
		this.isNeedPay = isNeedPay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column registration.is_pay
	 * @return  the value of registration.is_pay
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public Integer getIsPay() {
		return isPay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column registration.is_pay
	 * @param isPay  the value for registration.is_pay
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setIsPay(Integer isPay) {
		this.isPay = isPay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column registration.pay_time
	 * @return  the value of registration.pay_time
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public Date getPayTime() {
		return payTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column registration.pay_time
	 * @param payTime  the value for registration.pay_time
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column registration.regist_time
	 * @return  the value of registration.regist_time
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public Date getRegistTime() {
		return registTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column registration.regist_time
	 * @param registTime  the value for registration.regist_time
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column registration.cancel_time
	 * @return  the value of registration.cancel_time
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public Date getCancelTime() {
		return cancelTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column registration.cancel_time
	 * @param cancelTime  the value for registration.cancel_time
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}
}