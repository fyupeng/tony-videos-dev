package com.tony.controller;

import com.tony.service.BgmService;
import com.tony.utils.IMoocJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "背景音乐业务的接口",tags = {"背景音乐业务的controller"})
@RequestMapping(value = "/bgm")
public class BgmController {
    @Autowired
    private BgmService bgmService;

    @ApiOperation(value = "获取背景音乐列表",notes = "获取背景音乐列表的接口")
    @PostMapping(value = "/list")
    public IMoocJSONResult list(){
        return IMoocJSONResult.ok(bgmService.queryBgmList());
    }

}
