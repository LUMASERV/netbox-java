package com.lumaserv.netbox.model.dcim.nested;

import lombok.Getter;

@Getter
public class NestedDeviceType {

    Integer id;
    String url;
    String display;
    NestedManufacturer manufacturer;
    String model;
    String slug;
    Integer deviceCount;

}
