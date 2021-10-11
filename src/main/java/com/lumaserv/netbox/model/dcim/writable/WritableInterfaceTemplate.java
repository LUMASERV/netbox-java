package com.lumaserv.netbox.model.dcim.writable;

import lombok.Setter;

@Setter
public class WritableInterfaceTemplate {

    Integer deviceType;
    String name;
    String label;
    String type;
    Boolean mgmtOnly;
    String description;

}
