package com.lumaserv.netbox.model.ipam;

import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
@Setter
public class RIR {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    Boolean isPrivate;
    String description;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer aggregateCount;

}
