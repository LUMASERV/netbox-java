package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.NestedCable;
import com.lumaserv.netbox.model.dcim.nested.NestedDevice;
import com.lumaserv.netbox.model.dcim.nested.NestedPowerPort;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

import java.util.Date;

@Getter
public class PowerOutlet {

    Integer id;
    String url;
    String display;
    NestedDevice device;
    String name;
    String label;
    LabeledString type;
    NestedPowerPort powerPort;
    LabeledString feedLeg;
    String description;
    Boolean markConnected;
    NestedCable cable;
    AbstractObject cablePeer;
    String cablePeerType;
    AbstractObject connectedEndpoint;
    String connectedEndpointType;
    Boolean connectedEndpointReachable;
    NestedTag[] tags;
    Date created;
    Date lastUpdated;
    @MapperOptions(name = "_occupied")
    Boolean occupied;

}
