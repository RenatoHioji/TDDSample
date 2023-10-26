package com.TDDSample.TDDSample.entity;

import com.TDDSample.TDDSample.dto.UserDTORequest;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private final String password;
    @Column(nullable = false)
    private final String email;
    @Column(nullable = false)
    private final String name;

    public User(UserDTORequest userDTORequest){
        this.email = userDTORequest.email();
        this.name = userDTORequest.name();
        this.password = userDTORequest.password();
    }

}
