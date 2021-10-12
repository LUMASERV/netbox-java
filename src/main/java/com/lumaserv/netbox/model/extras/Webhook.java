package com.lumaserv.netbox.model.extras;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Webhook {

    Integer id;
    String url;
    String display;
    String[] contentTypes;
    String name;
    Boolean typeCreate;
    Boolean typeUpdate;
    Boolean typeDelete;
    String payloadUrl;
    Boolean enabled;
    String httpMethod;
    String httpContentType;
    String additionalHeaders;
    String bodyTemplate;
    String secret;
    Boolean sslVerification;
    String caFilePath;

}
