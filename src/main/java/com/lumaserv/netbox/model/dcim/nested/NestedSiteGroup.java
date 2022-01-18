package com.lumaserv.netbox.model.dcim.nested;

import lombok.Getter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
public class NestedSiteGroup {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    Integer siteCount;
    @MapperOptions(name = "_depth")
    Integer depth;

}
