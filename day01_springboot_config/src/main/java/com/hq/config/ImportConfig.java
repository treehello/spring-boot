package com.hq.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * @author 黄强
 * @date 2021/4/9 - 21:05
 */

/**
 * @ImportResource ： 加载指定的spring的xml文件。只能在配置类上使用。
 * springBoot 不建议使用，springBoot官方建议使用全注解方式。
 */
//@ImportResource({"classpath:xml/beans.xml"})
@Configuration
public class ImportConfig {
}
