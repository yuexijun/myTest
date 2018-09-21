package com.test.testCalendar;

import java.util.Calendar;

public class CalendarDemo {
	
	public static void main(String[] args) {
		getAgeByIdCard("422326199310061038");
		System.out.println(getGenderByIdCard("422326199310061038"));
	}
	
	
	/**
     * 根据身份编号获取年龄
     *
     * @param idCard 身份编号
     * @return 年龄
     */
	public static void getAgeByIdCard(String idCard) {
		String str = idCard.substring(6, 10);
		Calendar cal = Calendar.getInstance();
		int currYear = cal.get(Calendar.YEAR);
		System.out.println(currYear - Integer.parseInt(str));
	}
	
	
	/**
     * 根据身份编号获取性别
     *
     * @param idCard 身份编号
     * @return 性别(M-男，F-女，N-未知)
     */
    public static String getGenderByIdCard(String idCard) {
        String sGender = "未知";

        String sCardNum = idCard.substring(16, 17);
        System.out.println(sCardNum);
        if (Integer.parseInt(sCardNum) % 2 != 0) {
            sGender = "1";//男
        } else {
            sGender = "2";//女
        }
        return sGender;
    }
	

}
