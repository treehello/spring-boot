package com.hq;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 黄强
 * @date 2021/5/3 - 22:21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDay02SpringBootLog {

    /**
     * 方法功能：演示日志的输出。
     */
    @Test
    public void testPrintLog(){

        /*
         * SpringBoot能自动适配所有的日志，而且底层使用slf4j+logback的方式记录日志，
         * 引入其他框架的时候，只需要 把这个框架依赖的日志框架排除掉即可；
         */

        /**
         * .使用指定类初始化日志对象 在日志输出的时候，可以打印出日志信息所在的类，
         * 如下： Logger logger = LoggerFactory.getLogger(com.User.class);
         * logger.debug("用户信息");
         * 将会打印出: com.User : 用户信息
         */
        Logger logger = LoggerFactory.getLogger(TestDay02SpringBootLog.class);

        //日志的级别；
        // 由低到高 trace < debug < info < warn < error
        // 可以调整输出的日志级别；日志就只会在这个级别以以后的高级别生效
        logger.trace("这是trace日志...");
        logger.debug("这是debug日志...");

        //SpringBoot默认给我们使用的是info级别的，没有指定级别的就用SpringBoot默认规定的级别；root 级别
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");
    }
}
