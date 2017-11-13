package com.github.lincolnluiz.SpringWebService;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.lincolnluiz.SpringWebService.endpoints.BookEndpoint;

@Configuration
@EnableAutoConfiguration
public class WebServiceConfig {
	
	@Autowired
    private Bus bus;
	
	@Autowired
	private BookEndpoint bookEndpoint;
 
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, bookEndpoint);
        endpoint.publish("/Book");
        return endpoint;
    }

}
