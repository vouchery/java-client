# UsersApi

All URIs are relative to *https://preview.vouchery.io/api/v2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsers**](UsersApi.md#getUsers) | **GET** /users | Get all users within a project


<a name="getUsers"></a>
# **getUsers**
> List&lt;User&gt; getUsers()

Get all users within a project

### Example
```java
// Import classes:
import io.vouchery.sdk.ApiClient;
import io.vouchery.sdk.ApiException;
import io.vouchery.sdk.Configuration;
import io.vouchery.sdk.auth.*;
import io.vouchery.sdk.models.*;
import io.vouchery.sdk.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://preview.vouchery.io/api/v2.0");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    UsersApi apiInstance = new UsersApi(defaultClient);
    try {
      List<User> result = apiInstance.getUsers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Collection of users |  * Link - Provides urls for traversing paginated responses. See docs.vouchery.io for details. <br>  |

