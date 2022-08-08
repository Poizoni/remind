package com.poizoni.remindme;

import static com.codename1.ui.CN.*;

import com.codename1.notifications.LocalNotification;
import com.codename1.system.Lifecycle;
import com.codename1.ui.*;
import com.codename1.ui.layouts.*;
import com.codename1.io.*;
import com.codename1.ui.plaf.*;
import com.codename1.ui.util.Resources;
import com.codename1.rad.controllers.ApplicationController;
import com.codename1.rad.controllers.ControllerEvent;

/**
 * This file was generated by <a href="https://www.codenameone.com/">Codename One</a> for the purpose
 * of building native mobile applications using Java.
 */
public class Remind extends ApplicationController {
    @Override
    public void runApp() {
        int time = 1;

        Form remind = new Form("RemindMe", BoxLayout.y());
        remind.add(new Label("Create Reminder"));
        remind.show();

        LocalNotification n = new LocalNotification();
        n.setId("RemindMe");
        n.setAlertBody("this is the message");
        n.setAlertSound(null);

        Display.getInstance().scheduleLocalNotification(
                n,
                System.currentTimeMillis()+time*1000,
                LocalNotification.REPEAT_NONE
        );
        System.out.println("test");
    }

    private void hello() {
        Dialog.show("Hello Codename One", "Welcome to Codename One", "OK", null);
    }

}
