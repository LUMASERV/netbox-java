package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.dcim.nested.NestedDevice;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class DeviceBay {

    Integer id;
    String url;
    String display;
    NestedDevice device;
    String name;
    String label;
    String description;
    NestedDevice installedDevice;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;

}
