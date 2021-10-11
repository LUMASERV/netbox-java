package com.lumaserv.netbox.model.dcim;

import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
@Setter
public class DeviceRole {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    String color;
    Boolean vmRole;
    String description;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer deviceCount;
    Integer virtualmachineCount;

}
