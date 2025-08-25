public class Nizovi {
  public static void main (String[] args){
      System.out.println("This is the beginning of the code.");
     int[] niz = new int[3];

     niz[0] = 2431234;
     niz[1] = 41241243;

     niz[2] = 9;

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

      String[] strings = {"asfd23412", "asfd2341a", "sfasf"};
      String[] strings1 = {"asfd23412", "asfd2341a", "sfasf"};
      String[] strings2 = {"asfd23412", "asfd2341a", "sfasf"};
      String[] strings3 = {"asfd23412", "asfd2341a", "sfasf"};
      String[] strings4 = {"asfd23412", "asfd2341a", "sfasf"};
      String[] strings5 = {"asfd23412", "asfd2341a", "sfasf"};
      System.out.println("This is the new line for resolving the conflict");

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
        System.out.println("Ovo je kraj koda");
      }

      System.out.println("This is the end of the code.");


  }
}
