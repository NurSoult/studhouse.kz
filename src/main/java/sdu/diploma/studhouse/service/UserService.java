package sdu.diploma.studhouse.service;

import sdu.diploma.studhouse.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();

    void deleteUser(UserDto userDTO);

    UserDto updateUser(UserDto userDTO);

    UserDto getUser(Long id);
}
