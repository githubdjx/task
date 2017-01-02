package com.kojingji.task.models;

import java.util.Date;

public class Players {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column players.id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column players.t_id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private Long tId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column players.pr_id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private Long prId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column players.play_nick
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private String playNick;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column players.qq_id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private String qqId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column players.seat_index
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private Integer seatIndex;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column players.is_win
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private Integer isWin;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column players.create_time
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column players.update_time
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column players.update_by
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	private String updateBy;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column players.id
	 * @return  the value of players.id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column players.id
	 * @param id  the value for players.id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column players.t_id
	 * @return  the value of players.t_id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public Long gettId() {
		return tId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column players.t_id
	 * @param tId  the value for players.t_id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void settId(Long tId) {
		this.tId = tId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column players.pr_id
	 * @return  the value of players.pr_id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public Long getPrId() {
		return prId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column players.pr_id
	 * @param prId  the value for players.pr_id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setPrId(Long prId) {
		this.prId = prId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column players.play_nick
	 * @return  the value of players.play_nick
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public String getPlayNick() {
		return playNick;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column players.play_nick
	 * @param playNick  the value for players.play_nick
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setPlayNick(String playNick) {
		this.playNick = playNick == null ? null : playNick.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column players.qq_id
	 * @return  the value of players.qq_id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public String getQqId() {
		return qqId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column players.qq_id
	 * @param qqId  the value for players.qq_id
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setQqId(String qqId) {
		this.qqId = qqId == null ? null : qqId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column players.seat_index
	 * @return  the value of players.seat_index
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public Integer getSeatIndex() {
		return seatIndex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column players.seat_index
	 * @param seatIndex  the value for players.seat_index
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setSeatIndex(Integer seatIndex) {
		this.seatIndex = seatIndex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column players.is_win
	 * @return  the value of players.is_win
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public Integer getIsWin() {
		return isWin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column players.is_win
	 * @param isWin  the value for players.is_win
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setIsWin(Integer isWin) {
		this.isWin = isWin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column players.create_time
	 * @return  the value of players.create_time
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column players.create_time
	 * @param createTime  the value for players.create_time
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column players.update_time
	 * @return  the value of players.update_time
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column players.update_time
	 * @param updateTime  the value for players.update_time
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column players.update_by
	 * @return  the value of players.update_by
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public String getUpdateBy() {
		return updateBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column players.update_by
	 * @param updateBy  the value for players.update_by
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy == null ? null : updateBy.trim();
	}
}