package com.final_statement;

import javax.crypto.EncryptedPrivateKeyInfo;

public class Password {
    private static final int KEY = 748576362;
    private final int ENCRYPTED_PASSWORD;

    public Password(int password) {
        this.ENCRYPTED_PASSWORD = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ KEY;
    }

    public final void storePassword() {
        System.out.println("Saving password as " + this.ENCRYPTED_PASSWORD);
    }

    public boolean letMeIn(int password) {
        if(encryptDecrypt(password) == this.ENCRYPTED_PASSWORD){
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }
}
