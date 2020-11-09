public class HW3 {
    public static void main(String[] args) {
        double salary = 1000.0;
        double bonus = 0;
        int seniority = 5;

        if(seniority<5){
            bonus = salary*0.1;
        }else if(seniority>=5&&seniority<10){
            bonus = salary*0.15;
        }else if(seniority>=10&&seniority<15) {
            bonus = salary * 0.25;
        }else if(seniority>=15&&seniority<20) {
            bonus = salary * 0.35;
        }else if(seniority>=20&&seniority<25) {
            bonus = salary * 0.45;
        }else if(seniority>=25){
            bonus = salary*0.5;
        }
        System.out.println("Премия: " + bonus);
    }
}
