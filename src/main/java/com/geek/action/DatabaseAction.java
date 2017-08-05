package com.geek.action;

import com.geek.util.MysqlDatabaseBackup;
import com.geek.util.Result;
import com.geek.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
public class DatabaseAction {

    @Autowired
    private MysqlDatabaseBackup mysqlDatabaseBackup;

    @ResponseBody
    @RequestMapping(value = "/database/backup",method = RequestMethod.GET)
    public Result backup(){
        mysqlDatabaseBackup.backup();
        String message = "您成功将数据库备份在" + mysqlDatabaseBackup.getSavePath() + "目录下";
        return ResultUtil.successResult(message);
    }

    @ResponseBody
    @RequestMapping(value = "/database/restore",method = RequestMethod.POST)
    public Result restore(MultipartFile multipartFile){
        mysqlDatabaseBackup.restore((File) multipartFile);
        String message = "您成功将备份" + multipartFile.getOriginalFilename() + "还原";
        return ResultUtil.successResult(message);
    }

}
