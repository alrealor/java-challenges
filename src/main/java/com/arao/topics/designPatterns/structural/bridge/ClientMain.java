package com.arao.topics.designPatterns.structural.bridge;

import com.arao.topics.designPatterns.structural.bridge.implementation.Device;
import com.arao.topics.designPatterns.structural.bridge.implementation.Radio;
import com.arao.topics.designPatterns.structural.bridge.implementation.Tv;
import com.arao.topics.designPatterns.structural.bridge.abstraction.AdvancedRemote;
import com.arao.topics.designPatterns.structural.bridge.abstraction.BasicRemote;


/** BRIDGE pattern
 *
 * The Bridge pattern lets you split the monolithic class into several class hierarchies.
 * After this, you can change the classes in each hierarchy independently of the classes in the others.
 * This approach simplifies code maintenance and minimizes the risk of breaking existing code.
 *
 * This example shows separation between the classes of remotes and devices  that they control.
 * Remotes act as abstractions, and devices are their implementations. Thanks to the common interfaces, the same
 * remotes can work with different devices and vice versa.
 *
 * The Bridge pattern allows changing or even creating new classes without touching the code of the opposite hierarchy.
 */
public class ClientMain {

    public static void main(String[] args) {
        // Create a new Tv device to test basic remote control
        Device tvDevice = new Tv();
        System.out.println("Tests with BASIC remote.");
        BasicRemote basicRemote = new BasicRemote(tvDevice);
        basicRemote.power();
        basicRemote.channelUp();
        tvDevice.printStatus();

        // Create a new Radio device to test advanced remote control
        Device radioDevice = new Radio();
        System.out.println("Tests with ADVANCED remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(radioDevice);
        advancedRemote.power();
        advancedRemote.volumeUp();
        advancedRemote.mute();
        radioDevice.printStatus();

    }
}
