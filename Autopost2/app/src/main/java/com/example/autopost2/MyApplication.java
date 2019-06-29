package com.example.autopost2;

import android.app.Application;
import android.util.Log;
import com.twitter.sdk.android.core.DefaultLogger;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterConfig;

    public class MyApplication extends Application {

        // API key 0613
        private static final String CONSUMER_KEY = "WdSdXSVvWyYIB5vTM0VmM5EH9";
        // API secret key 0613
        private static final String CONSUMER_SECRET = "MXyTBTSUhwlFVXSGNZMzu8YncabqYVtEnWFn37mTQvp8QCIxPu";

        @Override
        public void onCreate() {
            super.onCreate();

            // Twitter初期化処理 0613
            TwitterConfig config = new TwitterConfig.Builder(this)
                    .logger(new DefaultLogger(Log.DEBUG))
                    .twitterAuthConfig(new TwitterAuthConfig(CONSUMER_KEY, CONSUMER_SECRET))
                    .debug(true)
                    .build();
            Twitter.initialize(config);

        }
    }
