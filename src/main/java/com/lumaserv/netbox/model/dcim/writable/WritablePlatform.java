package com.lumaserv.netbox.model.dcim.writable;

import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritablePlatform {

    String name;
    String slug;
    Integer manufacturer;
    String napalmDriver;
    String napalmArgs;
    String description;
    AbstractObject customFields;

}
