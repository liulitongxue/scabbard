package org.acottage.scabbard.core.service;

import org.acottage.scabbard.core.entity.TestMyBatis;

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
     * @return
     */
    Long insertTestMybatis(TestMyBatis testMyBatis);
}
