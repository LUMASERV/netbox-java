package com.lumaserv.netbox.apis;

import com.lumaserv.netbox.NetBoxAPIException;
import com.lumaserv.netbox.NetBoxClient;
import com.lumaserv.netbox.model.ipam.*;
import com.lumaserv.netbox.model.users.Group;
import com.lumaserv.netbox.query.DefaultQuery;
import com.lumaserv.netbox.response.ListResponse;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class IPAMAPI {

    final NetBoxClient client;

    public List<Aggregate> getAggregates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/aggregates/", query, null, ListResponse.class).getResults(Aggregate.class);
    }

    public Aggregate getAggregate(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/aggregates/" + id + "/", null, null, Aggregate.class);
    }

    public void deleteAggregate(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/aggregates/" + id + "/", null, null, null);
    }

    public List<IPAddress> getIPAddresses(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/ip-addresses/", query, null, ListResponse.class).getResults(IPAddress.class);
    }

    public IPAddress getIPAddress(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/ip-addresses/" + id + "/", null, null, IPAddress.class);
    }

    public void deleteIPAddress(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/ip-addresses/" + id + "/", null, null, null);
    }

    public List<IPRange> getIPRanges(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/ip-ranges/", query, null, ListResponse.class).getResults(IPRange.class);
    }

    public IPRange getIPRange(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/ip-ranges/" + id + "/", null, null, IPRange.class);
    }

    public void deleteIPRange(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/ip-ranges/" + id + "/", null, null, null);
    }

    public List<Prefix> getPrefixes(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/prefixes/", query, null, ListResponse.class).getResults(Prefix.class);
    }

    public Prefix getPrefix(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/prefixes/" + id + "/", null, null, Prefix.class);
    }

    public void deletePrefix(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/prefixes/" + id + "/", null, null, null);
    }

    public List<RIR> getRIRs(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/rirs/", query, null, ListResponse.class).getResults(RIR.class);
    }

    public RIR getRIR(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/rirs/" + id + "/", null, null, RIR.class);
    }

    public void deleteRIR(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/rirs/" + id + "/", null, null, null);
    }

    public List<Role> getRoles(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/roles/", query, null, ListResponse.class).getResults(Role.class);
    }

    public Role getRole(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/roles/" + id + "/", null, null, Role.class);
    }

    public void deleteRole(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/roles/" + id + "/", null, null, null);
    }

    public List<RouteTarget> getRouteTargets(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/route-targets/", query, null, ListResponse.class).getResults(RouteTarget.class);
    }

    public RouteTarget getRouteTarget(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/route-targets/" + id + "/", null, null, RouteTarget.class);
    }

    public void deleteRouteTarget(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/route-targets/" + id + "/", null, null, null);
    }

    public List<Service> getServices(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/services/", query, null, ListResponse.class).getResults(Service.class);
    }

    public Service getService(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/services/" + id + "/", null, null, Service.class);
    }

    public void deleteService(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/services/" + id + "/", null, null, null);
    }

    public List<VLANGroup> getVLANGroups(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/vlan-groups/", query, null, ListResponse.class).getResults(VLANGroup.class);
    }

    public VLANGroup getVLANGroup(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/vlan-groups/" + id + "/", null, null, VLANGroup.class);
    }

    public void deleteVLANGroup(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/vlan-groups/" + id + "/", null, null, null);
    }

    public List<VLAN> getVLANs(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/vlans/", query, null, ListResponse.class).getResults(VLAN.class);
    }

    public VLAN getVLAN(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/vlans/" + id + "/", null, null, VLAN.class);
    }

    public void deleteVLAN(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/vlans/" + id + "/", null, null, null);
    }

    public List<VRF> getVRFs(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/vrfs/", query, null, ListResponse.class).getResults(VRF.class);
    }

    public VRF getVRF(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/vrfs/" + id + "/", null, null, VRF.class);
    }

    public void deleteVRF(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/vrfs/" + id + "/", null, null, null);
    }

}
