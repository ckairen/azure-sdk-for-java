/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.scheduler.models;

/**
* Parameters supplied to the Get Job History operation.
*/
public class JobGetHistoryParameters {
    private int skip;
    
    /**
    * Required. Specify the (0-based) index of the history list from which to
    * begin requesting entries.
    * @return The Skip value.
    */
    public int getSkip() {
        return this.skip;
    }
    
    /**
    * Required. Specify the (0-based) index of the history list from which to
    * begin requesting entries.
    * @param skipValue The Skip value.
    */
    public void setSkip(final int skipValue) {
        this.skip = skipValue;
    }
    
    private int top;
    
    /**
    * Required. Specify the number of history entries to request, in the of
    * range [1..100].
    * @return The Top value.
    */
    public int getTop() {
        return this.top;
    }
    
    /**
    * Required. Specify the number of history entries to request, in the of
    * range [1..100].
    * @param topValue The Top value.
    */
    public void setTop(final int topValue) {
        this.top = topValue;
    }
}
