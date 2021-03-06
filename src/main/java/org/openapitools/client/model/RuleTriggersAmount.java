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
import java.math.BigDecimal;

/**
 * RuleTriggersAmount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-09T14:06:19.023+01:00[Europe/Berlin]")
public class RuleTriggersAmount {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TRIGGERSAMOUNT("TriggersAmount");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * What kind of check should system do, comparing number of triggers and rule value property.
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    EQUALS("equals"),
    
    IS_MORE("is_more"),
    
    IS_MORE_OR_EQUAL("is_more_or_equal"),
    
    IS_LESS("is_less"),
    
    IS_LESS_OR_EQUAL("is_less_or_equal"),
    
    BETWEEN("between"),
    
    DIVISION_REMAINDER_EQUALS_ZERO("division_remainder_equals_zero");

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
  private BigDecimal value;

  /**
   * How exactly should total amount of triggers be calculated. For each customer, subcampaign or other.
   */
  @JsonAdapter(GroupByEnum.Adapter.class)
  public enum GroupByEnum {
    CUSTOMER("customer");

    private String value;

    GroupByEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GroupByEnum fromValue(String value) {
      for (GroupByEnum b : GroupByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GroupByEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GroupByEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GroupByEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GroupByEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GROUP_BY = "group_by";
  @SerializedName(SERIALIZED_NAME_GROUP_BY)
  private GroupByEnum groupBy;


  public RuleTriggersAmount type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public RuleTriggersAmount operator(OperatorEnum operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * What kind of check should system do, comparing number of triggers and rule value property.
   * @return operator
  **/
  @ApiModelProperty(required = true, value = "What kind of check should system do, comparing number of triggers and rule value property.")

  public OperatorEnum getOperator() {
    return operator;
  }


  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  public RuleTriggersAmount value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value to compare loyalty points with.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Value to compare loyalty points with.")

  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public RuleTriggersAmount groupBy(GroupByEnum groupBy) {
    
    this.groupBy = groupBy;
    return this;
  }

   /**
   * How exactly should total amount of triggers be calculated. For each customer, subcampaign or other.
   * @return groupBy
  **/
  @ApiModelProperty(required = true, value = "How exactly should total amount of triggers be calculated. For each customer, subcampaign or other.")

  public GroupByEnum getGroupBy() {
    return groupBy;
  }


  public void setGroupBy(GroupByEnum groupBy) {
    this.groupBy = groupBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleTriggersAmount ruleTriggersAmount = (RuleTriggersAmount) o;
    return Objects.equals(this.type, ruleTriggersAmount.type) &&
        Objects.equals(this.operator, ruleTriggersAmount.operator) &&
        Objects.equals(this.value, ruleTriggersAmount.value) &&
        Objects.equals(this.groupBy, ruleTriggersAmount.groupBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, operator, value, groupBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleTriggersAmount {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
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

