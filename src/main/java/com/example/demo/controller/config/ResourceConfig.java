package com.example.demo.controller.config;

@Configuration
public class ResourceConfig {
  @Bean("messageSource")
  MessageSource getMessageSource() {
    ReloadableResourceBundleMessageSource ms = new ReloadableResourceBundleMessageSource();
    ms.setBasenames("classpath:messages/mail", "classpath:messages/account");
    ms.setDefaultEncoding("utf-8");
    return ms;
  }
}
