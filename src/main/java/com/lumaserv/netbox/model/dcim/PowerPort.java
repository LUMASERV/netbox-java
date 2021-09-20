package com.lumaserv.netbox.model.dcim;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.NestedCable;
import com.lumaserv.netbox.model.dcim.nested.NestedDevice;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class PowerPort {

    Integer id;
    String url;
    String display;
    NestedDevice device;
    String name;
    String label;
    LabeledString type;
    Integer maximumDraw;
    Integer allocatedDraw;
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
    @SerializedName("_occupied")
    Boolean occupied;

}
