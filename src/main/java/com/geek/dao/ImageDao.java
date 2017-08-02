package com.geek.dao;

import com.geek.entity.Image;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yuanyang
 */
@Repository
public interface ImageDao {

    /**
     * 添加一张图片
     * @param image
     * @return
     */
    int insertImage(Image image);

    /**
     * 删除一张图片
     * @param imageId
     * @return
     */
    int deleteImage(Integer imageId);

    /**
     * 批量删除图片
     * @param imageIds
     * @return
     */
    int deleteImages(@Param("imageIds") List<Integer> imageIds);

    /**
     * 修改一张图片
     * @param image
     * @return
     */
    int updateImage(Image image);

    /**
     * 查找所有的图片
     * @return
     */
    List<Image> selectAllImages();

}
