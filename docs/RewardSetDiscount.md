

# RewardSetDiscount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  | 
**title** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**discountType** | [**DiscountTypeEnum**](#DiscountTypeEnum) | Discount type defines if a customer should receive a discount of 10% or $10 on their order. Gft Card type of reward works as a gift card: voucher can be used several times, discount value can be distributed to many transactions. | 
**discountValue** | [**BigDecimal**](BigDecimal.md) |  | 



## Enum: TypeEnum

Name | Value
---- | -----
SETDISCOUNT | &quot;SetDiscount&quot;



## Enum: DiscountTypeEnum

Name | Value
---- | -----
NUMERIC | &quot;numeric&quot;
PERCENTAGE | &quot;percentage&quot;
GIFT_CARD | &quot;gift_card&quot;



