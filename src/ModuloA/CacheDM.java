
package ModuloA;

public class CacheDM {
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
    
    void Calc(){
        this.n_conj = (t_user*1024)/ t_word;
        this.t_ind = LogBase(n_conj,2);
        this.op = LogBase (n_word_bloco,2);
        this.ob = LogBase (t_word,2);
        this.tag = t_end - t_ind - op - ob;
        this.overhad = (float) (1 + tag) * n_conj;
        this.t_total = (float) t_user + overhad;
    }
  
    int LogBase(int x, int base){
        return (int) (Math.log(x) / Math.log(base));
    }
}
