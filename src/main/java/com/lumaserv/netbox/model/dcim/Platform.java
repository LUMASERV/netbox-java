package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.dcim.nested.NestedManufacturer;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class Platform {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    NestedManufacturer manufacturer;
    String napalmDriver;
    String napalmArgs;
    String description;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer deviceCount;
    Integer virtualmachineCount;

}
