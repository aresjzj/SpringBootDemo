package com.example.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "测试消息", tags = { "测试消息登陆" })
public class HelloWorldController {
 
	@RequestMapping(value = "/getIndex", method = { RequestMethod.POST })
    @ApiOperation(value = "测试",notes = "输入个名字试试")
	@ApiImplicitParams({
        @ApiImplicitParam(paramType = "query", dataType = "String", name = "name",value = "用户名称")
    })
	public String index(String name) {
		if (null == name) {
			name = "boy";
		}

		return "hello world " + name;
	}
}
