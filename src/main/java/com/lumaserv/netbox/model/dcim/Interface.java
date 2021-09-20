package com.lumaserv.netbox.model.dcim;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.NestedCable;
import com.lumaserv.netbox.model.dcim.nested.NestedDevice;
import com.lumaserv.netbox.model.dcim.nested.NestedInterface;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import com.lumaserv.netbox.model.ipam.nested.NestedVLAN;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class Interface {

    Integer id;
    String url;
    String display;
    NestedDevice device;
    String name;
    String label;
    LabeledString type;
    Boolean enabled;
    NestedInterface parent;
    NestedInterface lag;
    Integer mtu;
    String macAddress;
    Boolean mgmtOnly;
    String description;
    LabeledString mode;
    NestedVLAN untaggedVlan;
    NestedVLAN taggedVlans;
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
    Integer countIpaddresses;
    @SerializedName("_occupied")
    Boolean occupied;

}
