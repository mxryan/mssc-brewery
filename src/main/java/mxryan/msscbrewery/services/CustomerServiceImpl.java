package mxryan.msscbrewery.services;

import lombok.extern.slf4j.Slf4j;
import mxryan.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {

        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Franz Franklin")
                .build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("John Jonson")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        // todo: impl

    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("deleting customer");
    }
}
