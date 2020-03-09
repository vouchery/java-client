# RedemptionsApi

All URIs are relative to *https://preview.vouchery.io/api/v2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**confirmRedemption**](RedemptionsApi.md#confirmRedemption) | **PATCH** /vouchers/{code}/redemptions | Confirm a redemption
[**createRedemption**](RedemptionsApi.md#createRedemption) | **POST** /vouchers/{code}/redemptions | Create a redemption
[**deleteRedemption**](RedemptionsApi.md#deleteRedemption) | **DELETE** /vouchers/{code}/redemptions | Delete a redemption
[**getRedemption**](RedemptionsApi.md#getRedemption) | **GET** /vouchers/{code}/redemptions | Get a redemption
[**getRedemptions**](RedemptionsApi.md#getRedemptions) | **GET** /campaigns/{campaign_id}/redemptions | Get all redemptions for a campaign


<a name="confirmRedemption"></a>
# **confirmRedemption**
> Redemption confirmRedemption(code, transactionId)

Confirm a redemption

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.RedemptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    RedemptionsApi apiInstance = new RedemptionsApi(defaultClient);
    String code = "code_example"; // String | Voucher code
    String transactionId = "transactionId_example"; // String | ID which identifies the transaction in customer system, e.g. order number, invoice number
    try {
      Redemption result = apiInstance.confirmRedemption(code, transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedemptionsApi#confirmRedemption");
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
 **code** | **String**| Voucher code |
 **transactionId** | **String**| ID which identifies the transaction in customer system, e.g. order number, invoice number |

### Return type

[**Redemption**](Redemption.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A redemption |  -  |

<a name="createRedemption"></a>
# **createRedemption**
> Redemption createRedemption(code, redemption)

Create a redemption

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.RedemptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    RedemptionsApi apiInstance = new RedemptionsApi(defaultClient);
    String code = "code_example"; // String | Voucher code
    Redemption redemption = new Redemption(); // Redemption | 
    try {
      Redemption result = apiInstance.createRedemption(code, redemption);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedemptionsApi#createRedemption");
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
 **code** | **String**| Voucher code |
 **redemption** | [**Redemption**](Redemption.md)|  | [optional]

### Return type

[**Redemption**](Redemption.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A redemption |  -  |

<a name="deleteRedemption"></a>
# **deleteRedemption**
> deleteRedemption(code, transactionId)

Delete a redemption

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.RedemptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    RedemptionsApi apiInstance = new RedemptionsApi(defaultClient);
    String code = "code_example"; // String | Voucher code
    String transactionId = "transactionId_example"; // String | ID which identifies the transaction in customer system, e.g. order number, invoice number
    try {
      apiInstance.deleteRedemption(code, transactionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedemptionsApi#deleteRedemption");
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
 **code** | **String**| Voucher code |
 **transactionId** | **String**| ID which identifies the transaction in customer system, e.g. order number, invoice number |

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
**204** | Redemption was successfully deleted |  -  |

<a name="getRedemption"></a>
# **getRedemption**
> Redemption getRedemption(code, transactionId)

Get a redemption

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.RedemptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    RedemptionsApi apiInstance = new RedemptionsApi(defaultClient);
    String code = "code_example"; // String | Voucher code
    String transactionId = "transactionId_example"; // String | ID which identifies the transaction in customer system, e.g. order number, invoice number
    try {
      Redemption result = apiInstance.getRedemption(code, transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedemptionsApi#getRedemption");
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
 **code** | **String**| Voucher code |
 **transactionId** | **String**| ID which identifies the transaction in customer system, e.g. order number, invoice number |

### Return type

[**Redemption**](Redemption.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A redemption |  -  |

<a name="getRedemptions"></a>
# **getRedemptions**
> List&lt;Redemption&gt; getRedemptions(campaignId)

Get all redemptions for a campaign

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.RedemptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    RedemptionsApi apiInstance = new RedemptionsApi(defaultClient);
    Integer campaignId = 56; // Integer | Campaign ID
    try {
      List<Redemption> result = apiInstance.getRedemptions(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedemptionsApi#getRedemptions");
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

[**List&lt;Redemption&gt;**](Redemption.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Collection of redemptions for campaign |  -  |

