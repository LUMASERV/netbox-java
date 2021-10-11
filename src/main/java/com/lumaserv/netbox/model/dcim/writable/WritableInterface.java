package com.lumaserv.netbox.model.dcim.writable;

import com.lumaserv.netbox.model.dcim.nested.NestedCable;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableInterface {

    Integer device;
    String name;
    String label;
    String type;
    Boolean enabled;
    Integer parent;
    Integer lag;
    Integer mtu;
    String macAddress;
    Boolean mgmtOnly;
    String description;
    String mode;
    Integer untaggedVlan;
    int[] taggedVlans;
    Boolean markConnected;
    NestedCable cable;
    NestedTag[] tags;
    AbstractObject customFields;

}
