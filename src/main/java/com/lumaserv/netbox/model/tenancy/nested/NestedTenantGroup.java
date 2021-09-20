package com.lumaserv.netbox.model.tenancy.nested;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class NestedTenantGroup {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    Integer tenantCount;
    @SerializedName("_depth")
    Integer depth;

}
