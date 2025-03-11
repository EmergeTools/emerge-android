package com.emergetools.distribution.internal;

import android.os.Build;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Foo {
    public void foo() {
        InputStream s = this.getClass().getClassLoader().getResourceAsStream("META-INF/version.txt");
        try {
            byte[] bytes = null;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                bytes = s.readAllBytes();
            }
            Log.e("!!!!", new String(bytes, StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
