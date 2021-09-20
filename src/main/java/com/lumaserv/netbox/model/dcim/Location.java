package com.lumaserv.netbox.model.dcim;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.netbox.model.dcim.nested.NestedLocation;
import com.lumaserv.netbox.model.dcim.nested.NestedSite;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class Location {

    Integer od;
    String url;
    String display;
    String name;
    String slug;
    NestedSite site;
    NestedLocation parent;
    String description;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer rackCount;
    Integer deviceCount;
    @SerializedName("_depth")
    Integer depth;

}
