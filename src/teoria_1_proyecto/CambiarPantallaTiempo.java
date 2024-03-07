package teoria_1_proyecto;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

/**
 *
 * @author rinal
 */
public class CambiarPantallaTiempo extends Thread {

    private JFrame Cambio, Anterior;
    private int milisegundos;
    private Clip Music;
    private boolean Extended;

    public CambiarPantallaTiempo(JFrame Cambio, JFrame Anterior, int milisegundos) {
        this.Cambio = Cambio;
        this.Anterior = Anterior;
        this.milisegundos = milisegundos;
        Extended=false;
    }
    public CambiarPantallaTiempo(JFrame Cambio, JFrame Anterior, int milisegundos,boolean Extended) {
        this.Cambio = Cambio;
        this.Anterior = Anterior;
        this.milisegundos = milisegundos;
        this.Extended=Extended;
    }

    @Override
    public void run() {
        Anterior.setVisible(false);
        Cambio.pack();
        Cambio.setLocationRelativeTo(Anterior);
        Cambio.setVisible(true);
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException ex) {
        }
        Cambio.setVisible(false);
        Anterior.pack();
        Anterior.setLocationRelativeTo(Cambio);
    if (Extended) {
            Anterior.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
        Anterior.setVisible(true);
    }

    public void playMusic(String filepath) {
        try {
            File music = new File(filepath);
            AudioInputStream AudioImput = AudioSystem.getAudioInputStream(music);
            Music = AudioSystem.getClip();
            Music.open(AudioImput);
        } catch (Exception e) {
            System.out.println("El Archivo no Existe");
            e.printStackTrace();
        }
    }
}
