/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import accounts.*;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public interface Operations {
 static final double OVERDRAFT_LIMIT =500.00;
 static final double SAVING_INTEREST =5.8;
  
 double makeTransaction(Transaction transaction) throws Exception;
 public String generateStatement() throws Exception;
}