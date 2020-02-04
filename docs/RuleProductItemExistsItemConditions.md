

# RuleProductItemExistsItemConditions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | [**FieldEnum**](#FieldEnum) |  |  [optional]
**operator** | [**OperatorEnum**](#OperatorEnum) | What kind of check should system do, comparing field of item with given value |  [optional]
**value** | **String** | Value to compare. Can be number or string, depending on field to compare |  [optional]



## Enum: FieldEnum

Name | Value
---- | -----
NAME | &quot;name&quot;
PRICE | &quot;price&quot;
SKU | &quot;sku&quot;
QUANTITY | &quot;quantity&quot;
PRODUCT_IDENTIFIER | &quot;product_identifier&quot;
WEIGHT | &quot;weight&quot;
CATEGORIES | &quot;categories&quot;



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
INCLUDE | &quot;include&quot;



