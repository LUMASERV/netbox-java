package com.lumaserv.netbox.model.extras;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomLink {

    Integer id;
    String url;
    String display;
    String contentType;
    String name;
    String linkText;
    String linkUrl;
    Integer weight;
    String groupName;
    String buttonClass;
    Boolean newWindow;

}
