package com.lumaserv.netbox.model.virtualization.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableVMInterface {

    Integer virtualMachine;
    String name;
    Boolean enabled;
    Integer parent;
    Integer mtu;
    String macAddress;
    String description;
    String mode;
    Integer untaggedVlan;
    int[] taggedVlans;
    NestedTag[] tags;
    AbstractObject customFields;

}
