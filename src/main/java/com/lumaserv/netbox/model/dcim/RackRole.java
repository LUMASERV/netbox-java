package com.lumaserv.netbox.model.dcim;

import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class RackRole {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    String color;
    String description;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer rackCount;

}
