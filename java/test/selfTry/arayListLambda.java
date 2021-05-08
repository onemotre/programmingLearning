package test.selfTry;

public class arayListLambda {
    public static void main(String[] args) {
        var son1 = new son();
        System.out.println(son1.getSonImformation());
        var sons = new son[3];
        System.out.println(sons[0].getSonImformation());
        sons[0] = son1;
        System.out.println(sons[0]);
    }
}
class son{
    private String name;
    private float rate;
    private float money;
    public son(){
        this.name =  "null";
        this.money = 0;
        this.rate = 0;
    }
    public void setSonName(String name){this.name = name;}
    public void setSonRate(float rate){this.rate = rate;}
    public void figureMoney(float sumMoney){this.money = sumMoney * rate;}
    public String getSonImformation(){
        String imformation = name +" "+ String.valueOf(money); 
        return imformation;
    }
}
