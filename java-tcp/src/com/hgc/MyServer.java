package com.hgc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: zcs
 * @create: 2019/2/19 11:23
 * @description: tcp服务器端
 **/
public class MyServer {
    public static void main(String[] args) throws Exception{
        System.out.println("服务器运行了");
        ServerSocket s=new ServerSocket(8989);//服务器端创建ServerSocket,监听8989端口
        Socket socket=s.accept();//等待客户端的连接,直到有客户端连接，否则会一致卡在这里
        InputStream is=socket.getInputStream();//获取一个字节输入流
        InputStreamReader isr=new InputStreamReader(is);//基于一个字节输入流获取一个字符输入流
        BufferedReader br=new BufferedReader(isr);//基于一个字符输入流获取一个缓冲字符输入流
        String sline=br.readLine();
        System.out.println("客户端发送的数据是："+sline);
        br.close();
        isr.close();
        is.close();
        System.out.println("服务器执行完毕了");
    }

}
