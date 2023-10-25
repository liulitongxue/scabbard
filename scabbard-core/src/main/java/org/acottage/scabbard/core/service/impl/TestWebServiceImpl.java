package org.acottage.scabbard.core.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.acottage.scabbard.core.service.TestWebService;
import org.springframework.stereotype.Service;


/**
 * @Author liam.liu
 * @Email liam.liu@cloudwise.com
 * @Date 2023/10/24 14:35
 * @Version 1.0
 */
@Slf4j
@Service
public class TestWebServiceImpl implements TestWebService {

    @Override
    public String OA(String param) {
        System.out.println(param);
        return param;
    }

}
