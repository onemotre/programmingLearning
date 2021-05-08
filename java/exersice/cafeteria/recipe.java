package exersice.cafeteria;

public class recipe {
    /**
     * @parm: name is used to set name of a dish
     * @parm: price is a dish's pirce
     * @parm: quen is used to sign the 频率 of a dish; 'N' is not used before;
     * 'F' is the first time;
     * 'S' is the second time;
     */
    private String name;
    private float price;
    private enum quen{N,F,S}
    private quen option;

    /**
     * @method: creat ot check a recipe file '.text'
     */
    public static void creatAfile(){

    }

    /**
     * @method: set the 频率
     */
    public void setQuen(int option){
        switch(option){
            case option == 0:
                this.option = quen.N;
                break;
            case option == 1:
                this.option = quen.F;
                break;
            case option == 2:
                this.option = quen.S;
                break;
            default:
                this.option = quen.N;
        }
    }

    public void writeRecipe(String name){

    }
    
    public String getName(){return this.name;}
    public float getPrice(){return this.price;}
}
