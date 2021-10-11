package com.lumaserv.netbox.model.dcim.writable;

import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableDeviceBay {

    Integer device;
    String name;
    String label;
    String description;
    Integer installedDevice;
    NestedTag[] tags;
    AbstractObject customFields;

}
