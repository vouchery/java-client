

# Redemption

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] [readonly]
**transactionId** | **String** | Unique transaction ID which identifies underlying transaction in your system, e.g. order number, invoice number | 
**customerIdentifier** | **String** | A string uniquely identifying customer in your system. Please check customers API. |  [optional]
**totalTransactionCost** | [**BigDecimal**](BigDecimal.md) |  | 
**ttl** | [**BigDecimal**](BigDecimal.md) | How many minutes should the redemption be valid for before it expires. |  [optional]
**grantedDiscount** | [**BigDecimal**](BigDecimal.md) |  |  [optional] [readonly]
**userAgent** | **String** |  |  [optional]
**voucher** | [**RedemptionVoucher**](RedemptionVoucher.md) |  |  [optional]
**confirmed** | **Boolean** | Only confirmed redemption are counted towards budget and total number of redemptions. |  [optional]
**productItems** | [**List&lt;RedemptionProductItems&gt;**](RedemptionProductItems.md) | Array of product items, associated with a redemption |  [optional]
**validatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**confirmedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]



## Enum: TypeEnum

Name | Value
---- | -----
REDEMPTION | &quot;Redemption&quot;



