package com.TDDSample.TDDSample.dto;

import com.TDDSample.TDDSample.entity.User;

public record UserDTOResponse(Long id, String name, String email, String password) {
    public UserDTOResponse(User user){
        this(user.getId(), user.getName(), user.getEmail(), user.getPassword());
    }
}
