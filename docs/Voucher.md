

# Voucher

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  | 
**campaignId** | **Integer** |  |  [optional] [readonly]
**active** | **Boolean** |  |  [readonly]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**code** | **String** |  | 
**customerIdentifier** | **String** | A string uniquely identifying customer in your system. Please check customers API. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]



## Enum: TypeEnum

Name | Value
---- | -----
VOUCHER | &quot;Voucher&quot;



## Enum: StatusEnum

Name | Value
---- | -----
CREATED | &quot;created&quot;
DISTRIBUTED | &quot;distributed&quot;
VALIDATED | &quot;validated&quot;
REDEEMED | &quot;redeemed&quot;
EXPIRED | &quot;expired&quot;



