package com.epam.ta.reportportal.ws.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

/**
 * @author Konstantin Antipin
 */
public class EntryCreatedAsyncRS extends EntryCreatedRS {

    @JsonProperty("clientRef")
    private String clientRef;

    public EntryCreatedAsyncRS() {

    }

    public EntryCreatedAsyncRS(Long id) {
        super.setId(id);
    }

    public String getClientRef() {
        return clientRef;
    }

    public void setClientRef(String clientRef) {
        this.clientRef = clientRef;
    }
}
