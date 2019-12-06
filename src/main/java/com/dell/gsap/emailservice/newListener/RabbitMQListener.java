package com.dell.gsap.emailservice.newListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQListener implements MessageListener{
	
	@Override
	public void onMessage(Message message) {
			
			System.out.println("Consuming message - " + new String(message.getBody()));
	}

}
