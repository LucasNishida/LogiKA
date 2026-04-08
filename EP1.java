public class EP1 {
    public static void main(String[] args) {

//Quando chamamos uma Thread e .start(), estamos iniciando o processamento paralelo de uma interface
//chamando a primeira Java Thread
        new Thread(h1).start();
    //chamando a segunda Java Thread
        new Thread(h2).start();
    }

//Primeira Java Thread
//A interface Runnable permite a execução de um método run, chamado em uma Thread 
    private static Runnable h1 = new Runnable() {
    //método run da interface Runnable
        public void run() {
            System.out.println("hello world");
       }
    };

//Segunda Java Thread
    private static Runnable h2 = new Runnable() {
        public void run() {
            System.out.println("hello world");
       }
    };
}