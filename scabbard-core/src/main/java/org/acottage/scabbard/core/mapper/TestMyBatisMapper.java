package org.acottage.scabbard.core.mapper;

import org.acottage.scabbard.core.entity.TestMyBatis;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author liuli email:liulitongxue@126.com
 * @Date 2020/08/14 下午 12:17
 * @Version 1.0
 */
@Mapper
public interface TestMyBatisMapper {
    /**
     * 测试不使用MyBatis Generator 插入数据
     *
     * @param testMyBatis
     * @return 受影响的行数
     */
    Long insert(TestMyBatis testMyBatis);

    /**
     * 测试批量插入
     *
     * @param testMyBatisList
     * @return 插入数据的主键id
     */
    Long insertList(List<TestMyBatis> testMyBatisList);
}
