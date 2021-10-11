package com.lumaserv.netbox.model.tenancy.writable;

import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

@Setter
public class WritableTenantGroup {

    String name;
    String slug;
    Integer parent;
    String description;
    AbstractObject customFields;

}
