package com.geek.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Image {

    //图片编号,自增
    private Integer imageId;
    //图片名称
    private String imageName;
    //图片虚拟地址
    private String imageAddress;
    //图片类型
    private String imageType;
    //图片大小
    private Integer imageSize;
    //图片插入时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date imageTime;

    public Image() {
    }

    public Image(Integer imageId, String imageName, String imageAddress, String imageType, Integer imageSize, Date imageTime) {
        this.imageId = imageId;
        this.imageName = imageName;
        this.imageAddress = imageAddress;
        this.imageType = imageType;
        this.imageSize = imageSize;
        this.imageTime = imageTime;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageAddress() {
        return imageAddress;
    }

    public void setImageAddress(String imageAddress) {
        this.imageAddress = imageAddress;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public Integer getImageSize() {
        return imageSize;
    }

    public void setImageSize(Integer imageSize) {
        this.imageSize = imageSize;
    }

    public Date getImageTime() {
        return imageTime;
    }

    public void setImageTime(Date imageTime) {
        this.imageTime = imageTime;
    }

    @Override
    public String toString() {
        return "Image{" +
                "imageId=" + imageId +
                ", imageName='" + imageName + '\'' +
                ", imageAddress='" + imageAddress + '\'' +
                ", imageType='" + imageType + '\'' +
                ", imageSize=" + imageSize +
                ", imageTime=" + imageTime +
                '}';
    }
}
