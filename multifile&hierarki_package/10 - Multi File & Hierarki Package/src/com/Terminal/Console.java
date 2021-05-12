package com.Terminal;

public class Console {
    String message;
    public static void log (String message){
        System.out.println(message);
    }
}

// ini hanya akan bisa diakses dari package com.Terminal
class terminal {
    public static void log(String message){
        System.out.println(message);
    }
}

