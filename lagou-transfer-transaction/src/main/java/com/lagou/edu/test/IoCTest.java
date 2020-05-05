package com.lagou.edu.test;

import com.lagou.edu.SpringConfig;
import com.lagou.edu.service.TransferService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCTest {

    /**
     * 测试anno aop
     */
    @Test
    public void testXmlAnnoAop() throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        TransferService transferService = applicationContext.getBean(TransferService.class);
        System.out.println(transferService);
//        transferService.transfer("6029621011000","6029621011001",100);
    }
}
