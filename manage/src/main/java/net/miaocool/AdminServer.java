package net.miaocool;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.miaocool.mapper")
public class AdminServer {
  public static void main(String[] args) {
    SpringApplication.run(AdminServer.class);
  }
}
