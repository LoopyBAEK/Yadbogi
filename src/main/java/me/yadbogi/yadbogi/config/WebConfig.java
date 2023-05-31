package me.yadbogi.yadbogi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// WebConfig 파일은 웹 구성에 대해 지정하는 내용이 담겨있는 설정 파일
// 스프링 부트에서는 WebMvcConfigurer 인터페이스를 구현
// WebMvcConfigurer 인터페이스는 Spring MVC 구성을 사용자 정의하는 데에 사용하는 인터페이스
// -> 내가 커스텀하고 싶은 옵션에 대한 메소드만 @Override를 통해서 재정의하면 됨
@Configuration
public class WebConfig implements WebMvcConfigurer {
    // (Cross-Origin Resource Sharing,CORS) 란 다른 출처의 자원을 공유할 수 있도록 설정하는 권한 체제
    // 따라서 CORS를 설정해주지 않거나 제대로 설정하지 않은 경우, 원하는대로 리소스를 공유하지 못하게 됨
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // registry.addMapping을 이용해서 CORS를 적용할 URL패턴을 정의할 수 있다
        registry.addMapping("/**")
                // allowedOrigins 메소드를 이용해서 자원 공유를 허락할 Origin을 지정할 수 있다
                .allowedOrigins("*")
                // allowedMethods 메소드를 이용해서 자원 공유를 허락할 HttpMethod를 지정할 수 있다
                .allowedMethods("*");
    }
}
