package com.miu.edu.spring.data.controller;

import com.miu.edu.spring.data.dto.AddressDto;
import com.miu.edu.spring.data.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<AddressDto> getAll() {
        return addressService.getAllAddresses();
    }

    @GetMapping("/{id}")
    public AddressDto getById(@PathVariable int id) {
        return addressService.getAddressById(id);
    }

    @GetMapping("/user/{id}")
    public AddressDto getAddressByUserId(@PathVariable int id) {
        return addressService.getAddressById(id);
    }

    @PutMapping
    public void updateAddress(@RequestBody AddressDto address) {
        addressService.updateAddress(address);
    }

    @PostMapping
    public void addAddress(@RequestBody AddressDto address) {
        addressService.addAddress(address);
    }

    @DeleteMapping("/{id}")
    public void removeById(@PathVariable int id) {
        addressService.removeById(id);
    }
}
