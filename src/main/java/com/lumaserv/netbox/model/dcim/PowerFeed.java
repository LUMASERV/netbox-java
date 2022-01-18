package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.NestedCable;
import com.lumaserv.netbox.model.dcim.nested.NestedPowerPanel;
import com.lumaserv.netbox.model.dcim.nested.NestedRack;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

import java.util.Date;

@Getter
public class PowerFeed {

    Integer id;
    String url;
    String display;
    NestedPowerPanel powerPanel;
    NestedRack rack;
    String name;
    LabeledString status;
    LabeledString type;
    LabeledString supply;
    LabeledString phase;
    Integer voltage;
    Integer amperage;
    Integer maxUtilization;
    String comments;
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
