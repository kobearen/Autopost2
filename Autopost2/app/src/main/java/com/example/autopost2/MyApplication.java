package com.example.autopost2;

import android.app.Application;
import android.util.Log;
import com.twitter.sdk.android.core.DefaultLogger;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterConfig;

    public class MyApplication extends Application {

        private static final String CONSUMER_KEY = "自分のCONSUMER_KEYに書き換える";
        private static final String CONSUMER_SECRET = "自分のCONSUMER_SECRETに書き換える";

        @Override
        public void onCreate() {
            super.onCreate();

            TwitterConfig config = new TwitterConfig.Builder(this)
                    .logger(new DefaultLogger(Log.DEBUG))
                    .twitterAuthConfig(new TwitterAuthConfig(CONSUMER_KEY, CONSUMER_SECRET))
                    .debug(true)
                    .build();
            Twitter.initialize(config);
        }
    }
