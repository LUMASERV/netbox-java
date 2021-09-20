package com.lumaserv.netbox.model.dcim.nested;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class NestedLocation {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    Integer rackCount;
    @SerializedName("_depth")
    Integer depth;

}
