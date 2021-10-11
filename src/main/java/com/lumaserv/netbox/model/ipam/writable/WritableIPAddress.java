package com.lumaserv.netbox.model.ipam.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableIPAddress {

    String address;
    Integer vrf;
    Integer tenant;
    String status;
    String role;
    String assignedObjectType;
    Integer assignedObjectId;
    Integer natInside;
    String dnsName;
    String description;
    NestedTag[] tags;
    AbstractObject customFields;

}
