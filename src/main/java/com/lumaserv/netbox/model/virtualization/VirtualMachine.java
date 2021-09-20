package com.lumaserv.netbox.model.virtualization;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.NestedDeviceRole;
import com.lumaserv.netbox.model.dcim.nested.NestedPlatform;
import com.lumaserv.netbox.model.dcim.nested.NestedSite;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import com.lumaserv.netbox.model.ipam.nested.NestedIPAddress;
import com.lumaserv.netbox.model.tenancy.nested.NestedTenant;
import com.lumaserv.netbox.model.virtualization.nested.NestedCluster;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class VirtualMachine {

    Integer id;
    String url;
    String display;
    String name;
    LabeledString status;
    NestedSite site;
    NestedCluster cluster;
    NestedDeviceRole role;
    NestedTenant tenant;
    NestedPlatform platform;
    NestedIPAddress primaryIp;
    NestedIPAddress primaryIp4;
    NestedIPAddress primaryIp6;
    Integer vcpus;
    Integer memory;
    Integer disk;
    String comments;
    String localContextData;
    NestedTag[] tags;
    AbstractObject customFields;
    AbstractObject configContext;
    Date created;
    Date lastUpdated;

}
