package com.lumaserv.netbox.model.ipam;

import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
@Setter
public class Role {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    Integer weight;
    String description;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer prefixCount;
    Integer vlanCount;

}
