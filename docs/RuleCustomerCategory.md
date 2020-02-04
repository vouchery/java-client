

# RuleCustomerCategory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | What categories should customer belong/not belong to pass the rule. | 
**category** | **String** | Name of category, rule will be related to. |  [optional]
**matchingType** | [**MatchingTypeEnum**](#MatchingTypeEnum) | any_of means that customer should have tags in mentioned category. none_of - customer shouldn&#39;t have tags. | 
**tags** | **List&lt;String&gt;** |  | 



## Enum: TypeEnum

Name | Value
---- | -----
CUSTOMER_CATEGORY | &quot;customer_category&quot;



## Enum: MatchingTypeEnum

Name | Value
---- | -----
ANY_OF | &quot;any_of&quot;
NONE_OF | &quot;none_of&quot;



