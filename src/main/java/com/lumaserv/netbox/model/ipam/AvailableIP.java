package com.lumaserv.netbox.model.ipam;

import com.lumaserv.netbox.model.ipam.nested.NestedVRF;
import lombok.Getter;

@Getter
public class AvailableIP {

    Integer family;
    String address;
    NestedVRF vrf;

}
