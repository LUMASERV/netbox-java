package com.lumaserv.netbox.model.dcim.nested;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class NestedRegion {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    Integer siteCount;
    @SerializedName("_depth")
    Integer depth;

}
