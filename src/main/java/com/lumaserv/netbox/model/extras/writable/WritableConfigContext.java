package com.lumaserv.netbox.model.extras.writable;

import lombok.Setter;

@Setter
public class WritableConfigContext {

    String name;
    Integer weight;
    String description;
    Boolean isActive;
    int[] regions;
    int[] siteGroups;
    int[] sites;
    int[] deviceTypes;
    int[] roles;
    int[] platforms;
    int[] clusterGroups;
    int[] clusters;
    int[] tenantGroups;
    int[] tenants;
    String[] tags;
    String data;

}
