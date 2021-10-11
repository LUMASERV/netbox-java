package com.lumaserv.netbox.apis;

import com.lumaserv.netbox.NetBoxAPIException;
import com.lumaserv.netbox.NetBoxClient;
import com.lumaserv.netbox.model.circuits.*;
import com.lumaserv.netbox.model.circuits.writable.WritableCircuit;
import com.lumaserv.netbox.model.circuits.writable.WritableCircuitTermination;
import com.lumaserv.netbox.model.circuits.writable.WritableProviderNetwork;
import com.lumaserv.netbox.model.dcim.Site;
import com.lumaserv.netbox.model.dcim.writable.WritableSite;
import com.lumaserv.netbox.query.DefaultQuery;
import com.lumaserv.netbox.request.CreateRequest;
import com.lumaserv.netbox.response.ListResponse;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CircuitsAPI {

    final NetBoxClient client;

    public CircuitTermination createCircuitTermination(WritableCircuitTermination body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/circuits/circuit-terminations/", null, new CreateRequest().setData(body), CircuitTermination.class);
    }

    public List<CircuitTermination> getCircuitTerminations(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/circuit-terminations/", query, null, ListResponse.class).getResults(CircuitTermination.class);
    }

    public CircuitTermination getCircuitTermination(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/circuit-terminations/" + id + "/", null, null, CircuitTermination.class);
    }

    public void deleteCircuitTermination(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/circuits/circuit-terminations/" + id + "/", null, null, null);
    }

    public CircuitType createCircuitType(CircuitType body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/circuits/circuit-types/", null, new CreateRequest().setData(body), CircuitType.class);
    }

    public List<CircuitType> getCircuitTypes(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/circuit-types/", query, null, ListResponse.class).getResults(CircuitType.class);
    }

    public CircuitType getCircuitType(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/circuit-types/" + id + "/", null, null, CircuitType.class);
    }

    public void deleteCircuitType(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/circuits/circuit-types/" + id + "/", null, null, null);
    }

    public Circuit createCircuit(WritableCircuit body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/circuits/circuits/", null, new CreateRequest().setData(body), Circuit.class);
    }

    public List<Circuit> getCircuits(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/circuits/", query, null, ListResponse.class).getResults(Circuit.class);
    }

    public Circuit getCircuit(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/circuits/" + id + "/", null, null, Circuit.class);
    }

    public void deleteCircuit(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/circuits/circuits/" + id + "/", null, null, null);
    }

    public ProviderNetwork createProviderNetwork(WritableProviderNetwork body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/circuits/provider-networks/", null, new CreateRequest().setData(body), ProviderNetwork.class);
    }

    public List<ProviderNetwork> getProviderNetworks(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/provider-networks/", query, null, ListResponse.class).getResults(ProviderNetwork.class);
    }

    public ProviderNetwork getProviderNetwork(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/provider-networks/" + id + "/", null, null, ProviderNetwork.class);
    }

    public void deleteProviderNetwork(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/circuits/provider-networks/" + id + "/", null, null, null);
    }

    public Provider createProvider(Provider body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/circuits/providers/", null, new CreateRequest().setData(body), Provider.class);
    }

    public List<Provider> getProviders(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/providers/", query, null, ListResponse.class).getResults(Provider.class);
    }

    public Provider getProvider(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/circuits/providers/" + id + "/", null, null, Provider.class);
    }

    public void deleteProvider(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/circuits/providers/" + id + "/", null, null, null);
    }

}
