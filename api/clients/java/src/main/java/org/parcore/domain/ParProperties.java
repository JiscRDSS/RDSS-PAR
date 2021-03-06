package org.parcore.domain;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PAR API
 * <p>
 * ParProperty
 * <p>
 * Domain model for a list of ParProperty Core Entities, as returned by the API
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * This class is based on code auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */
@ApiModel(description = "A list of PAR Properties")
public class ParProperties {

    @SerializedName("parProperties")
    private List<ParProperty> parProperties = null;

    public void addParProperty(ParProperty parProperty) {
        if (this.parProperties == null) {
            this.parProperties = new ArrayList<>();
        }
        this.parProperties.add(parProperty);
    }

    /**
     * Get parProperties
     *
     * @return parProperties
     **/
    @ApiModelProperty(value = "")
    public List<ParProperty> getParProperties() {
        if (this.parProperties == null) {
            this.parProperties = new ArrayList<>();
        }
        return parProperties;
    }

    public void setParProperties(List<ParProperty> parProperties) {
        this.parProperties = parProperties;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParProperties parProperties = (ParProperties) o;
        return Objects.equals(this.parProperties, parProperties.parProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parProperties);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParProperties {\n");

        sb.append("    parProperties: ").append(toIndentedString(parProperties)).append("\n");
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
