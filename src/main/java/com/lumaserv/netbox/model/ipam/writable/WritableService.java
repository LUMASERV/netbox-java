package com.lumaserv.netbox.model.ipam.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableService {

    Integer device;
    Integer virtualMachine;
    String name;
    int[] ports;
    String protocol;
    int[] ipaddresses;
    String description;
    NestedTag[] tags;
    AbstractObject customFields;

}
