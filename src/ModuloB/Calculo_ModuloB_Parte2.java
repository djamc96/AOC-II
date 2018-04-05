package ModuloB;

public class Calculo_ModuloB_Parte2 {
    private float t_bloco;
    private float n_conj;
    private int t_ind;
    private int t_end;
    private int o_bloco; //offiset de bloco
    private float tag;
    private float overhad;
    
    public Cache_ModuloB_Parte2 Calc (Cache_ModuloB_Parte2 cache){
        this.t_ind = cache.getT_ind();
        this.t_end = cache.getT_end();
        this.overhad = cache.getOverhad();
        
        this.n_conj = 2 ^ this.t_ind;
        this.tag = ((this.overhad * 8) - this.n_conj) / this.n_conj;
        this.o_bloco = (int) (this.t_end - this.tag - this.t_ind);
        this.t_bloco = (2 ^ this.o_bloco) / 8;
        
        cache.setN_conj(n_conj);
        cache.setO_bloco(o_bloco);
        cache.setTag(tag);
        cache.setT_bloco(t_bloco);

        return cache;
    }
    
}
