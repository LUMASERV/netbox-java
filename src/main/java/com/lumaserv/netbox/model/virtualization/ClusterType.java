package com.lumaserv.netbox.model.virtualization;

import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
@Setter
public class ClusterType {

    Integer id;
    String url;
    String display;
    String name;
    String slug;
    String description;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;
    Integer clusterCount;

}
