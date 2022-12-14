package org.seayaa.prometheus.server.filter;

import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.filter.ClientFilter;

import javax.ws.rs.core.MultivaluedMap;

/**
 * @Program: cloud
 * @Description:
 * @Author: Seayaa
 * @Create: 2021/5/1
 */
public class CloudClientFilterImpl extends ClientFilter {
    @Override
    public ClientResponse handle(ClientRequest clientRequest) throws ClientHandlerException {
        MultivaluedMap<String, Object> headers = clientRequest.getHeaders();
        ClientResponse response = getNext().handle(clientRequest);
        return response;
    }
}
