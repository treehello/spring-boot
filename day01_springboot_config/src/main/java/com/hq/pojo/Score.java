package com.hq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author 黄强
 * @date 2021/4/9 - 21:23
 */
//为该类的所有属性添加get、set方法，为该类添加equals、canEquals、hashCode、toString方法。
@Data

//为该类添加一个全参构造器。需要注意的是：由于此时已经有构造器了，Java不再提供无参构造器
@AllArgsConstructor

//为该类添加一个无参构造器。
@NoArgsConstructor

@Component

/**
 * @PropertySource 加载指定的配置文件，只能加载xx.properties文件。
 *  使用此注解的前提：该组件必须在容器中注册。
 */
@PropertySource("classpath:properties/score.properties")

/**
 * @ConfigurationProperties : 将配置文件中，
 *      名称与prefix属性值相同的对象的属性与该组件的属性进行绑定。
 *   使用此注解的前提：该组件必须在容器中注册。
 */
@ConfigurationProperties(prefix = "score")
public class Score {

    private Integer id;

    private Double score;

    private String courseName;
}
