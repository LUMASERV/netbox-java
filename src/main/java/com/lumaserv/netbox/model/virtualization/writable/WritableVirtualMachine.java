package com.lumaserv.netbox.model.virtualization.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableVirtualMachine {

    String name;
    String status;
    Integer cluster;
    Integer role;
    Integer tenant;
    Integer platform;
    Integer primaryIp4;
    Integer primaryIp6;
    Integer vcpus;
    Integer memory;
    Integer disk;
    String comments;
    String localContextData;
    NestedTag[] tags;
    AbstractObject customFields;

}
