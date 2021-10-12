package com.lumaserv.netbox.model.extras;

import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
@Setter
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
