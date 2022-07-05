public class Switch {
    public static void main(String[] args) {
        String estacion = "Invierno";

        switch (estacion){
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otono":
                System.out.println("Es Otono");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No es una estacion");
        }


    }
}
