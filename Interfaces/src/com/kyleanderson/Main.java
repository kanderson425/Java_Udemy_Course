package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
	ITelephone kylesPhone;
//	kylesPhone = new DeskPhone(123456);
//
//	kylesPhone.powerOn();
//	kylesPhone.callPhone(123456);
//	kylesPhone.answer();

	kylesPhone = new MobilePhone(234456);
	kylesPhone.powerOn();
	kylesPhone.callPhone(2345678);
	kylesPhone.answer();


    }
}
