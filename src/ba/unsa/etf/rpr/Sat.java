package ba.unsa.etf.rpr;

public class Sat{

    private int sati, minute, sekunde;

    public Sat(int sat, int minuta, int sekunda){

        this.sati = sat;
        this.minute = minuta;
        this.sekunde = sekunda;
    }
    public void Postavi(int sat, int minuta, int sekunda){
        this.sati = sat;
        this.minute = minuta;
        this.sekunde = sekunda;
    }
    public void Sljedeci(){
        sekunde++;
        if (sekunde==60) { sekunde=0; minute++; }
        if (minute==60) { minute=0; sati++; }
        if (sati==24) sati=0;
    }
    public void Prethodni(){
        sekunde--;
        if (sekunde==-1) { sekunde=59; minute--; }
        if (minute==-1) { minute=59; sati--; }
        if (sati==-1) sati=23;
    }
    public void PomjeriZa(int pomak){
        if (pomak>0) for (int i = 0; i<pomak; i++) Sljedeci();
        else for (int i = 0; i<-pomak; i++) Prethodni();
    }
    public int DajSate(){ return this.sati; }
    public int DajMinute(){ return this.minute; }
    public int DajSekunde(){ return this.sekunde; }
    public void Ispisi(){System.out.println(sati+":"+minute+":"+sekunde);}
    public static void main(String[] args) {
        Sat s = new Sat(15,30,45);
        s.Ispisi();
        s.Sljedeci();
        s.Ispisi();
        s.PomjeriZa(-48);
        s.Ispisi();
        s.Postavi(0,0,0);
        s.Ispisi();
    }
}
