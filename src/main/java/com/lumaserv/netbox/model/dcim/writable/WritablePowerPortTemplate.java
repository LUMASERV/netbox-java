package com.lumaserv.netbox.model.dcim.writable;

import lombok.Setter;

@Setter
public class WritablePowerPortTemplate {

    Integer deviceType;
    String name;
    String label;
    String type;
    Integer maximumDraw;
    Integer allocatedDraw;
    String description;

}
