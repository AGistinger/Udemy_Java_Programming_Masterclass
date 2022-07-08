package com.final_statement;

public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

//    @Override // Cannot override final method
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
