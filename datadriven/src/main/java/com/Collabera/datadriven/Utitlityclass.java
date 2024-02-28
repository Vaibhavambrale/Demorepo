package com.Collabera.datadriven;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.Collabera.testBase.Browserchoice;


public class Utitlityclass extends Browserchoice {
	
	public void ss(String filename) throws IOException{
		String path="C:\\Users\\Varun Ambrale\\Desktop\\Testing Notes\\Practise\\datadriven\\Screenshots";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File(path+filename+".png");
		
		FileHandler.copy(src, des);
		
		}
	}

