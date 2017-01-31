/**
 * @author JeremyW
 *
 */
package easy300;
import javax.sound.midi.*;

public class Easy300 {

	public static void main(String[] args) throws MidiUnavailableException, InterruptedException {
		int[] notes = {60, 62, 64, 65, 67, 69, 71, 72};
		Synthesizer notePlayer = MidiSystem.getSynthesizer();
		notePlayer.open();
		MidiChannel[] playChannel = notePlayer.getChannels();
		for (int note : notes) {
			playChannel[0].noteOn(note, 127);
			Thread.sleep(600);
		}
		notePlayer.close();

	}

}
