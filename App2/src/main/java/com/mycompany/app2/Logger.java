/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app2;



import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.PrintWriter;
import java.io.FileWriter;

public final class Logger {
    
  static DateTimeFormatter myFormatter;
  static String currentDateTimeString ;
  private static PrintWriter writer; 
  private static Logger logFile1;
  private static String fileName;
  
  private Logger(){
      
  }

    
  public void info (String message) {
    writer.println("INFO: " + message);
  }
  public void error (String message) {
    writer.println("Error: " + message);
  }
  public static Logger getLogger(){
      if(logFile1 == null){
        logFile1 = new Logger();
          myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
      currentDateTimeString = LocalDateTime.now().format(myFormatter);
      fileName = currentDateTimeString + ".txt";
    try {
      FileWriter fw = new FileWriter(fileName);
      writer = new PrintWriter(fw, true);
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
  
      }
      return logFile1;
  }
  
}