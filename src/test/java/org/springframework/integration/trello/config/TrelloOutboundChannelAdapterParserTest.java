package org.springframework.integration.trello.config;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrelloOutboundChannelAdapterParserTest {

	@Test
	public void channelShouldContainTrelloTemplate() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("TrelloOutboundChannelAdapterParser-context.xml", this.getClass());
		System.out.println(ac.getBean("trelloAdapter").getClass());
		
	}

	
	
}
