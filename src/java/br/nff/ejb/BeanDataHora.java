/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.nff.ejb;



import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.ejb.Stateless;

/**
 *
 * @author norton
 */
@Stateless
public class BeanDataHora implements Serializable{

    public BeanDataHora() {
        System.out.println("Usou o Construtor do beanDataHora");
    }
    
   public String getDataHoraServidor(){
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return simpleDateFormat.format(Calendar.getInstance().getTime());
   }
       
}
