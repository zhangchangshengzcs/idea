package com.hgc.controller;

import com.hgc.model.JsonData;
import com.hgc.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

@Controller
@PropertySource({"classpath:resource.properties"})
public class UserController {
    /*
    <p>时间：2018/12/24</p>
     */
    @GetMapping("/testjson")
    public @ResponseBody Object testJson(){
        String url="http://172.16.17.130/group1/M00/00/0C/rBARglwgmB6AIlBTAAAACu5oSVg461.pdf";
        int one=url.indexOf("//");
        int split=url.indexOf("/",one+2);
        String savaUrl=url.substring(split+1);
        System.out.println(split);
        System.out.println(savaUrl);
        return new User(25,"hello",new Date());
    }
    @GetMapping("/guimei")
    public String goToHtml(){
        return "CSS-guimei";
    }
    @GetMapping("/goUpload")
    public String gotoUpload(){
        return "upload";
    }

    /**
     * <p>时间：2018/12/25</p>
     */
    @Value("${web.file.path}")
    private static String filePath;
    @PostMapping("/upload")
    public @ResponseBody JsonData upload(@RequestParam("head_img") MultipartFile file, HttpServletRequest request){
        String name=request.getParameter("name");
        System.out.println("用户名："+name);
        //获取文件名
        String fileName=file.getOriginalFilename();
        System.out.println("上传的文件名为："+fileName);
        //获取文件的后缀名
        String suffixName=fileName.substring(fileName.lastIndexOf("."));
        System.out.println("上传的后缀名为："+suffixName);
        //文件上传后的路径
        fileName= UUID.randomUUID()+suffixName;
        System.out.println("转换后的名称："+fileName);
        File dest=new File(filePath+fileName);
        try {
            file.transferTo(dest);
            return new JsonData(0,fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JsonData(-1,"上传失败");
    }
}
