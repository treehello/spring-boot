package com.hq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 * 注：
 *  1. @SpringBootApplication 注解 标注的类 默认只扫描它所在的包及所有的子孙包的所有类。
 *  2. 会加载配置类。
 */
@SpringBootApplication
public class Day01SpringbootStartApplication {

    public static void main(String[] args) {

        /**
         * 将Spring应用启动起来
         * 参数一： primarySource ：主程序类的Class类类型。
         * 参数二： args ： 启动时需要加载的参数。
         */
        SpringApplication.run(Day01SpringbootStartApplication.class, args);
    }

}
