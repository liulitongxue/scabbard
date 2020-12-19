package org.acottage.scabbard.core.service;

import org.acottage.scabbard.core.entity.TestMyBatis;

import java.util.List;

/**
 * @Author liuli email:liulitongxue@126.com
 * @Date 2020/08/14 下午 12:15
 * @Version 1.0
 */
public interface TestMyBatisService {
    /**
     * 测试不使用Mybatis Generator 插入数据
     *
     * @param testMyBatis
     * @return 插入数据的主键id
     */
    Long insert(TestMyBatis testMyBatis);

    /**
     * 测试批量插入
     *
     * @param testMyBatisList
     * @return 影响的条数
     */
    Long insertList(List<TestMyBatis> testMyBatisList);

    /**
     * 测试事务注解
     *
     * @return 标记
     */
    int insertTransactional();
}
