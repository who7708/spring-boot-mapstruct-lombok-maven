package com.epam.mapstruct.mapstruct.customer;

import org.junit.jupiter.api.Test;

/**
 * @author Chris
 * @version 1.0.0
 * @date 2021/02/02
 */
class CustomerMapperTest {
    @Test
    public void test1() {
        System.out.println("===== test1 =====");
        CustomerDo customerDo = new CustomerDo("Jacky", "Brown");
        final CustomerDto customerDto = CustomerMapper.INSTANCE.customerToDto(customerDo);
        System.out.println(customerDto);

        final CustomerVo customerVo = CustomerMapper.INSTANCE.customerToVo(customerDto);
        System.out.println(customerVo);
    }
}