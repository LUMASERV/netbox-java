package com.lumaserv.netbox.model.circuits;

import com.lumaserv.netbox.model.LabeledString;
import com.lumaserv.netbox.model.circuits.nested.NestedCircuitType;
import com.lumaserv.netbox.model.circuits.nested.NestedProvider;
import com.lumaserv.netbox.model.extras.nested.NestedTag;
import com.lumaserv.netbox.model.tenancy.nested.NestedTenant;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class Circuit {

    Integer id;
    String url;
    String display;
    String cid;
    NestedProvider provider;
    NestedCircuitType type;
    LabeledString status;
    NestedTenant tenant;
    Date installDate;
    Integer commitRate;
    String description;
    CircuitCircuitTermination terminationA;
    CircuitCircuitTermination terminationZ;
    String comments;
    NestedTag[] tags;
    AbstractObject customFields;
    Date created;
    Date lastUpdated;

}
