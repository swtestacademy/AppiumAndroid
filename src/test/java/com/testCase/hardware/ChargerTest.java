package com.testCase.hardware;

import Listener.TestListener;
import com.setup.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page.ChargerTestFunction;

/**
 * Created by ahmetbaltaci on 22.12.2017.
 */

@Listeners({TestListener.class})
public class ChargerTest extends BaseTest {

    @Test
    public void chargerTest() throws InterruptedException {
        ChargerTestFunction chargerTestFunction = new ChargerTestFunction(driver);
        chargerTestFunction.chargerTest();
    }
}