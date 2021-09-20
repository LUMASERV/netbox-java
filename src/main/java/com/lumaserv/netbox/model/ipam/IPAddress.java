package com.lumaserv.netbox.model.ipam;

import com.lumaserv.netbox.model.LabeledInteger;
import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import com.lumaserv.netbox.model.ipam.nested.NestedIPAddress;
import com.lumaserv.netbox.model.ipam.nested.NestedVRF;
import com.lumaserv.netbox.model.tenancy.nested.NestedTenant;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class IPAddress {

    Integer id;
    String url;
    String display;
    LabeledInteger family;
    String address;
    NestedVRF vrf;
    NestedTenant tenant;
    LabeledString status;
    LabeledString role;
    String assignedObjectType;
    Integer assignedObjectId;
    AbstractObject assignedObject;
    NestedIPAddress natInside;
    NestedIPAddress natOutside;
    String dnsName;
    String description;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;

}
