package com.testrabbitmq.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.testrabbitmq.producter.MQProducerImpl;

@Controller
@RequestMapping("/testrabbitmq")

public class TestController {
	@Resource
	private MQProducerImpl mp;
	
	@RequestMapping("/doTest")
	@ResponseBody
	public Object testRabbitMq() {
		mp.sendDataToQueue("test_queue_3", "这是向 test_queue_3 发送的消息 内容");		//向队列test_queue_3 中发送消息
		mp.sendDataToQueue("r_test_queue_key", "这是向 test_queue_2 发送的消息 内容");		//向队列test_queue_key中发送消息
		return "v";
	}
}
