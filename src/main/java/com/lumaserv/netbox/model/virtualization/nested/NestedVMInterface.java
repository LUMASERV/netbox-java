package com.lumaserv.netbox.model.virtualization.nested;

import lombok.Getter;

import java.net.Inet4Address;

@Getter
public class NestedVMInterface {

    Inet4Address id;
    String url;
    String display;
    NestedVirtualMachine virtualMachine;
    String name;

}
