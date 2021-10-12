package com.lumaserv.netbox.model.extras.writable;

import lombok.Setter;

@Setter
public class WritableJournalEntry {

    String assignedObjectType;
    Integer assignedObjectId;
    Integer createdBy;
    String kind;
    String comments;

}
