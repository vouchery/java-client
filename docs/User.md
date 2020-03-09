

# User

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] [readonly]
**id** | **Integer** |  |  [optional] [readonly]
**name** | **String** |  |  [optional]
**email** | **String** |  | 
**team** | **String** |  |  [optional]
**role** | [**RoleEnum**](#RoleEnum) |  | 
**accessScope** | [**AccessScopeEnum**](#AccessScopeEnum) |  | 
**active** | **Boolean** |  |  [optional] [readonly]
**maskedApiKey** | **String** |  |  [optional] [readonly]
**lastSignInAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]



## Enum: TypeEnum

Name | Value
---- | -----
USER | &quot;User&quot;



## Enum: RoleEnum

Name | Value
---- | -----
ADMIN | &quot;admin&quot;
POINT_OF_DISTRIBUTION | &quot;point_of_distribution&quot;
POINT_OF_SALE | &quot;point_of_sale&quot;



## Enum: AccessScopeEnum

Name | Value
---- | -----
PROJECT | &quot;project&quot;
CAMPAIGN | &quot;campaign&quot;
TEAM | &quot;team&quot;



