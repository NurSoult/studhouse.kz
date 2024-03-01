package sdu.diploma.studhouse.api;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sdu.diploma.studhouse.dto.UserDto;
import sdu.diploma.studhouse.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserRestController {

    private final UserService userService;

    @GetMapping
//    @PreAuthorize("hasAnyRole('ROLE_USER')")
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(value = "{id}")
//    @PreAuthorize("isAuthenticated()")
    public UserDto getUser(
            @PathVariable(name = "id") Long id
    ){
        return userService.getUser(id);
    }

    @PutMapping
//    @PreAuthorize("hasAnyRole('ROLE_USER')")
    public UserDto updateUser(@RequestBody UserDto userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping
//    @PreAuthorize("hasAnyRole('ROLE_USER')")
    public void deleteUser(@RequestBody UserDto userDTO){
        userService.deleteUser(userDTO);
    }

}
