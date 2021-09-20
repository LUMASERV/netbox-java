package com.lumaserv.netbox.model.extras;

import lombok.Getter;

@Getter
public class Tag {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    String color;
    String description;
    Integer taggedItems;

}
