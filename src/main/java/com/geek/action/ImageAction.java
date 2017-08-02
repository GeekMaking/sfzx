package com.geek.action;

import com.geek.entity.Image;
import com.geek.service.ImageService;
import com.geek.util.Result;
import com.geek.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;

/**
 * @author yuanyang
 */
@Controller
public class ImageAction {

    //图片服务类
    @Autowired
    private ImageService service;

    @ResponseBody
    @RequestMapping(value = "/insertImage",method = RequestMethod.POST)
    public Result insertImage(MultipartFile picture){
        service.insertImage(picture);
        return ResultUtil.successResult(null);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteImage",method = RequestMethod.GET)
    public Result deleteImage(Integer imageId){
        service.deleteImage(imageId);
        return ResultUtil.successResult(null);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteImages",method = RequestMethod.GET)
    public Result deleteImages(Integer[] imageIds){
        service.deleteImages(Arrays.asList(imageIds));
        return ResultUtil.successResult(null);
    }

    @ResponseBody
    @RequestMapping(value = "/updateImage",method = RequestMethod.POST)
    public Result updateImage(Image image, MultipartFile picture){
        service.updateImage(image,picture);
        return ResultUtil.successResult(null);
    }

    @ResponseBody
    @RequestMapping(value = "/selectAllImages",method = RequestMethod.GET)
    public Result selectAllImages(){
        List<Image> images = service.selectAllImages();
        return ResultUtil.successResult(images);
    }
}
