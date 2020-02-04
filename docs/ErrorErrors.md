

# ErrorErrors

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribute** | **String** | Attribute name |  [optional]
**code** | [**CodeEnum**](#CodeEnum) | Machine-readable API error code |  [optional]
**message** | **String** | Human-readable error message |  [optional]
**boundaryValue** | **String** | Minimum, maximum, or expected value for this attribute |  [optional]



## Enum: CodeEnum

Name | Value
---- | -----
REQUIRED | &quot;required&quot;
BELOW_MINIMUM | &quot;below_minimum&quot;
ABOVE_MAXIMUM | &quot;above_maximum&quot;
UNEXPECTED_VALUE | &quot;unexpected_value&quot;
MUST_BE_UNIQUE | &quot;must_be_unique&quot;
SHOULD_MATCH_CONFIRMATION | &quot;should_match_confirmation&quot;
MUST_BE_ACCEPTED | &quot;must_be_accepted&quot;
MUST_BE_NULL | &quot;must_be_null&quot;
TOO_SHORT | &quot;too_short&quot;
TOO_LONG | &quot;too_long&quot;
WRONG_LENGTH | &quot;wrong_length&quot;
INVALID | &quot;invalid&quot;
INVALID_DATE | &quot;invalid_date&quot;
INVALID_TIME | &quot;invalid_time&quot;
INVALID_DATETIME | &quot;invalid_datetime&quot;
NOT_ALLOWED_TO_HAVE_VOUCHERS | &quot;not_allowed_to_have_vouchers&quot;
ALREADY_CONFIRMED | &quot;already_confirmed&quot;
EXPIRED | &quot;expired&quot;
MISSING_REQUIRED_TAGS | &quot;missing_required_tags&quot;
INCLUDES_FORBIDDEN_TAGS | &quot;includes_forbidden_tags&quot;
MISSING_REQUIRED_CATEGORY | &quot;missing_required_category&quot;
OUTSIDE_OF_PERMITTED_AREAS | &quot;outside_of_permitted_areas&quot;
NOT_VALID_AT_THIS_TIME | &quot;not_valid_at_this_time&quot;
NOT_ACTIVE | &quot;not_active&quot;
MAXIMUM_REDEMPTIONS_EXCEEDED | &quot;maximum_redemptions_exceeded&quot;
BUDGET_EXCEEDED | &quot;budget_exceeded&quot;
NEW_CUSTOMER_REQUIRED | &quot;new_customer_required&quot;
PER_CUSTOMER_LIMIT_EXCEEDED | &quot;per_customer_limit_exceeded&quot;
TIME_LIMIT_EXPIRED | &quot;time_limit_expired&quot;
REDEMPTIONS_LIMIT_EXCEEDED | &quot;redemptions_limit_exceeded&quot;
BELOW_CAMPAIGN_MINIMUM | &quot;below_campaign_minimum&quot;
ABOVE_CAMPAIGN_MAXIMUM | &quot;above_campaign_maximum&quot;
UNKNOWN_TAGS | &quot;unknown_tags&quot;
DOES_NOT_MATCH_ASSIGNED_CUSTOMER | &quot;does_not_match_assigned_customer&quot;
UNIQUE_CODE_ALREADY_USED | &quot;unique_code_already_used&quot;
NOT_MATCH | &quot;not_match&quot;



