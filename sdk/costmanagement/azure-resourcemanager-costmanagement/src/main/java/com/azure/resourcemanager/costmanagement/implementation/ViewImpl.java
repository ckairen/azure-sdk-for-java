// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.costmanagement.fluent.models.ViewInner;
import com.azure.resourcemanager.costmanagement.models.AccumulatedType;
import com.azure.resourcemanager.costmanagement.models.ChartType;
import com.azure.resourcemanager.costmanagement.models.KpiProperties;
import com.azure.resourcemanager.costmanagement.models.MetricType;
import com.azure.resourcemanager.costmanagement.models.PivotProperties;
import com.azure.resourcemanager.costmanagement.models.ReportConfigDataset;
import com.azure.resourcemanager.costmanagement.models.ReportConfigTimePeriod;
import com.azure.resourcemanager.costmanagement.models.ReportTimeframeType;
import com.azure.resourcemanager.costmanagement.models.ReportType;
import com.azure.resourcemanager.costmanagement.models.View;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class ViewImpl implements View, View.Definition, View.Update {
    private ViewInner innerObject;

    private final com.azure.resourcemanager.costmanagement.CostManagementManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String scope() {
        return this.innerModel().scope();
    }

    public OffsetDateTime createdOn() {
        return this.innerModel().createdOn();
    }

    public OffsetDateTime modifiedOn() {
        return this.innerModel().modifiedOn();
    }

    public ChartType chart() {
        return this.innerModel().chart();
    }

    public AccumulatedType accumulated() {
        return this.innerModel().accumulated();
    }

    public MetricType metric() {
        return this.innerModel().metric();
    }

    public List<KpiProperties> kpis() {
        List<KpiProperties> inner = this.innerModel().kpis();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<PivotProperties> pivots() {
        List<PivotProperties> inner = this.innerModel().pivots();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ReportType typePropertiesType() {
        return this.innerModel().typePropertiesType();
    }

    public ReportTimeframeType timeframe() {
        return this.innerModel().timeframe();
    }

    public ReportConfigTimePeriod timePeriod() {
        return this.innerModel().timePeriod();
    }

    public ReportConfigDataset dataset() {
        return this.innerModel().dataset();
    }

    public ViewInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.costmanagement.CostManagementManager manager() {
        return this.serviceManager;
    }

    private String scope;

    private String viewName;

    public ViewImpl withExistingScope(String scope) {
        this.scope = scope;
        return this;
    }

    public View create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getViews()
                .createOrUpdateByScopeWithResponse(scope, viewName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public View create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getViews()
                .createOrUpdateByScopeWithResponse(scope, viewName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ViewImpl(String name, com.azure.resourcemanager.costmanagement.CostManagementManager serviceManager) {
        this.innerObject = new ViewInner();
        this.serviceManager = serviceManager;
        this.viewName = name;
    }

    public ViewImpl update() {
        return this;
    }

    public View apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getViews()
                .createOrUpdateByScopeWithResponse(scope, viewName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public View apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getViews()
                .createOrUpdateByScopeWithResponse(scope, viewName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ViewImpl(ViewInner innerObject, com.azure.resourcemanager.costmanagement.CostManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.scope =
            Utils
                .getValueFromIdByParameterName(
                    innerObject.id(), "/{scope}/providers/Microsoft.CostManagement/views/{viewName}", "scope");
        this.viewName =
            Utils
                .getValueFromIdByParameterName(
                    innerObject.id(), "/{scope}/providers/Microsoft.CostManagement/views/{viewName}", "viewName");
    }

    public View refresh() {
        this.innerObject =
            serviceManager.serviceClient().getViews().getByScopeWithResponse(scope, viewName, Context.NONE).getValue();
        return this;
    }

    public View refresh(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getViews().getByScopeWithResponse(scope, viewName, context).getValue();
        return this;
    }

    public ViewImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public ViewImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public ViewImpl withScope(String scope) {
        this.innerModel().withScope(scope);
        return this;
    }

    public ViewImpl withChart(ChartType chart) {
        this.innerModel().withChart(chart);
        return this;
    }

    public ViewImpl withAccumulated(AccumulatedType accumulated) {
        this.innerModel().withAccumulated(accumulated);
        return this;
    }

    public ViewImpl withMetric(MetricType metric) {
        this.innerModel().withMetric(metric);
        return this;
    }

    public ViewImpl withKpis(List<KpiProperties> kpis) {
        this.innerModel().withKpis(kpis);
        return this;
    }

    public ViewImpl withPivots(List<PivotProperties> pivots) {
        this.innerModel().withPivots(pivots);
        return this;
    }

    public ViewImpl withTypePropertiesType(ReportType typePropertiesType) {
        this.innerModel().withTypePropertiesType(typePropertiesType);
        return this;
    }

    public ViewImpl withTimeframe(ReportTimeframeType timeframe) {
        this.innerModel().withTimeframe(timeframe);
        return this;
    }

    public ViewImpl withTimePeriod(ReportConfigTimePeriod timePeriod) {
        this.innerModel().withTimePeriod(timePeriod);
        return this;
    }

    public ViewImpl withDataset(ReportConfigDataset dataset) {
        this.innerModel().withDataset(dataset);
        return this;
    }
}
