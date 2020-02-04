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
import java.util.ArrayList;
import java.util.List;

/**
 * RedemptionProductItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-04T15:47:26.674+01:00[Europe/Berlin]")
public class RedemptionProductItems {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_PRODUCT_IDENTIFIER = "product_identifier";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDENTIFIER)
  private String productIdentifier;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private BigDecimal quantity;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<String> categories = null;


  public RedemptionProductItems name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RedemptionProductItems sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public RedemptionProductItems productIdentifier(String productIdentifier) {
    
    this.productIdentifier = productIdentifier;
    return this;
  }

   /**
   * Get productIdentifier
   * @return productIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProductIdentifier() {
    return productIdentifier;
  }


  public void setProductIdentifier(String productIdentifier) {
    this.productIdentifier = productIdentifier;
  }


  public RedemptionProductItems quantity(BigDecimal quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getQuantity() {
    return quantity;
  }


  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }


  public RedemptionProductItems price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public RedemptionProductItems categories(List<String> categories) {
    
    this.categories = categories;
    return this;
  }

  public RedemptionProductItems addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<String>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCategories() {
    return categories;
  }


  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedemptionProductItems redemptionProductItems = (RedemptionProductItems) o;
    return Objects.equals(this.name, redemptionProductItems.name) &&
        Objects.equals(this.sku, redemptionProductItems.sku) &&
        Objects.equals(this.productIdentifier, redemptionProductItems.productIdentifier) &&
        Objects.equals(this.quantity, redemptionProductItems.quantity) &&
        Objects.equals(this.price, redemptionProductItems.price) &&
        Objects.equals(this.categories, redemptionProductItems.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sku, productIdentifier, quantity, price, categories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedemptionProductItems {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    productIdentifier: ").append(toIndentedString(productIdentifier)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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
