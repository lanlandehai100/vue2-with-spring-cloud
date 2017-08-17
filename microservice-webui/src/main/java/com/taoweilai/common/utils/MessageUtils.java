package com.taoweilai.common.utils;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

public class MessageUtils {

    private static final MessageSource messageSource = ApplicationContextHolder.getBean(MessageSource.class);
    
    public static String getMessage(String messageId) {
    	Locale locale = LocaleContextHolder.getLocale();
    	return messageSource.getMessage(messageId, null, locale);
	}

	public static String getMessage(String messageId, String... parameter) {
		Locale locale = LocaleContextHolder.getLocale();
		String message = messageSource.getMessage(messageId, parameter, locale);
		return message;
	}

	public static String getMessage(String messageId, Locale locale) {
		return messageSource.getMessage(messageId, null, locale);
	}

	public static String getMessage(String messageId, Locale locale, Object... parameter) {
		String message = messageSource.getMessage(messageId, parameter, locale);
		return message;
	}
}
