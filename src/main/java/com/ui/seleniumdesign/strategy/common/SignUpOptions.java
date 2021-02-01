package com.ui.seleniumdesign.strategy.common;

import javax.annotation.Nullable;
import java.util.Map;

public interface SignUpOptions {

    public void signUpInformation(@Nullable String username,String password1, @Nullable String password2, @Nullable String email);
}
