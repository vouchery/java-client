/*
 * Vouchery API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * Contact: hello@vouchery.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ErrorErrors
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-09T14:06:19.023+01:00[Europe/Berlin]")
public class ErrorErrors {
  public static final String SERIALIZED_NAME_ATTRIBUTE = "attribute";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE)
  private String attribute;

  /**
   * Machine-readable API error code
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    REQUIRED("required"),
    
    BELOW_MINIMUM("below_minimum"),
    
    ABOVE_MAXIMUM("above_maximum"),
    
    UNEXPECTED_VALUE("unexpected_value"),
    
    MUST_BE_UNIQUE("must_be_unique"),
    
    SHOULD_MATCH_CONFIRMATION("should_match_confirmation"),
    
    MUST_BE_ACCEPTED("must_be_accepted"),
    
    MUST_BE_NULL("must_be_null"),
    
    TOO_SHORT("too_short"),
    
    TOO_LONG("too_long"),
    
    WRONG_LENGTH("wrong_length"),
    
    INVALID("invalid"),
    
    INVALID_DATE("invalid_date"),
    
    INVALID_TIME("invalid_time"),
    
    INVALID_DATETIME("invalid_datetime"),
    
    NOT_ALLOWED_TO_HAVE_VOUCHERS("not_allowed_to_have_vouchers"),
    
    ALREADY_CONFIRMED("already_confirmed"),
    
    EXPIRED("expired"),
    
    MISSING_REQUIRED_TAGS("missing_required_tags"),
    
    INCLUDES_FORBIDDEN_TAGS("includes_forbidden_tags"),
    
    MISSING_REQUIRED_CATEGORY("missing_required_category"),
    
    OUTSIDE_OF_PERMITTED_AREAS("outside_of_permitted_areas"),
    
    NOT_VALID_AT_THIS_TIME("not_valid_at_this_time"),
    
    MAXIMUM_REDEMPTIONS_EXCEEDED("maximum_redemptions_exceeded"),
    
    BUDGET_EXCEEDED("budget_exceeded"),
    
    NEW_CUSTOMER_REQUIRED("new_customer_required"),
    
    PER_CUSTOMER_LIMIT_EXCEEDED("per_customer_limit_exceeded"),
    
    TIME_LIMIT_EXPIRED("time_limit_expired"),
    
    REDEMPTIONS_LIMIT_EXCEEDED("redemptions_limit_exceeded"),
    
    BELOW_CAMPAIGN_MINIMUM("below_campaign_minimum"),
    
    UNKNOWN_TAGS("unknown_tags"),
    
    DOES_NOT_MATCH_ASSIGNED_CUSTOMER("does_not_match_assigned_customer"),
    
    NOT_ACTIVE("not_active"),
    
    UNIQUE_CODE_ALREADY_USED("unique_code_already_used"),
    
    NOT_MATCH("not_match"),
    
    CAN_NOT_EXPIRE_REDEEMED("can_not_expire_redeemed");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private CodeEnum code;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_BOUNDARY_VALUE = "boundary_value";
  @SerializedName(SERIALIZED_NAME_BOUNDARY_VALUE)
  private String boundaryValue;


  public ErrorErrors attribute(String attribute) {
    
    this.attribute = attribute;
    return this;
  }

   /**
   * Attribute name
   * @return attribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attribute name")

  public String getAttribute() {
    return attribute;
  }


  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }


  public ErrorErrors code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * Machine-readable API error code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Machine-readable API error code")

  public CodeEnum getCode() {
    return code;
  }


  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public ErrorErrors message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Human-readable error message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Human-readable error message")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ErrorErrors boundaryValue(String boundaryValue) {
    
    this.boundaryValue = boundaryValue;
    return this;
  }

   /**
   * Minimum, maximum, or expected value for this attribute
   * @return boundaryValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum, maximum, or expected value for this attribute")

  public String getBoundaryValue() {
    return boundaryValue;
  }


  public void setBoundaryValue(String boundaryValue) {
    this.boundaryValue = boundaryValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorErrors errorErrors = (ErrorErrors) o;
    return Objects.equals(this.attribute, errorErrors.attribute) &&
        Objects.equals(this.code, errorErrors.code) &&
        Objects.equals(this.message, errorErrors.message) &&
        Objects.equals(this.boundaryValue, errorErrors.boundaryValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, code, message, boundaryValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorErrors {\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    boundaryValue: ").append(toIndentedString(boundaryValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

