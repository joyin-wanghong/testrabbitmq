package com.testrabbitmq.producter;

public interface MQProducer {
	public void sendDataToQueue(String queueKey, Object object);
}
