package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.dcim.nested.NestedSiteGroup;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

import java.util.Date;

@Getter
public class SiteGroup {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    NestedSiteGroup parent;
    String description;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer siteCount;
    @MapperOptions(name = "_depth")
    Integer depth;

}
