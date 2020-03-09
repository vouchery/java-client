

# Campaign

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | This field is required only when you create a campaign. Main Campaign is a wrapper for multipe Sub Campaings, grouped together. Main Campaign can have own budget and redemptions limit. | 
**id** | **Integer** |  |  [optional] [readonly]
**parentId** | **Integer** | Required only for subcampaigns. | 
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**name** | **String** | The name of the campaign must be unique. | 
**triggersOn** | [**TriggersOnEnum**](#TriggersOnEnum) | What type of trigger sub campaign is reacting on to check rules and give rewards. |  [optional]
**triggerName** | **String** | If campaign is triggered by custom trigger, it&#39;s name should be specified. |  [optional]
**template** | [**TemplateEnum**](#TemplateEnum) | Valid template values for MainCampaign are: discount, loyalty, gift_card. For SubCampaign valid templates are sub_redemption, sub_reward_points, sub_generate_vouchers. |  [optional]
**description** | **String** |  |  [optional]
**customerInformation** | **String** | Text that can be displayed to the customer once the redemption is validated or confirmed. |  [optional]
**maxTotalBudget** | [**BigDecimal**](BigDecimal.md) | The budget available for all discount campaigns grouped by this campaign. |  [optional]
**maxRedemptions** | [**BigDecimal**](BigDecimal.md) | The maximum number of redemptions available across all discount campaigns grouped by this campaign. |  [optional]
**minimumValue** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**maxDiscount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**redemptionsCount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**totalBudgetSpent** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**currency** | **String** | Currency denominating monetary values in this campaign (USD, GBP, EUR, AUD) |  [optional] [readonly]
**currencySymbol** | **String** | Currency symbol ($, £, €) |  [optional] [readonly]
**team** | **String** |  |  [optional]
**channel** | **String** |  |  [optional]
**purpose** | **String** |  |  [optional]
**budgetCode** | **String** |  |  [optional]
**medium** | **String** |  |  [optional]
**voucherType** | [**VoucherTypeEnum**](#VoucherTypeEnum) | Determines what type of vouchers can be generated for campaign. Generic vouchers (eg. SALE10) can be redeemed multiple times. Unique vouchers allow for greater control and better tracking of who and how is using your promotions. |  [optional]
**voucherCodeType** | [**VoucherCodeTypeEnum**](#VoucherCodeTypeEnum) | What characters should the code include when new voucher is created. Possible choices are digits, letters, and mixed. |  [optional]
**voucherRandomPartLength** | [**BigDecimal**](BigDecimal.md) | How long should the random part of the code be? Valid values are between 2 and 10, depending on batch size. |  [optional]
**voucherPrefix** | **String** | A prefix that will be used to generate vouchers. Needs to be unique within project. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**createdBy** | [**CampaignCreatedBy**](CampaignCreatedBy.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**updatedBy** | [**CampaignCreatedBy**](CampaignCreatedBy.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
MAINCAMPAIGN | &quot;MainCampaign&quot;
SUBCAMPAIGN | &quot;SubCampaign&quot;



## Enum: StatusEnum

Name | Value
---- | -----
DRAFT | &quot;draft&quot;
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
ARCHIVED | &quot;archived&quot;



## Enum: TriggersOnEnum

Name | Value
---- | -----
CUSTOMER_POINTS_CHANGE | &quot;customer_points_change&quot;
REDEMPTION | &quot;redemption&quot;
CUSTOM | &quot;custom&quot;



## Enum: TemplateEnum

Name | Value
---- | -----
DISCOUNT | &quot;discount&quot;
LOYALTY | &quot;loyalty&quot;
GIFT_CARD | &quot;gift_card&quot;
SUB_REDEMPTION | &quot;sub_redemption&quot;
SUB_REWARD_POINTS | &quot;sub_reward_points&quot;
SUB_GENERATE_VOUCHERS | &quot;sub_generate_vouchers&quot;



## Enum: VoucherTypeEnum

Name | Value
---- | -----
UNIQUE | &quot;unique&quot;
GENERIC | &quot;generic&quot;



## Enum: VoucherCodeTypeEnum

Name | Value
---- | -----
DIGITS | &quot;digits&quot;
LETTERS | &quot;letters&quot;
MIXED | &quot;mixed&quot;



