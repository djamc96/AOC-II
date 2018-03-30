package ModuloA;

public class Cache_dm_tam_total {

    private int t_user;
    private int t_word;
    private int n_conj;
    private int n_word_bloco;
    private int t_ind;
    private int t_end;
    private int ob;
    private int op;
    private int tag;
    private float overhad;
    private float t_total;

    public CacheDMNew Calc(CacheDMNew cache) {
        this.t_user = cache.getT_user();
        this.t_word = cache.getT_word();
        this.n_conj = cache.getN_conj();
        this.n_word_bloco = cache.getN_word_bloco();
        this.t_ind = cache.getT_ind();
        this.t_end = cache.getT_end();
        this.ob = cache.getOb();
        this.op = cache.getOp();
        this.tag = cache.getTag();
        this.overhad = cache.getOverhad();
        this.t_total = cache.getT_total();

        this.n_conj = (t_user * 1024) / t_word;
        this.t_ind = LogBase(n_conj, 2);
        this.op = LogBase(n_word_bloco, 2);
        this.ob = LogBase(t_word, 2);
        this.t_end = this.t_word * 8;
        this.tag = t_end - t_ind - op - ob;
        this.overhad = (float) (1 + tag) * n_conj;
        this.t_total = (float) t_user + overhad;

        cache.setT_user(t_user);
        cache.setT_word(t_word);
        cache.setN_conj(n_conj);
        cache.setN_word_bloco(n_word_bloco);
        cache.setT_ind(t_ind);
        cache.setT_end(t_end);
        cache.setOb(ob);
        cache.setOp(op);
        cache.setTag(tag);
        cache.setOverhad(overhad);
        cache.setT_total(t_total);
        return cache;
    }

    int LogBase(int x, int base) {
        return (int) (Math.log(x) / Math.log(base));
    }

}
