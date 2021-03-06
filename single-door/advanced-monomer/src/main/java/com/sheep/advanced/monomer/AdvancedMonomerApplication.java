package com.sheep.advanced.monomer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * @author yangyangSheep
 * @ClassName AdvancedMonomerApplication.java
 * @Description security的单体项目进阶启动类
 * @createTime 2021/5/13 19:14
 */
@SpringBootApplication
@MapperScan("com.sheep.advanced.monomer.mapper")
@EnableWebSecurity(debug = true)
public class AdvancedMonomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdvancedMonomerApplication.class, args);
    }

}

