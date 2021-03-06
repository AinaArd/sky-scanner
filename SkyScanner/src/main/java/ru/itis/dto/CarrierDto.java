package ru.itis.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Data transfer object for Carrier.
 *
 * @since 0.1
 * @author Roman Beskrovnyi
 */
@Data
public class CarrierDto {

    @JsonProperty("CarrierId")
    private Integer carrierId;

    @JsonProperty("Name")
    private String name;
}