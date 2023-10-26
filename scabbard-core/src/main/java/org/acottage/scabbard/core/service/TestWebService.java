package org.acottage.scabbard.core.service;

import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @Author liam.liu
 * @Email liam.liu@cloudwise.com
 * @Date 2023/10/24 14:35
 * @Version 1.0
 */
@WebService(serviceName = "TestWebService",
        targetNamespace = "http://scabbard.acottage.com",
        endpointInterface = "org.acottage.scabbard.core.service.TestWebService")
@Service
public interface TestWebService {
    @WebMethod(operationName = "test",action = "http://scabbard.acottage.com")
    @WebResult(name = "result")
    String test(@WebParam(name = "param", targetNamespace = "http://scabbard.acottage.com") String param);
}
