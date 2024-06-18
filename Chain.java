public class Chain {
    private int value;

    
    public Chain setValue(int value) {
        this.value = value;
        return this; 
    }


    public Chain add(int number) {
        this.value += number;
        return this; 
    }


    public Chain multiply(int number) {
        this.value *= number;
        return this; 
    }

    public Chain subtract(int number) {
        this.value -= number;
        return this; 
    }


    public void printValue() {
        System.out.println("Current value: " + this.value);
    }

    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.setValue(10)     
             .add(5)          
             .multiply(2)     
             .subtract(3)     
             .printValue();   
    }
}

