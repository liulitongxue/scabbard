package org.acottage.scabbard.core.dao;

import org.acottage.scabbard.core.entity.TestMyBatis;

/**
 * @Author liuli email:liulitongxue@126.com
 * @Date 2020/08/14 下午 12:17
 * @Version 1.0
 */
public interface TestMyBatisMapper {
    /**
     * 测试不使用MyBatis Generator 插入数据
     *
     * @param testMyBatis
     * @return
     */
    Long insertTestMybatis(TestMyBatis testMyBatis);
}
