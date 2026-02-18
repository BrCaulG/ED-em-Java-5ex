package notasAlunos;

public class Notas {
    public static void main(String[] args) {

        int maiorMedia=0;
        double soma=0,media;
        double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};
        double maiorNota = notas[0];
        for(int i =0; i< 10;i++){
            soma= notas[i]+soma;

        }
        media = soma/10;
        for(int j =0; j<10;j++){
            if(notas[j]>= media){
                maiorMedia++;
            }

        }
        for(int k=0;k<10;k++){
            if(notas[k]> maiorNota){
                maiorNota= notas[k];
            }

        }

        System.out.println("media: " +media);
        System.out.println("Maiores que a media: "+maiorMedia);
        System.out.println("A maior nota é: "+maiorNota);
    }



}
