/**
 * Copyright 2016-2017 Sixt GmbH & Co. Autovermietung KG
 * Licensed under the Apache License, Version 2.0 (the "License"); you may 
 * not use this file except in compliance with the License. You may obtain a 
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and limitations 
 * under the License.
 */

package com.sixt.service.framework;

import org.apache.commons.lang3.StringUtils;

public class FeatureFlags {

    // Key for service property.  in seconds
    public final static String HEALTH_CHECK_POLL_INTERVAL = "healthCheckPollInterval";
    public final static int DEFAULT_HEALTH_CHECK_POLL_INTERVAL = 10;

    // Set to "true" to allow an RpcResponse to set the http response code, otherwise: always return 200.
    public final static String FLAG_EXPOSE_ERRORS_HTTP = "exposeErrorsHttp";

    public static boolean shouldExposeErrorsToHttp(ServiceProperties serviceProps) {
        String value = serviceProps.getProperty(FLAG_EXPOSE_ERRORS_HTTP);
        if (StringUtils.isNotEmpty(value) && Boolean.valueOf(value)) {
            return true;
        } else {
            return false;
        }
    }


}
