package com.mall.admin.vo.activity;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity
     *
     * @mbggenerated Sat Jul 25 14:53:08 CST 2015
     */
    int countByExample(ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity
     *
     * @mbggenerated Sat Jul 25 14:53:08 CST 2015
     */
    int deleteByExample(ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity
     *
     * @mbggenerated Sat Jul 25 14:53:08 CST 2015
     */
    int deleteByPrimaryKey(Long activityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity
     *
     * @mbggenerated Sat Jul 25 14:53:08 CST 2015
     */
    int insert(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity
     *
     * @mbggenerated Sat Jul 25 14:53:08 CST 2015
     */
    int insertSelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity
     *
     * @mbggenerated Sat Jul 25 14:53:08 CST 2015
     */
    List<Activity> selectByExample(ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity
     *
     * @mbggenerated Sat Jul 25 14:53:08 CST 2015
     */
    Activity selectByPrimaryKey(Long activityId);
    
    Activity getActivityByStorageId(Long storageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity
     *
     * @mbggenerated Sat Jul 25 14:53:08 CST 2015
     */
    int updateByExampleSelective(@Param("record") Activity record, @Param("example") ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity
     *
     * @mbggenerated Sat Jul 25 14:53:08 CST 2015
     */
    int updateByExample(@Param("record") Activity record, @Param("example") ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity
     *
     * @mbggenerated Sat Jul 25 14:53:08 CST 2015
     */
    int updateByPrimaryKeySelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity
     *
     * @mbggenerated Sat Jul 25 14:53:08 CST 2015
     */
    int updateByPrimaryKey(Activity record);
    
    List<Activity> selectPage(Map<String, Object> example);
    
    int countPage(Map<String, Object> example);
    
    List<Activity> selectCouponPage(Map<String, Object> example);
    
    int countCouponPage(Map<String, Object> example);
    
    int open(@Param("activityId") long activityId, @Param("status") int status);
}