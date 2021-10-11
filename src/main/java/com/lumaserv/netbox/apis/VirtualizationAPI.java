package com.lumaserv.netbox.apis;

import com.lumaserv.netbox.NetBoxAPIException;
import com.lumaserv.netbox.NetBoxClient;
import com.lumaserv.netbox.model.dcim.Interface;
import com.lumaserv.netbox.model.ipam.Aggregate;
import com.lumaserv.netbox.model.virtualization.*;
import com.lumaserv.netbox.model.virtualization.writable.WritableCluster;
import com.lumaserv.netbox.model.virtualization.writable.WritableVMInterface;
import com.lumaserv.netbox.model.virtualization.writable.WritableVirtualMachine;
import com.lumaserv.netbox.query.DefaultQuery;
import com.lumaserv.netbox.request.CreateRequest;
import com.lumaserv.netbox.response.ListResponse;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class VirtualizationAPI {

    final NetBoxClient client;

    public ClusterGroup createCluster(ClusterGroup body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/virtualization/cluster-groups/", null, new CreateRequest().setData(body), ClusterGroup.class);
    }

    public List<ClusterGroup> getClusterGroups(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/virtualization/cluster-groups/", query, null, ListResponse.class).getResults(ClusterGroup.class);
    }

    public ClusterGroup getClusterGroup(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/virtualization/cluster-groups/" + id + "/", null, null, ClusterGroup.class);
    }

    public void deleteClusterGroup(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/virtualization/cluster-groups/" + id + "/", null, null, null);
    }

    public List<ClusterType> getClusterTypes(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/virtualization/cluster-types/", query, null, ListResponse.class).getResults(ClusterType.class);
    }

    public ClusterType getClusterType(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/virtualization/cluster-types/" + id + "/", null, null, ClusterType.class);
    }

    public void deleteClusterType(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/virtualization/cluster-types/" + id + "/", null, null, null);
    }

    public Cluster createCluster(WritableCluster body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/virtualization/clusters/", null, new CreateRequest().setData(body), Cluster.class);
    }

    public List<Cluster> getClusters(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/virtualization/clusters/", query, null, ListResponse.class).getResults(Cluster.class);
    }

    public Cluster getCluster(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/virtualization/clusters/" + id + "/", null, null, Cluster.class);
    }

    public void deleteCluster(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/virtualization/clusters/" + id + "/", null, null, null);
    }

    public VMInterface createVMInterface(WritableVMInterface body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/virtualization/interfaces/", null, new CreateRequest().setData(body), VMInterface.class);
    }

    public List<VMInterface> getInterfaces(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/virtualization/interfaces/", query, null, ListResponse.class).getResults(VMInterface.class);
    }

    public VMInterface getInterface(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/virtualization/interfaces/" + id + "/", null, null, VMInterface.class);
    }

    public void deleteInterface(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/virtualization/interfaces/" + id + "/", null, null, null);
    }

    public VirtualMachine createVirtualMachine(WritableVirtualMachine body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/virtualization/virtual-machines/", null, new CreateRequest().setData(body), VirtualMachine.class);
    }

    public List<VirtualMachine> getVirtualMachines(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/virtualization/virtual-machines/", query, null, ListResponse.class).getResults(VirtualMachine.class);
    }

    public VirtualMachine getVirtualMachine(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/virtualization/virtual-machines/" + id + "/", null, null, VirtualMachine.class);
    }

    public void deleteVirtualMachine(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/virtualization/virtual-machines/" + id + "/", null, null, null);
    }

}
