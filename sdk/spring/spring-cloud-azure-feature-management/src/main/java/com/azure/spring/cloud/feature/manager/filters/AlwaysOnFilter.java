// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.cloud.feature.manager.filters;

import com.azure.spring.cloud.feature.manager.models.FeatureFilterEvaluationContext;

/**
 * A filter that always returns true
 */
public final class AlwaysOnFilter implements FeatureFilter {

    @Override
    public boolean evaluate(FeatureFilterEvaluationContext context) {
        return true;
    }

}
