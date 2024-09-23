package com.sparta.outsourcing_project.domain.user.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrdersCountDto {
    private LocalDate orderDate;
    private long totalOrderCount;
}
