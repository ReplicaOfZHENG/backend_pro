package com.blockchainpro.sys.entity;

import lombok.Getter;

@Getter
public class RegisterResponse {
    private String status;

    public RegisterResponse(String status) {
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
