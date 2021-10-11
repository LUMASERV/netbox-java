package com.lumaserv.netbox.model.dcim.writable;

import lombok.Setter;

@Setter
public class WritablePowerOutletTemplate {

    Integer deviceType;
    String name;
    String label;
    String type;
    Integer powerPort;
    String feedLeg;
    String description;

}
