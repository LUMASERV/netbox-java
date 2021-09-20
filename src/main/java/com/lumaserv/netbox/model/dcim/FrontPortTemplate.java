package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.NestedDeviceType;
import com.lumaserv.netbox.model.dcim.nested.NestedRearPortTemplate;
import lombok.Getter;

import java.util.Date;

@Getter
public class FrontPortTemplate {

    Integer id;
    String url;
    String display;
    NestedDeviceType deviceType;
    String name;
    String label;
    LabeledString type;
    String color;
    NestedRearPortTemplate rearPort;
    Integer rearPortPosition;
    String description;
    Date created;
    Date lastUpdated;

}
