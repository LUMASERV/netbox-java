package com.lumaserv.netbox.model.dcim;

import lombok.Getter;

@Getter
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
