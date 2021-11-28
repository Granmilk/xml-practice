package com.gtbr.xmlpractice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserType {
    private Integer id;
    private String type;
    private String description;
}
