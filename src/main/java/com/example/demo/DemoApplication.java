package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(info = @Info(title = "the title", version = "1.0", description = "AI API"))
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
			config.setEnableEnumTranslation(true);
//			config.getExposureConfiguration().disablePutForCreation();
//			config.useHalAsDefaultJsonMediaType(false);
//			config.exposeIdsFor(Billionaires.class);
		}

//		@Override
//		public void configureJacksonObjectMapper(ObjectMapper objectMapper) {
//			objectMapper.registerModule(new SimpleModule("MyCustomModule") {
//				private static final long serialVersionUID = 1L;
//				@Override
//				public void setupModule(SetupContext context) {
//					AbstractTypeResolver resolver = new SimpleAbstractTypeResolver()
//							.addMapping(MyInterface.class, MyInterfaceImpl.class));
//					context.addAbstractTypeResolver(resolver);
//				}
//			});
//		}

	}

}
