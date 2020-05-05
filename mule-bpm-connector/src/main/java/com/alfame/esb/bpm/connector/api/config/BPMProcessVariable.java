package com.alfame.esb.bpm.connector.api.config;

import org.mule.runtime.api.metadata.TypedValue;
import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

import java.io.Serializable;

import static org.mule.runtime.api.meta.ExpressionSupport.NOT_SUPPORTED;
import static org.mule.runtime.api.meta.ExpressionSupport.SUPPORTED;

@Alias("process-variable")
public class BPMProcessVariable {

    @Parameter
    @Expression(NOT_SUPPORTED)
    private String variableName;

    @Parameter
    @Expression(SUPPORTED)
    @Optional
    TypedValue<Serializable> value;

    public String getVariableName() {
        return variableName;
    }

    public TypedValue<Serializable> getValue() {
        return value;
    }

}