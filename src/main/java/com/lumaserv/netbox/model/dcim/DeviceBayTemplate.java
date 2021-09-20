package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.dcim.nested.NestedDeviceType;
import lombok.Getter;

import java.util.Date;

@Getter
public class DeviceBayTemplate {

    Integer id;
    String url;
    String display;
    NestedDeviceType deviceType;
    String name;
    String label;
    String description;
    Date created;
    Date lastUpdated;

}
