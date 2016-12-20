package com.atguigu.cxf.client;

import com.atguigu.cxf.spring.HelloWorld;
import com.atguigu.cxf.spring.HelloWorldImplService;

public class MainClient {

	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorldImplService().getHelloWorldImplPort();
		helloWorld.info("小明", "男");
	}
}
