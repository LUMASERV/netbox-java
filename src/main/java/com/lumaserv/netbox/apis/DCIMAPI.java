package com.lumaserv.netbox.apis;

import com.lumaserv.netbox.NetBoxAPIException;
import com.lumaserv.netbox.NetBoxClient;
import com.lumaserv.netbox.model.dcim.*;
import com.lumaserv.netbox.model.dcim.writable.*;
import com.lumaserv.netbox.query.DefaultQuery;
import com.lumaserv.netbox.request.CreateRequest;
import com.lumaserv.netbox.response.ListResponse;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class DCIMAPI {

    final NetBoxClient client;

    public Cable createCable(WritableCable body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/cables/", null, new CreateRequest().setData(body), Cable.class);
    }

    public List<Cable> getCables(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/cables/", query, null, ListResponse.class).getResults(Cable.class);
    }

    public Cable getCable(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/cables/" + id + "/", null, null, Cable.class);
    }

    public void deleteCable(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/cables/" + id + "/", null, null, null);
    }

    public ConsolePortTemplate createConsolePortTemplate(WritableConsolePortTemplate body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/console-port-templates/", null, new CreateRequest().setData(body), ConsolePortTemplate.class);
    }

    public List<ConsolePortTemplate> getConsolePortTemplates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/console-port-templates/", query, null, ListResponse.class).getResults(ConsolePortTemplate.class);
    }

    public ConsolePortTemplate getConsolePortTemplate(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/console-port-templates/" + id + "/", null, null, ConsolePortTemplate.class);
    }

    public void deleteConsolePortTemplate(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/console-port-templates/" + id + "/", null, null, null);
    }

    public ConsolePort createConsolePort(WritableConsolePort body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/console-ports/", null, new CreateRequest().setData(body), ConsolePort.class);
    }

    public List<ConsolePort> getConsolePorts(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/console-ports/", query, null, ListResponse.class).getResults(ConsolePort.class);
    }

    public ConsolePort getConsolePort(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/console-port/" + id + "/", null, null, ConsolePort.class);
    }

    public void deleteConsolePort(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/console-ports/" + id + "/", null, null, null);
    }

    public ConsoleServerPortTemplate createConsoleServerPortTemplate(WritableConsoleServerPortTemplate body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/console-server-port-templates/", null, new CreateRequest().setData(body), ConsoleServerPortTemplate.class);
    }

    public List<ConsoleServerPortTemplate> getConsoleServerPortTemplates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/console-server-port-templates/", query, null, ListResponse.class).getResults(ConsoleServerPortTemplate.class);
    }

    public ConsoleServerPortTemplate getConsoleServerPortTemplate(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/console-server-port-templates/" + id + "/", null, null, ConsoleServerPortTemplate.class);
    }

    public void deleteConsoleServerPortTemplate(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/console-server-port-templates/" + id + "/", null, null, null);
    }

    public ConsoleServerPort createConsoleServerPort(WritableConsoleServerPort body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/console-server-ports/", null, new CreateRequest().setData(body), ConsoleServerPort.class);
    }

    public List<ConsoleServerPort> getConsoleServerPorts(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/console-server-ports/", query, null, ListResponse.class).getResults(ConsoleServerPort.class);
    }

    public ConsoleServerPort getConsoleServerPort(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/console-server-ports/" + id + "/", null, null, ConsoleServerPort.class);
    }

    public void deleteConsoleServerPort(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/console-server-ports/" + id + "/", null, null, null);
    }

    public DeviceBayTemplate createDeviceBayTemplate(WritableDeviceBayTemplate body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/device-bay-templates/", null, new CreateRequest().setData(body), DeviceBayTemplate.class);
    }

    public List<DeviceBayTemplate> getDeviceBayTemplates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/device-bay-templates/", query, null, ListResponse.class).getResults(DeviceBayTemplate.class);
    }

    public DeviceBayTemplate getDeviceBayTemplate(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/device-bay-templates/" + id + "/", null, null, DeviceBayTemplate.class);
    }

    public void deleteDeviceBayTemplate(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/device-bay-templates/" + id + "/", null, null, null);
    }

    public DeviceBay createDeviceBay(WritableDeviceBay body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/device-bays/", null, new CreateRequest().setData(body), DeviceBay.class);
    }

    public List<DeviceBay> getDeviceBays(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/device-bays/", query, null, ListResponse.class).getResults(DeviceBay.class);
    }

    public DeviceBay getDeviceBay(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/device-bays/" + id + "/", null, null, DeviceBay.class);
    }

    public void deleteDeviceBay(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/device-bays/" + id + "/", null, null, null);
    }

    public DeviceRole createDeviceRole(DeviceRole body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/device-roles/", null, new CreateRequest().setData(body), DeviceRole.class);
    }

    public List<DeviceRole> getDeviceRoles(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/device-roles/", query, null, ListResponse.class).getResults(DeviceRole.class);
    }

    public DeviceRole getDeviceRole(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/device-roles/" + id + "/", null, null, DeviceRole.class);
    }

    public void deleteDeviceRole(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/device-roles/" + id + "/", null, null, null);
    }

    public DeviceType createDeviceType(WritableDeviceType body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/device-types/", null, new CreateRequest().setData(body), DeviceType.class);
    }

    public List<DeviceType> getDeviceTypes(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/device-types/", query, null, ListResponse.class).getResults(DeviceType.class);
    }

    public DeviceType getDeviceType(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/device-types/" + id + "/", null, null, DeviceType.class);
    }

    public void deleteDeviceType(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/device-types/" + id + "/", null, null, null);
    }

    public Device createDevice(WritableDevice body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/devices/", null, new CreateRequest().setData(body), Device.class);
    }

    public List<Device> getDevices(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/devices/", query, null, ListResponse.class).getResults(Device.class);
    }

    public Device getDevice(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/devices/" + id + "/", null, null, Device.class);
    }

    public void deleteDevice(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/devices/" + id + "/", null, null, null);
    }

    public FrontPortTemplate createFrontPortTemplate(WritableFrontPortTemplate body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/front-port-templates/", null, new CreateRequest().setData(body), FrontPortTemplate.class);
    }

    public List<FrontPortTemplate> getFrontPortTemplates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/front-port-templates/", query, null, ListResponse.class).getResults(FrontPortTemplate.class);
    }

    public FrontPortTemplate getFrontPortTemplate(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/front-port-templates/" + id + "/", null, null, FrontPortTemplate.class);
    }

    public void deleteFrontPortTemplate(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/front-port-templates/" + id + "/", null, null, null);
    }

    public FrontPort createFrontPort(WritableFrontPort body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/front-ports/", null, new CreateRequest().setData(body), FrontPort.class);
    }

    public List<FrontPort> getFrontPorts(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/front-ports/", query, null, ListResponse.class).getResults(FrontPort.class);
    }

    public FrontPort getFrontPort(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/front-ports/" + id + "/", null, null, FrontPort.class);
    }

    public void deleteFrontPort(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/front-ports/" + id + "/", null, null, null);
    }

    public InterfaceTemplate createInterfaceTemplate(WritableInterfaceTemplate body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/interface-templates/", null, new CreateRequest().setData(body), InterfaceTemplate.class);
    }

    public List<InterfaceTemplate> getInterfaceTemplates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/interface-templates/", query, null, ListResponse.class).getResults(InterfaceTemplate.class);
    }

    public InterfaceTemplate getInterfaceTemplate(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/interface-templates/" + id + "/", null, null, InterfaceTemplate.class);
    }

    public void deleteInterfaceTemplate(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/interface-templates/" + id + "/", null, null, null);
    }

    public Interface createInterfaceTemplate(WritableInterface body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/interfaces/", null, new CreateRequest().setData(body), Interface.class);
    }

    public List<Interface> getInterfaces(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/interfaces/", query, null, ListResponse.class).getResults(Interface.class);
    }

    public Interface getInterface(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/interfaces/" + id + "/", null, null, Interface.class);
    }

    public void deleteInterface(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/interfaces/" + id + "/", null, null, null);
    }

    public InventoryItem createInventoryItem(WritableInventoryItem body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/inventory-items/", null, new CreateRequest().setData(body), InventoryItem.class);
    }

    public List<InventoryItem> getInventoryItems(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/inventory-items/", query, null, ListResponse.class).getResults(InventoryItem.class);
    }

    public InventoryItem getInventoryItem(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/inventory-items/" + id + "/", null, null, InventoryItem.class);
    }

    public void deleteInventoryItem(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/inventory-items/" + id + "/", null, null, null);
    }

    public Location createLocation(WritableLocation body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/locations/", null, new CreateRequest().setData(body), Location.class);
    }

    public List<Location> getLocations(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/locations/", query, null, ListResponse.class).getResults(Location.class);
    }

    public Location getLocation(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/locations/" + id + "/", null, null, Location.class);
    }

    public void deleteLocation(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/locations/" + id + "/", null, null, null);
    }

    public Manufacturer createManufacturer(Manufacturer body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/manufacturers/", null, new CreateRequest().setData(body), Manufacturer.class);
    }

    public List<Manufacturer> getManufacturers(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/manufacturers/", query, null, ListResponse.class).getResults(Manufacturer.class);
    }

    public Manufacturer getManufacturer(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/manufacturers/" + id + "/", null, null, Manufacturer.class);
    }

    public void deleteManufacturer(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/manufacturers/" + id + "/", null, null, null);
    }

    public Platform createPlatform(WritablePlatform body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/platforms/", null, new CreateRequest().setData(body), Platform.class);
    }

    public List<Platform> getPlatforms(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/platforms/", query, null, ListResponse.class).getResults(Platform.class);
    }

    public Platform getPlatform(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/platforms/" + id + "/", null, null, Platform.class);
    }

    public void deletePlatform(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/platforms/" + id + "/", null, null, null);
    }

    public PowerFeed createPowerFeed(WritablePowerFeed body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/power-feeds/", null, new CreateRequest().setData(body), PowerFeed.class);
    }

    public List<PowerFeed> getPowerFeeds(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/power-feeds/", query, null, ListResponse.class).getResults(PowerFeed.class);
    }

    public PowerFeed getPowerFeed(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/power-feeds/" + id + "/", null, null, PowerFeed.class);
    }

    public void deletePowerFeed(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/power-feeds/" + id + "/", null, null, null);
    }

    public PowerOutletTemplate createPowerOutletTemplate(WritablePowerOutletTemplate body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/power-outlet-templates/", null, new CreateRequest().setData(body), PowerOutletTemplate.class);
    }

    public List<PowerOutletTemplate> getPowerOutletTemplates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/power-outlet-templates/", query, null, ListResponse.class).getResults(PowerOutletTemplate.class);
    }

    public PowerOutletTemplate getPowerOutletTemplate(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/power-outlet-templates/" + id + "/", null, null, PowerOutletTemplate.class);
    }

    public void deletePowerOutletTemplate(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/power-outlet-templates/" + id + "/", null, null, null);
    }

    public PowerOutlet createPowerOutlet(WritablePowerOutlet body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/power-outlets/", null, new CreateRequest().setData(body), PowerOutlet.class);
    }

    public List<PowerOutlet> getPowerOutlets(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/power-outlets/", query, null, ListResponse.class).getResults(PowerOutlet.class);
    }

    public PowerOutlet getPowerOutlet(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/power-outlets/" + id + "/", null, null, PowerOutlet.class);
    }

    public void deletePowerOutlet(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/power-outlets/" + id + "/", null, null, null);
    }

    public PowerPanel createPowerPanel(WritablePowerPanel body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/power-panels/", null, new CreateRequest().setData(body), PowerPanel.class);
    }

    public List<PowerPanel> getPowerPanels(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/power-panels/", query, null, ListResponse.class).getResults(PowerPanel.class);
    }

    public PowerPanel getPowerPanel(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/power-panels/" + id + "/", null, null, PowerPanel.class);
    }

    public void deletePowerPanel(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/power-panels/" + id + "/", null, null, null);
    }

    public PowerPortTemplate createPowerPortTemplate(WritablePowerPortTemplate body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/power-port-templates/", null, new CreateRequest().setData(body), PowerPortTemplate.class);
    }

    public List<PowerPortTemplate> getPowerPortTemplates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/power-port-templates/", query, null, ListResponse.class).getResults(PowerPortTemplate.class);
    }

    public PowerPortTemplate getPowerPortTemplate(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/power-port-templates/" + id + "/", null, null, PowerPortTemplate.class);
    }

    public void deletePowerPortTemplate(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/power-port-templates/" + id + "/", null, null, null);
    }

    public PowerPort createPowerPort(WritablePowerPort body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/power-ports/", null, new CreateRequest().setData(body), PowerPort.class);
    }

    public List<PowerPort> getPowerPorts(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/power-ports/", query, null, ListResponse.class).getResults(PowerPort.class);
    }

    public PowerPort getPowerPort(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/power-ports/" + id + "/", null, null, PowerPort.class);
    }

    public void deletePowerPort(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/power-ports/" + id + "/", null, null, null);
    }

    public RackReservation createRackReservation(WritableRackReservation body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/rack-reservations/", null, new CreateRequest().setData(body), RackReservation.class);
    }

    public List<RackReservation> getRackReservations(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/rack-reservations/", query, null, ListResponse.class).getResults(RackReservation.class);
    }

    public RackReservation getRackReservation(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/rack-reservations/" + id + "/", null, null, RackReservation.class);
    }

    public void deleteRackReservation(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/rack-reservations/" + id + "/", null, null, null);
    }

    public RackRole createRackRole(RackRole body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/rack-roles/", null, new CreateRequest().setData(body), RackRole.class);
    }

    public List<RackRole> getRackRoles(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/rack-roles/", query, null, ListResponse.class).getResults(RackRole.class);
    }

    public RackRole getRackRole(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/rack-roles/" + id + "/", null, null, RackRole.class);
    }

    public void deleteRackRole(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/rack-roles/" + id + "/", null, null, null);
    }

    public Rack createRack(WritableRack body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/racks/", null, new CreateRequest().setData(body), Rack.class);
    }

    public List<Rack> getRacks(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/racks/", query, null, ListResponse.class).getResults(Rack.class);
    }

    public Rack getRacks(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/racks/" + id + "/", null, null, Rack.class);
    }

    public void deleteRack(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/racks/" + id + "/", null, null, null);
    }

    public RearPortTemplate createRearPortTemplate(WritableRearPortTemplate body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/rear-port-templates/", null, new CreateRequest().setData(body), RearPortTemplate.class);
    }

    public List<RearPortTemplate> getRearPortTemplates(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/rear-port-templates/", query, null, ListResponse.class).getResults(RearPortTemplate.class);
    }

    public RearPortTemplate getRearPortTemplate(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/rear-port-templates/" + id + "/", null, null, RearPortTemplate.class);
    }

    public void deleteRearPortTemplate(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/rear-port-templates/" + id + "/", null, null, null);
    }

    public RearPort createRearPort(WritableRearPort body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/rear-ports/", null, new CreateRequest().setData(body), RearPort.class);
    }

    public List<RearPort> getRearPorts(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/rear-ports/", query, null, ListResponse.class).getResults(RearPort.class);
    }

    public RearPort getRearPort(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/rear-ports/" + id + "/", null, null, RearPort.class);
    }

    public void deleteRearPort(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/rear-ports/" + id + "/", null, null, null);
    }

    public Region createRegion(WritableRegion body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/regions/", null, new CreateRequest().setData(body), Region.class);
    }

    public List<Region> getRegions(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/regions/", query, null, ListResponse.class).getResults(Region.class);
    }

    public Region getRegion(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/regions/" + id + "/", null, null, Region.class);
    }

    public void deleteRegion(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/regions/" + id + "/", null, null, null);
    }

    public SiteGroup createSiteGroup(WritableSiteGroup body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/site-groups/", null, new CreateRequest().setData(body), SiteGroup.class);
    }

    public List<SiteGroup> getSiteGroups(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/site-groups/", query, null, ListResponse.class).getResults(SiteGroup.class);
    }

    public SiteGroup getSiteGroup(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/site-groups/" + id + "/", null, null, SiteGroup.class);
    }

    public void deleteSiteGroup(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/site-groups/" + id + "/", null, null, null);
    }

    public Site createSite(WritableSite body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/sites/", null, new CreateRequest().setData(body), Site.class);
    }

    public List<Site> getSites(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/sites/", query, null, ListResponse.class).getResults(Site.class);
    }

    public Site getSite(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/sites/" + id + "/", null, null, Site.class);
    }

    public void deleteSite(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/sites/" + id + "/", null, null, null);
    }

    public VirtualChassis createVirtualChassis(WritableVirtualChassis body) throws NetBoxAPIException {
        return client.apiRequest("POST", "/dcim/virtual-chassis/", null, new CreateRequest().setData(body), VirtualChassis.class);
    }

    public List<VirtualChassis> getVirtualChassis(DefaultQuery query) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/virtual-chassis/", query, null, ListResponse.class).getResults(VirtualChassis.class);
    }

    public VirtualChassis getVirtualChassis(int id) throws NetBoxAPIException {
        return client.apiRequest("GET", "/dcim/virtual-chassis/" + id + "/", null, null, VirtualChassis.class);
    }

    public void deleteVirtualChassis(int id) throws NetBoxAPIException {
        client.apiRequest("DELETE", "/dcim/virtual-chassis/" + id + "/", null, null, null);
    }

}
