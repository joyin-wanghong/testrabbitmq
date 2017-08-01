package com.testrabbitmq.messagereceive;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class QueueListenter implements MessageListener {
	
	public void onMessage(Message msg) {
		try{
            System.out.println("properties:"+msg.getMessageProperties().toString());	//打印所有属性
            System.out.println("messageid:"+msg.getMessageProperties().getMessageId());
            System.out.println("appid:"+msg.getMessageProperties().getAppId());
            System.out.println("contenttype:"+msg.getMessageProperties().getContentType());
            
            System.out.println("receivedexchange:"+msg.getMessageProperties().getReceivedExchange());
            System.out.println("ConsumerQueue:"+msg.getMessageProperties().getConsumerQueue());

            System.out.println("content:"+new String(msg.getBody(),"utf-8"));		//获取消息内容
        }catch(Exception e){
            e.printStackTrace();
        }
	}

}
