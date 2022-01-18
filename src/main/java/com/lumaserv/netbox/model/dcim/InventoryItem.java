package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.dcim.nested.NestedDevice;
import com.lumaserv.netbox.model.dcim.nested.NestedManufacturer;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

import java.util.Date;

@Getter
public class InventoryItem {

    Integer id;
    String url;
    String display;
    NestedDevice device;
    Integer parent;
    String name;
    String label;
    NestedManufacturer manufacturer;
    String partId;
    String serial;
    String assetTag;
    Boolean discovered;
    String description;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    @MapperOptions(name = "_depth")
    Integer depth;

}
