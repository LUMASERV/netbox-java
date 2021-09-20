package com.lumaserv.netbox.model.circuits;

import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class CircuitType {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    String description;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer circuitCount;

}
