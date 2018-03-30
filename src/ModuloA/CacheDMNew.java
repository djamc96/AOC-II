package ModuloA;

public class CacheDMNew {

    public int t_user;
    public int t_word;
    public int n_conj;
    public int n_word_bloco;
    public int t_ind;
    public int t_end;
    public int ob;
    public int op;
    public int tag;
    public float overhad;
    public float t_total;

    public CacheDMNew(int t_user, int t_word, int n_word_bloco) {
        this.t_user = t_user;
        this.t_word = t_word;
        this.n_word_bloco = n_word_bloco;
    }

    public int getT_user() {
        return t_user;
    }

    public void setT_user(int t_user) {
        this.t_user = t_user;
    }

    public int getT_word() {
        return t_word;
    }

    public void setT_word(int t_word) {
        this.t_word = t_word;
    }

    public int getN_conj() {
        return n_conj;
    }

    public void setN_conj(int n_conj) {
        this.n_conj = n_conj;
    }

    public int getN_word_bloco() {
        return n_word_bloco;
    }

    public void setN_word_bloco(int n_word_bloco) {
        this.n_word_bloco = n_word_bloco;
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

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
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
