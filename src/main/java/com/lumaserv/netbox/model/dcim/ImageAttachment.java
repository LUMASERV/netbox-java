package com.lumaserv.netbox.model.dcim;

import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class ImageAttachment {

    Integer id;
    String url;
    String display;
    String contentType;
    Integer objectId;
    AbstractObject parent;
    String name;
    String image;
    Integer imageHeight;
    Integer imageWidth;
    Date created;

}
