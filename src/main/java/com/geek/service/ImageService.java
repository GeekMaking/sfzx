package com.geek.service;

import com.geek.dao.ImageDao;
import com.geek.entity.Image;
import com.geek.exception.ErrorException;
import com.geek.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author yuanyang
 */
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

    /**
     * 删除一张图片
     * @param imageId
     */
    public void deleteImage(Integer imageId){

    }

    /**
     * 批量删除图片
     * @param imageIds
     */
    public void deleteImages(List<Integer> imageIds){

    }

    /**
     * 修改一张图片
     * @param image
     * @param picture
     */
    public void updateImage(Image image,MultipartFile picture){

    }

    /**
     * 获取所有图片
     * @return
     */
    public List<Image> selectAllImages(){
        List<Image> images = imageDao.selectAllImages();
        if (images == null || images.size() == 0)
            throw new ErrorException("没有任何图片");
        return images;
    }
}
