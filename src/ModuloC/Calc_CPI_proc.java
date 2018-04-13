/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloC;

/**
 *
 * @author Anderson e Ritiele 
 */
public class Calc_CPI_proc {
    private float fcd1;     //falhas de cache de dados nivel 1
    private float fci1;     //falhas de cache de intruções nivel 1 
    private float fcd2;     //falhas de cache de dados nivel 2
    private float fci2;     //falhas de cache de intruções nivel 2 
    private float cpif;     //cpi final
    private float tp_ns;    //periodo do processador em ns
    private float lcd_ci;   //latencia da cache de dados nivel 2 em ciclos
    private float lci_ci;   //latencia da cache de instruções nivel 2 em ciclos
    private float lmp_ci;   //latencia da memporia principal em ciclos
    
    
    public CPI_processador calc( CPI_processador cpi){
        conv_ciclos(cpi);
        
        //calculo do cpi com cache nivel 2
        this.fcd1 = (cpi.getTils() / 100) + (cpi.getTfcd_n1() / 100) + cpi.getLcd_n2_ci();
        this.fcd2 = (cpi.getTils() / 100) + (cpi.getTfcd_n1() / 100) + (cpi.getTfcd_n2() / 100) + cpi.getLmp_ci();
        this.fci1 = (cpi.getTfci_n1() /100) + cpi.getLci_n2_ci();
        this.fci2 = (cpi.getTfci_n1() /100) + (cpi.getTfci_n2() / 100) + cpi.getLmp_ci();
        this.cpif = cpi.getCpi_base() + this.fcd1 + this.fcd2 + this.fci1 + this.fci2;
        cpi.setCfcd_n1_1(fcd1);
        cpi.setCfcd_n2_1(fcd2);
        cpi.setCfci_n1_1(fci1);
        cpi.setCfci_n2_1(fci2);
        cpi.setCpif_cn2(cpif);
        
        //calculo do cpi sem cache nivel 2
        this.fcd1 = (cpi.getTils() / 100) + (cpi.getTfcd_n1() / 100) + cpi.getLmp_ci();
        this.fci1 = (cpi.getTfci_n1() / 100) + cpi.getLmp_ci();
        this.cpif = cpi.getCpi_base() + this.fcd1 + this.fci1;
        cpi.setCfcd_n1_2(fcd1);
        cpi.setCfci_n1_2(fci1);
        cpi.setCpif_sn2(cpif);
        
        return cpi;
    }
    
    //função para converter de periodo para ciclos
    public void conv_ciclos( CPI_processador cpi){
        this.tp_ns = 1 / cpi.getFreq_proc();
        this.lcd_ci = cpi.getLcd_n2_ns() / tp_ns;
        this.lci_ci = cpi.getLci_n2_ns() / tp_ns;
        this.lmp_ci = cpi.getLmp_ns() / tp_ns;
        cpi.setLcd_n2_ci(lcd_ci);
        cpi.setLci_n2_ci(lci_ci);
        cpi.setLmp_ci(lmp_ci);
    }
    
    public static boolean test_porc(float porc){
        return porc >= 0 && porc <= 100;
    }
}
