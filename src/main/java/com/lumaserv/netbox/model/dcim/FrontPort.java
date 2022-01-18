package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.NestedCable;
import com.lumaserv.netbox.model.dcim.nested.NestedDevice;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

import java.util.Date;

@Getter
public class FrontPort {

    Integer id;
    String url;
    String display;
    NestedDevice device;
    String name;
    String label;
    LabeledString type;
    String color;
    FrontPortRearPort rearPort;
    Integer rearPortPosition;
    String description;
    Boolean markConnected;
    NestedCable cable;
    AbstractObject cablePeer;
    String cablePeerType;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    @MapperOptions(name = "_occupied")
    Boolean occupied;

}
