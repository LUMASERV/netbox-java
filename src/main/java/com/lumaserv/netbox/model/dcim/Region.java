package com.lumaserv.netbox.model.dcim;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.netbox.model.dcim.nested.NestedRegion;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

import java.util.Date;

@Getter
public class Region {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    NestedRegion parent;
    String description;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer siteCount;
    @MapperOptions(name = "_depth")
    Integer depth;

}
