package com.sparta.outsourcing_project.domain.user.entity;

import com.sparta.outsourcing_project.domain.user.enums.UserType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(length = 150, nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @ColumnDefault("false")
    private Boolean isDeleted; // isDeleted 값을 false로 초기화

    private Integer store_number;

    public User(String email, String password, UserType userType) {
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    public void changePassword(String password) {
        this.password = password;
    }
}
