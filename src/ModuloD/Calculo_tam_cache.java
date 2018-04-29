/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloD;

/**
 *
 * @author oem
 */
public class Calculo_tam_cache {

    private float n_conj;
    private int t_ind;
    private int op;
    private int ob;
    private int t_end;
    private int tag;
    private float overhad;
    private float t_total;
    
    public CacheVias calc (CacheVias cache){
        
        
        this.n_conj = (cache.getT_user() * 1024) / cache.getT_word();
        this.t_ind = LogBase(cache.getN_conj(), 2);
        this.op = LogBase(cache.getN_word_bloco(), 2);
        this.ob = LogBase(cache.getT_word(), 2);
        this.t_end = (int) (cache.getT_word() * 8);
        this.tag = t_end - t_ind - op - ob;
        this.overhad = (float) (((3 + tag) * n_conj * cache.getN_vias_cache()) / 8192);
        this.t_total = (float) (cache.getT_user() + overhad);
        
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
