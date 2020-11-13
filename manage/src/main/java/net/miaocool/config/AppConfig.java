package net.miaocool.config;

import net.miaocool.filter.JsonFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class AppConfig {
  @Bean
  public Filter filter() {
    return new JsonFilter();
  }
}
