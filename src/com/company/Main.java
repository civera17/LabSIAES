package com.company;

import sun.security.krb5.internal.crypto.Aes128;

public class Main {
    public static void main(String[] args) {
        System.out.println(AES.encrypt("Ion Loh","secret"));
        System.out.println(AES.decrypt(AES.encrypt("Ion Loh","secret"),"secret"));

    }
}
