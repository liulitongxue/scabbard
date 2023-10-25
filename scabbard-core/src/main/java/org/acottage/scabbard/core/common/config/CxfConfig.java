package org.acottage.scabbard.core.common.config;

import org.acottage.scabbard.core.service.TestWebService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @Author liam.liu
 * @Email liam.liu@cloudwise.com
 * @Date 2023/10/25 10:04
 * @Version 1.0
 */
@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;

    @Autowired
    private TestWebService testWebService;


    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint =  new EndpointImpl(bus, testWebService);
        endpoint.publish("/testWebService");
        return endpoint;
    }

}
