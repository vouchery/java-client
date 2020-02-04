

# Error

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | **Boolean** |  |  [optional]
**code** | [**CodeEnum**](#CodeEnum) | Machine-readable API error code |  [optional]
**message** | **String** | Human-readable error message |  [optional]
**errors** | [**List&lt;ErrorErrors&gt;**](ErrorErrors.md) |  |  [optional]



## Enum: CodeEnum

Name | Value
---- | -----
INVALID | &quot;invalid&quot;
NOT_FOUND | &quot;not_found&quot;
NOT_AUTHORIZED | &quot;not_authorized&quot;
FORBIDDEN | &quot;forbidden&quot;
CAN_NOT_BE_DELETED | &quot;can_not_be_deleted&quot;
UNKNOWN_ERROR | &quot;unknown_error&quot;



