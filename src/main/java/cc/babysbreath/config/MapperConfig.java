package cc.babysbreath.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 吴畅
 * @date 2022/10/30 - 1:15
 */
@Configuration
@MapperScan("cc.babysbreath.mapper")
public class MapperConfig {
}
