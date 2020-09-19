public class Main {

    public static void main(String[] args) {

        User jayceDelgado = new User("jayce", "Delgado", "jayceDelgado1", "gfyhgyhg&&jj");
        User leonelBenton = new User("leonel", "Benton", "leonelBenton2", "buhsdsoy89");


        System.out.println(jayceDelgado.getFirstName());
        System.out.println(leonelBenton.getFirstName());

        jayceDelgado.passWord="gfyhgyhg&&";
        System.out.println(jayceDelgado.getPassword());
    }

}

