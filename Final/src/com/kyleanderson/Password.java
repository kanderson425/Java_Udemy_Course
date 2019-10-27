package com.kyleanderson;

public class Password {
    private static final int key = 7487987234;
    private final int encryptedPassword;

    public Password(int encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

}
