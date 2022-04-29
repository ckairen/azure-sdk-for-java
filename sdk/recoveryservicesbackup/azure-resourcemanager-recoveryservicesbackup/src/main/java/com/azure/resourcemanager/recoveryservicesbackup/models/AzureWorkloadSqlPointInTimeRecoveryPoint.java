// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Recovery point specific to PointInTime. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AzureWorkloadSQLPointInTimeRecoveryPoint")
@Fluent
public final class AzureWorkloadSqlPointInTimeRecoveryPoint extends AzureWorkloadSqlRecoveryPoint {
    /*
     * List of log ranges
     */
    @JsonProperty(value = "timeRanges")
    private List<PointInTimeRange> timeRanges;

    /**
     * Get the timeRanges property: List of log ranges.
     *
     * @return the timeRanges value.
     */
    public List<PointInTimeRange> timeRanges() {
        return this.timeRanges;
    }

    /**
     * Set the timeRanges property: List of log ranges.
     *
     * @param timeRanges the timeRanges value to set.
     * @return the AzureWorkloadSqlPointInTimeRecoveryPoint object itself.
     */
    public AzureWorkloadSqlPointInTimeRecoveryPoint withTimeRanges(List<PointInTimeRange> timeRanges) {
        this.timeRanges = timeRanges;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSqlPointInTimeRecoveryPoint withExtendedInfo(
        AzureWorkloadSqlRecoveryPointExtendedInfo extendedInfo) {
        super.withExtendedInfo(extendedInfo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSqlPointInTimeRecoveryPoint withRecoveryPointTimeInUtc(OffsetDateTime recoveryPointTimeInUtc) {
        super.withRecoveryPointTimeInUtc(recoveryPointTimeInUtc);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSqlPointInTimeRecoveryPoint withType(RestorePointType type) {
        super.withType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSqlPointInTimeRecoveryPoint withRecoveryPointTierDetails(
        List<RecoveryPointTierInformationV2> recoveryPointTierDetails) {
        super.withRecoveryPointTierDetails(recoveryPointTierDetails);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSqlPointInTimeRecoveryPoint withRecoveryPointMoveReadinessInfo(
        Map<String, RecoveryPointMoveReadinessInfo> recoveryPointMoveReadinessInfo) {
        super.withRecoveryPointMoveReadinessInfo(recoveryPointMoveReadinessInfo);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (timeRanges() != null) {
            timeRanges().forEach(e -> e.validate());
        }
    }
}
