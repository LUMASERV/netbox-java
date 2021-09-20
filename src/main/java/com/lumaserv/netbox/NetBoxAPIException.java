package com.lumaserv.netbox;

import lombok.Getter;
import org.javawebstack.httpclient.HTTPRequest;

@Getter
public class NetBoxAPIException extends Exception {

    final HTTPRequest request;

    public NetBoxAPIException(HTTPRequest request) {
        super("Error " + request.status());
        this.request = request;
    }

}
