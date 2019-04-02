package com.imooc.exchange;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author: zcs
 * @create: 2019/1/22 14:56
 **/
public class ProducerDirectExchange {
    public static void main(String[] args) throws IOException, TimeoutException {
        //1.创建一个ConnectionFactory，并进行配置
        ConnectionFactory connectionFactory=new ConnectionFactory();
        connectionFactory.setHost("127.0.0.1");
        connectionFactory.setPort(5672);
        connectionFactory.setVirtualHost("/");
        //2.通过连接工厂创建连接
        Connection connection=connectionFactory.newConnection();
        //3.通过connection创建一个channel
        Channel channel=connection.createChannel();
        //4.声明
        String exchangeName="test_direct_exchange";
        String routingKey="test.direct";
        //5.发送
        String msg="hello wordld rabbitmq 4 direct exchange message";
        channel.basicPublish(exchangeName,routingKey,null,msg.getBytes());
    }
}
