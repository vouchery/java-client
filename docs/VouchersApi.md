# VouchersApi

All URIs are relative to *https://preview.vouchery.io/api/v2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchGenerateVouchers**](VouchersApi.md#batchGenerateVouchers) | **POST** /campaigns/{id}/vouchers/batch | Batch create vouchers
[**createVoucher**](VouchersApi.md#createVoucher) | **POST** /campaigns/{campaign_id}/vouchers | Create a voucher
[**deleteVoucher**](VouchersApi.md#deleteVoucher) | **DELETE** /vouchers/{code} | Delete a voucher
[**expireVouchers**](VouchersApi.md#expireVouchers) | **POST** /campaigns/vouchers/expire | Expire a list of vouchers
[**findVoucher**](VouchersApi.md#findVoucher) | **GET** /vouchers/find | Find a voucher by campaign metadata
[**getVoucher**](VouchersApi.md#getVoucher) | **GET** /vouchers/{code} | Get a voucher
[**getVouchers**](VouchersApi.md#getVouchers) | **GET** /campaigns/{campaign_id}/vouchers | Get all vouchers for a campaign
[**importVouchers**](VouchersApi.md#importVouchers) | **POST** /campaigns/{id}/vouchers/import | Import your own vouchers
[**updateVoucher**](VouchersApi.md#updateVoucher) | **PATCH** /vouchers/{code} | Update a voucher


<a name="batchGenerateVouchers"></a>
# **batchGenerateVouchers**
> List&lt;Voucher&gt; batchGenerateVouchers(id, batch)

Batch create vouchers

 &lt;p&gt;Generate a batch of unique vouchers. Each voucher will be created using &lt;code&gt;{prefix}-{random code}&lt;/code&gt; format where code will be a random string of requested type and length. &lt;strong&gt;A prefix needs to be unique within a project.&lt;/strong&gt;&lt;/p&gt; &lt;p&gt; Following code types are supported: &lt;ul&gt; &lt;li&gt;digits&lt;/li&gt; &lt;li&gt;letters&lt;/li&gt; &lt;li&gt;mixed (digits and letters)&lt;/li&gt; &lt;/ul&gt; &lt;/p&gt; &lt;p&gt;Allowed characters for each code type have been filtered to avoid typing mistakes. Maximum number of codes possible to generate in one batch request is 50 000.&lt;/p&gt;

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    Integer id = 56; // Integer | Campaign ID
    Batch batch = new Batch(); // Batch | 
    try {
      List<Voucher> result = apiInstance.batchGenerateVouchers(id, batch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#batchGenerateVouchers");
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
 **batch** | [**Batch**](Batch.md)|  | [optional]

### Return type

[**List&lt;Voucher&gt;**](Voucher.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Collection of created vouchers |  -  |

<a name="createVoucher"></a>
# **createVoucher**
> Voucher createVoucher(campaignId, voucher)

Create a voucher

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    Integer campaignId = 56; // Integer | Campaign ID
    Voucher voucher = new Voucher(); // Voucher | 
    try {
      Voucher result = apiInstance.createVoucher(campaignId, voucher);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#createVoucher");
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
 **voucher** | [**Voucher**](Voucher.md)|  | [optional]

### Return type

[**Voucher**](Voucher.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Created voucher |  -  |

<a name="deleteVoucher"></a>
# **deleteVoucher**
> deleteVoucher(code)

Delete a voucher

Delete a single voucher. Vouchers with at least one confirmed redemption can not be deleted.

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "code_example"; // String | Voucher code
    try {
      apiInstance.deleteVoucher(code);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#deleteVoucher");
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
**204** | Voucher was successfully deleted |  -  |

<a name="expireVouchers"></a>
# **expireVouchers**
> expireVouchers(inlineObject4)

Expire a list of vouchers

Given a list of voucher codes, change their status to expired, unless they have been redeemed.

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    InlineObject4 inlineObject4 = new InlineObject4(); // InlineObject4 | 
    try {
      apiInstance.expireVouchers(inlineObject4);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#expireVouchers");
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
 **inlineObject4** | [**InlineObject4**](InlineObject4.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Status was successfully changed |  -  |

<a name="findVoucher"></a>
# **findVoucher**
> Voucher findVoucher(medium, purpose, team, channel, customerIdentifier)

Find a voucher by campaign metadata

&lt;p&gt;Find voucher by campaign metadata.&lt;/p&gt; &lt;p&gt;   Optionally assign found voucher to a customer by passing customer_identifier param.   All vouchers for a customer can be fetched at &lt;a href&#x3D;\&quot;#get_customers-identifier-vouchers\&quot;&gt;/customers/{id}/vouchers&lt;/a&gt;. &lt;/p&gt; &lt;p&gt;If no voucher is available this endpoint will return an empty response and HTTP code &lt;code&gt;204 No content&lt;/code&gt;&lt;/p&gt; &lt;p&gt;At least one metadata must be provided, otherwise no voucher will be returned.&lt;/p&gt; 

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    List<String> medium = Arrays.asList(); // List<String> | 
    List<String> purpose = Arrays.asList(); // List<String> | 
    List<String> team = Arrays.asList(); // List<String> | 
    List<String> channel = Arrays.asList(); // List<String> | 
    String customerIdentifier = "customerIdentifier_example"; // String | \"Assign found voucher to a customer with this identifier. Will create customer if not present. Optional.\"
    try {
      Voucher result = apiInstance.findVoucher(medium, purpose, team, channel, customerIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#findVoucher");
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
 **medium** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **purpose** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **team** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **channel** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **customerIdentifier** | **String**| \&quot;Assign found voucher to a customer with this identifier. Will create customer if not present. Optional.\&quot; | [optional]

### Return type

[**Voucher**](Voucher.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Found voucher |  -  |
**204** | No vouchers found for given criteria |  -  |

<a name="getVoucher"></a>
# **getVoucher**
> Voucher getVoucher(code)

Get a voucher

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "code_example"; // String | Voucher code
    try {
      Voucher result = apiInstance.getVoucher(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#getVoucher");
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

### Return type

[**Voucher**](Voucher.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Collection of vouchers for campaign |  -  |

<a name="getVouchers"></a>
# **getVouchers**
> List&lt;Voucher&gt; getVouchers(campaignId)

Get all vouchers for a campaign

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    Integer campaignId = 56; // Integer | Campaign ID
    try {
      List<Voucher> result = apiInstance.getVouchers(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#getVouchers");
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

[**List&lt;Voucher&gt;**](Voucher.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Collection of vouchers for campaign |  * Link - Provides urls for traversing paginated responses. See docs.vouchery.io for details. <br>  |

<a name="importVouchers"></a>
# **importVouchers**
> InlineResponse200 importVouchers(id, file)

Import your own vouchers

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    Integer id = 56; // Integer | Campaign ID
    File file = new File("/path/to/file"); // File | 
    try {
      InlineResponse200 result = apiInstance.importVouchers(id, file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#importVouchers");
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
 **file** | **File**|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Import summary |  -  |

<a name="updateVoucher"></a>
# **updateVoucher**
> Voucher updateVoucher(code, voucher)

Update a voucher

Only voucher status can be updated.

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "code_example"; // String | Voucher code
    Voucher voucher = new Voucher(); // Voucher | 
    try {
      Voucher result = apiInstance.updateVoucher(code, voucher);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#updateVoucher");
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
 **voucher** | [**Voucher**](Voucher.md)|  | [optional]

### Return type

[**Voucher**](Voucher.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated voucher |  -  |

