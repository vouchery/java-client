# RewardsApi

All URIs are relative to *https://preview.vouchery.io/api/v2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReward**](RewardsApi.md#createReward) | **POST** /campaigns/{campaign_id}/rewards | Create a reward
[**deleteReward**](RewardsApi.md#deleteReward) | **DELETE** /rewards/{id} | Delete a reward
[**getReward**](RewardsApi.md#getReward) | **GET** /rewards/{id} | Get a reward
[**getRewards**](RewardsApi.md#getRewards) | **GET** /campaigns/{campaign_id}/rewards | Get all rewards for a campaign
[**updateReward**](RewardsApi.md#updateReward) | **PATCH** /rewards/{id} | Update a reward


<a name="createReward"></a>
# **createReward**
> Reward createReward(campaignId, reward)

Create a reward

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.RewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    RewardsApi apiInstance = new RewardsApi(defaultClient);
    Integer campaignId = 56; // Integer | Campaign ID
    Reward reward = new Reward(); // Reward | 
    try {
      Reward result = apiInstance.createReward(campaignId, reward);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardsApi#createReward");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| Campaign ID |
 **reward** | [**Reward**](Reward.md)|  | [optional]

### Return type

[**Reward**](Reward.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Created reward |  -  |

<a name="deleteReward"></a>
# **deleteReward**
> deleteReward(id)

Delete a reward

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.RewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    RewardsApi apiInstance = new RewardsApi(defaultClient);
    Integer id = 56; // Integer | Reward ID
    try {
      apiInstance.deleteReward(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardsApi#deleteReward");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Reward ID |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | reward was successfully deleted |  -  |

<a name="getReward"></a>
# **getReward**
> Reward getReward(id)

Get a reward

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.RewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    RewardsApi apiInstance = new RewardsApi(defaultClient);
    Integer id = 56; // Integer | Reward ID
    try {
      Reward result = apiInstance.getReward(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardsApi#getReward");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Reward ID |

### Return type

[**Reward**](Reward.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Show campaign reward details |  -  |

<a name="getRewards"></a>
# **getRewards**
> List&lt;Reward&gt; getRewards(campaignId)

Get all rewards for a campaign

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.RewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    RewardsApi apiInstance = new RewardsApi(defaultClient);
    Integer campaignId = 56; // Integer | Campaign ID
    try {
      List<Reward> result = apiInstance.getRewards(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardsApi#getRewards");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| Campaign ID |

### Return type

[**List&lt;Reward&gt;**](Reward.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Collection of rewards for a campaign |  -  |

<a name="updateReward"></a>
# **updateReward**
> Reward updateReward(id, reward)

Update a reward

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.RewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    RewardsApi apiInstance = new RewardsApi(defaultClient);
    Integer id = 56; // Integer | Reward ID
    Reward reward = new Reward(); // Reward | 
    try {
      Reward result = apiInstance.updateReward(id, reward);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardsApi#updateReward");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Reward ID |
 **reward** | [**Reward**](Reward.md)|  | [optional]

### Return type

[**Reward**](Reward.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated reward |  -  |

