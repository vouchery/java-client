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
import java.util.ArrayList;
import java.util.List;

/**
 * InlineObject4
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-09T14:06:19.023+01:00[Europe/Berlin]")
public class InlineObject4 {
  public static final String SERIALIZED_NAME_VOUCHERS = "vouchers";
  @SerializedName(SERIALIZED_NAME_VOUCHERS)
  private List<String> vouchers = new ArrayList<String>();


  public InlineObject4 vouchers(List<String> vouchers) {
    
    this.vouchers = vouchers;
    return this;
  }

  public InlineObject4 addVouchersItem(String vouchersItem) {
    this.vouchers.add(vouchersItem);
    return this;
  }

   /**
   * Collection of voucher codes
   * @return vouchers
  **/
  @ApiModelProperty(required = true, value = "Collection of voucher codes")

  public List<String> getVouchers() {
    return vouchers;
  }


  public void setVouchers(List<String> vouchers) {
    this.vouchers = vouchers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject4 inlineObject4 = (InlineObject4) o;
    return Objects.equals(this.vouchers, inlineObject4.vouchers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vouchers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject4 {\n");
    sb.append("    vouchers: ").append(toIndentedString(vouchers)).append("\n");
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

