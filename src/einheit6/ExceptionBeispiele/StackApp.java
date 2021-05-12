package einheit6.ExceptionBeispiele;

import java.time.LocalDate;

public class StackApp {
    public static void main(String[] args) {
//        //in main we should react to it
//       try { //in try und catch können mehrere Zeilen stehen -> so kurz wie möglich so viel wie nötig
         helper();
////            //this code after helper ist not executed if an exception is thrown
//         System.out.println("You will never se me");
////        } catch (StackFullException e) {
////            e.printStackTrace();
////        } catch (StackEmptyException e) {
////            e.printStackTrace();
////        }
 //       System.out.println("puh so many methods");
    }

    public static void helper() {//throws StackFullException, StackEmptyException { Methode gibt Exception weiter z.B. an Main
        Stack s = new Stack(5);
        //s.push(new Note(LocalDate.now(), "Einkaufsliste", "Eier, Milch, Gurken, Tomaten, Zucchini")); (wenn throws dabei)
        try {
            s.push(new Note(LocalDate.now(), "Einkaufsliste", "Eier, Milch, Gurken, Tomaten, Zucchini"));
            s.push(new Note(LocalDate.now(), "Anrufen", "Steffi, Toni, Hubsi, Anton"));
            s.push(new Note(LocalDate.now(), "Vatertagsgeschenk organisieren", "Unterwäsche oder doch eine Krawatte?"));
            s.push(new Note(LocalDate.now(), "Einkaufsliste", "Eier, Milch, Gurken, Tomaten, Zucchini"));
            s.push(new Note(LocalDate.now(), "Anrufen", "Steffi, Toni, Hubsi, Anton"));
            s.push(new Note(LocalDate.now(), "Vatertagsgeschenk organisieren", "Unterwäsche oder doch eine Krawatte?"));

            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
        } catch (StackFullException  | StackEmptyException e){
            //es wird die erste Exception benutzt die passt im catch block;
            //wenn StackFullException und StackEmptyException gleich behandelt werden sollen können sie nebeneinander stehen sonst in getrennten catch - Blöcken
            e.printStackTrace();
        } catch (Exception e){ //wenn das vorne steht würde immer dieser ausgeführt
            System.out.println("anderer Fehler");
        } finally {
            System.out.println("wird immer gemacht");
        }
        System.out.println("hier hier ist code");
    }
}
