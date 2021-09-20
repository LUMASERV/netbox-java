package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.NestedDeviceType;
import lombok.Getter;

import java.util.Date;

@Getter
public class InterfaceTemplate {

    Integer id;
    String url;
    String display;
    NestedDeviceType deviceType;
    String name;
    String label;
    LabeledString type;
    Boolean mgmtOnly;
    String description;
    Date created;
    Date lastUpdated;

}
