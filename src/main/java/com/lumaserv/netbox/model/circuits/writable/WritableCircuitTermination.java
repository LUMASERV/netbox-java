package com.lumaserv.netbox.model.circuits.writable;

import com.lumaserv.netbox.model.dcim.nested.NestedCable;
import lombok.Setter;

@Setter
public class WritableCircuitTermination {

    Integer circuit;
    String termSide;
    Integer site;
    Integer providerNetwork;
    Integer portSpeed;
    Integer upstreamSpeed;
    String xconnectId;
    String ppInfo;
    String description;
    Boolean markConnected;
    NestedCable cable;

}
