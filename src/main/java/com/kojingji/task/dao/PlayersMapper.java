package com.kojingji.task.dao;

import com.kojingji.task.models.Players;

public interface PlayersMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table players
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table players
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	int insert(Players record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table players
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	int insertSelective(Players record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table players
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	Players selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table players
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	int updateByPrimaryKeySelective(Players record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table players
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	int updateByPrimaryKey(Players record);
}