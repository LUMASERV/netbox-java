package com.lumaserv.netbox.model.dcim.nested;

import lombok.Getter;

@Getter
public class NestedVirtualChassis {

    Integer id;
    String url;
    String name;
    NestedDevice master;
    Integer memberCount;

}
