/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author folio
 */
public class GetAnswer {
      public static void main(String[] args){
          for (int k=3;k<100;k+=2){ 
              int j = k-2;
              int l = k+2;
              if(j*k - k*l ==28){
                  System.out.println(j);
                  System.out.println(k);
                  System.out.println(l);
                  break;
              }
          }
      }
        
}
