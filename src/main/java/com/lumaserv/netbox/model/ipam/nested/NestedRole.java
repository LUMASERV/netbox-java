package com.lumaserv.netbox.model.ipam.nested;

import lombok.Getter;

@Getter
public class NestedRole {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    Integer prefixCount;
    Integer vlanCount;

}
