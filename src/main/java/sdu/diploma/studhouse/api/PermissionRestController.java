package sdu.diploma.studhouse.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sdu.diploma.studhouse.dto.PermissionDto;
import sdu.diploma.studhouse.service.PermissionService;

import java.util.List;

@RestController
@RequestMapping("/permissions")
@RequiredArgsConstructor
public class PermissionRestController {

    private final PermissionService permissionService;

    @GetMapping
//    @PreAuthorize("hasAnyRole('ROLE_USER)')")
    public List<PermissionDto> getList() {
        return permissionService.getAllPermissions();
    }
}