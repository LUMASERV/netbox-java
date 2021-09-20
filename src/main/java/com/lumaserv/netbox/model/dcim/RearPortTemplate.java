package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.NestedDeviceType;
import lombok.Getter;

import java.util.Date;

@Getter
public class RearPortTemplate {

    Integer id;
    String url;
    String display;
    NestedDeviceType deviceType;
    String name;
    String label;
    LabeledString type;
    String color;
    Integer positions;
    String description;
    Date created;
    Date lastUpdated;

}
