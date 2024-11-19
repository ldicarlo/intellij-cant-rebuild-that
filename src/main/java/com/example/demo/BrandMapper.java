package com.example.demo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper
public interface BrandMapper {
    @Mapping(source = "name", target = "name")
    BrandOut map(Brand brand);

}
