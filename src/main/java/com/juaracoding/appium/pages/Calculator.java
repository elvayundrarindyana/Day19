package com.juaracoding.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

    public class Calculator {
        private AndroidDriver<MobileElement> driver;

        public Calculator(AndroidDriver<MobileElement> driver) {
            this.driver = driver;
        }

        By btn1 = By.id("com.android.calculator2:id/digit_1");
        By btn2 = By.id("com.android.calculator2:id/digit_2");
        By btn3 = By.id("com.android.calculator2:id/digit_3");
        By btn4 = By.id("com.android.calculator2:id/digit_4");
        By btn_tambah = By.id("com.android.calculator2:id/op_add");
        By btn_kali = By.id("com.android.calculator2:id/op_mul");
        By btn_samadengan = By.id("com.android.calculator2:id/eq");
        By hasil = By.id("com.android.calculator2:id/result");

        public void calculatorAdd() {
            driver.findElement(btn1).click();
            System.out.println("Klik angka 1");
            driver.findElement(btn_tambah).click();
            System.out.println("Klik tanda tambah");
            driver.findElement(btn2).click();
            System.out.println("Klik angka 2");
            driver.findElement(btn_samadengan).click();
            System.out.println("Klik sama dengan");
        }

        public void calculatorMul() {
            driver.findElement(btn3).click();
            System.out.println("Klik angka 3");
            driver.findElement(btn_kali).click();
            System.out.println("Klik tombol kali");
            driver.findElement(btn4).click();
            System.out.println("Klik angka 4");
            driver.findElement(btn_samadengan).click();
            System.out.println("Klik sama dengan");
        }

        public String getTxtResult() {
            return driver.findElement(hasil).getText();
        }
    }
