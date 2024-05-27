package com.example.userregistration.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Phone
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-27T04:00:32.117468400-05:00[America/Bogota]")
public class Phone   {
  @JsonProperty("number")
  private String number;

  @JsonProperty("citycode")
  private String citycode;

  @JsonProperty("contrycode")
  private String contrycode;

  public Phone number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @ApiModelProperty(value = "")


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Phone citycode(String citycode) {
    this.citycode = citycode;
    return this;
  }

  /**
   * Get citycode
   * @return citycode
  */
  @ApiModelProperty(value = "")


  public String getCitycode() {
    return citycode;
  }

  public void setCitycode(String citycode) {
    this.citycode = citycode;
  }

  public Phone contrycode(String contrycode) {
    this.contrycode = contrycode;
    return this;
  }

  /**
   * Get contrycode
   * @return contrycode
  */
  @ApiModelProperty(value = "")


  public String getContrycode() {
    return contrycode;
  }

  public void setContrycode(String contrycode) {
    this.contrycode = contrycode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phone phone = (Phone) o;
    return Objects.equals(this.number, phone.number) &&
        Objects.equals(this.citycode, phone.citycode) &&
        Objects.equals(this.contrycode, phone.contrycode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, citycode, contrycode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phone {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    citycode: ").append(toIndentedString(citycode)).append("\n");
    sb.append("    contrycode: ").append(toIndentedString(contrycode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

