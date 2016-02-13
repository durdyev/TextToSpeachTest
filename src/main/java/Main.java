import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 * Created by idurdyev on 13.02.16.
 */
public class Main {
    public static void main(String[] args) {
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice("kevin16");
        voice.allocate();
        voice.speak("Hello, world!");
    }
}
