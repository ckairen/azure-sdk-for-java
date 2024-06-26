// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.logs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The related metadata items for the Log Analytics workspace.
 */
@Fluent
public final class MetadataWorkspaceRelated {
    /*
     * The related tables for the Log Analytics workspace.
     */
    @JsonProperty(value = "tables")
    private List<String> tables;

    /*
     * The related Log Analytics solutions for the Log Analytics workspace.
     */
    @JsonProperty(value = "solutions")
    private List<String> solutions;

    /*
     * The related resource types for the Log Analytics workspace.
     */
    @JsonProperty(value = "resourceTypes")
    private List<String> resourceTypes;

    /*
     * The related functions for the Log Analytics workspace.
     */
    @JsonProperty(value = "functions")
    private List<String> functions;

    /*
     * The related Azure resources for the Log Analytics workspace.
     */
    @JsonProperty(value = "resources")
    private List<String> resources;

    /**
     * Creates an instance of MetadataWorkspaceRelated class.
     */
    public MetadataWorkspaceRelated() {
    }

    /**
     * Get the tables property: The related tables for the Log Analytics workspace.
     * 
     * @return the tables value.
     */
    public List<String> getTables() {
        return this.tables;
    }

    /**
     * Set the tables property: The related tables for the Log Analytics workspace.
     * 
     * @param tables the tables value to set.
     * @return the MetadataWorkspaceRelated object itself.
     */
    public MetadataWorkspaceRelated setTables(List<String> tables) {
        this.tables = tables;
        return this;
    }

    /**
     * Get the solutions property: The related Log Analytics solutions for the Log Analytics workspace.
     * 
     * @return the solutions value.
     */
    public List<String> getSolutions() {
        return this.solutions;
    }

    /**
     * Set the solutions property: The related Log Analytics solutions for the Log Analytics workspace.
     * 
     * @param solutions the solutions value to set.
     * @return the MetadataWorkspaceRelated object itself.
     */
    public MetadataWorkspaceRelated setSolutions(List<String> solutions) {
        this.solutions = solutions;
        return this;
    }

    /**
     * Get the resourceTypes property: The related resource types for the Log Analytics workspace.
     * 
     * @return the resourceTypes value.
     */
    public List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * Set the resourceTypes property: The related resource types for the Log Analytics workspace.
     * 
     * @param resourceTypes the resourceTypes value to set.
     * @return the MetadataWorkspaceRelated object itself.
     */
    public MetadataWorkspaceRelated setResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    /**
     * Get the functions property: The related functions for the Log Analytics workspace.
     * 
     * @return the functions value.
     */
    public List<String> getFunctions() {
        return this.functions;
    }

    /**
     * Set the functions property: The related functions for the Log Analytics workspace.
     * 
     * @param functions the functions value to set.
     * @return the MetadataWorkspaceRelated object itself.
     */
    public MetadataWorkspaceRelated setFunctions(List<String> functions) {
        this.functions = functions;
        return this;
    }

    /**
     * Get the resources property: The related Azure resources for the Log Analytics workspace.
     * 
     * @return the resources value.
     */
    public List<String> getResources() {
        return this.resources;
    }

    /**
     * Set the resources property: The related Azure resources for the Log Analytics workspace.
     * 
     * @param resources the resources value to set.
     * @return the MetadataWorkspaceRelated object itself.
     */
    public MetadataWorkspaceRelated setResources(List<String> resources) {
        this.resources = resources;
        return this;
    }
}
