package com.lumaserv.netbox.model.dcim.nested;

import lombok.Getter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
public class NestedLocation {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    Integer rackCount;
    @MapperOptions(name = "_depth")
    Integer depth;

}
