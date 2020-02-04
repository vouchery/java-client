# CampaignsApi

All URIs are relative to *https://preview.vouchery.io/api/v2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCampaign**](CampaignsApi.md#createCampaign) | **POST** /campaigns | Create a campaign
[**deleteCampaign**](CampaignsApi.md#deleteCampaign) | **DELETE** /campaigns/{id} | Delete a campaign
[**findSubCampaigns**](CampaignsApi.md#findSubCampaigns) | **GET** /campaigns/sub | Get sub campaigns by params
[**getCampaign**](CampaignsApi.md#getCampaign) | **GET** /campaigns/{id} | Get a campaign
[**getCampaigns**](CampaignsApi.md#getCampaigns) | **GET** /campaigns | Get main campaigns with children by params
[**updateCampaign**](CampaignsApi.md#updateCampaign) | **PATCH** /campaigns/{id} | Update a campaign


<a name="createCampaign"></a>
# **createCampaign**
> Campaign createCampaign(campaign)

Create a campaign

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    Campaign campaign = new Campaign(); // Campaign | 
    try {
      Campaign result = apiInstance.createCampaign(campaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#createCampaign");
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
 **campaign** | [**Campaign**](Campaign.md)|  | [optional]

### Return type

[**Campaign**](Campaign.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The newly created campaign |  -  |

<a name="deleteCampaign"></a>
# **deleteCampaign**
> deleteCampaign(id)

Delete a campaign

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    Integer id = 56; // Integer | Campaign ID
    try {
      apiInstance.deleteCampaign(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#deleteCampaign");
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
 **id** | **Integer**| Campaign ID |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Campaign was successfully deleted |  -  |

<a name="findSubCampaigns"></a>
# **findSubCampaigns**
> List&lt;Campaign&gt; findSubCampaigns(nameCont, statusEq, templateEq, triggersOnEq, triggerNameCont)

Get sub campaigns by params

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String nameCont = "nameCont_example"; // String | Name contains
    String statusEq = "statusEq_example"; // String | Status
    String templateEq = "templateEq_example"; // String | Template (type) of sub campaign
    String triggersOnEq = "triggersOnEq_example"; // String | Triggers On
    String triggerNameCont = "triggerNameCont_example"; // String | Trigger Name contains
    try {
      List<Campaign> result = apiInstance.findSubCampaigns(nameCont, statusEq, templateEq, triggersOnEq, triggerNameCont);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#findSubCampaigns");
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
 **nameCont** | **String**| Name contains | [optional]
 **statusEq** | **String**| Status | [optional]
 **templateEq** | **String**| Template (type) of sub campaign | [optional]
 **triggersOnEq** | **String**| Triggers On | [optional]
 **triggerNameCont** | **String**| Trigger Name contains | [optional]

### Return type

[**List&lt;Campaign&gt;**](Campaign.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Collection of campaigns |  * Link - Provides urls for traversing paginated responses. See docs.vouchery.io for details. <br>  |

<a name="getCampaign"></a>
# **getCampaign**
> Campaign getCampaign(id)

Get a campaign

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    Integer id = 56; // Integer | Campaign ID
    try {
      Campaign result = apiInstance.getCampaign(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#getCampaign");
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
 **id** | **Integer**| Campaign ID |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A campaign |  -  |

<a name="getCampaigns"></a>
# **getCampaigns**
> List&lt;Campaign&gt; getCampaigns(nameCont, teamEq, statusEq, templateEq)

Get main campaigns with children by params

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String nameCont = "nameCont_example"; // String | Name contains
    String teamEq = "teamEq_example"; // String | Team
    String statusEq = "statusEq_example"; // String | Status
    String templateEq = "templateEq_example"; // String | Template (promotion type) of main campaign
    try {
      List<Campaign> result = apiInstance.getCampaigns(nameCont, teamEq, statusEq, templateEq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#getCampaigns");
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
 **nameCont** | **String**| Name contains | [optional]
 **teamEq** | **String**| Team | [optional]
 **statusEq** | **String**| Status | [optional]
 **templateEq** | **String**| Template (promotion type) of main campaign | [optional]

### Return type

[**List&lt;Campaign&gt;**](Campaign.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Collection of campaigns |  * Link - Provides urls for traversing paginated responses. See docs.vouchery.io for details. <br>  |

<a name="updateCampaign"></a>
# **updateCampaign**
> Campaign updateCampaign(id, campaign)

Update a campaign

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    Integer id = 56; // Integer | Campaign ID
    Campaign campaign = new Campaign(); // Campaign | 
    try {
      Campaign result = apiInstance.updateCampaign(id, campaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#updateCampaign");
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
 **id** | **Integer**| Campaign ID |
 **campaign** | [**Campaign**](Campaign.md)|  | [optional]

### Return type

[**Campaign**](Campaign.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The updated campaign |  -  |

