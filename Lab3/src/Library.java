
public class Library {
    private String name;
    private String nameHall;
    private String Fam;
    private String Lit;
    private String date;
    private String Term;
    private int Sum;
    public Library(){

    }

public Library(String name, String nameHall, String Fam, String Lit, String  date, String Term, int Sum)
{
    this.name = name;
    this.nameHall = nameHall;
    this.Fam = Fam;
    this.Lit = Lit;
    this.date = date;
    this.Term = Term;
    this.Sum = Sum;
    }
public String getName(String name){
        return name;
}
public void setName(String name){
        this.name = name;
}
public String getNameHall(String nameHall){
        return nameHall;
}
public void setNameHall(String nameHall){
        this.nameHall = nameHall;
}
public String getFam(String Fam) {
    return Fam;
}
public void setFam(String Fam){
    this.Fam = Fam;
    }
public String getLit(String Lit){
        return Lit;
}
public void setLit(String Lit){
        this.Lit = Lit;
}
public String getDate(String date){
        return date;
}
public void setDate(String  date){
        this.date = date;
}
public String getTerm(String Term){
        return Term;
}
public void setTerm(String Term){
        this.Term = Term;
}
public int getSum(int Sum){
        return Sum;
}
public void setSum(int Sum){
        this.Sum = Sum;
}
public String toString()
{
    return "Name library is\t" + name + "\nReading room is\t" + nameHall + "\nReader's last name of\t" +  Fam + "\nLiterature\t" + Lit + "\nDate:" + date + "\nIssuance period:" + Term + "\nDeposit amount\t" + Sum + "rub";
}
}



