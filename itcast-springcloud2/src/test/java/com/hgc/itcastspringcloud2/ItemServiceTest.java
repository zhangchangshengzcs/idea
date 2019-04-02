package com.hgc.itcastspringcloud2;

import com.hgc.ItcastSpringcloud2Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: zcs
 * @create: 2019/1/15 17:39
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItcastSpringcloud2Application.class)
public class ItemServiceTest {
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Test
    public void test(){
        String serviceId = "itcast-microservice-item";
        for (int i = 0; i < 100; i++) {
            ServiceInstance serviceInstance = this.loadBalancerClient.choose(serviceId);
            System.out.println("第"+(i+1)+"次：" + serviceInstance.getHost() + ": " + serviceInstance.getPort());
        }
    }

}
