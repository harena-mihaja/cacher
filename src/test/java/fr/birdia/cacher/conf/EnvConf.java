package fr.birdia.cacher.conf;

import org.springframework.test.context.DynamicPropertyRegistry;

public class EnvConf {
  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("API_KEY", () -> "test-api-key");
  }
}
