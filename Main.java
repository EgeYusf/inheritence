//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

         krediUI krediUI = new krediUI();

        krediUI.hesapla(new EmeklikrediManager());
        krediUI.hesapla(new AskerkrediManager());
        krediUI.hesapla(new ÖğrencikrediManager());
        krediUI.hesapla(new İskrediManager());
        krediUI.hesapla(new ÖğretmenkrediManager());
        krediUI.hesapla(new ÇiftçikrediManager());




        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        }

}