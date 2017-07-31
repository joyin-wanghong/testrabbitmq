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
		mp.sendDataToQueue("r_test_queue_key", "ÏûÏ¢ÄÚÈÝ£¡");
		return "v";
	}
}
