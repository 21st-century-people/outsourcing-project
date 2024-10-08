package com.sparta.outsourcing_project.domain.menu.controller;

import com.sparta.outsourcing_project.config.authUser.Auth;
import com.sparta.outsourcing_project.config.authUser.AuthUser;
import com.sparta.outsourcing_project.domain.menu.dto.response.MenuListResponseDto;
import com.sparta.outsourcing_project.domain.menu.dto.response.MenuResponse;
import com.sparta.outsourcing_project.domain.menu.service.MenuCustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers/stores/{storeId}/menus")
@RequiredArgsConstructor
public class MenuCustomerController {
    private final MenuCustomerService menuCustomerService;

    // Retrieve Store with Menus
    @GetMapping
    public ResponseEntity<List<MenuResponse>> getStoreWithMenus(@PathVariable Long storeId, @Auth AuthUser authUser) {
        List<MenuResponse> menus = menuCustomerService.getStoreWithMenus(storeId, authUser.getId());
        return ResponseEntity.ok(menus);
    }

    // 메뉴를 타입별로 조회
    @GetMapping("/types")
    public ResponseEntity<List<MenuListResponseDto>> getMenusByType(
            @PathVariable Long storeId,
            @RequestParam("menuType") String menuType) {
        return ResponseEntity.ok(menuCustomerService.getMenusByType(storeId, menuType));
    }
}
