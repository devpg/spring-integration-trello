package org.springframework.integration.trello.config;

import org.springframework.integration.config.xml.AbstractIntegrationNamespaceHandler;

public class TrelloNamespaceHandler extends AbstractIntegrationNamespaceHandler {

	public void init() {
		registerBeanDefinitionParser("card-outbound-channel-adapter", new TrelloOutboundChannelAdapterParser());
	}

}
