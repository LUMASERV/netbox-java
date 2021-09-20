package com.lumaserv.netbox.model.ipam.nested;

import lombok.Getter;

@Getter
public class NestedVRF {

    Integer id;
    String url;
    String display;
    String name;
    String rd;
    Integer prefixCount;

}
