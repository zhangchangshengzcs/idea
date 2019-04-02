package com.hgc;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author: zcs
 * @create: 2019/2/19 11:48
 *@description: 客户端
 **/
public class MyClient {
    public static void main(String[] args)throws Exception{
        Scanner scanner=new Scanner(System.in);
        System.out.println("客户端开始启动");
        Socket socket=new Socket("127.0.0.1",8989);
        OutputStream os=socket.getOutputStream();//获取一个字节输出流
        OutputStreamWriter osw=new OutputStreamWriter(os);//基于一个字节输出流获取一个字符输出流
        PrintWriter pw=new PrintWriter(osw);//基于一个字符输出流获取一个缓冲字符输出流
        System.out.println("请输入要发送给服务器的数据：");
        pw.print(scanner.next());//发送数据到服务器
        pw.close();
        osw.close();
        os.close();
        System.out.println("客户端执行完毕");
    }
}
