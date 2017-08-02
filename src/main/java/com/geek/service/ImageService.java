package com.geek.service;

import com.geek.dao.ImageDao;
import com.geek.entity.Image;
import com.geek.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageService {

    //图片持久层接口
    @Autowired
    private ImageDao imageDao;

    //文件存储工具类
    @Autowired
    private FileUtil fileUtil;

    /**
     * 插入一张图片
     * @param picture
     */
    public void insertImage(MultipartFile picture){

        Image image = new Image();
    }

}
