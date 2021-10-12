package com.lumaserv.netbox.apis;

import com.lumaserv.netbox.NetBoxAPIException;
import com.lumaserv.netbox.NetBoxClient;
import com.lumaserv.netbox.model.ipam.*;
import com.lumaserv.netbox.model.ipam.writable.*;
import com.lumaserv.netbox.query.DefaultQuery;
import com.lumaserv.netbox.response.ListResponse;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class IPAMAPI {

    final NetBoxClient client;

    public Aggregate createAggregate(WritableAggregate body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/ipam/aggregates/", null, body, Aggregate.class);
    }

    public List<Aggregate> getAggregates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/aggregates/", query, null, ListResponse.class).getResults(Aggregate.class);
    }

    public Aggregate getAggregate(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/aggregates/" + id + "/", null, null, Aggregate.class);
    }

    public Aggregate updateAggregate(int id, WritableAggregate body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/ipam/aggregates/" + id + "/", null, body, Aggregate.class);
    }

    public Aggregate patchAggregate(int id, WritableAggregate body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/ipam/aggregates/" + id + "/", null, body, Aggregate.class);
    }

    public void deleteAggregate(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/aggregates/" + id + "/", null, null, null);
    }

    public IPAddress createIPAddress(WritableIPAddress body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/ipam/ip-addresses/", null, body, IPAddress.class);
    }

    public List<IPAddress> getIPAddresses(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/ip-addresses/", query, null, ListResponse.class).getResults(IPAddress.class);
    }

    public IPAddress getIPAddress(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/ip-addresses/" + id + "/", null, null, IPAddress.class);
    }

    public IPAddress updateIPAddress(int id, WritableIPAddress body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/ipam/ip-addresses/" + id + "/", null, body, IPAddress.class);
    }

    public IPAddress patchIPAddress(int id, WritableIPAddress body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/ipam/ip-addresses/" + id + "/", null, body, IPAddress.class);
    }

    public void deleteIPAddress(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/ip-addresses/" + id + "/", null, null, null);
    }

    public IPRange createIPRange(WritableIPRange body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/ipam/ip-ranges/", null, body, IPRange.class);
    }

    public List<IPRange> getIPRanges(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/ip-ranges/", query, null, ListResponse.class).getResults(IPRange.class);
    }

    public IPRange getIPRange(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/ip-ranges/" + id + "/", null, null, IPRange.class);
    }

    public IPRange updateIPRange(int id, WritableIPRange body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/ipam/ip-ranges/" + id + "/", null, body, IPRange.class);
    }

    public IPRange patchIPRange(int id, WritableIPRange body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/ipam/ip-ranges/" + id + "/", null, body, IPRange.class);
    }

    public void deleteIPRange(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/ip-ranges/" + id + "/", null, null, null);
    }

    public Prefix createPrefix(WritablePrefix body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/ipam/prefixes/", null, body, Prefix.class);
    }

    public List<Prefix> getPrefixes(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/prefixes/", query, null, ListResponse.class).getResults(Prefix.class);
    }

    public Prefix getPrefix(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/prefixes/" + id + "/", null, null, Prefix.class);
    }

    public Prefix updatePrefix(int id, WritablePrefix body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/ipam/prefixes/" + id + "/", null, body, Prefix.class);
    }

    public Prefix patchPrefix(int id, WritablePrefix body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/ipam/prefixes/" + id + "/", null, body, Prefix.class);
    }

    public void deletePrefix(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/prefixes/" + id + "/", null, null, null);
    }

    public RIR createRIR(RIR body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/ipam/rirs/", null, body, RIR.class);
    }

    public List<RIR> getRIRs(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/rirs/", query, null, ListResponse.class).getResults(RIR.class);
    }

    public RIR getRIR(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/rirs/" + id + "/", null, null, RIR.class);
    }

    public RIR updateRIR(int id, RIR body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/ipam/rirs/" + id + "/", null, body, RIR.class);
    }

    public RIR patchRIR(int id, RIR body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/ipam/rirs/" + id + "/", null, body, RIR.class);
    }

    public void deleteRIR(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/rirs/" + id + "/", null, null, null);
    }

    public Role createRole(Role body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/ipam/roles/", null, body, Role.class);
    }

    public List<Role> getRoles(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/roles/", query, null, ListResponse.class).getResults(Role.class);
    }

    public Role getRole(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/roles/" + id + "/", null, null, Role.class);
    }

    public Role updateRole(int id, Role body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/ipam/roles/" + id + "/", null, body, Role.class);
    }

    public Role patchRole(int id, Role body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/ipam/roles/" + id + "/", null, body, Role.class);
    }

    public void deleteRole(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/roles/" + id + "/", null, null, null);
    }

    public RouteTarget createRouteTargets(WritableRouteTarget body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/ipam/route-targets/", null, body, RouteTarget.class);
    }

    public List<RouteTarget> getRouteTargets(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/route-targets/", query, null, ListResponse.class).getResults(RouteTarget.class);
    }

    public RouteTarget getRouteTarget(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/route-targets/" + id + "/", null, null, RouteTarget.class);
    }

    public RouteTarget updateRouteTarget(int id, WritableRouteTarget body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/ipam/route-targets/" + id + "/", null, body, RouteTarget.class);
    }

    public RouteTarget patchRouteTarget(int id, WritableRouteTarget body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/ipam/route-targets/" + id + "/", null, body, RouteTarget.class);
    }

    public void deleteRouteTarget(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/route-targets/" + id + "/", null, null, null);
    }

    public Service createService(WritableService body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/ipam/services/", null, body, Service.class);
    }

    public List<Service> getServices(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/services/", query, null, ListResponse.class).getResults(Service.class);
    }

    public Service getService(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/services/" + id + "/", null, null, Service.class);
    }

    public Service updateService(int id, WritableService body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/ipam/services/" + id + "/", null, body, Service.class);
    }

    public Service patchService(int id, WritableService body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/ipam/services/" + id + "/", null, body, Service.class);
    }

    public void deleteService(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/services/" + id + "/", null, null, null);
    }

    public VLANGroup createVLANGroup(VLANGroup body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/ipam/vlan-groups/", null, body, VLANGroup.class);
    }

    public List<VLANGroup> getVLANGroups(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/vlan-groups/", query, null, ListResponse.class).getResults(VLANGroup.class);
    }

    public VLANGroup getVLANGroup(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/vlan-groups/" + id + "/", null, null, VLANGroup.class);
    }

    public VLANGroup updateVLANGroup(int id, VLANGroup body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/ipam/vlan-groups/" + id + "/", null, body, VLANGroup.class);
    }

    public VLANGroup patchVLANGroup(int id, VLANGroup body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/ipam/vlan-groups/" + id + "/", null, body, VLANGroup.class);
    }

    public void deleteVLANGroup(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/vlan-groups/" + id + "/", null, null, null);
    }

    public VLAN createVLAN(WritableVLAN body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/ipam/vlans/", null, body, VLAN.class);
    }

    public List<VLAN> getVLANs(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/vlans/", query, null, ListResponse.class).getResults(VLAN.class);
    }

    public VLAN getVLAN(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/vlans/" + id + "/", null, null, VLAN.class);
    }

    public VLAN updateVLAN(int id, WritableVLAN body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/ipam/vlans/" + id + "/", null, body, VLAN.class);
    }

    public VLAN patchVLAN(int id, WritableVLAN body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/ipam/vlans/" + id + "/", null, body, VLAN.class);
    }

    public void deleteVLAN(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/vlans/" + id + "/", null, null, null);
    }

    public VRF createVRF(WritableVRF body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/ipam/vrfs/", null, body, VRF.class);
    }

    public List<VRF> getVRFs(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/vrfs/", query, null, ListResponse.class).getResults(VRF.class);
    }

    public VRF getVRF(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/ipam/vrfs/" + id + "/", null, null, VRF.class);
    }

    public VRF updateVRF(int id, WritableVRF body) throws NetBoxAPIException {
        return client.apiRequest("PUT", "/ipam/vrfs/" + id + "/", null, body, VRF.class);
    }

    public VRF patchVRF(int id, WritableVRF body) throws NetBoxAPIException {
        return client.apiRequest("PATCH", "/ipam/vrfs/" + id + "/", null, body, VRF.class);
    }

    public void deleteVRF(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/ipam/vrfs/" + id + "/", null, null, null);
    }

}
