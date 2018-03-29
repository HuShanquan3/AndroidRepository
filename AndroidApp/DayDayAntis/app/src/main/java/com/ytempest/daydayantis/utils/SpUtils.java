package com.ytempest.daydayantis.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * @author ytempest
 *         Description：
 */
public class SpUtils {

    private static SpUtils mInstance;
    private Context mContext;

    private SpUtils(Context context) {
        mContext = context.getApplicationContext();
    }

    public static SpUtils getInstance(Context context) {
        if (mInstance == null) {
            synchronized (SpUtils.class) {
                if (mInstance == null) {
                    mInstance = new SpUtils(context);
                }
            }
        }

        return mInstance;
    }

    public void putBoolean(String tag, String key, boolean value) {
        SharedPreferences sp = mContext.getSharedPreferences(tag, Context.MODE_PRIVATE);
        sp.edit().putBoolean(key, value).commit();
    }

    public void putString(String tag, String key, String value) {
        SharedPreferences sp = mContext.getSharedPreferences(tag, Context.MODE_PRIVATE);
        sp.edit().putString(key, value).commit();
    }

    public boolean getBoolean(String tag, String key, boolean defaultValue) {
        SharedPreferences sp = mContext.getSharedPreferences(tag, Context.MODE_PRIVATE);
        return sp.getBoolean(key, defaultValue);
    }

    public String getString(String tag, String key, String defaultValue) {
        SharedPreferences sp = mContext.getSharedPreferences(tag, Context.MODE_PRIVATE);
        return sp.getString(key, defaultValue);
    }
    }
