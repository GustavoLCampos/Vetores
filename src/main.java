public class main {

    public static void main(String[] args) {

        int [] vetor = {0, 15, -8, 27, -5, 32};

        System.out.println("Vetor: ");
        int count = 0;
        while (count < (vetor.length)){

            System.out.println(vetor[count]+ " ");
            count++;

        }
        System.out.print("Ordem inversa: \n");
        for (int i = (vetor.length-1); i>=0; i--) {
            System.out.println(vetor[i] + " ");
        }


    }
}
