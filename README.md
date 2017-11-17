# SpringBoot-WebService

Spring Boot with SOAP web service.

Sample application java with Spring Boot that publish a service in SOAP using Apache CXF.

Sample web service class **BookEndpoint**:

```java
@Service
@WebService
public class BookEndpoint {
	
	@Autowired
	BookRepository bookRepository;
	
	@WebMethod(operationName = "listAll")
	public List<Book> listAll(@WebParam(name = "title") String title) {
		
		return bookRepository.findBookByTitleContaining(title);
	}

}
```
Class of configure for Apache CXF **WebServiceConfig**:

```java
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
```
Definition of context for publish of services **application.properties**:
```
cxf.path=/ws
```
