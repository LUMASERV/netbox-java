package com.lumaserv.netbox.apis;

import com.lumaserv.netbox.NetBoxAPIException;
import com.lumaserv.netbox.NetBoxClient;
import com.lumaserv.netbox.model.dcim.Interface;
import com.lumaserv.netbox.model.virtualization.Cluster;
import com.lumaserv.netbox.model.virtualization.ClusterGroup;
import com.lumaserv.netbox.model.virtualization.ClusterType;
import com.lumaserv.netbox.model.virtualization.VirtualMachine;
import com.lumaserv.netbox.query.DefaultQuery;
import com.lumaserv.netbox.response.ListResponse;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class VirtualizationAPI {

    final NetBoxClient client;

    public List<ClusterGroup> getClusterGroups(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/virtualization/cluster-groups/", query, null, ListResponse.class).getResults(ClusterGroup.class);
    }

    public List<ClusterType> getClusterTypes(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/virtualization/cluster-types/", query, null, ListResponse.class).getResults(ClusterType.class);
    }

    public List<Cluster> getClusters(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/virtualization/clusters/", query, null, ListResponse.class).getResults(Cluster.class);
    }

    public List<Interface> getInterfaces(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/virtualization/interfaces/", query, null, ListResponse.class).getResults(Interface.class);
    }

    public List<VirtualMachine> getVirtualMachines(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/virtualization/virtual-machines/", query, null, ListResponse.class).getResults(VirtualMachine.class);
    }

}
