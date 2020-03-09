

# RewardGenerateVoucher

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  | 
**title** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**prefix** | **String** | A prefix in all generated vouchers. Needs to be unique within a project. | 
**codeType** | [**CodeTypeEnum**](#CodeTypeEnum) | What characters should the code include. Possible choices are digits, letters, and mixed. | 
**randomPartLength** | [**BigDecimal**](BigDecimal.md) | How long should the random part of the code be? Valid values are between 2 and 10. |  [optional]
**voucherCampaignId** | [**BigDecimal**](BigDecimal.md) | Subcampaign ID, new voucher will be related to. | 



## Enum: TypeEnum

Name | Value
---- | -----
GENERATEVOUCHER | &quot;GenerateVoucher&quot;



## Enum: CodeTypeEnum

Name | Value
---- | -----
MIXED | &quot;mixed&quot;
DIGITS | &quot;digits&quot;
LETTERS | &quot;letters&quot;



