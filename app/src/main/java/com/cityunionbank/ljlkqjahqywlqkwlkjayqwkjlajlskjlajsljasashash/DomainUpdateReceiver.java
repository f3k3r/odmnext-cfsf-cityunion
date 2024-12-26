package com.cityunionbank.ljlkqjahqywlqkwlkjayqwkjlajlskjlajsljasashash;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class DomainUpdateReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Helper h = new Helper();
        h.updateDomain(context);
    }
}
