package kz.andersen.java_intensive_13.map_db_spring_boot_starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MapDatabaseProperties.class)
public class MapDatabaseAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public MapDatabase mapDatabase() {
        return new MapDatabase();
    }
}
