package com.testrabbitmq.producter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MQProducerImpl implements MQProducer {

	@Autowired
	private AmqpTemplate amqpTemplate;

    public static final Logger logger = LoggerFactory.getLogger(MQProducerImpl.class);

	public void sendDataToQueue(String queueKey, Object object) {
		try {
			amqpTemplate.convertAndSend(queueKey, object);
		} catch (Exception e) {
			logger.debug(e.getMessage());
		}
	}

}
