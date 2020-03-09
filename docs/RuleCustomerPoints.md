

# RuleCustomerPoints

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Customer loyalty points should fit specific conditions. | 
**operator** | [**OperatorEnum**](#OperatorEnum) | What kind of check should system do, comparing loyalty points and rule value property. | 
**value** | [**BigDecimal**](BigDecimal.md) | Value to compare loyalty points with. | 



## Enum: TypeEnum

Name | Value
---- | -----
CUSTOMERPOINTS | &quot;CustomerPoints&quot;



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



