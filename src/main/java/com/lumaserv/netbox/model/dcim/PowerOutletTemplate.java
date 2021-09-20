package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.dcim.nested.NestedDeviceType;
import com.lumaserv.netbox.model.dcim.nested.NestedPowerPortTemplate;
import lombok.Getter;

import java.util.Date;

@Getter
public class PowerOutletTemplate {

    Integer id;
    String url;
    String display;
    NestedDeviceType deviceType;
    String name;
    String label;
    LabeledString type;
    NestedPowerPortTemplate powerPort;
    LabeledString feedLeg;
    String description;
    Date created;
    Date lastUpdated;

}
