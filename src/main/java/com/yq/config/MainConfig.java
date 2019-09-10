package com.yq.config;

import com.sun.org.apache.bcel.internal.generic.ConstantPushInstruction;
import com.yq.bean.Computer;
import com.yq.bean.Person;
import com.yq.condition.LinuxCondition;
import com.yq.condition.WindowsCondition;
import org.springframework.context.annotation.*;

@ComponentScan("com.controller.*")
@Configuration
public class MainConfig {

    /**
     * 懒加载注解@Lazy,等到需要时再进行实例化
     * @return
     */
    @Lazy
    @Bean("personal")
    public Person person(){
        return new Person();
    }

    @Lazy
    @Conditional({WindowsCondition.class})
    @Bean("computer")
    public Computer computer(){
        return new Computer("Windows",64,9000);
    }


    @Lazy
    @Bean("computer")
    @Conditional({LinuxCondition.class})
    public Computer computer1(){
        return new Computer("linux",32,8000);
    }

}
