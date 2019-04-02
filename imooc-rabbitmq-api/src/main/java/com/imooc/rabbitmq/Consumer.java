package com.imooc.rabbitmq;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author: zcs
 * @create: 2019/1/22 11:37
 **/
public class Consumer {
    public static void main(String[] args) throws IOException, TimeoutException {
        //1.创建一个ConnectionFactory，并进行配置
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("127.0.0.1");
        connectionFactory.setPort(5672);
        connectionFactory.setVirtualHost("/");
        //2.通过连接工厂创建连接
        Connection connection = connectionFactory.newConnection();
        //3.通过connection创建一个channel
        Channel channel = connection.createChannel();
        //4.声明（创建）一个队列
        String queueName = "test001";
        channel.queueDeclare(queueName, true, false, false, null);
        //5.创建消费者
//        DefaultConsumer defaultConsumer = new DefaultConsumer(channel);
        //6.设置Channel
        channel.basicConsume(queueName, true, new DefaultConsumer(channel){
                    @Override
                    public void handleDelivery(String consumerTag,
                                               Envelope envelope,
                                               AMQP.BasicProperties properties,
                                               byte[] body)
                            throws IOException
                    {
                        String routingKey = envelope.getRoutingKey();
                        String contentType = properties.getContentType();
                        long deliveryTag = envelope.getDeliveryTag();
                        // (process the message components here ...)
                        channel.basicAck(deliveryTag, false);
                    }
        });
        //7.获取消息
//        String msg = defaultConsumer.getConsumerTag();
//        System.out.println("消费者："+msg);
    }
}
