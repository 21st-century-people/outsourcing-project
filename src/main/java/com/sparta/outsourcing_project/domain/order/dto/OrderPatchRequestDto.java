package com.sparta.outsourcing_project.domain.order.dto;

import lombok.Getter;

@Getter
public class OrderPatchRequestDto {
    private Long menuId;
    private Boolean is_deleted = false;
}
