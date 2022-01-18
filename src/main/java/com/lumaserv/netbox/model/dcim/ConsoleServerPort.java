package com.lumaserv.netbox.model.dcim;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.netbox.model.LabeledInteger;
import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.NestedCable;
import com.lumaserv.netbox.model.dcim.nested.NestedDevice;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

import java.util.Date;

@Getter
public class ConsoleServerPort {

    Integer id;
    String url;
    String display;
    NestedDevice device;
    String name;
    String label;
    LabeledString type;
    LabeledInteger speed;
    String description;
    Boolean markConnected;
    NestedCable cable;
    AbstractObject cablePeer;
    String cablePeerType;
    AbstractObject connectedEndpoint;
    String connectedEndpointType;
    Boolean connectedEndpointReachable;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    @MapperOptions(name = "_occupied")
    Boolean occupied;

}
