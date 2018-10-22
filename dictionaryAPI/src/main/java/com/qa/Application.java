package com.qa;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.qa.backend.utility.JSONUtility;

@SpringBootApplication(scanBasePackages = "com.qa")
public class Application {
	
	private static final String topicExchangeName = "spring-boot-exchange";

	private static final String queueName = "spring-boot";

	@Bean
	Queue queue() {
		return new Queue(queueName, false);
	}

	@Bean
	TopicExchange exchange() {
		return new TopicExchange(topicExchangeName);
	}

	@Bean
	Binding binding(Queue queue, TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with("foo.bar.#");
	}
	
	@Bean
	JSONUtility restTemplate() {
		return new JSONUtility();
	}
	
	public static String gettopicExchangeName() {
		return topicExchangeName;
	}
	
	public static String getqueueName() {
		return queueName;
	}
	
	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}
	
}