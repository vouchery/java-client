

# RuleTimeOfOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Define when customer can trigger subcampaign: particular time of day and week days. | 
**startTime** | **String** | Time in 24-hour format: HH:MM | 
**endTime** | **String** | Time in 24-hour format: HH:MM | 
**daysOfWeek** | **List&lt;Integer&gt;** | Array of days of week, where Sunday is 0, Monday is 1, Saturday is 6 | 
**timeZone** | **String** | Time zone name as defined in the [tz database](http://www.iana.org/time-zones) (e.g. Europe/London) | 



## Enum: TypeEnum

Name | Value
---- | -----
TIME_OF_ORDER | &quot;time_of_order&quot;



