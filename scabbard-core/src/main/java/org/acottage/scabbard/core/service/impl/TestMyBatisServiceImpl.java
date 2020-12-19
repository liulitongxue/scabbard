package org.acottage.scabbard.core.service.impl;

import org.acottage.scabbard.core.common.constant.ParamConst;
import org.acottage.scabbard.core.entity.TestMyBatis;
import org.acottage.scabbard.core.mapper.TestMyBatisMapper;
import org.acottage.scabbard.core.service.TestMyBatisService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author liuli email:liulitongxue@126.com
 * @Date 2020/08/14 下午 12:38
 * @Version 1.0
 */
@Service
public class TestMyBatisServiceImpl implements TestMyBatisService {

    @Resource
    private TestMyBatisMapper testMyBatisMapper;

    @Override
    public Long insert(TestMyBatis testMyBatis) {
        Assert.notNull(testMyBatis, ParamConst.NULL_PARAM);
        testMyBatis.setDel(false);
        testMyBatis.setUpdateTime(new Date());
        testMyBatis.setInsertTime(new Date());
        testMyBatisMapper.insert(testMyBatis);
        return testMyBatis.getId();
    }

    @Override
    public Long insertList(List<TestMyBatis> testMyBatisList) {
        testMyBatisList.forEach(testMyBatis -> {
            testMyBatis.setDel(true);
            testMyBatis.setUpdateTime(new Date());
            testMyBatis.setInsertTime(new Date());
        });
        for (TestMyBatis testMyBatis : testMyBatisList) {
            testMyBatis.setDel(false);
        }
        return testMyBatisMapper.insertList(testMyBatisList);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public int insertTransactional() {
        try {
            for (int i = 0; i < 5; i++) {
                TestMyBatis testMyBatis = new TestMyBatis();
                testMyBatis.setName("七言" + i);
                testMyBatis.setDel(false);
                if (i==2){
                    int remarks = 1/0;
                }
                testMyBatis.setUpdateTime(new Date());
                testMyBatis.setInsertTime(new Date());
                testMyBatisMapper.insert(testMyBatis);
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}
