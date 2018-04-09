package ModuloB;

/**
 *
 * @author anderson & Ritiele
 */
public class Calculo_ModuloB_Parte1 {
    private float t_user;
    private float t_word;
    private float n_conj;
    private float n_word_bloco;
    private int t_ind;
    private int t_end;
    private int ob;
    private int op;
    private float tag;
    private float overhad;
    private float t_total;
    
    public Cache_ModuloB_Parte1 Calc (Cache_ModuloB_Parte1 cache){
        this.t_word = cache.getT_word();
        this.t_user = cache.getT_user();
        this.n_word_bloco = cache.getN_word_bloco();
        
        this.n_conj = (t_user * 1024) / (t_word * n_word_bloco);
        this.t_ind = LogBase(n_conj, 2);
        this.op = LogBase(n_word_bloco, 2);
        this.ob = LogBase(t_word, 2);
        this.t_end = (int) (this.t_word * 8);
        this.tag = t_end - t_ind - op - ob;
        this.overhad = (float) (((1 + tag) * n_conj) / 8192);
        this.t_total = (float) (t_user + overhad);
        
        cache.setN_conj(n_conj);
        cache.setT_ind(t_ind);
        cache.setOp(op);
        cache.setOb(ob);
        cache.setT_end(t_end);
        cache.setTag(tag);
        cache.setOverhad(overhad);
        cache.setT_total(t_total);
        
        return cache;
    }
    
    int LogBase(float num, int base) {
        return (int) (Math.log(num) / Math.log(base));
    }
    
}
