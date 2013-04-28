package org.springframework.integration.trello.outbound;

import org.springframework.integration.Message;
import org.springframework.integration.handler.AbstractMessageHandler;
import org.trello4j.Trello;

public class CardCreatingMessageHandler extends AbstractMessageHandler {

	private final Trello trelloTemplate;
	
	public CardCreatingMessageHandler(Trello trelloTemplate) {
		this.trelloTemplate = trelloTemplate;
	}
	
	@Override
	protected void handleMessageInternal(Message<?> message) throws Exception {

	}

}
