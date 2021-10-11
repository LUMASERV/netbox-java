package com.lumaserv.netbox.model.dcim.writable;

import lombok.Setter;

@Setter
public class WritableFrontPortTemplate {

    Integer deviceType;
    String name;
    String label;
    String type;
    String color;
    Integer rearPort;
    Integer rearPortPosition;
    String description;

}
