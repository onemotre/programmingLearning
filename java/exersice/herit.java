package exersice;

import java.util.*;

public class herit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /**
         * @parm: sumMonet is used for storage full money
         * @parm: numOfSons is used for create a famaly
         * @parm: sons is to storage sons' information
         * @parm: model is used to sign the model of add sons' rate
         */
        System.out.println("你一共有多少钱");
        float sumMoney = in.nextFloat();
        System.out.println("你有多少个孩子");
        int numOfSons = in.nextInt();
        var family = new son[numOfSons];
        float rate = 0;

        for(int initalize = 0; initalize<=family.length-1; initalize++){family[initalize] = new son();}
        for(int initalize = 0; initalize<=family.length-1;initalize++){
            System.out.print("输入第"+(initalize+1)+"孩子的名字");
            String name = in.next();
            family[initalize].setSonName(name);
        }
        enum model {A,H};
        System.out.println("是否需要自动填入相同的比率(Y/N)");
        model option;
        String choice = in.next();
        switch(choice){
            case "Y":
                option = model.A;
                break;
            case "N":
                option = model.H;
            default:
                option = model.H;
        }
        if(option == model.A){
            System.out.println("输入比率，接下来会自动填入");
            rate = in.nextFloat();
            for(int n = 0;n<=family.length-1;n++){family[n].setSonRate(rate);}
        }
        else{
            for(int n = 0;n<=family.length-1;n++){
                System.out.println("输入"+(n+1)+"个孩子的比率");
                rate = in.nextFloat();
                family[n].setSonRate(rate);
            }
        }
        for(int n = 0;n<=family.length-1;n++){
            family[n].figureMoney(sumMoney);
            System.out.println(family[n].getSonImformation());
        }
        in.close();
    }
}
class son{
    private String name;
    private float rate;
    private float money;
    public son(){
        this.name =  "you haven't set name";
        money = 0;
        rate = 0;
    }
    public void setSonName(String name1){this.name = name1;}
    public void setSonRate(float rate){this.rate = rate;}
    public void figureMoney(float sumMoney){this.money = sumMoney * rate;}
    public void fighreMoney2(float sumMoney, float last){
        this.money = last * rate;
    }
    public String getSonImformation(){
        String imformation = name + " "+ String.valueOf(money); 
        return imformation;
    }
}
