package com.lumaserv.netbox.model.ipam;

import com.lumaserv.netbox.model.ipam.nested.NestedVRF;
import lombok.Getter;

@Getter
public class AvailablePrefix {

    Integer family;
    String prefix;
    NestedVRF vrf;

}
