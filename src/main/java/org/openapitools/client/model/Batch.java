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
 * Batch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-09T14:06:19.023+01:00[Europe/Berlin]")
public class Batch {
  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private BigDecimal size;

  /**
   * What characters should the code include. Possible choices are digits, letters, and mixed.
   */
  @JsonAdapter(CodeTypeEnum.Adapter.class)
  public enum CodeTypeEnum {
    DIGITS("digits"),
    
    LETTERS("letters"),
    
    MIXED("mixed");

    private String value;

    CodeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeTypeEnum fromValue(String value) {
      for (CodeTypeEnum b : CodeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CodeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CodeTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CODE_TYPE = "code_type";
  @SerializedName(SERIALIZED_NAME_CODE_TYPE)
  private CodeTypeEnum codeType;

  public static final String SERIALIZED_NAME_RANDOM_PART_LENGTH = "random_part_length";
  @SerializedName(SERIALIZED_NAME_RANDOM_PART_LENGTH)
  private BigDecimal randomPartLength;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;


  public Batch size(BigDecimal size) {
    
    this.size = size;
    return this;
  }

   /**
   * How many unique vouchers to generate? Can be an number between 1 and 50 000.
   * minimum: 1
   * maximum: 50000
   * @return size
  **/
  @ApiModelProperty(required = true, value = "How many unique vouchers to generate? Can be an number between 1 and 50 000.")

  public BigDecimal getSize() {
    return size;
  }


  public void setSize(BigDecimal size) {
    this.size = size;
  }


  public Batch codeType(CodeTypeEnum codeType) {
    
    this.codeType = codeType;
    return this;
  }

   /**
   * What characters should the code include. Possible choices are digits, letters, and mixed.
   * @return codeType
  **/
  @ApiModelProperty(required = true, value = "What characters should the code include. Possible choices are digits, letters, and mixed.")

  public CodeTypeEnum getCodeType() {
    return codeType;
  }


  public void setCodeType(CodeTypeEnum codeType) {
    this.codeType = codeType;
  }


  public Batch randomPartLength(BigDecimal randomPartLength) {
    
    this.randomPartLength = randomPartLength;
    return this;
  }

   /**
   * How long should the random part of the code be? Valid values are between 2 and 10, depending on batch size.
   * minimum: 3
   * maximum: 10
   * @return randomPartLength
  **/
  @ApiModelProperty(required = true, value = "How long should the random part of the code be? Valid values are between 2 and 10, depending on batch size.")

  public BigDecimal getRandomPartLength() {
    return randomPartLength;
  }


  public void setRandomPartLength(BigDecimal randomPartLength) {
    this.randomPartLength = randomPartLength;
  }


  public Batch prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * A prefix is required for batch generated vouchers. Needs to be unique within project.
   * @return prefix
  **/
  @ApiModelProperty(required = true, value = "A prefix is required for batch generated vouchers. Needs to be unique within project.")

  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Batch batch = (Batch) o;
    return Objects.equals(this.size, batch.size) &&
        Objects.equals(this.codeType, batch.codeType) &&
        Objects.equals(this.randomPartLength, batch.randomPartLength) &&
        Objects.equals(this.prefix, batch.prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, codeType, randomPartLength, prefix);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Batch {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    codeType: ").append(toIndentedString(codeType)).append("\n");
    sb.append("    randomPartLength: ").append(toIndentedString(randomPartLength)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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

