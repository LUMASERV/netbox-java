package com.lumaserv.netbox.model.dcim;

import com.lumaserv.netbox.model.LabeledString;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Date;

@Getter
public class JournalEntry {

    Integer id;
    String url;
    String displayy;
    String assignedObjectType;
    Integer assignedObjectId;
    AbstractObject assignedObject;
    Date created;
    Integer createdBy;
    LabeledString kind;
    String comments;

}
