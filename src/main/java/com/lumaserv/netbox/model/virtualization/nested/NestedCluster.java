package com.lumaserv.netbox.model.virtualization.nested;

import lombok.Getter;

@Getter
public class NestedCluster {

    Integer id;
    String url;
    String display;
    String name;
    Integer virtualmachineCount;

}
