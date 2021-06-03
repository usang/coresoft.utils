package kr.coresoft.core.utils;

import org.slf4j.helpers.MessageFormatter;

public class SysOut {
	
	public static void print(String msg) {
		System.out.println(msg);
	}
	
	public static void print(String format, Object arg) {
		String formatted = MessageFormatter.format(format, arg).getMessage();
		System.out.println(formatted);
	}

	public static void print(String format, Object... args) {
		String formatted = MessageFormatter.arrayFormat(format, args).getMessage();
		System.out.println(formatted);
	}
}
