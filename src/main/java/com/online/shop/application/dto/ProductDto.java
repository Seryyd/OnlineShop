package com.online.shop.application.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ProductDto extends PartialProductDto {
    private CategoryDto category;
    private List<@NotBlank String> properties = new ArrayList<>();
    private List<ReviewDto> reviews = new ArrayList<>();
}
