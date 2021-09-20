package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.*;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import com.lumaserv.netbox.model.ipam.nested.NestedIPAddress;
import com.lumaserv.netbox.model.tenancy.nested.NestedTenant;
import com.lumaserv.netbox.model.virtualization.nested.NestedCluster;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class Device {

    Integer id;
    String url;
    String display;
    String name;
    NestedDeviceType deviceType;
    NestedDeviceRole deviceRole;
    NestedTenant tenant;
    NestedPlatform platform;
    String serial;
    String assetTag;
    NestedSite site;
    NestedLocation location;
    NestedRack rack;
    Integer position;
    LabeledString face;
    NestedDevice parentDevice;
    LabeledString status;
    NestedIPAddress primaryIp;
    NestedIPAddress primaryIp4;
    NestedIPAddress primaryIp6;
    NestedCluster cluster;
    NestedVirtualChassis virtualChassis;
    Integer vcPosition;
    Integer vcPriority;
    String comments;
    String localContextData;
    NestedTag[] tags;
    AbstractObject customFields;
    AbstractObject configContext;
    Date created;
    Date lastUpdated;

}
