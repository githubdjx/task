package com.kojingji.task.dao;

import com.kojingji.task.models.PlayRoom;

public interface PlayRoomMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table play_room
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table play_room
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	int insert(PlayRoom record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table play_room
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	int insertSelective(PlayRoom record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table play_room
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	PlayRoom selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table play_room
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	int updateByPrimaryKeySelective(PlayRoom record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table play_room
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	int updateByPrimaryKey(PlayRoom record);
}