package com.yq.maintest;

import com.yq.bean.Computer;
import com.yq.bean.Person;
import com.yq.config.MainConfig;
import com.yq.controller.BaseController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

    @Autowired
    private BaseController baseController;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        Computer computer = (Computer) configApplicationContext.getBean("computer");
        System.out.println(computer.toString());

        String[] a = configApplicationContext.getBeanDefinitionNames();
        for (String s:
             a) {
            System.out.println(s);
        }
    }

    @Test
    public void controllerTest(){
        baseController.init();
    }
}
