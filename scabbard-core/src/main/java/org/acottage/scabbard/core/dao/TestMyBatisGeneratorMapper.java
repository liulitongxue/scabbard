package org.acottage.scabbard.core.dao;

import org.acottage.scabbard.core.entity.TestMyBatisGenerator;
import org.acottage.scabbard.core.entity.TestMyBatisGeneratorExample;
import org.acottage.scabbard.core.entity.TestMyBatisGeneratorKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestMyBatisGeneratorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_my_batis_generator
     *
     * @mbggenerated Mon Aug 24 12:21:43 CST 2020
     */
    int countByExample(TestMyBatisGeneratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_my_batis_generator
     *
     * @mbggenerated Mon Aug 24 12:21:43 CST 2020
     */
    int deleteByExample(TestMyBatisGeneratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_my_batis_generator
     *
     * @mbggenerated Mon Aug 24 12:21:43 CST 2020
     */
    int deleteByPrimaryKey(TestMyBatisGeneratorKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_my_batis_generator
     *
     * @mbggenerated Mon Aug 24 12:21:43 CST 2020
     */
    int insert(TestMyBatisGenerator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_my_batis_generator
     *
     * @mbggenerated Mon Aug 24 12:21:43 CST 2020
     */
    int insertSelective(TestMyBatisGenerator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_my_batis_generator
     *
     * @mbggenerated Mon Aug 24 12:21:43 CST 2020
     */
    List<TestMyBatisGenerator> selectByExample(TestMyBatisGeneratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_my_batis_generator
     *
     * @mbggenerated Mon Aug 24 12:21:43 CST 2020
     */
    TestMyBatisGenerator selectByPrimaryKey(TestMyBatisGeneratorKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_my_batis_generator
     *
     * @mbggenerated Mon Aug 24 12:21:43 CST 2020
     */
    int updateByExampleSelective(@Param("record") TestMyBatisGenerator record, @Param("example") TestMyBatisGeneratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_my_batis_generator
     *
     * @mbggenerated Mon Aug 24 12:21:43 CST 2020
     */
    int updateByExample(@Param("record") TestMyBatisGenerator record, @Param("example") TestMyBatisGeneratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_my_batis_generator
     *
     * @mbggenerated Mon Aug 24 12:21:43 CST 2020
     */
    int updateByPrimaryKeySelective(TestMyBatisGenerator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_my_batis_generator
     *
     * @mbggenerated Mon Aug 24 12:21:43 CST 2020
     */
    int updateByPrimaryKey(TestMyBatisGenerator record);
}