package web.service.api;

import web.dto.NewUserDto;
import web.dto.UserDto;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

public interface IRegistrationService {

    void save(NewUserDto user);

  /*  UserDto findByUsername(String login);*/
    List<UserDto> get();


}
