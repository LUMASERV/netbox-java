package com.lumaserv.netbox.model.dcim.writable;

import com.lumaserv.netbox.model.dcim.nested.NestedDevice;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableDevice {

    String name;
    Integer deviceType;
    Integer deviceRole;
    Integer tenant;
    Integer platform;
    String serial;
    String assetTag;
    Integer site;
    Integer location;
    Integer rack;
    Integer position;
    String face;
    NestedDevice parentDevice;
    String status;
    Integer primaryIp4;
    Integer primaryIp6;
    Integer cluster;
    Integer virtualChassis;
    Integer vcPosition;
    Integer vcPriority;
    String comments;
    String localContextData;
    NestedTag[] tags;
    AbstractObject customFields;

}
