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
 * RuleProductItemExistsItemConditions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-09T14:06:19.023+01:00[Europe/Berlin]")
public class RuleProductItemExistsItemConditions {
  /**
   * Gets or Sets field
   */
  @JsonAdapter(FieldEnum.Adapter.class)
  public enum FieldEnum {
    NAME("name"),
    
    PRICE("price"),
    
    SKU("sku"),
    
    QUANTITY("quantity"),
    
    PRODUCT_IDENTIFIER("product_identifier"),
    
    WEIGHT("weight"),
    
    CATEGORIES("categories");

    private String value;

    FieldEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FieldEnum fromValue(String value) {
      for (FieldEnum b : FieldEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FieldEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FieldEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FieldEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FieldEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private FieldEnum field;

  /**
   * What kind of check should system do, comparing field of item with given value
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    EQUALS("equals"),
    
    IS_MORE("is_more"),
    
    IS_MORE_OR_EQUAL("is_more_or_equal"),
    
    IS_LESS("is_less"),
    
    IS_LESS_OR_EQUAL("is_less_or_equal"),
    
    BETWEEN("between"),
    
    DIVISION_REMAINDER_EQUALS_ZERO("division_remainder_equals_zero"),
    
    INCLUDE("include");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private OperatorEnum operator;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public RuleProductItemExistsItemConditions field(FieldEnum field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FieldEnum getField() {
    return field;
  }


  public void setField(FieldEnum field) {
    this.field = field;
  }


  public RuleProductItemExistsItemConditions operator(OperatorEnum operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * What kind of check should system do, comparing field of item with given value
   * @return operator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "What kind of check should system do, comparing field of item with given value")

  public OperatorEnum getOperator() {
    return operator;
  }


  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  public RuleProductItemExistsItemConditions value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value to compare. Can be number or string, depending on field to compare
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value to compare. Can be number or string, depending on field to compare")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleProductItemExistsItemConditions ruleProductItemExistsItemConditions = (RuleProductItemExistsItemConditions) o;
    return Objects.equals(this.field, ruleProductItemExistsItemConditions.field) &&
        Objects.equals(this.operator, ruleProductItemExistsItemConditions.operator) &&
        Objects.equals(this.value, ruleProductItemExistsItemConditions.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operator, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleProductItemExistsItemConditions {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

