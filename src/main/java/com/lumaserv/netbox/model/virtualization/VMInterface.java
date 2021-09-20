package com.lumaserv.netbox.model.virtualization;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import com.lumaserv.netbox.model.ipam.nested.NestedVLAN;
import com.lumaserv.netbox.model.virtualization.nested.NestedVMInterface;
import com.lumaserv.netbox.model.virtualization.nested.NestedVirtualMachine;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class VMInterface {

    Integer id;
    String url;
    String display;
    NestedVirtualMachine virtualMachine;
    String name;
    Boolean enabled;
    NestedVMInterface parent;
    Integer mtu;
    String macAddress;
    String description;
    LabeledString mode;
    NestedVLAN untaggedVlan;
    NestedVLAN[] taggedVlans;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer countIpaddresses;

}
