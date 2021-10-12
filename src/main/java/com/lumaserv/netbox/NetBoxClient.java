package com.lumaserv.netbox;

import com.lumaserv.netbox.apis.*;
import lombok.experimental.FieldDefaults;
import org.javawebstack.httpclient.HTTPClient;
import org.javawebstack.httpclient.HTTPRequest;

@FieldDefaults(makeFinal = true)
public class NetBoxClient extends HTTPClient {

    CircuitsAPI circuitsAPI = new CircuitsAPI(this);
    DCIMAPI dcimAPI = new DCIMAPI(this);
    ExtrasAPI extrasAPI = new ExtrasAPI(this);
    IPAMAPI ipamAPI = new IPAMAPI(this);
    TenancyAPI tenancyAPI = new TenancyAPI(this);
    UserAPI userAPI = new UserAPI(this);
    VirtualizationAPI virtualizationAPI = new VirtualizationAPI(this);

    public NetBoxClient(String url, String token) {
        if (url.endsWith("/"))
            url = url.substring(0, url.length() - 1);
        if (!url.endsWith("/api"))
            url += "/api";
        setBaseUrl(url);
        header("Accept", "application/json");
        header("Authorization", "Token " + token);
    }

    public CircuitsAPI circuits() {
        return circuitsAPI;
    }

    public DCIMAPI dcim() {
        return dcimAPI;
    }

    public ExtrasAPI extras() {
        return extrasAPI;
    }

    public IPAMAPI ipam() {
        return ipamAPI;
    }

    public TenancyAPI tenancy() {
        return tenancyAPI;
    }

    public UserAPI users() {
        return userAPI;
    }

    public VirtualizationAPI virtualization() {
        return virtualizationAPI;
    }

    public <T> T apiRequest(String method, String path, Object query, Object request, Class<T> type) throws NetBoxAPIException {
        HTTPRequest r = request(method, path);
        if (request != null)
            r.jsonBody(request);
        if (r.status() < 200 || r.status() >= 300)
            throw new NetBoxAPIException(r);
        if (type == null)
            return null;
        return r.object(type);
    }

}
