package com.lumaserv.netbox.model.circuits;

import com.lumaserv.netbox.model.circuits.nested.NestedCircuit;
import com.lumaserv.netbox.model.circuits.nested.NestedProviderNetwork;
import com.lumaserv.netbox.model.dcim.nested.NestedCable;
import com.lumaserv.netbox.model.dcim.nested.NestedSite;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
public class CircuitTermination {

    Integer id;
    String url;
    String display;
    NestedCircuit circuit;
    String termSide;
    NestedSite site;
    NestedProviderNetwork providerNetwork;
    Integer portSpeed;
    Integer upstreamSpeed;
    String xconnectId;
    String ppInfo;
    String description;
    Boolean markConnected;
    NestedCable cable;
    AbstractObject cablePeer;
    String cablePeerType;
    @MapperOptions(name = "_occupied")
    Boolean occupied;

}
