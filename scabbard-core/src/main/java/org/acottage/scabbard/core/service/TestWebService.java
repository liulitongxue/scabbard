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
@WebService(serviceName = "OaService",
        targetNamespace = "http://demo.autoflow.huichuan.cloudwise.com",
        endpointInterface = "com.cloudwise.huichuan.autoflow.demo.service.OaService")
@Service
public interface TestWebService {
    @WebMethod(operationName = "OA")
    @WebResult(name = "result") String OA(@WebParam(name = "param") String param);
}
