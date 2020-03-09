

# MainCampaign

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | This field is required only when you create a campaign. Main Campaign is a wrapper for multipe Sub Campaings, grouped together. Main Campaign can have own budget and redemptions limit. | 
**id** | **Integer** |  |  [optional] [readonly]
**name** | **String** | The name of the campaign must be unique. | 
**triggersOn** | [**TriggersOnEnum**](#TriggersOnEnum) | What type of trigger sub campaign is reacting on to check rules and give rewards. |  [optional]
**triggerName** | **String** | If campaign is triggered by custom trigger, it&#39;s name should be specified. |  [optional]
**template** | [**TemplateEnum**](#TemplateEnum) | Valid template values for MainCampaign are: discount, loyalty, gift_card. |  [optional]
**description** | **String** |  |  [optional]
**maxTotalBudget** | [**BigDecimal**](BigDecimal.md) | The budget available for all discount campaigns grouped by this campaign. |  [optional]
**maxRedemptions** | [**BigDecimal**](BigDecimal.md) | The maximum number of redemptions available across all discount campaigns grouped by this campaign. |  [optional]
**team** | **String** |  |  [optional]
**budgetCode** | **String** |  |  [optional]
**children** | [**List&lt;MainCampaignChildren&gt;**](MainCampaignChildren.md) | List of child campaigns |  [optional] [readonly]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**createdBy** | [**CampaignCreatedBy**](CampaignCreatedBy.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**updatedBy** | [**CampaignCreatedBy**](CampaignCreatedBy.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
MAINCAMPAIGN | &quot;MainCampaign&quot;



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



