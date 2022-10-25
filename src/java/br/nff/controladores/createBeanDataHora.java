/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.nff.controladores;

import br.nff.ejb.BeanDataHora;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author norton
 */
@Named(value = "controleDataHora")
@RequestScoped
public class createBeanDataHora {
    
    @EJB
    private BeanDataHora beanDataHora;
            
    
    public createBeanDataHora(){
        System.out.println("Criou instancia de createDataHora");
    }

    public BeanDataHora getBeanDataHora() {
        return beanDataHora;
    }

    public void setBeanDataHora(BeanDataHora beanDataHora) {
        this.beanDataHora = beanDataHora;
    }
    
    
    
    
}
