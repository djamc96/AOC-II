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
public class CPI_processador {
    private float freq_proc;    //Frequência do processador
    private float lmp_ns;          //Latencia da memoria principal em nanosegundos = penalidade por acesso a memoria
    private float lcd_n2_ns;       //Latência da cache de dados nivel 2 em nanosegundos = penalidade por acesso a cache de dados nivel 2
    private float lci_n2_ns;       //Latência da cache de intruções nivel 2 em nanosengos = penalidade por acesso a cache de instruções nivel 2
    private float lmp_ci;          //Latencia da memoria principal em ciclos = penalidade por acesso a memoria
    private float lcd_n2_ci;       //Latência da cache de dados nivel 2 em ciclos = penalidade por acesso a cache de dados nivel 2
    private float lci_n2_ci;       //Latência da cache de intruções nivel 2 em ciclos = penalidade por acesso a cache de instruções nivel 2
    private float cpi_base;     //CPI base do processador sem atrasos das memorias
    private float tfcd_n1;      //taxa de falahas da cache de dados nivel 1 em %
    private float tfci_n1;      //taxa de falahas da cache de instruções nivel 1 em %
    private float tfcd_n2;      //taxa de falahas da cache de dados nivel 2 em %
    private float tfci_n2;      //taxa de falahas da cache de instruções nivel 2 em %
    private float tils;         //tava de intruções do tipo load store  
    private float t_proc;       //periodo do processador;
    //variaveis pra calculo de falhas com cache nivel 2
    private float cfcd_n1_1;    //calculo de falhas da cache de dados nivel 1 considerando que haja cache de dados nivel 2
    private float cfci_n1_1;    //calculo de falhas de cache de instruções nivel 1 considerando que haja cache de intruções nivel 2
    private float cfcd_n2_1;    //calculo de falhad de cache de dados nivel 2
    private float cfci_n2_1;    //calculo de falhas da cache de instruções nivel 2
    private float cpif_cn2;     //calculo do cpi final considerando que haja cache de dados e intruções nivel 2
    //variaveis pra calculo de falhas sem cache nivel 2
    private float cfcd_n1_2;    //calculo de falhas da cache de dados nivel 1 considerando que não haja cache de dados nivel 2
    private float cfci_n1_2;    //calculo de falhas de cache de instruções nivel 1 considerando que não haja cache de intruções nivel 2
    private float cpif_sn2;     //calculo do cpi final considerando que haja cache de dados e intruções nivel 2

    public float getCpif_cn2() {
        return cpif_cn2;
    }

    public void setCpif_cn2(float cpif_cn2) {
        this.cpif_cn2 = cpif_cn2;
    }

    public float getCpif_sn2() {
        return cpif_sn2;
    }

    public void setCpif_sn2(float cpif_sn2) {
        this.cpif_sn2 = cpif_sn2;
    }
    
    public CPI_processador(float freq_proc, float lmp, float lcd_n2, float lci_n2, float cpi_base, float tfcd_n1, float tfci_n1, float tfcd_n2, float tfci_n2, float tils) {
        this.freq_proc = freq_proc;
        this.lmp_ns = lmp;
        this.lcd_n2_ns = lcd_n2;
        this.lci_n2_ns = lci_n2;
        this.cpi_base = cpi_base;
        this.tfcd_n1 = tfcd_n1;
        this.tfci_n1 = tfci_n1;
        this.tfcd_n2 = tfcd_n2;
        this.tfci_n2 = tfci_n2;
        this.tils = tils;
    }

    public float getLmp_ns() {
        return lmp_ns;
    }

    public void setLmp_ns(float lmp_ns) {
        this.lmp_ns = lmp_ns;
    }

    public float getLcd_n2_ns() {
        return lcd_n2_ns;
    }

    public void setLcd_n2_ns(float lcd_n2_ns) {
        this.lcd_n2_ns = lcd_n2_ns;
    }

    public float getLci_n2_ns() {
        return lci_n2_ns;
    }

    public void setLci_n2_ns(float lci_n2_ns) {
        this.lci_n2_ns = lci_n2_ns;
    }

    public float getLmp_ci() {
        return lmp_ci;
    }

    public void setLmp_ci(float lmp_ci) {
        this.lmp_ci = lmp_ci;
    }

    public float getLcd_n2_ci() {
        return lcd_n2_ci;
    }

    public void setLcd_n2_ci(float lcd_n2_ci) {
        this.lcd_n2_ci = lcd_n2_ci;
    }

    public float getLci_n2_ci() {
        return lci_n2_ci;
    }

    public void setLci_n2_ci(float lci_n2_ci) {
        this.lci_n2_ci = lci_n2_ci;
    }

    public float getT_proc() {
        return t_proc;
    }

    public void setT_proc(float t_proc) {
        this.t_proc = t_proc;
    }

    public float getFreq_proc() {
        return freq_proc;
    }

    public void setFreq_proc(float freq_proc) {
        this.freq_proc = freq_proc;
    }

    public float getCpi_base() {
        return cpi_base;
    }

    public void setCpi_base(float cpi_base) {
        this.cpi_base = cpi_base;
    }

    public float getTfcd_n1() {
        return tfcd_n1;
    }

    public void setTfcd_n1(float tfcd_n1) {
        this.tfcd_n1 = tfcd_n1;
    }

    public float getTfci_n1() {
        return tfci_n1;
    }

    public void setTfci_n1(float tfci_n1) {
        this.tfci_n1 = tfci_n1;
    }

    public float getTfcd_n2() {
        return tfcd_n2;
    }

    public void setTfcd_n2(float tfcd_n2) {
        this.tfcd_n2 = tfcd_n2;
    }

    public float getTfci_n2() {
        return tfci_n2;
    }

    public void setTfci_n2(float tfci_n2) {
        this.tfci_n2 = tfci_n2;
    }

    public float getTils() {
        return tils;
    }

    public void setTils(float tils) {
        this.tils = tils;
    }

    public float getCfcd_n1_1() {
        return cfcd_n1_1;
    }

    public void setCfcd_n1_1(float cfcd_n1_1) {
        this.cfcd_n1_1 = cfcd_n1_1;
    }

    public float getCfci_n1_1() {
        return cfci_n1_1;
    }

    public void setCfci_n1_1(float cfci_n1_1) {
        this.cfci_n1_1 = cfci_n1_1;
    }

    public float getCfcd_n2_1() {
        return cfcd_n2_1;
    }

    public void setCfcd_n2_1(float cfcd_n2_1) {
        this.cfcd_n2_1 = cfcd_n2_1;
    }

    public float getCfci_n2_1() {
        return cfci_n2_1;
    }

    public void setCfci_n2_1(float cfci_n2_1) {
        this.cfci_n2_1 = cfci_n2_1;
    }

    public float getCfcd_n1_2() {
        return cfcd_n1_2;
    }

    public void setCfcd_n1_2(float cfcd_n1_2) {
        this.cfcd_n1_2 = cfcd_n1_2;
    }

    public float getCfci_n1_2() {
        return cfci_n1_2;
    }

    public void setCfci_n1_2(float cfci_n1_2) {
        this.cfci_n1_2 = cfci_n1_2;
    }


}
