package com.accp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/")
public class FilesUploadController {

    @Value("${pathUpload-url}")
    String pathUploadUrl;

    /**
     * @Title: uploadSource
     * @Description: 文件上传，返回文件的存储路径
     * @param file
     * @return Object
     * @author hzp
     * @date 2019年5月6日下午9:51:16
     */
    @RequestMapping(value="/filesUpload" , method = RequestMethod.POST)
    @ResponseBody
    public String filesUpload(@RequestParam("file") MultipartFile file , HttpServletRequest request) {
        System.out.println(file);
        String pathString = null;
        String name = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_" +file.getOriginalFilename();
        if(file!=null) {
            pathString = pathUploadUrl + name;
        }
        try {
            File files=new File(pathString);
            //打印查看上传路径
            System.out.println(pathString);
            if(!files.getParentFile().exists()){
                files.getParentFile().mkdirs();
            }
            file.transferTo(files);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //return "{\"code\":0,\"msg\":\""+pathString+"\"}";
        return "{\n" +
                "  \"code\": 0\n" +
                "  ,\"msg\": \"\"\n" +
                "  ,\"data\": {\n" +
                "    \"src\": \"http://120.27.93.156:8082/"+name+"\"\n" +
                "  }\n" +
                "} ";
    }
}
