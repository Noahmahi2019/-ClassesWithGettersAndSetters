public class Obeject {
    public static void main(String[] args) {


        User jayceDelgado = new User("jayce", "Delgado", "jayceDelgado1", "jayceDelgado");
        User leonelBenton = new User("leonel", "Benton", "leonelBenton2", "leonelBenton1");

       System.out.println(jayceDelgado.getFirstName());
        System.out.println(leonelBenton.getFirstName());

        jayceDelgado.passWord="gfyhgyhg&&";
        System.out.println(jayceDelgado.getPassword());

    }
}