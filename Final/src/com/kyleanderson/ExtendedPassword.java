package com.kyleanderson;

public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//        // we can't override the stored password method within the Password class b/c we are using the 'final' keyword on that method
//    }
}
