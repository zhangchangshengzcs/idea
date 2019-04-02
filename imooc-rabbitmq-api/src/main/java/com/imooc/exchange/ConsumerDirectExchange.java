package com.imooc.exchange;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author: zcs
 * @create: 2019/1/22 15:02
 **/
public class ConsumerDirectExchange {
    public static void main(String[] args) throws IOException, TimeoutException {
        //1.创建一个ConnectionFactory，并进行配置
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("127.0.0.1");
        connectionFactory.setPort(5672);
        connectionFactory.setVirtualHost("/");
        connectionFactory.setAutomaticRecoveryEnabled(true);//设置自动重连
        connectionFactory.setNetworkRecoveryInterval(3000);
        //2.通过连接工厂创建连接
        Connection connection = connectionFactory.newConnection();
        //3.通过connection创建一个channel
        Channel channel = connection.createChannel();
        //4.声明（创建）一个队列
        String exchangeName="test_direct_exchange";
        String exchangeType="direct";
        String queueName="test_direct_queue";
        String routingKey="test.direct";
        //表示声明了一个交换机
        channel.exchangeDeclare(exchangeName,exchangeType,true,false,false,null);
       //表示声明了一个队列
        channel.queueDeclare(queueName,false,false,false,null);
        //建立一个绑定关系
        channel.queueBind(queueName,exchangeName,routingKey);
        //durable 是否持久化消息
        //5.创建消费者
//        DefaultConsumer defaultConsumer = new DefaultConsumer(channel);
        //6.设置Channel
        //7.获取消息
//        String msg = defaultConsumer.getConsumerTag();
//        System.out.println("消费者："+msg);
    }
}
