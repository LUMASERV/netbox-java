package com.lumaserv.netbox.model.circuits;

import com.lumaserv.netbox.model.circuits.nested.NestedProviderNetwork;
import com.lumaserv.netbox.model.dcim.nested.NestedSite;
import lombok.Getter;

@Getter
public class CircuitCircuitTermination {

    Integer id;
    String url;
    String display;
    NestedSite site;
    NestedProviderNetwork providerNetwork;
    Integer portSpeed;
    Integer upstreamSpeed;
    String xconnectId;

}
