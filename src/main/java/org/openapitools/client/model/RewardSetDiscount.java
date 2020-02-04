/*
 * Vouchery API Reference
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
 * RewardSetDiscount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-04T15:47:26.674+01:00[Europe/Berlin]")
public class RewardSetDiscount {
  /**
   * This reward sets specific discount for transaction amount during a redemption or order completion.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SET_DISCOUNT("set_discount");

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
  private TypeEnum type = TypeEnum.SET_DISCOUNT;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Discount type defines if a customer should receive a discount of 10% or $10 on their order. Gft Card type of reward works as a gift card: voucher can be used several times, discount value can be distributed to many transactions.
   */
  @JsonAdapter(DiscountTypeEnum.Adapter.class)
  public enum DiscountTypeEnum {
    NUMERIC("numeric"),
    
    PERCENTAGE("percentage"),
    
    GIFT_CARD("gift_card");

    private String value;

    DiscountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DiscountTypeEnum fromValue(String value) {
      for (DiscountTypeEnum b : DiscountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DiscountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DiscountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DiscountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DiscountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISCOUNT_TYPE = "discount_type";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_TYPE)
  private DiscountTypeEnum discountType;

  public static final String SERIALIZED_NAME_DISCOUNT_VALUE = "discount_value";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_VALUE)
  private BigDecimal discountValue;


  public RewardSetDiscount type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * This reward sets specific discount for transaction amount during a redemption or order completion.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "This reward sets specific discount for transaction amount during a redemption or order completion.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public RewardSetDiscount title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public RewardSetDiscount description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RewardSetDiscount discountType(DiscountTypeEnum discountType) {
    
    this.discountType = discountType;
    return this;
  }

   /**
   * Discount type defines if a customer should receive a discount of 10% or $10 on their order. Gft Card type of reward works as a gift card: voucher can be used several times, discount value can be distributed to many transactions.
   * @return discountType
  **/
  @ApiModelProperty(required = true, value = "Discount type defines if a customer should receive a discount of 10% or $10 on their order. Gft Card type of reward works as a gift card: voucher can be used several times, discount value can be distributed to many transactions.")

  public DiscountTypeEnum getDiscountType() {
    return discountType;
  }


  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }


  public RewardSetDiscount discountValue(BigDecimal discountValue) {
    
    this.discountValue = discountValue;
    return this;
  }

   /**
   * Get discountValue
   * @return discountValue
  **/
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getDiscountValue() {
    return discountValue;
  }


  public void setDiscountValue(BigDecimal discountValue) {
    this.discountValue = discountValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardSetDiscount rewardSetDiscount = (RewardSetDiscount) o;
    return Objects.equals(this.type, rewardSetDiscount.type) &&
        Objects.equals(this.title, rewardSetDiscount.title) &&
        Objects.equals(this.description, rewardSetDiscount.description) &&
        Objects.equals(this.discountType, rewardSetDiscount.discountType) &&
        Objects.equals(this.discountValue, rewardSetDiscount.discountValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, description, discountType, discountValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardSetDiscount {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    discountValue: ").append(toIndentedString(discountValue)).append("\n");
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
