package com.lumaserv.netbox.model.dcim.nested;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class NestedInterface {

    Integer id;
    String url;
    String display;
    NestedDevice device;
    String name;
    Integer cable;
    @SerializedName("_occupied")
    String occupied;

}
