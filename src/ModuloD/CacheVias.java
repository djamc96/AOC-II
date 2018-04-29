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
public class CacheVias {
    private float t_user;
    private float t_word;
    private float n_conj;
    private float n_word_bloco;
    private float n_vias_cache;
    private int t_ind;
    private int t_end;
    private int ob;
    private int op;
    private float tag;
    private float overhad;
    private float t_total;

    public CacheVias(float t_user, float t_word, float n_word_bloco, float n_vias_cache) {
        this.t_user = t_user;
        this.t_word = t_word;
        this.n_word_bloco = n_word_bloco;
        this.n_vias_cache = n_vias_cache;
    }

    public float getT_user() {
        return t_user;
    }

    public void setT_user(float t_user) {
        this.t_user = t_user;
    }

    public float getT_word() {
        return t_word;
    }

    public void setT_word(float t_word) {
        this.t_word = t_word;
    }

    public float getN_conj() {
        return n_conj;
    }

    public void setN_conj(float n_conj) {
        this.n_conj = n_conj;
    }

    public float getN_word_bloco() {
        return n_word_bloco;
    }

    public void setN_word_bloco(float n_word_bloco) {
        this.n_word_bloco = n_word_bloco;
    }

    public float getN_vias_cache() {
        return n_vias_cache;
    }

    public void setN_vias_cache(float n_vias_cache) {
        this.n_vias_cache = n_vias_cache;
    }

    public int getT_ind() {
        return t_ind;
    }

    public void setT_ind(int t_ind) {
        this.t_ind = t_ind;
    }

    public int getT_end() {
        return t_end;
    }

    public void setT_end(int t_end) {
        this.t_end = t_end;
    }

    public int getOb() {
        return ob;
    }

    public void setOb(int ob) {
        this.ob = ob;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public float getTag() {
        return tag;
    }

    public void setTag(float tag) {
        this.tag = tag;
    }

    public float getOverhad() {
        return overhad;
    }

    public void setOverhad(float overhad) {
        this.overhad = overhad;
    }

    public float getT_total() {
        return t_total;
    }

    public void setT_total(float t_total) {
        this.t_total = t_total;
    }
    
    
}
