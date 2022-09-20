/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app2;

import java.time.LocalDate;
import java.util.Random;

public class Order {
  private int orderNumber;
  private LocalDate orderDate;
  private Logger log = Logger.getLogger();
  
  private int getRandomNumber(){
    Random ran = new Random();
    return ran.nextInt(Integer.MAX_VALUE);
  }
  public Order(){
    // Emulate slow initialization.
    try {
      Thread.sleep(2000);
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
    try {
      Thread.sleep(2000);
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
    this.orderNumber = getRandomNumber();
    this.orderDate = LocalDate.now();
    log.info("A new order was created");
    log.info(this.toString());
  }
  public String toString(){
    return "Order info:\nOrder number: " + this.orderNumber +
      "\nDate" + this.orderDate;
  }
}