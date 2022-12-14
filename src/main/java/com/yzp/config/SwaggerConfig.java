package com.yzp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2WebMvc
public class SwaggerConfig {

    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("yangzp的购买小屋")
                        .description("# 秒杀系统测试暂用")
                        .termsOfServiceUrl("http://www.yangzp.work/")
                        .contact("1784956734@qq.com")
                        .version("1.0.0")
                        .build())
                // 分组名称
                .groupName("1.0.0")
                .select()
                // 这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.yzp.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}