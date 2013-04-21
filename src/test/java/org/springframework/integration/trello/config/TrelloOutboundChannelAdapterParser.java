package org.springframework.integration.trello.config;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.integration.config.xml.AbstractOutboundChannelAdapterParser;
import org.w3c.dom.Element;

public class TrelloOutboundChannelAdapterParser extends AbstractOutboundChannelAdapterParser{

	@Override
	protected AbstractBeanDefinition parseConsumer(Element element,
			ParserContext parserContext) {
		return null;
	}

}
