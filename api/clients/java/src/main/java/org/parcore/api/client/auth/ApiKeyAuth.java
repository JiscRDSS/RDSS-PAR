package org.parcore.api.client.auth;

import org.parcore.api.client.utilities.Pair;

import java.util.Map;
import java.util.List;

/**
 * PAR API
 * <p>
 * ApiKeyAuth
 * <p>
 * Implementation of authentication interface using an API key. A string in the form "$apiKeyPrefix $apiKey" is appended to the
 * header or query parameters, as specified by the $location
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * This class is based on code auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */
public class ApiKeyAuth implements Authentication {
    private final String location;
    private final String paramName;

    private String apiKey;
    private String apiKeyPrefix;

    public ApiKeyAuth(String location, String paramName) {
        this.location = location;
        this.paramName = paramName;
    }

    public String getLocation() {
        return location;
    }

    public String getParamName() {
        return paramName;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKeyPrefix() {
        return apiKeyPrefix;
    }

    public void setApiKeyPrefix(String apiKeyPrefix) {
        this.apiKeyPrefix = apiKeyPrefix;
    }

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
        if (apiKey == null) {
            return;
        }
        String value;
        if (apiKeyPrefix != null) {
            value = apiKeyPrefix + " " + apiKey;
        } else {
            value = apiKey;
        }
        if ("query".equals(location)) {
            queryParams.add(new Pair(paramName, value));
        } else if ("header".equals(location)) {
            headerParams.put(paramName, value);
        }
    }
}
