package com.testrabbitmq.messagereceive;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class QueueListenter implements MessageListener {
	
	public void onMessage(Message msg) {
		try{
            System.out.print(msg.getMessageProperties().toString());
        }catch(Exception e){
            e.printStackTrace();
        }
	}

}
