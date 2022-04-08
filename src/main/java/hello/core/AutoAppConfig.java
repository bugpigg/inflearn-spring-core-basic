package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
    excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) // 컴포넌트 스캔을 사용하면 @Configuration 붙은 설정정보도 자동으로 올라오므로, 이렇게 제외한다.
public class AutoAppConfig {
}
