# TriggersApi

All URIs are relative to *https://preview.vouchery.io/api/v2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTrigger**](TriggersApi.md#createTrigger) | **POST** /triggers | Create a trigger


<a name="createTrigger"></a>
# **createTrigger**
> Trigger createTrigger(trigger)

Create a trigger

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.TriggersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    TriggersApi apiInstance = new TriggersApi(defaultClient);
    Trigger trigger = new Trigger(); // Trigger | 
    try {
      Trigger result = apiInstance.createTrigger(trigger);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TriggersApi#createTrigger");
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
 **trigger** | [**Trigger**](Trigger.md)|  | [optional]

### Return type

[**Trigger**](Trigger.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A trigger generated |  -  |

