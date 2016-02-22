package com.wzr.chat.common.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

public class ResourceUtil {
	public static String findResourceAsString(String relativePath) throws FileNotFoundException, IOException{
		String s=IOUtils.toString(new FileInputStream("/Users/thl/Documents/Sheldon/workspace/Chat/resource"+relativePath));
		return s;
	}

}
