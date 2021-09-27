package com.lumaserv.netbox.apis;

import com.lumaserv.netbox.NetBoxAPIException;
import com.lumaserv.netbox.NetBoxClient;
import com.lumaserv.netbox.model.dcim.*;
import com.lumaserv.netbox.query.DefaultQuery;
import com.lumaserv.netbox.response.ListResponse;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class DCIMAPI {

    final NetBoxClient client;

    public List<Cable> getCables(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/cables/", query, null, ListResponse.class).getResults(Cable.class);
    }

    public List<ConsolePortTemplate> getConsolePortTemplates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/console-port-templates/", query, null, ListResponse.class).getResults(ConsolePortTemplate.class);
    }

    public List<ConsolePort> getConsolePorts(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/console-ports/", query, null, ListResponse.class).getResults(ConsolePort.class);
    }

    public List<ConsoleServerPortTemplate> getConsoleServerPortTemplates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/console-server-port-templates/", query, null, ListResponse.class).getResults(ConsoleServerPortTemplate.class);
    }

    public List<ConsoleServerPort> getConsoleServerPorts(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/console-server-ports/", query, null, ListResponse.class).getResults(ConsoleServerPort.class);
    }

    public List<DeviceBayTemplate> getDeviceBayTemplates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/device-bay-templates/", query, null, ListResponse.class).getResults(DeviceBayTemplate.class);
    }

    public List<DeviceBay> getDeviceBays(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/device-bays/", query, null, ListResponse.class).getResults(DeviceBay.class);
    }

    public List<DeviceRole> getDeviceRoles(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/device-roles/", query, null, ListResponse.class).getResults(DeviceRole.class);
    }

    public List<DeviceType> getDeviceTypes(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/device-types/", query, null, ListResponse.class).getResults(DeviceType.class);
    }

    public List<Device> getDevices(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/devices/", query, null, ListResponse.class).getResults(Device.class);
    }

    public List<FrontPortTemplate> getFrontPortTemplates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/front-port-templates/", query, null, ListResponse.class).getResults(FrontPortTemplate.class);
    }

    public List<FrontPort> getFrontPorts(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/front-ports/", query, null, ListResponse.class).getResults(FrontPort.class);
    }

    public List<InterfaceTemplate> getInterfaceTemplates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/interface-templates/", query, null, ListResponse.class).getResults(InterfaceTemplate.class);
    }

    public List<Interface> getInterfaces(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/interfaces/", query, null, ListResponse.class).getResults(Interface.class);
    }

    public List<InventoryItem> getInventoryItems(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/inventory-items/", query, null, ListResponse.class).getResults(InventoryItem.class);
    }

    public List<Location> getLocations(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/locations/", query, null, ListResponse.class).getResults(Location.class);
    }

    public List<Manufacturer> getManufacturers(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/manufacturers/", query, null, ListResponse.class).getResults(Manufacturer.class);
    }

    public List<Platform> getPlatforms(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/platforms/", query, null, ListResponse.class).getResults(Platform.class);
    }

    public List<PowerFeed> getPowerFeeds(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/power-feeds/", query, null, ListResponse.class).getResults(PowerFeed.class);
    }

    public List<PowerOutletTemplate> getPowerOutletTemplates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/power-outlet-templates/", query, null, ListResponse.class).getResults(PowerOutletTemplate.class);
    }

    public List<PowerOutlet> getPowerOutlets(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/power-outlets/", query, null, ListResponse.class).getResults(PowerOutlet.class);
    }

    public List<PowerPanel> getPowerPanels(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/power-panels/", query, null, ListResponse.class).getResults(PowerPanel.class);
    }

    public List<PowerPortTemplate> getPowerPortTemplates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/power-port-templates/", query, null, ListResponse.class).getResults(PowerPortTemplate.class);
    }

    public List<PowerPort> getPowerPorts(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/power-ports/", query, null, ListResponse.class).getResults(PowerPort.class);
    }

    public List<RackReservation> getRackReservations(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/rack-reservations/", query, null, ListResponse.class).getResults(RackReservation.class);
    }

    public List<RackRole> getRackRoles(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/rack-roles/", query, null, ListResponse.class).getResults(RackRole.class);
    }

    public List<Rack> getRacks(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/racks/", query, null, ListResponse.class).getResults(Rack.class);
    }

    public List<RearPortTemplate> getRearPortTemplates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/rear-port-templates/", query, null, ListResponse.class).getResults(RearPortTemplate.class);
    }

    public List<RearPort> getRearPorts(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/rear-ports/", query, null, ListResponse.class).getResults(RearPort.class);
    }

    public List<Region> getRegions(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/regions/", query, null, ListResponse.class).getResults(Region.class);
    }

    public List<SiteGroup> getSiteGroups(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/site-groups/", query, null, ListResponse.class).getResults(SiteGroup.class);
    }

    public List<Site> getSite(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/sites/", query, null, ListResponse.class).getResults(Site.class);
    }

    public List<VirtualChassis> getVirtualChassis(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/virtual-chassis/", query, null, ListResponse.class).getResults(VirtualChassis.class);
    }

}
