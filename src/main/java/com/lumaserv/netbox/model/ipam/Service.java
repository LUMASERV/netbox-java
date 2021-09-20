package com.lumaserv.netbox.model.ipam;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.NestedDevice;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import com.lumaserv.netbox.model.ipam.nested.NestedIPAddress;
import com.lumaserv.netbox.model.virtualization.nested.NestedVirtualMachine;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class Service {

    Integer id;
    String url;
    String display;
    NestedDevice device;
    NestedVirtualMachine virtualMachine;
    String name;
    int[] ports;
    LabeledString protocol;
    NestedIPAddress[] ipaddresses;
    String description;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;

}
