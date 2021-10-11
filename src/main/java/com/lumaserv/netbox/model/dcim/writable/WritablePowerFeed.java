package com.lumaserv.netbox.model.dcim.writable;

import com.lumaserv.netbox.model.dcim.nested.NestedCable;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritablePowerFeed {

    Integer powerPanel;
    Integer rack;
    String name;
    String status;
    String type;
    String supply;
    String phase;
    Integer voltage;
    Integer amperage;
    Integer maxUtilization;
    String comments;
    Boolean markConnected;
    NestedCable cable;
    NestedTag[] tags;
    AbstractObject customFields;

}
