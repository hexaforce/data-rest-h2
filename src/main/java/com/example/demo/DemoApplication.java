package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition (info =
@Info(
          title = "the title",
          version = "0.0",
          description = "My API",
          license = @License(name = "Apache 2.0", url = "http://foo.bar"),
          contact = @Contact(url = "http://gigantic-server.com", name = "Fred", email = "Fred@gigagantic-server.com")
  )
)
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Configuration
	public class SpringRestConfiguration implements RepositoryRestConfigurer {
		@Override
		public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
			config.setDefaultMediaType(MediaType.APPLICATION_JSON);
			// config.getExposureConfiguration().disablePutForCreation();
			//config.useHalAsDefaultJsonMediaType(false);
			// config.exposeIdsFor(Billionaires.class);
		}
		
	}
	
//	@Override
//	protected void configureJacksonObjectMapper(ObjectMapper objectMapper) {
//		objectMapper.registerModule(new SimpleModule("MyCustomModule") {
//			@Override
//			public void setupModule(SetupContext context) {
//				context.addAbstractTypeResolver(
//						new SimpleAbstractTypeResolver().addMapping(MyInterface.class, MyInterfaceImpl.class));
//			}
//		});
//	}


}
