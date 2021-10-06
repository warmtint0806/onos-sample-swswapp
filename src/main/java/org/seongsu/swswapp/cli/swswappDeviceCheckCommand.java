package org.seongsu.swswapp.cli;

import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.onosproject.cli.AbstractShellCommand;
import org.onosproject.net.Device;
import org.onosproject.net.Host;
import org.onosproject.net.device.DeviceService;
import org.onosproject.net.host.HostService;

/**
 * Sample Apache Karaf CLI command.
 */
@Service
@Command(scope = "onos", name = "swswapp-device-check",
        description = "Sample Apache Karaf CLI command")
public class swswappDeviceCheckCommand extends AbstractShellCommand {

    @Override
    protected void doExecute() {
        print("Hello %s", ", it is swswapp speaking: device check command executed");
        DeviceService deviceService = get(DeviceService.class);
        Iterable<Device> devices=deviceService.getAvailableDevices();

        HostService hostService = get(HostService.class);
        Iterable<Host> hosts = hostService.getHosts();
        print("Available devices are : ");
        for(Device item : devices)
        {
            print(item.toString());
        }

        print("Available hosts are : ");
        for (Host item: hosts){
            print(item.toString());
        }
    }

}

