package com.geek.service;

import com.geek.dao.ContentDao;
import com.geek.entity.Content;
import com.geek.exception.ErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yuanyang
 */
@Service
public class ContentService {

    //内容持久层接口
    @Autowired
    private ContentDao contentDao;

    /**
     * 添加一项内容
     * @param content
     */
    public void insertContent(Content content){

    }

    /**
     * 删除一项内容
     * @param contentId
     */
    public void deleteContent(Integer contentId){

    }

    /**
     * 批量删除内容
     * @param contentIds
     */
    public void deleteContents(List<Integer> contentIds){

    }

    /**
     * 修改一项内容
     * @param content
     */
    public void updateContent(Content content){

    }

    /**
     * 获取所有的内容
     * @return
     */
    public List<Content> selectAllContents(){
        List<Content> contents = contentDao.selectAllContents();
        if (contents == null || contents.size() == 0){
            throw new ErrorException("没有任何内容");
        }
        return contents;
    }

    /**
     * 通过对应栏目查找内容
     * @param contentPart
     * @return
     */
    public List<Content> selectContentByPart(Integer contentPart){
        List<Content> contents = contentDao.selectContentByPart(contentPart);
        if (contents == null || contents.size() == 0){
            throw new ErrorException("没有任何内容");
        }
        return contents;
    }

}
