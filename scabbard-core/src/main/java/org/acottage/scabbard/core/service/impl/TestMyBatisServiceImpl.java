package org.acottage.scabbard.core.service.impl;

import org.acottage.scabbard.core.common.constant.ParamConst;
import org.acottage.scabbard.core.entity.TestMyBatis;
import org.acottage.scabbard.core.dao.TestMyBatisMapper;
import org.acottage.scabbard.core.service.TestMyBatisService;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Date;

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
    public Long insertTestMybatis(TestMyBatis testMyBatis) {
        Assert.notNull(testMyBatis, ParamConst.NULL_PARAM);
        testMyBatis.setDel(false);
        testMyBatis.setInsertTime(new Date());
        testMyBatis.setInsertTime(new Date());
        return testMyBatisMapper.insertTestMybatis(testMyBatis);
    }

}
