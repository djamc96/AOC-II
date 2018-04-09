package ModuloB;

/**
 *
 * @author anderson & Ritiele
 */
public class Cache_ModuloB_Parte2 {

    private float t_bloco;
    private float n_conj;
    private int t_ind;
    private int t_end;
    private int o_bloco; //offiset de bloco
    private float tag;
    private float overhad;

    public Cache_ModuloB_Parte2(int t_ind, int t_end, float overhad) {
        this.t_ind = t_ind;
        this.t_end = t_end;
        this.overhad = overhad;
    }

    public float getT_bloco() {
        return t_bloco;
    }

    public void setT_bloco(float t_bloco) {
        this.t_bloco = t_bloco;
    }

    public float getN_conj() {
        return n_conj;
    }

    public void setN_conj(float n_conj) {
        this.n_conj = n_conj;
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

    public int getO_bloco() {
        return o_bloco;
    }

    public void setO_bloco(int o_bloco) {
        this.o_bloco = o_bloco;
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

}
