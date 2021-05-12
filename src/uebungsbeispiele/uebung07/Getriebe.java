package uebungsbeispiele.uebung07;

public class Getriebe {
    private int gang;
    private int minGang;
    private int maxGang;

    public Getriebe(int minGang, int maxGang) {
        this.minGang = minGang;
        this.maxGang = maxGang;
        gang = 0;
    }

    public int getGang() {
        return gang;
    }

    public int getMinGang() {
        return minGang;
    }

    public int getMaxGang() {
        return maxGang;
    }

    public void setGang(int gang) throws GetriebeSchutzException{
        if ((gang < 0 && this.gang < 0) || (this.gang > 0 && gang >0)){
            this.gang = gang;
        }else{
            throw new GetriebeSchutzException("Leerlauf einlegen");
        }
    }

    public void gangErhöhen (int gang) throws GangExistiertNichtException{

        if ((this.gang + gang) > maxGang){
            throw new GangExistiertNichtException("Gang zuhoch");
        }
        this.gang = this.gang + gang;
    }
}
