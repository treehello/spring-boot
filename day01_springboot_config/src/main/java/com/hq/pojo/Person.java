package com.hq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 黄强
 * @date 2021/4/9 - 15:15
 */
//为该类的所有属性添加get、set方法，为该类添加equals、canEquals、hashCode、toString方法。
@Data

//为该类添加一个全参构造器。需要注意的是：由于此时已经有构造器了，Java不再提供无参构造器
@AllArgsConstructor

//为该类添加一个无参构造器。
@NoArgsConstructor

@Component

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties ：
 *
 * 告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 *      默认是从全局配置文件(application.xxx)中获取值。
 *
 * prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
 *
 * 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能；
 *      即spring容器中必须要有该组件的实例。否则会报错。
 */
@ConfigurationProperties(prefix = "person")

/**
 * @Validated 如果 该类使用了@ConfigurationProperties 注解将类中的所有属性和配置文件中相关的配置进行绑定。
 *          在启动springBoot主程序进行数据注入时，会开启JSR 303 数据校验。
 */
@Validated
public class Person {

    //姓名,在进行数据注入时，验证长度是否在2~5之间。
    @Size(min = 2 , max = 5)
    private String name;

    //年龄
    private Integer age;

    //生日
    private Date birthday;

    private List<Object> objectList;

    private String strings[];

    private Map<String, Object> map;

    private Dog dog;
}
