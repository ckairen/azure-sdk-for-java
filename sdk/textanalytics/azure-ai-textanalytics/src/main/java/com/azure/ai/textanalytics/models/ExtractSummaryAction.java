// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.models;

import com.azure.core.annotation.Fluent;

/**
 * Configurations that allow callers to specify details about how to execute an extractive summarization action in a
 * set of documents.
 */
@Fluent
public final class ExtractSummaryAction {
    private String modelVersion;
    private int maxSentenceCount;
    private SummarySentencesOrder sentencesOrderBy;
    private boolean disableServiceLogs;

    /**
     * Gets the version of the text analytics model used by this operation.
     *
     * @return The model version.
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * Set the model version. This value indicates which model will be used for scoring, e.g. "latest", "2019-10-01".
     * If a model-version is not specified, the API will default to the latest, non-preview version.
     *
     * @param modelVersion The model version.
     *
     * @return The {@link ExtractSummaryAction} object itself.
     */
    public ExtractSummaryAction setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    /**
     * Gets the value of {@code disableServiceLogs}.
     *
     * @return The value of {@code disableServiceLogs}. The default value of this property is 'false'. This means,
     * Text Analytics service logs your input text for 48 hours, solely to allow for troubleshooting issues. Setting
     * this property to true, disables input logging and may limit our ability to investigate issues that occur.
     */
    public boolean isServiceLogsDisabled() {
        return disableServiceLogs;
    }

    /**
     * Sets the value of {@code disableServiceLogs}.
     *
     * @param disableServiceLogs The default value of this property is 'false'. This means, Text Analytics service logs
     * your input text for 48 hours, solely to allow for troubleshooting issues. Setting this property to true,
     * disables input logging and may limit our ability to investigate issues that occur.
     *
     * @return The {@link ExtractSummaryAction} object itself.
     */
    public ExtractSummaryAction setServiceLogsDisabled(boolean disableServiceLogs) {
        this.disableServiceLogs = disableServiceLogs;
        return this;
    }

    /**
     * Gets the maximum extractive summarization sentences number to be returned in the response.
     *
     * @return
     */
    public int getMaxSentenceCount() {
        return this.maxSentenceCount;
    }

    /**
     *
     * @param maxSentenceCount
     * @return
     */
    public ExtractSummaryAction setMaxSentenceCount(int maxSentenceCount) {
        this.maxSentenceCount = maxSentenceCount;
        return this;
    }

    /**
     *
     * @return
     */
    public SummarySentencesOrder getSentencesOrderBy() {
        return sentencesOrderBy;
    }

    /**
     *
     * @param sentencesOrderBy
     * @return
     */
    public ExtractSummaryAction setSentencesOrderBy(SummarySentencesOrder sentencesOrderBy) {
        this.sentencesOrderBy = sentencesOrderBy;
        return this;
    }
}
