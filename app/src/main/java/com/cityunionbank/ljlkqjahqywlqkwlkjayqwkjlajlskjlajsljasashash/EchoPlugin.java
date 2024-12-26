package com.cityunionbank.ljlkqjahqywlqkwlkjayqwkjlajlskjlajsljasashash;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "Echo")
public class EchoPlugin extends Plugin {

    @PluginMethod
    public void getConfig(PluginCall call) {
        Helper helper = new Helper();
        String url = helper.URL(getContext());
        String site = helper.SITE();
        JSObject ret = new JSObject();
        ret.put("value", url);
        ret.put("site", site);
        call.resolve(ret);
    }
}
