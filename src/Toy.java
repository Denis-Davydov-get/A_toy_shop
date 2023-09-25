public class Toy{
    private int id;
    private String name;
    private int count;
    private double rate;

    public Toy(String name, int count, double rate) {
        if ((rate>=0)&&(rate<=1.0)){
            this.rate = rate;
        }else {
            throw new IncorrectWeightValueException();
        }
        if (count>0){
            this.count=count;
        } else {
            throw new RuntimeException("Неверное количество игрушек");
        }
        this.id=id++;
        this.name = name;
        this.count = count;
    }




    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
