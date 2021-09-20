package com.lumaserv.netbox.model.dcim.nested;

import lombok.Getter;

@Getter
public class NestedDeviceRole {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    Integer deviceCount;
    Integer virtualmachineCount;

}
