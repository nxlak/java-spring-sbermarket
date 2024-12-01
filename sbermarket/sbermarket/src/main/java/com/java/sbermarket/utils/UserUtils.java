package com.java.sbermarket.utils;

import com.java.sbermarket.entity.PayMethod;
import com.java.sbermarket.entity.User;
import com.java.sbermarket.exceptions.PayMethodNotFoundException;


// пока что не нужно
public class UserUtils {
    
    public static PayMethod findDefaultPayMethod(User user) {
        return user.getPay_methods().stream().findAny().orElseThrow(() -> new PayMethodNotFoundException("Unable to find pay methode!"));
    }
}
