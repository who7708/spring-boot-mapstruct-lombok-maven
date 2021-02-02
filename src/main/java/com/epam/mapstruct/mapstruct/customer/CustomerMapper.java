package com.epam.mapstruct.mapstruct.customer;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@org.mapstruct.Mapper
public interface CustomerMapper {

    /** 其实就是 CustomerMapper 实例对象 */
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    /**
     * CustomerDo 转换成 CustomerDto
     *
     * \@org.mapstruct.Mapping
     * source: 源类的属性
     * target: 目标类的属性
     * 如果两个类中的属性名不相同, 则需要进行 source -> target 进行映射;
     * 如果两个类属性名完全相同, 则无需添加 \@org.mapstruct.Mapping, MapStruct 自动相同名称进行映射
     *
     * @param customerDo 源数据
     * @return 转换之后数据
     */
    @Mapping(source = "firstName", target = "forename")
    @Mapping(source = "lastName", target = "surname")
    CustomerDto customerToDto(CustomerDo customerDo);

    /** CustomerDto 转换成 CustomerVo */
    @Mapping(source = "forename", target = "firstName")
    @Mapping(source = "surname", target = "lastName")
    CustomerVo customerToVo(CustomerDto dto);

}