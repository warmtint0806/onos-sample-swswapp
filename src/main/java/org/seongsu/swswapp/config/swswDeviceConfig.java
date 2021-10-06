package org.seongsu.swswapp.config;

import org.onlab.packet.MacAddress;
import org.onosproject.net.Device;
import org.onosproject.net.DeviceId;
import org.onosproject.net.config.Config;

public class swswDeviceConfig extends Config<DeviceId> {
    public static final String CONFIG_KEY = "swswDeviceConfig";
    private static final String MY_WEIGHT = "myWeight";

    @Override
    public boolean isValid() {
        return hasOnlyFields(MY_WEIGHT);
    }

    public int myWeight() {
        int my_weight = get(MY_WEIGHT, 0);
        return my_weight;
    }
}





