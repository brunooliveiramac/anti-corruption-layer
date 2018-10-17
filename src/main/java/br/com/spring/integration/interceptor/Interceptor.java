package br.com.spring.integration.interceptor;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.w3c.dom.Node;

import javax.xml.transform.dom.DOMSource;

public class Interceptor implements ClientInterceptor {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
		WebServiceMessage message = messageContext.getRequest();
		DOMSource source = (DOMSource) message.getPayloadSource();

		System.out.println("@@@@@@@@@ source" + source.toString());

		Node name = source.getNode().getAttributes().getNamedItem("nome");
//
//		String oldValue = name.getNodeValue();
//		name.setNodeValue("This Testing was intercepted!");
//
//		logger.info("Before endpoint invocation. Changed quantity old value {} for {}", oldValue, 5);

		return true;
	}

	public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
		logger.info("endpoint invocation succeed");

		return true;
	}

	public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
		logger.info("endpoint returned a fault");

		return true;
	}
}
