package com.kojingji.task.dao;

import com.kojingji.task.models.Category;

public interface CategoryMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	int insert(Category record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	int insertSelective(Category record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	Category selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	int updateByPrimaryKeySelective(Category record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category
	 * @mbggenerated  Tue Oct 04 23:02:17 CST 2016
	 */
	int updateByPrimaryKey(Category record);
}