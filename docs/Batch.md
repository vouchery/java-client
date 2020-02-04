

# Batch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**size** | [**BigDecimal**](BigDecimal.md) | How many unique vouchers to generate? Can be an number between 1 and 50 000. | 
**codeType** | [**CodeTypeEnum**](#CodeTypeEnum) | What characters should the code include. Possible choices are digits, letters, and mixed. | 
**randomPartLength** | [**BigDecimal**](BigDecimal.md) | How long should the random part of the code be? Valid values are between 2 and 10, depending on batch size. | 
**prefix** | **String** | A prefix is required for batch generated vouchers. Needs to be unique within project. | 



## Enum: CodeTypeEnum

Name | Value
---- | -----
DIGITS | &quot;digits&quot;
LETTERS | &quot;letters&quot;
MIXED | &quot;mixed&quot;



