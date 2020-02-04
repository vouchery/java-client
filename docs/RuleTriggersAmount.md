

# RuleTriggersAmount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Number of triggers, triggering the subcampaign, should match specific condition. | 
**operator** | [**OperatorEnum**](#OperatorEnum) | What kind of check should system do, comparing number of triggers and rule value property. | 
**value** | [**BigDecimal**](BigDecimal.md) | Value to compare loyalty points with. | 
**groupBy** | [**GroupByEnum**](#GroupByEnum) | How exactly should total amount of triggers be calculated. For each customer, subcampaign or other. | 



## Enum: TypeEnum

Name | Value
---- | -----
TRIGGERS_AMOUNT | &quot;triggers_amount&quot;



## Enum: OperatorEnum

Name | Value
---- | -----
EQUALS | &quot;equals&quot;
IS_MORE | &quot;is_more&quot;
IS_MORE_OR_EQUAL | &quot;is_more_or_equal&quot;
IS_LESS | &quot;is_less&quot;
IS_LESS_OR_EQUAL | &quot;is_less_or_equal&quot;
BETWEEN | &quot;between&quot;
DIVISION_REMAINDER_EQUALS_ZERO | &quot;division_remainder_equals_zero&quot;



## Enum: GroupByEnum

Name | Value
---- | -----
CUSTOMER | &quot;customer&quot;



