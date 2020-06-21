package com.alfame.esb.bpm.module.api.param;

public enum BPMEventType {

    PROCESS_INSTANCE_CREATED,
    PROCESS_INSTANCE_ENDED,
    VARIABLE_CREATED,
    VARIABLE_UPDATED,
    VARIABLE_REMOVED;

    public String getValue() {
        return this.toString();
    }

}