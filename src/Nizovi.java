public class Nizovi {
  public static void main (String[] args){
     int[] niz = new int[3];

     niz[0] = 5;
     niz[1] = 6;
     niz[2] = 7;

     /*for (int i = 0; i < niz.length; i++){
       System.out.println(niz[i]);
     }*/
      /*for (int a : niz){
          System.out.println(a);
      }

      int[] noviNiz = {1, 3, 5, 7, 9};

      noviNiz[2] = 90;

      for (int a : noviNiz){
          System.out.println(a);
      }*/

      String[] strings = {"asfd", "asfda", "sfasf"};

      int[][] dvodimenzionalniNiz = new int[][]{
              {1, 2, 3},
              {4, 5, 6},
              {7, 8, 9}
      };

      for (int[] a : dvodimenzionalniNiz){
          for (int b : a){
              System.out.print(b + " ");
          }
          System.out.println("\n");
      }


  }
}
