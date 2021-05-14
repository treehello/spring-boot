package com.hq;

import com.hq.pojo.Dog;
import com.hq.pojo.Person;
import com.hq.pojo.Score;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Scanner;

/**
 * 标准测试类里是要有@RunWith的，作用是告诉java你这个类通过用什么运行环境运行，
 * 例如 启动和创建spring的应用上下文。否则你需要为此在启动时写一堆的环境配置代码。
 *  在IDEA里去掉@RunWith仍然能跑是因为在IDEA里识别为一个JUNIT的运行环境，
 * 相当于就是一个自识别的RunWith环境配置。但在其他IDE里并没有。
 * 所以，为了代码能在其他IDE里边正常运行，建议还是加 @RunWith
 */
@RunWith(SpringRunner.class)

/**
 * @SpringBootTest 标注该类是springBoot程序的测试类。
 *  使用此注解后，该类会注册到spring容器中。
 *  这时，该类就可以使用注解进行自动装配其他组件。
 */
@SpringBootTest
class TestBeanBinding {

    @Autowired
    private Person person;

    @Autowired
    private Dog dog;

    @Autowired
    private ApplicationContext context;

    @Autowired
    private Score score;

    /**
     * 演示@ConfigurationProperties注解的功能。
     */
    @Test
    public void testConfigurationProperties() {

        System.out.println(person);
    }

    /**
     * 演示@PropertySource注解的功能
     */
    @Test
    public void testPropertySource(){

        System.out.println(dog);
    }

    /**
     * 演示@ImportResource注解的功能
     */
    @Test
    public void testImportResource(){

        //判断是否有id属性值为score的组件。
        boolean existsScore = context.containsBean("score");
        System.out.println(existsScore);
    }

    /**
     * 演示在资源文件中使用占位符
     */
    @Test
    public void testPlaceholder(){

        System.out.println(score);
    }
}
