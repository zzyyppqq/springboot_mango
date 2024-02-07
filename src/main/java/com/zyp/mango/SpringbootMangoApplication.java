package com.zyp.mango;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * scanBasePackages: 配置包扫描，应用启动时自动扫描【com.zyp.mango】下的内容
 * SprinBoot默认会扫描启动类包及子包的组件
 */
@SpringBootApplication(scanBasePackages = {"com.zyp.mango"})
public class SpringbootMangoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMangoApplication.class, args);
    }

}
