package com.cydeo.converter;

import com.cydeo.dto.UserDTO;
import com.cydeo.service.UserService;
//import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationPropertiesBinding
public class UserDTOConvertor implements Converter<String, UserDTO> {

    private final UserService userService;

    public UserDTOConvertor(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDTO convert(String source) {

        if (source == null || source.equals("")) {
            return null;
        }

        return userService.findById(source);

    }

}
