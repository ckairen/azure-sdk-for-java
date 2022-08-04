// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automanage.fluent.HcrpReportsClient;
import com.azure.resourcemanager.automanage.fluent.models.ReportInner;
import com.azure.resourcemanager.automanage.models.HcrpReports;
import com.azure.resourcemanager.automanage.models.Report;

public final class HcrpReportsImpl implements HcrpReports {
    private static final ClientLogger LOGGER = new ClientLogger(HcrpReportsImpl.class);

    private final HcrpReportsClient innerClient;

    private final com.azure.resourcemanager.automanage.AutomanageManager serviceManager;

    public HcrpReportsImpl(
        HcrpReportsClient innerClient, com.azure.resourcemanager.automanage.AutomanageManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Report get(
        String resourceGroupName, String machineName, String configurationProfileAssignmentName, String reportName) {
        ReportInner inner =
            this.serviceClient().get(resourceGroupName, machineName, configurationProfileAssignmentName, reportName);
        if (inner != null) {
            return new ReportImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Report> getWithResponse(
        String resourceGroupName,
        String machineName,
        String configurationProfileAssignmentName,
        String reportName,
        Context context) {
        Response<ReportInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName, machineName, configurationProfileAssignmentName, reportName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ReportImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Report> listByConfigurationProfileAssignments(
        String resourceGroupName, String machineName, String configurationProfileAssignmentName) {
        PagedIterable<ReportInner> inner =
            this
                .serviceClient()
                .listByConfigurationProfileAssignments(
                    resourceGroupName, machineName, configurationProfileAssignmentName);
        return Utils.mapPage(inner, inner1 -> new ReportImpl(inner1, this.manager()));
    }

    public PagedIterable<Report> listByConfigurationProfileAssignments(
        String resourceGroupName, String machineName, String configurationProfileAssignmentName, Context context) {
        PagedIterable<ReportInner> inner =
            this
                .serviceClient()
                .listByConfigurationProfileAssignments(
                    resourceGroupName, machineName, configurationProfileAssignmentName, context);
        return Utils.mapPage(inner, inner1 -> new ReportImpl(inner1, this.manager()));
    }

    private HcrpReportsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automanage.AutomanageManager manager() {
        return this.serviceManager;
    }
}
